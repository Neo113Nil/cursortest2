package com.onesignal.notifications.internal.common;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotification;
import com.onesignal.notifications.internal.NotificationClickEvent;
import com.onesignal.notifications.internal.NotificationClickResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.AbstractC1453A;
import u.C1458F;

/* loaded from: classes.dex */
public final class NotificationHelper {
    public static final int GROUPLESS_SUMMARY_ID = -718463522;
    public static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";
    public static final NotificationHelper INSTANCE = new NotificationHelper();

    private NotificationHelper() {
    }

    public static /* synthetic */ boolean areNotificationsEnabled$default(NotificationHelper notificationHelper, Context context, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return notificationHelper.areNotificationsEnabled(context, str);
    }

    public final boolean areNotificationsEnabled(Context context, String str) {
        int importance;
        i.e(context, "context");
        try {
            if (!AbstractC1453A.a(new C1458F(context).f11989b)) {
                return false;
            }
            if (str == null || Build.VERSION.SDK_INT < 26) {
                return true;
            }
            NotificationManager notificationManager = getNotificationManager(context);
            NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(str) : null;
            if (notificationChannel == null) {
                return true;
            }
            importance = notificationChannel.getImportance();
            return importance != 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> grouplessNotifs) {
        i.e(grouplessNotifs, "grouplessNotifs");
        Iterator<StatusBarNotification> it = grouplessNotifs.iterator();
        while (it.hasNext()) {
            StatusBarNotification next = it.next();
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, next.getNotification());
            i.d(recoverBuilder, "recoverBuilder(...)");
            Notification build = recoverBuilder.setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            i.d(build, "build(...)");
            i.b(context);
            new C1458F(context).a(next.getId(), build);
        }
    }

    public final NotificationClickEvent generateNotificationOpenedResult$com_onesignal_notifications(JSONArray jsonArray, ITime time) {
        i.e(jsonArray, "jsonArray");
        i.e(time, "time");
        int length = jsonArray.length();
        int optInt = jsonArray.optJSONObject(0).optInt(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID);
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        JSONObject jSONObject = null;
        String str = null;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jSONObject = jsonArray.getJSONObject(i2);
                if (str == null && jSONObject.has(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID)) {
                    str = jSONObject.optString(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, null);
                }
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new com.onesignal.notifications.internal.Notification(jSONObject, time));
                }
            } catch (Throwable th) {
                Logging.error("Error parsing JSON item " + i2 + '/' + length + " for callback.", th);
            }
        }
        i.b(jSONObject);
        com.onesignal.notifications.internal.Notification notification = new com.onesignal.notifications.internal.Notification(arrayList, jSONObject, optInt, time);
        return new NotificationClickEvent(notification, new NotificationClickResult(str, notification.getLaunchURL()));
    }

    public final ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        i.e(context, "context");
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean isGroupSummary = isGroupSummary(statusBarNotification);
            boolean z = notification.getGroup() == null || i.a(notification.getGroup(), GROUPLESS_SUMMARY_KEY);
            if (!isGroupSummary && z) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final StatusBarNotification[] getActiveNotifications(Context context) {
        i.e(context, "context");
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            StatusBarNotification[] activeNotifications = getNotificationManager(context).getActiveNotifications();
            i.d(activeNotifications, "getActiveNotifications(...)");
            return activeNotifications;
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public final String getCampaignNameFromNotification(INotification notification) {
        String templateId;
        i.e(notification, "notification");
        String templateName = notification.getTemplateName();
        if ((templateName == null || templateName.length() != 0) && ((templateId = notification.getTemplateId()) == null || templateId.length() != 0)) {
            return notification.getTemplateName() + " - " + notification.getTemplateId();
        }
        if (notification.getTitle() == null) {
            return "";
        }
        String title = notification.getTitle();
        i.b(title);
        String title2 = notification.getTitle();
        i.b(title2);
        String substring = title.substring(0, Math.min(10, title2.length()));
        i.d(substring, "substring(...)");
        return substring;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) {
        i.e(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
    }

    public final int getGrouplessNotifsCount(Context context) {
        i.e(context, "context");
        int i2 = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if ((statusBarNotification.getNotification().flags & 512) == 0 && GROUPLESS_SUMMARY_KEY.equals(statusBarNotification.getNotification().getGroup())) {
                i2++;
            }
        }
        return i2;
    }

    public final String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
        } catch (JSONException unused) {
            Logging.debug$default("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.", null, 2, null);
        }
        if (jSONObject2.has("i")) {
            return jSONObject2.optString("i", null);
        }
        Logging.debug$default("Not a OneSignal formatted FCM message. No 'i' field in custom.", null, 2, null);
        return null;
    }

    public final NotificationManager getNotificationManager(Context context) {
        i.e(context, "context");
        Object systemService = context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final Uri getSoundUri(Context context, String str) {
        int identifier;
        i.e(context, "context");
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (AndroidUtils.INSTANCE.isValidResourceName(str) && (identifier = resources.getIdentifier(str, "raw", packageName)) != 0) {
            return Uri.parse("android.resource://" + packageName + '/' + identifier);
        }
        int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
        if (identifier2 == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + packageName + '/' + identifier2);
    }

    public final boolean isGroupSummary(StatusBarNotification notif) {
        i.e(notif, "notif");
        return (notif.getNotification().flags & 512) != 0;
    }

    public final long[] parseVibrationPattern(JSONObject fcmBundle) {
        JSONArray jSONArray;
        i.e(fcmBundle, "fcmBundle");
        try {
            Object opt = fcmBundle.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                i.c(opt, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.optLong(i2);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }
}
