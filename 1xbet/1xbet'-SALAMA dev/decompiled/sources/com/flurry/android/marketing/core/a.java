package com.flurry.android.marketing.core;

import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements FlurryMarketingUtils.FirebaseTokenAgent.TokenListener {
    @Override // com.flurry.android.marketing.FlurryMarketingUtils.FirebaseTokenAgent.TokenListener
    public final void onComplete(String str) {
        C1010l1.r();
        FlurryFCMNotification.getInstance().tokenRefreshed(str);
        FlurryFCMNotification.getInstance().notifyTokenRefresh(str);
    }
}
