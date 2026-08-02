package com.paypal.oslo.feature.debitcard.api.domain;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "countryCode", "", "includeCardArtImages", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionResult;", "getProductDefinition", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DebitInstrumentProductDefinitionProvider {
    java.lang.Object getProductDefinition(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError, com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionResult>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getProductDefinition$default(com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider debitInstrumentProductDefinitionProvider, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductDefinition");
        }
        if ((i & 2) != 0) {
            str = "US";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return debitInstrumentProductDefinitionProvider.getProductDefinition(debitCardProductName, str, z, continuation);
    }
}
