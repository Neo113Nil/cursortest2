package com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J0\u0010\u0005\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0005\u0010\tJ,\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "amount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormat;", "format", "", "digits", "", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormat;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireFormat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CurrencyFormatterFacade {
    java.lang.Object format(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat currencyFormat, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object requireFormat(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat currencyFormat, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object format$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat currencyFormat, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        if ((i2 & 2) != 0) {
            currencyFormat = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            i = 2;
        }
        return currencyFormatterFacade.format(currencyAmount, currencyFormat, i, continuation);
    }

    static /* synthetic */ java.lang.Object requireFormat$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat currencyFormat, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requireFormat");
        }
        if ((i2 & 2) != 0) {
            currencyFormat = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            i = 2;
        }
        return currencyFormatterFacade.requireFormat(currencyAmount, currencyFormat, i, continuation);
    }
}
