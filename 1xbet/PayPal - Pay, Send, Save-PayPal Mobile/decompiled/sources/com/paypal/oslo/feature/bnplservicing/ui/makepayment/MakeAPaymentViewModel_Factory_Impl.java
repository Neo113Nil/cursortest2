package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

/* loaded from: classes11.dex */
public final class MakeAPaymentViewModel_Factory_Impl implements com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.Factory {
    private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.C0311MakeAPaymentViewModel_Factory Camera2StreamConfigurationMap;

    private MakeAPaymentViewModel_Factory_Impl(com.paypal.oslo.feature.bnplservicing.ui.makepayment.C0311MakeAPaymentViewModel_Factory c0311MakeAPaymentViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0311MakeAPaymentViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.Factory
    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel create(java.lang.String str, java.lang.String str2) {
        return this.Camera2StreamConfigurationMap.get(str, str2);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.Factory> create(com.paypal.oslo.feature.bnplservicing.ui.makepayment.C0311MakeAPaymentViewModel_Factory c0311MakeAPaymentViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel_Factory_Impl(c0311MakeAPaymentViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.bnplservicing.ui.makepayment.C0311MakeAPaymentViewModel_Factory c0311MakeAPaymentViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel_Factory_Impl(c0311MakeAPaymentViewModel_Factory));
    }
}
