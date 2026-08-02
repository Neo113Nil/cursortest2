package com.paypal.oslo.core.i18n.domain.resolver;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/resolver/LanguageResolver;", "", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LanguageOverrideStrategy;", "languageOverrideStrategy", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/LanguageOverrideStrategy;)V", "", "", "preferredLanguageList", "Lcom/paypal/oslo/core/i18n/domain/model/Country;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "resolveLanguage", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/Country;)Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LanguageOverrideStrategy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LanguageResolver {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public LanguageResolver(com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy languageOverrideStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageOverrideStrategy, "");
        this.getHighSpeedVideoFpsRangesFor = languageOverrideStrategy;
    }

    public final com.paypal.oslo.core.i18n.domain.model.SupportedLanguage resolveLanguage(java.util.List<java.lang.String> preferredLanguageList, final com.paypal.oslo.core.i18n.domain.model.Country country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredLanguageList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "I18nSDK resolving a language", null, null, 6, null);
        com.paypal.oslo.core.i18n.domain.model.SupportedLanguage supportedLanguage = (com.paypal.oslo.core.i18n.domain.model.SupportedLanguage) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(preferredLanguageList), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver.$r8$lambda$mi_nmPDLD84GUt3rp8oXS7uwiaE(com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver.this, country, (java.lang.String) obj);
            }
        }), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver.$r8$lambda$34REUMoo6JGZEXzJINK1sSDyINk(com.paypal.oslo.core.i18n.domain.model.Country.this, (java.lang.String) obj);
            }
        }));
        if (supportedLanguage != null) {
            return supportedLanguage;
        }
        for (com.paypal.oslo.core.i18n.domain.model.SupportedLanguage supportedLanguage2 : country.getSupportedLanguages()) {
            boolean equals = kotlin.text.StringsKt.equals(supportedLanguage2.getLanguage(), country.getDefaultLanguage(), true);
            if (equals) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "I18nSDK default language provided", null, null, 6, null);
            }
            if (equals) {
                return supportedLanguage2;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.SupportedLanguage $r8$lambda$34REUMoo6JGZEXzJINK1sSDyINk(com.paypal.oslo.core.i18n.domain.model.Country country, java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = country.getSupportedLanguages().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.equals(str, ((com.paypal.oslo.core.i18n.domain.model.SupportedLanguage) obj).getLanguage(), true)) {
                break;
            }
        }
        return (com.paypal.oslo.core.i18n.domain.model.SupportedLanguage) obj;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$mi_nmPDLD84GUt3rp8oXS7uwiaE(com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver languageResolver, com.paypal.oslo.core.i18n.domain.model.Country country, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return languageResolver.getHighSpeedVideoFpsRangesFor.override(str, country.getCountry());
    }
}
