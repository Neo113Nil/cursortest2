package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion;

/* loaded from: classes13.dex */
public final class PlanAccordionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper> getHighResolutionOutputSizeshNQ4ISI;

    private PlanAccordionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper> provider) {
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel newInstance(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper) {
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel(planAccordionMapper);
    }
}
