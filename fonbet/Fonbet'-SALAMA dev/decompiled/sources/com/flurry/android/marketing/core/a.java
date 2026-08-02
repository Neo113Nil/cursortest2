package com.flurry.android.marketing.core;

import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class a implements FlurryMarketingUtils.FirebaseTokenAgent.TokenListener {
    @Override // com.flurry.android.marketing.FlurryMarketingUtils.FirebaseTokenAgent.TokenListener
    public final void onComplete(String str) {
        C1719l1.r();
        FlurryFCMNotification.getInstance().tokenRefreshed(str);
        FlurryFCMNotification.getInstance().notifyTokenRefresh(str);
    }
}
