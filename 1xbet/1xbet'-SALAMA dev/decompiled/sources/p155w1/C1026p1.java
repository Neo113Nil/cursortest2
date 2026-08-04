package p155w1;

import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;

/* JADX INFO: renamed from: w1.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1026p1 implements FlurryMarketingUtils.FirebaseTokenAgent.TokenListener {
    @Override // com.flurry.android.marketing.FlurryMarketingUtils.FirebaseTokenAgent.TokenListener
    public final void onComplete(String str) {
        FlurryFCMNotification.getInstance().tokenRefreshed(str);
    }
}
