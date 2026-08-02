package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/CollectPersonalInfoConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "cpiAvailabilityProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "getCpiAvailabilityProvider", "()Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "", "getShouldBeChecked", "()Z", "shouldBeChecked"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CollectPersonalInfoConfig {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    public CollectPersonalInfoConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpiAvailabilityProvider, "");
        this.ctx = configContext;
        this.cpiAvailabilityProvider = cpiAvailabilityProvider;
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider getCpiAvailabilityProvider() {
        return this.cpiAvailabilityProvider;
    }

    public final boolean getShouldBeChecked() {
        return this.ctx.getCpi() == com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US && this.cpiAvailabilityProvider.isCpiTypeEnabled(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.SHORT_TERM);
    }
}
