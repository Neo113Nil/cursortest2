package com.paypal.oslo.feature.p2p.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JJ\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/usecase/GetFxQuoteUseCase;", "", "Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;", "currencyRepository", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;)V", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;", "senderAmount", "receiverAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TARGET_CURRENCY_CODE, "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/FxQuoteError;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetFxQuoteUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetFxQuoteUseCase(com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository currencyRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = currencyRepository;
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase getFxQuoteUseCase, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput currencyInput, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput currencyInput2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            currencyInput = null;
        }
        if ((i & 4) != 0) {
            currencyInput2 = null;
        }
        return getFxQuoteUseCase.invoke(str, currencyInput, currencyInput2, str2);
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.FxQuoteError, com.paypal.oslo.feature.p2p.domain.model.FxQuote>> invoke(java.lang.String transferAttemptId, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput senderAmount, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput receiverAmount, java.lang.String targetCurrencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetCurrencyCode, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.getFxQuote(transferAttemptId, senderAmount, receiverAmount, targetCurrencyCode);
    }
}
