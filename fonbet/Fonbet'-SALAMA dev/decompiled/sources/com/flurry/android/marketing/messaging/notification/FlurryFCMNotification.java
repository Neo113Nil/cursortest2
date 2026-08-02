package com.flurry.android.marketing.messaging.notification;

import com.google.firebase.messaging.RemoteMessage;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import w1.AbstractC1706i0;
import w1.AbstractC1707i1;
import w1.AbstractC1739q1;
import w1.C1674a0;
import w1.H2;
import w1.Z;

/* loaded from: classes.dex */
public final class FlurryFCMNotification extends FlurryNotification<RemoteMessage> {

    /* renamed from: c, reason: collision with root package name */
    public static FlurryFCMNotification f10475c;

    public static synchronized FlurryFCMNotification getInstance() {
        FlurryFCMNotification flurryFCMNotification;
        synchronized (FlurryFCMNotification.class) {
            try {
                if (f10475c == null) {
                    f10475c = new FlurryFCMNotification();
                }
                flurryFCMNotification = f10475c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return flurryFCMNotification;
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotification
    public final FlurryNotificationFilter<RemoteMessage> defaultNotificationFilter() {
        return AbstractC1739q1.f17836d;
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotification
    public final void tokenRefreshed(String str) {
        this.token = str;
        "FCM token is refreshed: ".concat(String.valueOf(str));
        if (AbstractC1707i1.f17743c != null) {
            C1674a0 c1674a0 = H2.a().j;
            Collections.emptyMap();
            c1674a0.f17635A = str;
            c1674a0.h(new Z(str, c1674a0.f17636B));
        }
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotification
    public final JSONObject convertToJson(RemoteMessage remoteMessage) {
        Map data = remoteMessage.getData();
        if (data == null || data.isEmpty()) {
            AbstractC1706i0.t("FCM message doesn't contain data");
            return null;
        }
        try {
            return FlurryNotification.convertMapToJson(data);
        } catch (JSONException unused) {
            AbstractC1706i0.q("Can not parse FCM message");
            return null;
        }
    }
}
