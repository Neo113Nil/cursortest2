package org.betup.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.squareup.picasso.Picasso;
import dagger.android.AndroidInjection;
import io.bidmachine.unified.UnifiedMediationParams;
import io.sentry.protocol.DebugImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.DisplayEventPushMessage;
import org.betup.model.local.entity.Event;
import org.betup.model.local.entity.EventParam;
import org.betup.model.local.entity.NotificationType;
import org.betup.services.chats.ChatService;
import org.betup.services.experiments.ABTestService;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.utils.BundleUtil;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final String DEFAULT_CHANNEL = "DEFAULT_CHANNEL";
    private static final String INCOGNITO_AVATAR_PATH = "incognito.jpg";
    public static final String TAG_USER_ID = "MyFireBaseBaMessService";

    @Inject
    ABTestService abTestService;

    @Inject
    UserService userService;

    @Override // android.app.Service
    public void onCreate() {
        AndroidInjection.inject(this);
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("PUSHTEST", "MESSAGE RECEIVED!!");
        ((BetUpApp) getApplicationContext()).getComponent().inject(this);
        HashMap hashMap = new HashMap(remoteMessage.getData());
        NotificationType fromString = NotificationType.fromString(hashMap.get("type"));
        try {
            int intValue = hashMap.containsKey("userId") ? Integer.valueOf(hashMap.get("userId")).intValue() : 0;
            if (this.userService.isRegistered()) {
                int intValue2 = this.userService.getShortProfile().getUserModel().getId().intValue();
                if (intValue == 0 || intValue2 == intValue) {
                    if ((fromString != NotificationType.OFFER || this.abTestService.offersEnabled()) && fromString != NotificationType.ENERGY_FULL) {
                        if (fromString == NotificationType.LEVEL) {
                            return;
                        }
                        if (((BetUpApp) getApplicationContext()).isInForeground() && (fromString == NotificationType.OFFER || fromString == NotificationType.INTERSTITIAL)) {
                            EventBus.getDefault().post(new DisplayEventPushMessage(BundleUtil.mapToBundle(hashMap)));
                            return;
                        }
                        if (fromString == NotificationType.SUPPORT) {
                            updateUnreadMessages((ChatService) getApplicationContext());
                        } else if (fromString != NotificationType.MESSAGE) {
                            hashMap.put(DebugImage.JsonKeys.UUID, storeEvent(hashMap, fromString).getUid());
                        } else {
                            updateUnreadMessages((ChatService) getApplicationContext());
                        }
                        if (((BetUpApp) getApplicationContext()).isInForeground()) {
                            ((BetUpApp) getApplicationContext()).syncUser();
                            EventBus.getDefault().post(new DisplayEventPushMessage(BundleUtil.mapToBundle(hashMap)));
                        } else {
                            buildPush(getApplicationContext(), hashMap, fromString);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.d("PUSHTEST", "FAILED TO IDENTIFY DESTINATION FOR MESSAGE: " + e.getMessage());
        }
    }

    private void updateUnreadMessages(ChatService chatService) {
        chatService.refreshUnreadMessagesCount();
    }

    private Event storeEvent(Map<String, String> data, NotificationType type) {
        ArrayList arrayList = new ArrayList();
        for (String str : data.keySet()) {
            Log.d("PUSHTEST", str + " = " + data.get(str));
            arrayList.add(new EventParam(str, data.get(str)));
        }
        Event event = new Event();
        event.setBody(data.get("body"));
        event.setUserId(Integer.valueOf(data.get("userId")).intValue());
        event.setGotTimestamp(System.currentTimeMillis());
        event.setSentTimestamp(System.currentTimeMillis());
        event.setTitle(data.get("title"));
        event.setType(type);
        event.setUid(UUID.randomUUID().toString().replace("-", ""));
        event.setNew(true);
        event.setEventParams(arrayList);
        ((PushStorageProvider) getApplicationContext()).saveEvent(event);
        return event;
    }

    /* renamed from: org.betup.services.MyFirebaseMessagingService$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$local$entity$NotificationType;

        static {
            int[] iArr = new int[NotificationType.values().length];
            $SwitchMap$org$betup$model$local$entity$NotificationType = iArr;
            try {
                iArr[NotificationType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.SUPPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void buildPush(Context context, Map<String, String> data, NotificationType type) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$local$entity$NotificationType[type.ordinal()];
        if (i == 1) {
            displayMessageNotification(context, data);
        } else if (i == 2) {
            displaySupportNotification(context, data);
        } else {
            displaySimpleNotification(context, data);
        }
    }

    private void applyNotificationTheme(RemoteViews contentView) {
        Context createThemedContext = createThemedContext(isSystemInDarkMode());
        int color = ContextCompat.getColor(createThemedContext, R.color.notification_push_title);
        int color2 = ContextCompat.getColor(createThemedContext, R.color.notification_push_body);
        contentView.setTextColor(R.id.title, color);
        contentView.setTextColor(R.id.body, color2);
    }

    private boolean isSystemInDarkMode() {
        return (Resources.getSystem().getConfiguration().uiMode & 48) == 32;
    }

    private Context createThemedContext(boolean isDarkMode) {
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.uiMode = (isDarkMode ? 32 : 16) | (configuration.uiMode & (-49));
        return createConfigurationContext(configuration);
    }

    private Bitmap resolveMessageAvatar(String iconUrl) {
        if (iconUrl == null || iconUrl.isEmpty() || iconUrl.contains(INCOGNITO_AVATAR_PATH)) {
            return BitmapFactory.decodeResource(getResources(), R.drawable.profile_ic_gray);
        }
        try {
            Bitmap bitmap = Picasso.get().load(iconUrl).get();
            return bitmap != null ? bitmap : BitmapFactory.decodeResource(getResources(), R.drawable.profile_ic_gray);
        } catch (Exception e) {
            Log.d("PUSHTEST", "ERROR LOADING MESSAGE AVATAR!", e);
            return BitmapFactory.decodeResource(getResources(), R.drawable.profile_ic_gray);
        }
    }

    private void displayMessageNotification(Context context, Map<String, String> data) {
        Log.d("PUSHTEST", "DISPLAYING SIMPLE MESSAGE");
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.message_push);
        remoteViews.setTextViewText(R.id.body, data.get("body"));
        remoteViews.setTextViewText(R.id.title, data.get("title"));
        remoteViews.setImageViewBitmap(R.id.messagePushIcon, cropBitmapToCircle(resolveMessageAvatar(data.get(UnifiedMediationParams.KEY_ICON_URL))));
        applyNotificationTheme(remoteViews);
        Notification build = new NotificationCompat.Builder(this, DEFAULT_CHANNEL).setSmallIcon(R.drawable.icon_push).setContent(remoteViews).setGroup("BASE_GROUP").setAutoCancel(true).setColor(-65536).setContentIntent(prepareIntent(data)).build();
        int abs = Math.abs(new Random().nextInt() % 100000);
        NotificationManagerCompat from = NotificationManagerCompat.from(this);
        if (ActivityCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        from.notify(abs, build);
    }

    private void displaySupportNotification(Context context, Map<String, String> data) {
        Log.d("PUSHTEST", "DISPLAYING SUPPORT NOTIFICATION");
        int intValue = this.userService.getShortProfile().getUserModel().getId().intValue();
        int intValue2 = data.containsKey("userId") ? Integer.valueOf(data.get("userId")).intValue() : 0;
        if (intValue2 != 0 && intValue != intValue2) {
            Log.i(TAG_USER_ID, "Invalid user ID!");
            return;
        }
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.message_push);
        remoteViews.setTextViewText(R.id.body, data.get("body"));
        remoteViews.setTextViewText(R.id.title, data.get("title"));
        remoteViews.setImageViewBitmap(R.id.messagePushIcon, cropBitmapToCircle(BitmapFactory.decodeResource(getResources(), R.drawable.support_new_img_inside)));
        applyNotificationTheme(remoteViews);
        Notification build = new NotificationCompat.Builder(this, DEFAULT_CHANNEL).setSmallIcon(R.drawable.icon_push).setContent(remoteViews).setGroup("BASE_GROUP").setAutoCancel(true).setColor(-65536).setContentIntent(prepareIntent(data)).build();
        int abs = Math.abs(new Random().nextInt() % 100000);
        NotificationManagerCompat from = NotificationManagerCompat.from(this);
        if (ActivityCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        from.notify(abs, build);
    }

    private void displaySimpleNotification(Context context, Map<String, String> data) {
        Log.d("PUSHTEST", "DISPLAYING SIMPLE MESSAGE");
        if (this.userService.getShortProfile().getUserModel().getId().intValue() != Integer.valueOf(data.get("userId")).intValue()) {
            Log.i(TAG_USER_ID, "Invalid user ID!");
        } else {
            NotificationManagerCompat.from(this).notify(Math.abs(new Random().nextInt() % 100000), new NotificationCompat.Builder(this, DEFAULT_CHANNEL).setSmallIcon(R.drawable.icon_push).setContentTitle(data.get("title")).setContentText(data.get("body")).setGroup("BASE_GROUP").setAutoCancel(true).setColor(-65536).setContentIntent(prepareIntent(data)).build());
        }
    }

    private PendingIntent prepareIntent(Map<String, String> data) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getActivity(this, new Random().nextInt(), intent, 335544320);
        }
        return PendingIntent.getActivity(this, new Random().nextInt(), intent, 335544320);
    }

    private Bitmap cropBitmapToCircle(Bitmap source) {
        if (source == null) {
            return null;
        }
        int min = Math.min(source.getWidth(), source.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = min;
        float max = Math.max(f / source.getWidth(), f / source.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        matrix.postTranslate((f - (source.getWidth() * max)) / 2.0f, (f - (source.getHeight() * max)) / 2.0f);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(source, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        Bitmap createBitmap2 = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        float f2 = f / 2.0f;
        canvas2.drawCircle(f2, f2, f2, paint);
        createBitmap.recycle();
        return createBitmap2;
    }

    public static void prepareNotificationChannel(Context context) {
        NotificationChannel notificationChannel = new NotificationChannel(DEFAULT_CHANNEL, "Default channel", 3);
        notificationChannel.setDescription("Channel for notifications");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
