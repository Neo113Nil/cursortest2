package com.flurry.android.marketing.core;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Handler;
import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import u1.i;
import w1.AbstractC1706i0;
import w1.AbstractC1739q1;
import w1.AbstractC1741r1;
import w1.C1719l1;
import w1.L0;

/* loaded from: classes.dex */
public final class FlurryMarketingCoreModule implements i, L0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10471a = false;
    protected static boolean isFCMAutoIntegration;

    public FlurryMarketingCoreModule(Context context) {
        if (context != null) {
            init(context);
        }
    }

    public static synchronized Handler getCallbackHandler() {
        Handler handler;
        synchronized (FlurryMarketingCoreModule.class) {
            handler = (Handler) C1719l1.r().f17771a;
        }
        return handler;
    }

    public static synchronized void setCallbackHandler(Handler handler) {
        synchronized (FlurryMarketingCoreModule.class) {
            C1719l1 r7 = C1719l1.r();
            synchronized (r7) {
                r7.f17771a = handler;
            }
        }
    }

    public final synchronized void destroy() {
        f10471a = false;
    }

    @Override // w1.L0
    public final synchronized void init(Context context) {
        boolean z4;
        boolean z7;
        if (context == null) {
            AbstractC1706i0.q("context can not be null");
            return;
        }
        if (f10471a) {
            return;
        }
        C1719l1.r();
        try {
            JSONObject b7 = AbstractC1741r1.b(context);
            z4 = b7 == null ? AbstractC1739q1.f17834b : b7.getJSONObject("FlurryNotificationSettings").getJSONObject("FCM").getBoolean("autoIntegration");
        } catch (JSONException unused) {
            AbstractC1706i0.o(5, "flurryNotificationConfig.json is illegal, enable FCM auto integration by default");
            z4 = true;
        }
        isFCMAutoIntegration = z4;
        C1719l1.r();
        FlurryFCMNotification.getInstance().notifyIntegrationType(isFCMAutoIntegration);
        if (isFCMAutoIntegration) {
            new FlurryMarketingUtils.FirebaseTokenAgent().start(new a());
        }
        Executors.newSingleThreadExecutor().execute(new b(context.getApplicationContext(), isFCMAutoIntegration));
        C1719l1.r();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null && !notificationManager.areNotificationsEnabled()) {
            z7 = false;
            FlurryFCMNotification.getInstance().notifyNotificationStatus(z7);
            f10471a = true;
        }
        z7 = true;
        FlurryFCMNotification.getInstance().notifyNotificationStatus(z7);
        f10471a = true;
    }

    public final boolean isFCMAutoIntegration() {
        return isFCMAutoIntegration;
    }
}
