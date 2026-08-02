package com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui;

/* loaded from: classes13.dex */
public final class CIPPersonalInfoStepViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> getHighSpeedVideoSizes;

    private CIPPersonalInfoStepViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel newInstance(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel(addressCollectionStateHolder);
    }
}
