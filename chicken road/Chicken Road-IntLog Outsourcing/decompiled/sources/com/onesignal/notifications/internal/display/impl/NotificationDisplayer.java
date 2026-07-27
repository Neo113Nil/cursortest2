package com.onesignal.notifications.internal.display.impl;

import B4.r;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.MainThreadException;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.R;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.display.INotificationDisplayBuilder;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import e5.g;
import f4.v;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;
import u.C1458F;
import u.p;
import v.b;

/* loaded from: classes.dex */
public final class NotificationDisplayer implements INotificationDisplayer {
    private final IApplicationService _applicationService;
    private final INotificationDisplayBuilder _notificationDisplayBuilder;
    private final INotificationLimitManager _notificationLimitManager;
    private final ISummaryNotificationDisplayer _summaryNotificationDisplayer;

    public NotificationDisplayer(IApplicationService _applicationService, INotificationLimitManager _notificationLimitManager, ISummaryNotificationDisplayer _summaryNotificationDisplayer, INotificationDisplayBuilder _notificationDisplayBuilder) {
        i.e(_applicationService, "_applicationService");
        i.e(_notificationLimitManager, "_notificationLimitManager");
        i.e(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        i.e(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._notificationLimitManager = _notificationLimitManager;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final void addBackgroundImage(JSONObject jSONObject, p pVar) {
        Bitmap bitmap;
        JSONObject jSONObject2;
        String str;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            Logging.verbose$default("Cannot use background images in notifications for device on version: " + i2, null, 2, null);
            return;
        }
        String optString = jSONObject.optString("bg_img", null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = getBitmap(jSONObject2.optString("img", null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            Context currentContext = getCurrentContext();
            i.b(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), R.layout.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(R.id.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(jSONObject));
            remoteViews.setTextViewText(R.id.os_bgimage_notif_body, jSONObject.optString("alert"));
            JSONObject jSONObject3 = jSONObject2;
            setTextColor(remoteViews, jSONObject3, R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject3, R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                i.b(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    i.b(contextResources2);
                    str = contextResources2.getString(identifier);
                } else {
                    str = null;
                }
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage, bitmap);
            }
            i.b(pVar);
            pVar.f12025v.contentView = remoteViews;
            pVar.g(null);
        }
    }

    private final void applyNotificationExtender(NotificationGenerationJob notificationGenerationJob, p pVar) {
        if (notificationGenerationJob.hasExtender()) {
            try {
                Field declaredField = p.class.getDeclaredField("v");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(pVar);
                i.c(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                notificationGenerationJob.setOrgFlags(Integer.valueOf(notification.flags));
                notificationGenerationJob.setOrgSound(notification.sound);
                i.b(pVar);
                com.onesignal.notifications.internal.Notification notification2 = notificationGenerationJob.getNotification();
                i.b(notification2);
                notification2.getNotificationExtender();
                i.b(null);
                throw null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(p pVar, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, int i2) {
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = intentGeneratorForAttachingToNotifications.getNewBaseIntent(i2).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
        i.d(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(nextInt, putExtra);
        i.b(pVar);
        pVar.f12010g = newActionPendingIntent;
        pVar.f12025v.deleteIntent = this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i2));
        Notification a6 = pVar.a();
        i.d(a6, "build(...)");
        return a6;
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z5 = i.g(str.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z5) {
                    break;
                }
                length--;
            } else if (z5) {
                i2++;
            } else {
                z = true;
            }
        }
        String obj = str.subSequence(i2, length + 1).toString();
        return (r.O(obj, "http://", false) || r.O(obj, "https://", false)) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            i.b(currentContext);
            bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    i.b(currentContext2);
                    bitmap = BitmapFactory.decodeStream(currentContext2.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int resourceIcon = getResourceIcon(str);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            Logging.warn("Could not download image!", th);
            return null;
        }
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final int getDrawableId(String str) {
        Resources contextResources = getContextResources();
        i.b(contextResources);
        return contextResources.getIdentifier(str, "drawable", getPackageName());
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z5 = i.g(str.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z5) {
                    break;
                }
                length--;
            } else if (z5) {
                i2++;
            } else {
                z = true;
            }
        }
        String obj = str.subSequence(i2, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(obj)) {
            return 0;
        }
        int drawableId = getDrawableId(obj);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private final Integer safeGetColorFromHex(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i2, String str, String str2) {
        Integer safeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (safeGetColorFromHex != null) {
            remoteViews.setTextColor(i2, safeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        i.b(contextResources);
        int identifier = contextResources.getIdentifier(str2, "color", getPackageName());
        if (identifier != 0) {
            remoteViews.setTextColor(i2, b.a(getCurrentContext(), identifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNotification(NotificationGenerationJob notificationGenerationJob, InterfaceC1218d interfaceC1218d) {
        NotificationDisplayer$showNotification$1 notificationDisplayer$showNotification$1;
        int i2;
        JSONObject jsonPayload;
        String str;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder;
        ArrayList<StatusBarNotification> arrayList;
        NotificationDisplayer notificationDisplayer;
        NotificationGenerationJob notificationGenerationJob2;
        int i3;
        p pVar;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications;
        Notification createGenericPendingIntentsForNotif;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder2;
        NotificationDisplayer notificationDisplayer2;
        String channelId;
        if (interfaceC1218d instanceof NotificationDisplayer$showNotification$1) {
            notificationDisplayer$showNotification$1 = (NotificationDisplayer$showNotification$1) interfaceC1218d;
            int i6 = notificationDisplayer$showNotification$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationDisplayer$showNotification$1.label = i6 - Integer.MIN_VALUE;
                NotificationDisplayer$showNotification$1 notificationDisplayer$showNotification$12 = notificationDisplayer$showNotification$1;
                Object obj = notificationDisplayer$showNotification$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationDisplayer$showNotification$12.label;
                boolean z = true;
                if (i2 != 0) {
                    g.y(obj);
                    int androidId = notificationGenerationJob.getAndroidId();
                    jsonPayload = notificationGenerationJob.getJsonPayload();
                    i.b(jsonPayload);
                    String safeString = JSONObjectExtensionsKt.safeString(jsonPayload, "grp");
                    IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2 = new IntentGeneratorForAttachingToNotifications(getCurrentContext());
                    new ArrayList();
                    NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
                    ArrayList<StatusBarNotification> activeGrouplessNotifications = notificationHelper.getActiveGrouplessNotifications(getCurrentContext());
                    if (safeString != null || activeGrouplessNotifications.size() < 3) {
                        str = safeString;
                    } else {
                        notificationHelper.assignGrouplessNotifications(getCurrentContext(), activeGrouplessNotifications);
                        str = NotificationHelper.GROUPLESS_SUMMARY_KEY;
                    }
                    NotificationDisplayBuilder.OneSignalNotificationBuilder baseOneSignalNotificationBuilder = this._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob);
                    p compatBuilder = baseOneSignalNotificationBuilder.getCompatBuilder();
                    this._notificationDisplayBuilder.addNotificationActionButtons(jsonPayload, intentGeneratorForAttachingToNotifications2, compatBuilder, androidId, null);
                    try {
                        addBackgroundImage(jsonPayload, compatBuilder);
                    } catch (Throwable th) {
                        Logging.error("Could not set background notification image!", th);
                    }
                    applyNotificationExtender(notificationGenerationJob, compatBuilder);
                    if (notificationGenerationJob.isRestoring()) {
                        this._notificationDisplayBuilder.removeNotifyOptions(compatBuilder);
                    }
                    int i7 = str == null ? 1 : 2;
                    INotificationLimitManager iNotificationLimitManager = this._notificationLimitManager;
                    notificationDisplayer$showNotification$12.L$0 = this;
                    notificationDisplayer$showNotification$12.L$1 = notificationGenerationJob;
                    notificationDisplayer$showNotification$12.L$2 = jsonPayload;
                    notificationDisplayer$showNotification$12.L$3 = str;
                    notificationDisplayer$showNotification$12.L$4 = intentGeneratorForAttachingToNotifications2;
                    notificationDisplayer$showNotification$12.L$5 = activeGrouplessNotifications;
                    notificationDisplayer$showNotification$12.L$6 = baseOneSignalNotificationBuilder;
                    notificationDisplayer$showNotification$12.L$7 = compatBuilder;
                    notificationDisplayer$showNotification$12.I$0 = androidId;
                    notificationDisplayer$showNotification$12.label = 1;
                    if (iNotificationLimitManager.clearOldestOverLimit(i7, notificationDisplayer$showNotification$12) == enumC1260a) {
                        return enumC1260a;
                    }
                    oneSignalNotificationBuilder = baseOneSignalNotificationBuilder;
                    arrayList = activeGrouplessNotifications;
                    notificationDisplayer = this;
                    notificationGenerationJob2 = notificationGenerationJob;
                    i3 = androidId;
                    pVar = compatBuilder;
                    intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = notificationDisplayer$showNotification$12.I$0;
                        createGenericPendingIntentsForNotif = (Notification) notificationDisplayer$showNotification$12.L$2;
                        oneSignalNotificationBuilder2 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) notificationDisplayer$showNotification$12.L$1;
                        notificationDisplayer2 = (NotificationDisplayer) notificationDisplayer$showNotification$12.L$0;
                        g.y(obj);
                        oneSignalNotificationBuilder = oneSignalNotificationBuilder2;
                        notificationDisplayer = notificationDisplayer2;
                        notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, createGenericPendingIntentsForNotif);
                        Context currentContext = notificationDisplayer.getCurrentContext();
                        i.b(currentContext);
                        new C1458F(currentContext).a(i3, createGenericPendingIntentsForNotif);
                        if (Build.VERSION.SDK_INT >= 26) {
                            NotificationHelper notificationHelper2 = NotificationHelper.INSTANCE;
                            Context currentContext2 = notificationDisplayer.getCurrentContext();
                            i.b(currentContext2);
                            channelId = createGenericPendingIntentsForNotif.getChannelId();
                            z = notificationHelper2.areNotificationsEnabled(currentContext2, channelId);
                        }
                        return Boolean.valueOf(z);
                    }
                    i3 = notificationDisplayer$showNotification$12.I$0;
                    pVar = (p) notificationDisplayer$showNotification$12.L$7;
                    NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder3 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) notificationDisplayer$showNotification$12.L$6;
                    ArrayList<StatusBarNotification> arrayList2 = (ArrayList) notificationDisplayer$showNotification$12.L$5;
                    intentGeneratorForAttachingToNotifications = (IntentGeneratorForAttachingToNotifications) notificationDisplayer$showNotification$12.L$4;
                    str = (String) notificationDisplayer$showNotification$12.L$3;
                    jsonPayload = (JSONObject) notificationDisplayer$showNotification$12.L$2;
                    NotificationGenerationJob notificationGenerationJob3 = (NotificationGenerationJob) notificationDisplayer$showNotification$12.L$1;
                    NotificationDisplayer notificationDisplayer3 = (NotificationDisplayer) notificationDisplayer$showNotification$12.L$0;
                    g.y(obj);
                    oneSignalNotificationBuilder = oneSignalNotificationBuilder3;
                    arrayList = arrayList2;
                    notificationDisplayer = notificationDisplayer3;
                    notificationGenerationJob2 = notificationGenerationJob3;
                }
                if (str != null) {
                    createGenericPendingIntentsForNotif = notificationDisplayer.createGenericPendingIntentsForNotif(pVar, intentGeneratorForAttachingToNotifications, jsonPayload, i3);
                    notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, createGenericPendingIntentsForNotif);
                    Context currentContext3 = notificationDisplayer.getCurrentContext();
                    i.b(currentContext3);
                    new C1458F(currentContext3).a(i3, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    return Boolean.valueOf(z);
                }
                notificationDisplayer._summaryNotificationDisplayer.createGenericPendingIntentsForGroup(pVar, intentGeneratorForAttachingToNotifications, jsonPayload, str, i3);
                Notification createSingleNotificationBeforeSummaryBuilder = notificationDisplayer._summaryNotificationDisplayer.createSingleNotificationBeforeSummaryBuilder(notificationGenerationJob2, pVar);
                if (str.equals(NotificationHelper.GROUPLESS_SUMMARY_KEY)) {
                    ISummaryNotificationDisplayer iSummaryNotificationDisplayer = notificationDisplayer._summaryNotificationDisplayer;
                    int size = arrayList.size() + 1;
                    int groupAlertBehavior = notificationDisplayer._notificationDisplayBuilder.getGroupAlertBehavior();
                    notificationDisplayer$showNotification$12.L$0 = notificationDisplayer;
                    notificationDisplayer$showNotification$12.L$1 = oneSignalNotificationBuilder;
                    notificationDisplayer$showNotification$12.L$2 = createSingleNotificationBeforeSummaryBuilder;
                    notificationDisplayer$showNotification$12.L$3 = null;
                    notificationDisplayer$showNotification$12.L$4 = null;
                    notificationDisplayer$showNotification$12.L$5 = null;
                    notificationDisplayer$showNotification$12.L$6 = null;
                    notificationDisplayer$showNotification$12.L$7 = null;
                    notificationDisplayer$showNotification$12.I$0 = i3;
                    notificationDisplayer$showNotification$12.label = 2;
                    if (iSummaryNotificationDisplayer.createGrouplessSummaryNotification(notificationGenerationJob2, intentGeneratorForAttachingToNotifications, size, groupAlertBehavior, notificationDisplayer$showNotification$12) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    ISummaryNotificationDisplayer iSummaryNotificationDisplayer2 = notificationDisplayer._summaryNotificationDisplayer;
                    int groupAlertBehavior2 = notificationDisplayer._notificationDisplayBuilder.getGroupAlertBehavior();
                    notificationDisplayer$showNotification$12.L$0 = notificationDisplayer;
                    notificationDisplayer$showNotification$12.L$1 = oneSignalNotificationBuilder;
                    notificationDisplayer$showNotification$12.L$2 = createSingleNotificationBeforeSummaryBuilder;
                    notificationDisplayer$showNotification$12.L$3 = null;
                    notificationDisplayer$showNotification$12.L$4 = null;
                    notificationDisplayer$showNotification$12.L$5 = null;
                    notificationDisplayer$showNotification$12.L$6 = null;
                    notificationDisplayer$showNotification$12.L$7 = null;
                    notificationDisplayer$showNotification$12.I$0 = i3;
                    notificationDisplayer$showNotification$12.label = 3;
                    if (iSummaryNotificationDisplayer2.createSummaryNotification(notificationGenerationJob2, oneSignalNotificationBuilder, groupAlertBehavior2, notificationDisplayer$showNotification$12) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                oneSignalNotificationBuilder2 = oneSignalNotificationBuilder;
                notificationDisplayer2 = notificationDisplayer;
                createGenericPendingIntentsForNotif = createSingleNotificationBeforeSummaryBuilder;
                oneSignalNotificationBuilder = oneSignalNotificationBuilder2;
                notificationDisplayer = notificationDisplayer2;
                notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, createGenericPendingIntentsForNotif);
                Context currentContext32 = notificationDisplayer.getCurrentContext();
                i.b(currentContext32);
                new C1458F(currentContext32).a(i3, createGenericPendingIntentsForNotif);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                return Boolean.valueOf(z);
            }
        }
        notificationDisplayer$showNotification$1 = new NotificationDisplayer$showNotification$1(this, interfaceC1218d);
        NotificationDisplayer$showNotification$1 notificationDisplayer$showNotification$122 = notificationDisplayer$showNotification$1;
        Object obj2 = notificationDisplayer$showNotification$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationDisplayer$showNotification$122.label;
        boolean z5 = true;
        if (i2 != 0) {
        }
        if (str != null) {
        }
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayer
    public Object displayNotification(NotificationGenerationJob notificationGenerationJob, InterfaceC1218d interfaceC1218d) {
        isRunningOnMainThreadCheck();
        return showNotification(notificationGenerationJob, interfaceC1218d);
    }

    public final v isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new MainThreadException("Process for showing a notification should never been done on Main Thread!");
        }
        return v.f5689a;
    }
}
