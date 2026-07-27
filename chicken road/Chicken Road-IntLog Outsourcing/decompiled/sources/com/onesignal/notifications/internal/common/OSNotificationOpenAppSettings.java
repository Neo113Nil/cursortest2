package com.onesignal.notifications.internal.common;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OSNotificationOpenAppSettings {
    public static final OSNotificationOpenAppSettings INSTANCE = new OSNotificationOpenAppSettings();

    private OSNotificationOpenAppSettings() {
    }

    public final boolean getShouldOpenActivity(Context context) {
        i.e(context, "context");
        return !"DISABLE".equals(AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean getSuppressLaunchURL(Context context) {
        i.e(context, "context");
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.suppressLaunchURLs");
    }
}
