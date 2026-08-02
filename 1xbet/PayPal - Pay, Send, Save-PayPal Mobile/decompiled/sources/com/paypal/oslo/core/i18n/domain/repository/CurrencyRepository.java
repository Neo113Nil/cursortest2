package com.paypal.oslo.core.i18n.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/repository/CurrencyRepository;", "", "Ljava/util/Locale;", "locale", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyMetadata;", "getCurrencyMetadata", "(Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CurrencyRepository {
    java.lang.Object getCurrencyMetadata(java.util.Locale locale, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError, com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getCurrencyMetadata$default(com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository currencyRepository, java.util.Locale locale, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrencyMetadata");
        }
        if ((i & 1) != 0) {
            locale = null;
        }
        return currencyRepository.getCurrencyMetadata(locale, continuation);
    }
}
