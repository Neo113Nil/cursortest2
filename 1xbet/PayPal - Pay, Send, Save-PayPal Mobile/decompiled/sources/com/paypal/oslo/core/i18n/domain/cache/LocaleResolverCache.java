package com.paypal.oslo.core.i18n.domain.cache;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/I18nError;", "Ljava/util/Locale;", "getUserLocale", "()Larrow/core/Either;", "getFormatLocale", "", "", "preferredLanguageList", "Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "resolvedLanguage", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "cacheLocale", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;Ljava/lang/String;)V", "getResolvedCountry", "()Ljava/lang/String;", "resolvedCountry", "getPreferredLanguages", "()Ljava/util/List;", "preferredLanguages"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LocaleResolverCache {
    void cacheLocale(java.util.List<java.lang.String> preferredLanguageList, com.paypal.oslo.core.i18n.domain.model.SupportedLanguage resolvedLanguage, java.lang.String country);

    arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> getFormatLocale();

    java.util.List<java.lang.String> getPreferredLanguages();

    java.lang.String getResolvedCountry();

    arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> getUserLocale();
}
