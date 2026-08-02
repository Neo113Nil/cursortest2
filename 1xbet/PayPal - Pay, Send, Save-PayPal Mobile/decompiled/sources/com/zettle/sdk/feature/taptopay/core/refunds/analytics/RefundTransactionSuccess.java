package com.zettle.sdk.feature.taptopay.core.refunds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionSuccess;", "Lkotlin/Function2;", "", "", "", "transactionId", "amount", "invoke", "(Ljava/lang/String;J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RefundTransactionSuccess extends kotlin.jvm.functions.Function2<java.lang.String, java.lang.Long, kotlin.Unit> {
    void invoke(java.lang.String transactionId, long amount);
}
