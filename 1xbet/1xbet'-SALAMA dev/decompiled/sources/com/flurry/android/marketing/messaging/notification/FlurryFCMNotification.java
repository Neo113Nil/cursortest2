package com.flurry.android.marketing.messaging.notification;

import com.google.firebase.messaging.RemoteMessage;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC0998i1;
import p155w1.AbstractC1030q1;
import p155w1.C0965a0;
import p155w1.H2;
import p155w1.Z;

/* JADX INFO: loaded from: classes.dex */
public final class FlurryFCMNotification extends FlurryNotification<RemoteMessage> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static FlurryFCMNotification f10475c;

    public static synchronized FlurryFCMNotification getInstance() {
        try {
            if (f10475c == null) {
                f10475c = new FlurryFCMNotification();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10475c;
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotification
    public final FlurryNotificationFilter<RemoteMessage> defaultNotificationFilter() {
        return AbstractC1030q1.f17842d;
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotification
    public final void tokenRefreshed(String str) {
        this.token = str;
        "FCM token is refreshed: ".concat(String.valueOf(str));
        if (AbstractC0998i1.f17749c != null) {
            C0965a0 c0965a0 = H2.a().j;
            Collections.emptyMap();
            c0965a0.f17641A = str;
            c0965a0.h(new Z(str, c0965a0.f17642B));
        }
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotification
    public final JSONObject convertToJson(RemoteMessage remoteMessage) {
        Map data = remoteMessage.getData();
        if (data == null || data.isEmpty()) {
            AbstractC0997i0.t("FCM message doesn't contain data");
            return null;
        }
        try {
            return FlurryNotification.convertMapToJson(data);
        } catch (JSONException unused) {
            AbstractC0997i0.q("Can not parse FCM message");
            return null;
        }
    }
}
