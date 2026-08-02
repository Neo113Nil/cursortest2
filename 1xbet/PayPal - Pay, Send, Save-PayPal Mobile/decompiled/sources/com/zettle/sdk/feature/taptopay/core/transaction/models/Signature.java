package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012$\u0010\u0006\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR8\u0010\u0006\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "", "", "Lkotlin/Triple;", "", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getPoints$core_publicRelease", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Signature {
    private final java.util.List<java.util.List<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Long>>> points;

    /* JADX WARN: Multi-variable type inference failed */
    public Signature(java.util.List<? extends java.util.List<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Long>>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.points = list;
    }

    public final java.util.List<java.util.List<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Long>>> getPoints$core_publicRelease() {
        return this.points;
    }
}
