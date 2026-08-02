package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

/* loaded from: classes13.dex */
public final class PlanAccordionMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> getHighSpeedVideoFpsRangesFor;

    private PlanAccordionMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> provider) {
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper newInstance(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter) {
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper(moneyAmountFormatter);
    }
}
