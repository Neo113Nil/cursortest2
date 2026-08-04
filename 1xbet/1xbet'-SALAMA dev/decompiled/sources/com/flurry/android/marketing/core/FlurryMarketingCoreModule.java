package com.flurry.android.marketing.core;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Handler;
import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p145u1.i;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC1030q1;
import p155w1.AbstractC1032r1;
import p155w1.C1010l1;
import p155w1.L0;

/* JADX INFO: loaded from: classes.dex */
public final class FlurryMarketingCoreModule implements i, L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10471a = false;
    protected static boolean isFCMAutoIntegration;

    public FlurryMarketingCoreModule(Context context) {
        if (context != null) {
            init(context);
        }
    }

    public static synchronized Handler getCallbackHandler() {
        return (Handler) C1010l1.r().f17777a;
    }

    public static synchronized void setCallbackHandler(Handler handler) {
        C1010l1 c1010l1R = C1010l1.r();
        synchronized (c1010l1R) {
            c1010l1R.f17777a = handler;
        }
    }

    public final synchronized void destroy() {
        f10471a = false;
    }

    @Override // p155w1.L0
    public final synchronized void init(Context context) {
        boolean z4;
        if (context == null) {
            AbstractC0997i0.q("context can not be null");
            return;
        }
        if (f10471a) {
            return;
        }
        C1010l1.r();
        try {
            JSONObject jSONObjectB = AbstractC1032r1.b(context);
            z4 = jSONObjectB == null ? AbstractC1030q1.f17840b : jSONObjectB.getJSONObject("FlurryNotificationSettings").getJSONObject("FCM").getBoolean("autoIntegration");
        } catch (JSONException unused) {
            AbstractC0997i0.o(5, "flurryNotificationConfig.json is illegal, enable FCM auto integration by default");
            z4 = true;
        }
        isFCMAutoIntegration = z4;
        C1010l1.r();
        FlurryFCMNotification.getInstance().notifyIntegrationType(isFCMAutoIntegration);
        if (isFCMAutoIntegration) {
            new FlurryMarketingUtils.FirebaseTokenAgent().start(new a());
        }
        Executors.newSingleThreadExecutor().execute(new b(context.getApplicationContext(), isFCMAutoIntegration));
        C1010l1.r();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        FlurryFCMNotification.getInstance().notifyNotificationStatus(notificationManager == null || notificationManager.areNotificationsEnabled());
        f10471a = true;
    }

    public final boolean isFCMAutoIntegration() {
        return isFCMAutoIntegration;
    }
}
