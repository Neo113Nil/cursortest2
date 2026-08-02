package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H¦@¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PaymentRequestSettingsRepository;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "getTaxSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isTaxInclusive", "isTaxCalculatedAfterDiscount", "", "updateTaxSettings", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTaxSettings", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PaymentRequestSettingsRepository {
    java.lang.Object getTaxSettings(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings> continuation);

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings> observeTaxSettings();

    java.lang.Object updateTaxSettings(boolean z, boolean z2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
