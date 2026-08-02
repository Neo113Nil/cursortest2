package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/LocaleResolverUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;", "localeResolverRepository", "Lcom/paypal/oslo/core/i18n/domain/resolver/CountryResolver;", "countryResolver", "Lcom/paypal/oslo/core/i18n/domain/resolver/LanguageResolver;", "languageResolver", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;Lcom/paypal/oslo/core/i18n/domain/resolver/CountryResolver;Lcom/paypal/oslo/core/i18n/domain/resolver/LanguageResolver;)V", "", "", "preferredLanguageList", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/I18nError;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData;", "invoke", "(Ljava/util/List;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/resolver/CountryResolver;", "Lcom/paypal/oslo/core/i18n/domain/resolver/LanguageResolver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocaleResolverUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.resolver.CountryResolver getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public LocaleResolverUseCase(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository localeResolverRepository, com.paypal.oslo.core.i18n.domain.resolver.CountryResolver countryResolver, com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver languageResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageResolver, "");
        this.getHighResolutionOutputSizeshNQ4ISI = localeResolverCache;
        this.getHighSpeedVideoFpsRanges = localeResolverRepository;
        this.getHighSpeedVideoFpsRangesFor = countryResolver;
        this.getHighSpeedVideoSizes = languageResolver;
    }

    public static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved access$createResolvedResult(com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase localeResolverUseCase, java.util.List list, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData localeResolverMetaData) {
        com.paypal.oslo.core.i18n.domain.model.Country resolveCountry = localeResolverUseCase.getHighSpeedVideoFpsRangesFor.resolveCountry(str, localeResolverMetaData);
        return new com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved(list, localeResolverUseCase.getHighSpeedVideoSizes.resolveLanguage(list, resolveCountry), resolveCountry);
    }

    public static final /* synthetic */ void access$handleResult(com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase localeResolverUseCase, arrow.core.Either either) {
        if (either.isLeft()) {
            com.paypal.oslo.core.i18n.domain.error.I18nError i18nError = (com.paypal.oslo.core.i18n.domain.error.I18nError) ((arrow.core.Either.Left) either).getValue();
            if (!(i18nError instanceof com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized notInitialized = (com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized) i18nError;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Locale resolution failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", notInitialized.getMessage()), kotlin.TuplesKt.to("cause", notInitialized.getCause())), null, null, 12, null);
        }
        if (either.isRight()) {
            com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData localeResolutionData = (com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData) ((arrow.core.Either.Right) either).getValue();
            if (localeResolutionData instanceof com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved) {
                com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved resolved = (com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved) localeResolutionData;
                localeResolverUseCase.getHighResolutionOutputSizeshNQ4ISI.cacheLocale(resolved.getPreferredLanguageList(), resolved.getResolvedLanguage(), resolved.getResolvedCountry().getCountry());
                com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
                java.lang.String language = resolved.getResolvedLanguage().getLanguage();
                java.lang.String country = resolved.getResolvedCountry().getCountry();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(language);
                sb.append("-");
                sb.append(country);
                com.paypal.android.logger.Logger.i$default(logger, "Resolved locale", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("locale", sb.toString())), null, 4, null);
                return;
            }
            if (!(localeResolutionData instanceof com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Cached)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Using cached locale resolution", null, null, 6, null);
        }
    }

    public static final /* synthetic */ boolean access$isLocaleSame(com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase localeResolverUseCase, java.util.List list, java.lang.String str) {
        return kotlin.jvm.internal.Intrinsics.areEqual(localeResolverUseCase.getHighResolutionOutputSizeshNQ4ISI.getResolvedCountry(), str) && kotlin.jvm.internal.Intrinsics.areEqual(localeResolverUseCase.getHighResolutionOutputSizeshNQ4ISI.getPreferredLanguages(), list);
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData>> invoke(java.util.List<java.lang.String> preferredLanguageList, java.lang.String country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredLanguageList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        return kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$1(this, preferredLanguageList, country, null)), new com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$2(this, null));
    }
}
