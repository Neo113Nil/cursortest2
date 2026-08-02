package w1;

import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;

/* renamed from: w1.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735p1 implements FlurryMarketingUtils.FirebaseTokenAgent.TokenListener {
    @Override // com.flurry.android.marketing.FlurryMarketingUtils.FirebaseTokenAgent.TokenListener
    public final void onComplete(String str) {
        FlurryFCMNotification.getInstance().tokenRefreshed(str);
    }
}
