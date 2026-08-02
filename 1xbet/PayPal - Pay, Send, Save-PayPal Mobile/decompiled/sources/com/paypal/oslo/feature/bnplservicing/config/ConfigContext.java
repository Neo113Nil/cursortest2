package com.paypal.oslo.feature.bnplservicing.config;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\nR\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "", "Lcom/paypal/oslo/feature/bnplservicing/config/CountryResolver;", "countryResolver", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/config/CountryResolver;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "", "setCPI$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/config/CountryResolver;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCpi", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "setCpi", "Lcom/paypal/oslo/feature/bnplservicing/config/Country;", "getCountry", "()Lcom/paypal/oslo/feature/bnplservicing/config/Country;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfigContext {
    public static final int $stable = 8;
    private com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.config.CountryResolver getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ConfigContext(com.paypal.oslo.feature.bnplservicing.config.CountryResolver countryResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryResolver, "");
        this.getHighSpeedVideoSizes = countryResolver;
        this.cpi = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.UNKNOWN;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    public final void setCpi(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.cpi = creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.bnplservicing.config.Country getCountry() {
        return this.getHighSpeedVideoSizes.getCountry();
    }

    public final void setCPI$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        this.cpi = cpi;
    }
}
