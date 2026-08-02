package com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel;

/* loaded from: classes13.dex */
public final class PayRequestViewModel_Factory_Impl implements com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory {
    private final com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.C0379PayRequestViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private PayRequestViewModel_Factory_Impl(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.C0379PayRequestViewModel_Factory c0379PayRequestViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0379PayRequestViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory
    public final com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel create(java.lang.String str, java.lang.String str2, boolean z) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str, str2, z);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory> create(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.C0379PayRequestViewModel_Factory c0379PayRequestViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel_Factory_Impl(c0379PayRequestViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.C0379PayRequestViewModel_Factory c0379PayRequestViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel_Factory_Impl(c0379PayRequestViewModel_Factory));
    }
}
