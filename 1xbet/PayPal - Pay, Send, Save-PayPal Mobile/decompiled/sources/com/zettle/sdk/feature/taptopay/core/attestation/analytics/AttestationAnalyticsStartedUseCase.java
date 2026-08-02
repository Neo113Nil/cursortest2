package com.zettle.sdk.feature.taptopay.core.attestation.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001J\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H¦\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsStartedUseCase;", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "", "context", "info", "invoke", "(Landroid/content/Context;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AttestationAnalyticsStartedUseCase extends kotlin.jvm.functions.Function2<android.content.Context, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo, kotlin.Unit> {
    void invoke(android.content.Context context, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info);
}
