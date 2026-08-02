package com.plaid.internal;

/* loaded from: classes16.dex */
public final class K2 extends androidx.view.ViewModel {
    public static com.plaid.internal.D6 a(android.net.Uri uri) {
        if (uri == null) {
            return new com.plaid.internal.D6.d(new java.lang.IllegalStateException("Redirect with no oauth state provided"));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(uri.getHost(), com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE)) {
            java.lang.String obj = uri.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return new com.plaid.internal.D6.b(obj);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(uri.getHost(), "redirect")) {
            return kotlin.jvm.internal.Intrinsics.areEqual(uri.getHost(), "resume") ? new com.plaid.internal.D6.e() : new com.plaid.internal.D6.d(new java.lang.IllegalStateException("Invalid redirect uri: ".concat(java.lang.String.valueOf(uri))));
        }
        java.lang.String obj2 = uri.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return new com.plaid.internal.D6.a(obj2);
    }
}
