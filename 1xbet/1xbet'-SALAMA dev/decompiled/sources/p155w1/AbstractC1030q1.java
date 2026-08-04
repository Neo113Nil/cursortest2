package p155w1;

import F.u;
import F.v;
import F.w;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.flurry.android.marketing.messaging.notification.FlurryNotificationFilter;
import com.flurry.android.marketing.messaging.notification.NotificationCancelledReceiver;
import com.flurry.android.marketing.messaging.notification.NotificationClickedActivity;
import com.flurry.android.marketing.messaging.notification.NotificationClickedReceiver;
import com.flurry.android.marketing.messaging.notification.b;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: w1.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1030q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f17839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f17840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1018n1 f17841c = new C1018n1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FlurryNotificationFilter f17842d = new FlurryNotificationFilter.Builder().withNextPath("fl.Data").withListener(new C1022o1()).build();

    public static FlurryMessage a(Intent intent) {
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    return Build.VERSION.SDK_INT >= 33 ? (FlurryMessage) intent.getExtras().getParcelable("flurryMessage", FlurryMessage.class) : (FlurryMessage) intent.getExtras().getParcelable("flurryMessage");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void b(Context context, Intent intent) {
        FlurryMessage flurryMessageA = a(intent);
        if (flurryMessageA == null) {
            AbstractC0997i0.o(3, "No flurry message received in the clicked notification.");
            return;
        }
        flurryMessageA.getNotificationId();
        T0 t0A = T0.a();
        if (t0A.f17549g) {
            AbstractC0997i0.o(5, "Cold Start time is already measured, reportLaunched will be ignored.");
        } else {
            Context context2 = AbstractC0998i1.f17749c;
            Runtime runtime = Runtime.getRuntime();
            ActivityManager.MemoryInfo memoryInfoA = AbstractC0997i0.a(context2);
            long jNanoTime = System.nanoTime();
            T0.f17542k = jNanoTime;
            t0A.f17543a = jNanoTime;
            t0A.f17544b = runtime.totalMemory() - runtime.freeMemory();
            t0A.f17545c = memoryInfoA.totalMem - memoryInfoA.availMem;
        }
        AbstractC1006k1.e(new b(11, flurryMessageA, context, false));
        if (AbstractC1006k1.n()) {
            d("Flurry.PushOpened", flurryMessageA.getFlurryData());
        }
    }

    public static void c(Context context, String str, String str2) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager.getNotificationChannel(str) == null) {
            HashMap map = new HashMap(5);
            map.put("2", 4);
            map.put("1", 4);
            map.put("-2", 1);
            map.put("-1", 2);
            int iIntValue = 3;
            map.put("0", 3);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    iIntValue = map.containsKey(str2) ? ((Integer) map.get(str2)).intValue() : Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                    "Invalid notification  value from payload: ".concat(String.valueOf(str2));
                }
            }
            NotificationChannel notificationChannelC = p097n3.b.c(iIntValue, str);
            notificationChannelC.setDescription("General news and announcements");
            notificationChannelC.enableLights(true);
            notificationChannelC.enableVibration(true);
            notificationChannelC.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannelC);
        }
    }

    public static void d(String str, HashMap map) {
        if (map == null) {
            AbstractC0997i0.q("Attempting to log notification event with a non flurry notification.");
            return;
        }
        C0993h0 c0993h0 = H2.a().f17412k;
        c0993h0.getClass();
        c0993h0.d(new C0985f0(3, 0, c0993h0, true));
        Collections.emptyMap();
        r.i().j(str, 4, map);
        Collections.emptyMap();
        C0993h0 c0993h1 = H2.a().f17412k;
        c0993h1.getClass();
        c0993h1.d(new C0985f0(3, 1, c0993h1, true));
    }

    public static void e(boolean z4, Handler handler) {
        f17840b = z4;
        if (z4) {
            new FlurryMarketingUtils.FirebaseTokenAgent().start(new C1026p1());
        }
        C1010l1 c1010l1R = C1010l1.r();
        synchronized (c1010l1R) {
            c1010l1R.f17777a = handler;
        }
        FlurryFCMNotification.getInstance().addNotificationListener("flurryMarketing", f17841c);
        f17839a = FlurryFCMNotification.getInstance().addNotificationFilter(f17842d);
    }

    public static boolean f(RemoteMessage remoteMessage) {
        if (remoteMessage != null && remoteMessage.getData() != null && !TextUtils.isEmpty((CharSequence) remoteMessage.getData().get("fl.Data")) && remoteMessage.getNotification() == null) {
            return true;
        }
        AbstractC0997i0.q("Can't convert FCM message to Flurry Message as this was not a Flurry based notification.");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0180  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0189, please report this as an issue */
    public static void g(Context context, FlurryMessage flurryMessage) {
        int identifier;
        PendingIntent broadcast;
        int i7;
        int color;
        int identifier2;
        String priority;
        String str;
        ApplicationInfo applicationInfo;
        if (flurryMessage == null) {
            AbstractC0997i0.q("Can't show or log a null notification object.");
            return;
        }
        w wVar = new w(context, "default notification");
        String icon = flurryMessage.getIcon();
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(icon) || (identifier = resources.getIdentifier(icon, "drawable", context.getPackageName())) == 0) {
            identifier = AbstractC1006k1.f17768e;
            if (identifier != -1) {
                try {
                    if (resources.getDrawable(identifier) == null) {
                    }
                } catch (Resources.NotFoundException e7) {
                    AbstractC0997i0.o(5, "Error getting default icon from marketing: ".concat(String.valueOf(e7)));
                }
            } else {
                AbstractC0997i0.o(3, "No default icon provided for push notification, falling back to app icon.");
            }
            try {
                identifier = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
            } catch (PackageManager.NameNotFoundException e8) {
                e8.printStackTrace();
                identifier = 0;
            }
        }
        int notificationId = flurryMessage.getNotificationId();
        if (Build.VERSION.SDK_INT >= 31) {
            Intent intent = new Intent(context, (Class<?>) NotificationClickedActivity.class);
            intent.putExtra("flurryMessage", flurryMessage);
            broadcast = PendingIntent.getActivity(context, flurryMessage.notificationId, intent, 201326592);
        } else {
            Intent intent2 = new Intent(context, (Class<?>) NotificationClickedReceiver.class);
            intent2.putExtra("flurryMessage", flurryMessage);
            broadcast = PendingIntent.getBroadcast(context, flurryMessage.notificationId, intent2, 201326592);
        }
        Intent intent3 = new Intent(context, (Class<?>) NotificationCancelledReceiver.class);
        intent3.putExtra("flurryMessage", flurryMessage);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, flurryMessage.notificationId, intent3, 201326592);
        String priority2 = flurryMessage.getPriority();
        if (TextUtils.isEmpty(priority2)) {
            i7 = 0;
        } else {
            try {
                i7 = Integer.parseInt(priority2);
            } catch (NumberFormatException unused) {
                "Invalid notification priority from payload: ".concat(String.valueOf(priority2));
                i7 = 0;
            }
        }
        u uVar = new u();
        uVar.f2476b = w.b(flurryMessage.getTitle());
        uVar.f2455c = w.b(flurryMessage.getBody());
        wVar.f2473s.icon = identifier;
        wVar.f2460e = w.b(flurryMessage.getTitle());
        wVar.f2461f = w.b(flurryMessage.getBody());
        wVar.c(16);
        wVar.f2462g = broadcast;
        Notification notification = wVar.f2473s;
        notification.deleteIntent = broadcast2;
        notification.defaults = 6;
        notification.flags |= 1;
        wVar.f2464i = i7;
        wVar.e(uVar);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 && i8 >= 26) {
            try {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                if (packageManager == null || TextUtils.isEmpty(packageName)) {
                    priority = flurryMessage.getPriority();
                    str = AbstractC1006k1.f17767d;
                    if (!TextUtils.isEmpty(str)) {
                        AbstractC0997i0.q("A default notification channel id was NOT specified.Flurry will create and post the notification on Flurry's default channel.");
                        str = context.getPackageName() + ".flurry";
                        c(context, str, priority);
                    } else if (!TextUtils.isEmpty(str) || ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str) == null) {
                        AbstractC0997i0.q("A default notification channel id was specified, but the channel itself was not created.Flurry will create and post the notification on Flurry's default channel.");
                        c(context, str, priority);
                    } else {
                        String str2 = context.getPackageName() + ".flurry";
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager.getNotificationChannel(str2) != null) {
                            notificationManager.deleteNotificationChannel(str2);
                        }
                    }
                    wVar.f2471q = str;
                } else {
                    PackageInfo packageInfo = i8 >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
                    if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || applicationInfo.targetSdkVersion >= 26) {
                        priority = flurryMessage.getPriority();
                        str = AbstractC1006k1.f17767d;
                        if (!TextUtils.isEmpty(str)) {
                            AbstractC0997i0.q("A default notification channel id was NOT specified.Flurry will create and post the notification on Flurry's default channel.");
                            str = context.getPackageName() + ".flurry";
                            c(context, str, priority);
                        } else if (TextUtils.isEmpty(str)) {
                            AbstractC0997i0.q("A default notification channel id was specified, but the channel itself was not created.Flurry will create and post the notification on Flurry's default channel.");
                            c(context, str, priority);
                        } else {
                            AbstractC0997i0.q("A default notification channel id was specified, but the channel itself was not created.Flurry will create and post the notification on Flurry's default channel.");
                            c(context, str, priority);
                        }
                        wVar.f2471q = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException | RuntimeException unused2) {
            }
        }
        String color2 = flurryMessage.getColor();
        if (TextUtils.isEmpty(color2)) {
            color = -1;
        } else {
            try {
                color = Color.parseColor(color2);
            } catch (Exception unused3) {
                color = -1;
            }
        }
        if (color != -1) {
            wVar.f2469o = color;
        } else {
            int i9 = AbstractC1006k1.f17769f;
            if (i9 != -1) {
                wVar.f2469o = i9;
            }
        }
        if (!TextUtils.isEmpty(flurryMessage.getSound())) {
            String sound = flurryMessage.getSound();
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            if (!TextUtils.isEmpty(sound) && (identifier2 = context.getResources().getIdentifier(sound, "raw", context.getPackageName())) != 0) {
                defaultUri = Uri.parse(String.format(Locale.getDefault(), "android.resource://%s/%d", context.getPackageName(), Integer.valueOf(identifier2)));
            }
            defaultUri.toString();
            Notification notification2 = wVar.f2473s;
            notification2.sound = defaultUri;
            notification2.audioStreamType = -1;
            notification2.audioAttributes = v.a(v.e(v.c(v.b(), 4), 5));
        }
        ((NotificationManager) context.getSystemService("notification")).notify(notificationId, wVar.a());
    }
}
