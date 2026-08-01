package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class y2 {
    public static void a(Context context, final BidTokenCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.vungle.ads.internal.util.z.a()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            callback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!VungleAds.INSTANCE.isInitialized()) {
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            privacyManager.a(applicationContext);
        }
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new w2(context));
        ((com.vungle.ads.internal.executor.d) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new x2(context)).getValue()).a().execute(new Runnable() { // from class: com.vungle.ads.internal.y2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                y2.a(BidTokenCallback.this, lazy);
            }
        });
    }

    public static final void a(BidTokenCallback callback, Lazy bidTokenEncoder$delegate) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        l2 l2Var = new l2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        l2Var.e();
        com.vungle.ads.internal.bidding.b b = ((com.vungle.ads.internal.bidding.e) bidTokenEncoder$delegate.getValue()).b();
        l2Var.d();
        if (b.a().length() > 0) {
            callback.onBidTokenCollected(b.a());
        } else {
            l2Var.a(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            l2Var.a(b.b());
            callback.onBidTokenError(b.b());
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, l2Var, (com.vungle.ads.internal.util.s) null, 6);
    }
}
