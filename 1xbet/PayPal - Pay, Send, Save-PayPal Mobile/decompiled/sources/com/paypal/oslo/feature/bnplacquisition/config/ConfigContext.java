package com.paypal.oslo.feature.bnplacquisition.config;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B \b\u0007\u0012\u0015\u0010\u0006\u001a\u0011\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR#\u0010\u0010\u001a\u0011\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", "Lcom/paypal/oslo/feature/bnplacquisition/config/CountryGetter;", "Lkotlin/jvm/JvmSuppressWildcards;", "countryGetter", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "", "setCPI$bnpl_acquisition_prodRelease", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "getCpi", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "setCpi", "getCountry", "()Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfigContext {
    public static final int $stable = 8;
    private com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ConfigContext(kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = function0;
        this.cpi = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.UNKNOWN;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    public final void setCpi(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.cpi = creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.Country getCountry() {
        return this.Camera2StreamConfigurationMap.invoke();
    }

    public final void setCPI$bnpl_acquisition_prodRelease(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        this.cpi = cpi;
    }
}
