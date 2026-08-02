package com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui;

/* loaded from: classes13.dex */
public final class CIPW9StepViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> getHighSpeedVideoFpsRangesFor;

    private CIPW9StepViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel newInstance(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel(addressCollectionStateHolder);
    }
}
