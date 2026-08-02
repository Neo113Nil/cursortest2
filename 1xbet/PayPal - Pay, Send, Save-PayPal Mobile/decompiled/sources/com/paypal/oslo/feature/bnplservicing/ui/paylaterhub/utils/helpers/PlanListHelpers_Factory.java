package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers;

/* loaded from: classes11.dex */
public final class PlanListHelpers_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> getHighResolutionOutputSizeshNQ4ISI;

    private PlanListHelpers_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider payLaterHubContentProvider) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers(bnplServFormatter, payLaterHubContentProvider);
    }
}
