package com.paypal.oslo.feature.bnplservicing.ui.autopay;

/* loaded from: classes11.dex */
public final class UpdateAutopayViewModel_Factory_Impl implements com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.Factory {
    private final com.paypal.oslo.feature.bnplservicing.ui.autopay.C0309UpdateAutopayViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private UpdateAutopayViewModel_Factory_Impl(com.paypal.oslo.feature.bnplservicing.ui.autopay.C0309UpdateAutopayViewModel_Factory c0309UpdateAutopayViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0309UpdateAutopayViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.Factory
    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel create(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel) {
        return this.getHighSpeedVideoFpsRangesFor.get(turnOffAutopayModel);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.Factory> create(com.paypal.oslo.feature.bnplservicing.ui.autopay.C0309UpdateAutopayViewModel_Factory c0309UpdateAutopayViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel_Factory_Impl(c0309UpdateAutopayViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.bnplservicing.ui.autopay.C0309UpdateAutopayViewModel_Factory c0309UpdateAutopayViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel_Factory_Impl(c0309UpdateAutopayViewModel_Factory));
    }
}
