package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;", "localeResolverRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "invoke", "()Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRanges", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetCountriesListUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.google.i18n.phonenumbers.PhoneNumberUtil getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCountriesListUseCase(com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository localeResolverRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        this.getHighSpeedVideoSizes = localeResolverRepository;
        this.getHighSpeedVideoFpsRanges = localeResolverCache;
        com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil = com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(phoneNumberUtil, "");
        this.getHighSpeedVideoFpsRangesFor = phoneNumberUtil;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> invoke() {
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Country> countriesList;
        java.util.List sorted;
        java.util.Locale locale;
        com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData localeResolverMetadata = this.getHighSpeedVideoSizes.getLocaleResolverMetadata();
        if (localeResolverMetadata != null && (countriesList = localeResolverMetadata.getCountriesList()) != null) {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Country> list = countriesList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.core.i18n.domain.util.CountryUtilKt.toISOCountryCode(((com.paypal.oslo.core.i18n.domain.model.Country) it.next()).getCountry()));
            }
            java.util.List distinct = kotlin.collections.CollectionsKt.distinct(arrayList);
            if (distinct != null && (sorted = kotlin.collections.CollectionsKt.sorted(distinct)) != null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Retrieved supported regions", null, null, 6, null);
                arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> userLocale = this.getHighSpeedVideoFpsRanges.getUserLocale();
                if (userLocale instanceof arrow.core.Either.Right) {
                    locale = (java.util.Locale) ((arrow.core.Either.Right) userLocale).getValue();
                } else if (userLocale instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.error.I18nError i18nError = (com.paypal.oslo.core.i18n.domain.error.I18nError) ((arrow.core.Either.Left) userLocale).getValue();
                    if (!(i18nError instanceof com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to get user locale for GetCountriesListUseCase", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized) i18nError).getMessage())), null, null, 12, null);
                    locale = java.util.Locale.getDefault();
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.util.List<java.lang.String> list2 = sorted;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (java.lang.String str : list2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(locale);
                    java.lang.String countryNameFromRegionCode = com.paypal.oslo.core.i18n.domain.util.CountryUtilKt.getCountryNameFromRegionCode(str, locale);
                    java.lang.String str2 = com.paypal.oslo.core.i18n.domain.util.CountryUtilKt.getGOOGLE_LIB_UNSUPPORTED_COUNTRIES().get(str);
                    int parseInt = str2 != null ? java.lang.Integer.parseInt(str2) : this.getHighSpeedVideoFpsRangesFor.getCountryCodeForRegion(str);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.paypalobjects.com/webstatic/wallet/flags/flag-");
                    sb.append(str);
                    sb.append(".png");
                    arrayList2.add(new com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail(str, countryNameFromRegionCode, parseInt, sb.toString()));
                }
                return arrow.core.EitherKt.right(arrayList2);
            }
        }
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.METADATA_FETCH_FAILURE);
    }
}
