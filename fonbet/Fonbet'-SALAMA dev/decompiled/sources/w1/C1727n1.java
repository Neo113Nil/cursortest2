package w1;

import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryNotificationListener;
import com.google.firebase.messaging.RemoteMessage;

/* renamed from: w1.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727n1 implements FlurryNotificationListener {
    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotificationListener
    public final void onAppNotificationPermissionStatusChange(boolean z4) {
        "isAppNotificationAllowed: ".concat(String.valueOf(z4));
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotificationListener
    public final void onIntegrationTypeUpdate(boolean z4) {
        "isAutoIntegration: ".concat(String.valueOf(z4));
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotificationListener
    public final /* synthetic */ void onNotificationReceived(Object obj) {
        "notification received: ".concat(String.valueOf((RemoteMessage) obj));
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotificationListener
    public final void onTokenRefresh(String str) {
        new FlurryMarketingUtils.FirebaseTokenAgent().start(new C1723m1());
    }

    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotificationListener
    public final /* synthetic */ void onUnhandledNotification(Object obj) {
        RemoteMessage remoteMessage = (RemoteMessage) obj;
        if (AbstractC1739q1.f(remoteMessage) || AbstractC1715k1.a() == null) {
            return;
        }
        AbstractC1715k1.a().onNonFlurryNotificationReceived(remoteMessage);
    }
}
