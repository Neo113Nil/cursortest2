package com.paypal.oslo.core.i18n.domain.resolver;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/resolver/CountryResolver;", "", "<init>", "()V", "", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;", "metadata", "Lcom/paypal/oslo/core/i18n/domain/model/Country;", "resolveCountry", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;)Lcom/paypal/oslo/core/i18n/domain/model/Country;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CountryResolver {
    @javax.inject.Inject
    public CountryResolver() {
    }

    public final com.paypal.oslo.core.i18n.domain.model.Country resolveCountry(java.lang.String countryCode, com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData metadata) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "I18nSDK resolving a country", null, null, 6, null);
        java.util.Iterator<T> it = metadata.getCountriesList().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.equals(((com.paypal.oslo.core.i18n.domain.model.Country) obj).getCountry(), countryCode, true)) {
                break;
            }
        }
        com.paypal.oslo.core.i18n.domain.model.Country country = (com.paypal.oslo.core.i18n.domain.model.Country) obj;
        if (country != null) {
            return country;
        }
        for (com.paypal.oslo.core.i18n.domain.model.Country country2 : metadata.getCountriesList()) {
            boolean equals = kotlin.text.StringsKt.equals(country2.getCountry(), "US", true);
            if (equals) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "I18nSDK default country provided", null, null, 6, null);
            }
            if (equals) {
                return country2;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
