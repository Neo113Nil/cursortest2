package p155w1;

import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;

/* JADX INFO: renamed from: w1.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1014m1 implements FlurryMarketingUtils.FirebaseTokenAgent.TokenListener {
    @Override // com.flurry.android.marketing.FlurryMarketingUtils.FirebaseTokenAgent.TokenListener
    public final void onComplete(String str) {
        "FCMInstanceIDListenerService, refreshed token: ".concat(String.valueOf(str));
        FlurryMessagingListener flurryMessagingListener = AbstractC1006k1.f17764a;
        if (flurryMessagingListener != null) {
            flurryMessagingListener.onTokenRefresh(str);
        }
    }
}
