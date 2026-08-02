package com.paypal.oslo.core.i18n.data.implementation;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/implementation/CurrencyHandlerImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/CurrencyHandler;", "<init>", "()V", "", "amount", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", "format", "(DLcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyInfo;", "getCurrencyDetails", "(Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CurrencyHandlerImpl implements com.paypal.oslo.core.i18n.domain.interfaces.CurrencyHandler {
    @javax.inject.Inject
    public CurrencyHandlerImpl() {
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.CurrencyHandler
    public final java.lang.Object format(double d, com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.CurrencyError, java.lang.String>> continuation) {
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError("Currency formatting not yet implemented"));
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.CurrencyHandler
    public final java.lang.Object getCurrencyDetails(com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.CurrencyError, com.paypal.oslo.core.i18n.domain.model.CurrencyInfo>> continuation) {
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError("Currency details retrieval not yet implemented"));
    }
}
