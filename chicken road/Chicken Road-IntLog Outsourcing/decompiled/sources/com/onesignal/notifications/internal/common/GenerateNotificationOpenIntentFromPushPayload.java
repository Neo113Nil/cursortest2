package com.onesignal.notifications.internal.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class GenerateNotificationOpenIntentFromPushPayload {
    public static final GenerateNotificationOpenIntentFromPushPayload INSTANCE = new GenerateNotificationOpenIntentFromPushPayload();

    private GenerateNotificationOpenIntentFromPushPayload() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return AndroidUtils.INSTANCE.openURLInBrowserIntent(uri);
    }

    public final GenerateNotificationOpenIntent create(Context context, JSONObject fcmPayload) {
        i.e(context, "context");
        i.e(fcmPayload, "fcmPayload");
        OSNotificationOpenBehaviorFromPushPayload oSNotificationOpenBehaviorFromPushPayload = new OSNotificationOpenBehaviorFromPushPayload(context, fcmPayload);
        return new GenerateNotificationOpenIntent(context, openBrowserIntent(oSNotificationOpenBehaviorFromPushPayload.getUri()), oSNotificationOpenBehaviorFromPushPayload.getShouldOpenApp());
    }
}
