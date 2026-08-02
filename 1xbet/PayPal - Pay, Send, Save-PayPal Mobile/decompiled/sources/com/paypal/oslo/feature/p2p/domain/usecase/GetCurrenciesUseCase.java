package com.paypal.oslo.feature.p2p.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/usecase/GetCurrenciesUseCase;", "", "Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;", "currencyRepository", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;)V", "", "transferAttemptID", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "", "", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "invoke", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCurrenciesUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCurrenciesUseCase(com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository currencyRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyRepository, "");
        this.getHighSpeedVideoFpsRangesFor = currencyRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<java.lang.Throwable, java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>>> invoke(java.lang.String transferAttemptID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptID, "");
        return this.getHighSpeedVideoFpsRangesFor.getCurrencies(transferAttemptID);
    }
}
