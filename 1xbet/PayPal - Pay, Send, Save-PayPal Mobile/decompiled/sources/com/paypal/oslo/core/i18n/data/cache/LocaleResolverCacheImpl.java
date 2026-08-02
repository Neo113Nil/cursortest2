package com.paypal.oslo.core.i18n.data.cache;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u000b8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010 "}, d2 = {"Lcom/paypal/oslo/core/i18n/data/cache/LocaleResolverCacheImpl;", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/I18nError;", "Ljava/util/Locale;", "getUserLocale", "()Larrow/core/Either;", "getFormatLocale", "", "", "preferredLanguageList", "Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "resolvedLanguage", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "cacheLocale", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;Ljava/lang/String;)V", "resolvedCountry", "Ljava/lang/String;", "getResolvedCountry", "()Ljava/lang/String;", "setResolvedCountry", "(Ljava/lang/String;)V", "preferredLanguages", "Ljava/util/List;", "getPreferredLanguages", "()Ljava/util/List;", "setPreferredLanguages", "(Ljava/util/List;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Locale;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocaleResolverCacheImpl implements com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.Locale getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.Locale getHighSpeedVideoSizes;
    private java.lang.String resolvedCountry = "";
    private java.util.List<java.lang.String> preferredLanguages = kotlin.collections.CollectionsKt.emptyList();

    @javax.inject.Inject
    public LocaleResolverCacheImpl() {
    }

    @Override // com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache
    public final java.lang.String getResolvedCountry() {
        return this.resolvedCountry;
    }

    public final void setResolvedCountry(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.resolvedCountry = str;
    }

    @Override // com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache
    public final java.util.List<java.lang.String> getPreferredLanguages() {
        return this.preferredLanguages;
    }

    public final void setPreferredLanguages(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.preferredLanguages = list;
    }

    @Override // com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache
    public final void cacheLocale(java.util.List<java.lang.String> preferredLanguageList, com.paypal.oslo.core.i18n.domain.model.SupportedLanguage resolvedLanguage, java.lang.String country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredLanguageList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        setResolvedCountry(com.paypal.oslo.core.i18n.data.util.CommonUtilKt.convertToISOCountryCode(country));
        setPreferredLanguages(preferredLanguageList);
        if (resolvedLanguage != null) {
            java.util.Locale build = new java.util.Locale.Builder().setLanguage(resolvedLanguage.getLanguage()).setRegion(getResolvedCountry()).build();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "UserLocale", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userLocale", build)), null, 4, null);
            this.getHighSpeedVideoFpsRanges = build;
            java.util.Locale parseFormatLocale = com.paypal.oslo.core.i18n.data.util.CommonUtilKt.parseFormatLocale(resolvedLanguage.getFormatLocale());
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "FormatLocale", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("formatLocale", parseFormatLocale)), null, 4, null);
            this.getHighSpeedVideoSizes = parseFormatLocale;
        }
    }

    @Override // com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> getUserLocale() {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.Locale locale = this.getHighSpeedVideoFpsRanges;
            if (locale == null) {
                defaultRaise2.raise(new com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized("User locale not available", null, 2, null));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(locale);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> getFormatLocale() {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.Locale locale = this.getHighSpeedVideoSizes;
            if (locale == null) {
                defaultRaise2.raise(new com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized("Format locale not available", null, 2, null));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(locale);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
