package com.paypal.oslo.feature.wallet.amexandp3.ui;

/* loaded from: classes15.dex */
public final class ManageAmexViewModel_Factory_Impl implements com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel.Factory {
    private final com.paypal.oslo.feature.wallet.amexandp3.ui.C0437ManageAmexViewModel_Factory getHighSpeedVideoSizes;

    private ManageAmexViewModel_Factory_Impl(com.paypal.oslo.feature.wallet.amexandp3.ui.C0437ManageAmexViewModel_Factory c0437ManageAmexViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0437ManageAmexViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel.Factory
    public final com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel create(java.lang.String str) {
        return this.getHighSpeedVideoSizes.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel.Factory> create(com.paypal.oslo.feature.wallet.amexandp3.ui.C0437ManageAmexViewModel_Factory c0437ManageAmexViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel_Factory_Impl(c0437ManageAmexViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.wallet.amexandp3.ui.C0437ManageAmexViewModel_Factory c0437ManageAmexViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel_Factory_Impl(c0437ManageAmexViewModel_Factory));
    }
}
