package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

/* loaded from: classes11.dex */
public final class TtpPermissionsRationaleViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.C0332TtpPermissionsRationaleViewModel_Factory getHighSpeedVideoFpsRanges;

    private TtpPermissionsRationaleViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.C0332TtpPermissionsRationaleViewModel_Factory c0332TtpPermissionsRationaleViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0332TtpPermissionsRationaleViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel create(boolean z, boolean z2) {
        return this.getHighSpeedVideoFpsRanges.get(z, z2);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.C0332TtpPermissionsRationaleViewModel_Factory c0332TtpPermissionsRationaleViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel_Factory_Impl(c0332TtpPermissionsRationaleViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.C0332TtpPermissionsRationaleViewModel_Factory c0332TtpPermissionsRationaleViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel_Factory_Impl(c0332TtpPermissionsRationaleViewModel_Factory));
    }
}
