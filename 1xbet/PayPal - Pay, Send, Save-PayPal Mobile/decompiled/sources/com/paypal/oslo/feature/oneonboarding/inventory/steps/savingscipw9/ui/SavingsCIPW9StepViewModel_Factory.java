package com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui;

/* loaded from: classes13.dex */
public final class SavingsCIPW9StepViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> getHighSpeedVideoSizes;

    private SavingsCIPW9StepViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel newInstance(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel(addressCollectionStateHolder);
    }
}
