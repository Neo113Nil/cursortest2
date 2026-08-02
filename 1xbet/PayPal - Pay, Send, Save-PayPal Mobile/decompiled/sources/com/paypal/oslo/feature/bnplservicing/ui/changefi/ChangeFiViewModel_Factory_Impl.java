package com.paypal.oslo.feature.bnplservicing.ui.changefi;

/* loaded from: classes11.dex */
public final class ChangeFiViewModel_Factory_Impl implements com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.Factory {
    private final com.paypal.oslo.feature.bnplservicing.ui.changefi.C0310ChangeFiViewModel_Factory getHighSpeedVideoFpsRanges;

    private ChangeFiViewModel_Factory_Impl(com.paypal.oslo.feature.bnplservicing.ui.changefi.C0310ChangeFiViewModel_Factory c0310ChangeFiViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0310ChangeFiViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.Factory
    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel create(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs changeFiArgs) {
        return this.getHighSpeedVideoFpsRanges.get(changeFiArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.Factory> create(com.paypal.oslo.feature.bnplservicing.ui.changefi.C0310ChangeFiViewModel_Factory c0310ChangeFiViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel_Factory_Impl(c0310ChangeFiViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.bnplservicing.ui.changefi.C0310ChangeFiViewModel_Factory c0310ChangeFiViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel_Factory_Impl(c0310ChangeFiViewModel_Factory));
    }
}
