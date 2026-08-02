package com.paypal.android.taptopay.data.thales.payment;

/* loaded from: classes10.dex */
public final class ThalesPaymentHCEService_MembersInjector implements dagger.MembersInjector<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService> {
    private final javax.inject.Provider<com.gemalto.mfs.mwsdk.payment.PaymentServiceListener> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency>> getHighSpeedVideoFpsRangesFor;

    public ThalesPaymentHCEService_MembersInjector(javax.inject.Provider<com.gemalto.mfs.mwsdk.payment.PaymentServiceListener> provider, javax.inject.Provider<java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency>> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    public static dagger.MembersInjector<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService> create(javax.inject.Provider<com.gemalto.mfs.mwsdk.payment.PaymentServiceListener> provider, javax.inject.Provider<java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency>> provider2) {
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService thalesPaymentHCEService) {
        injectPaymentServiceListener(thalesPaymentHCEService, this.getHighSpeedVideoFpsRanges.get());
        injectOrphanedObservers(thalesPaymentHCEService, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static void injectPaymentServiceListener(com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService thalesPaymentHCEService, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        thalesPaymentHCEService.paymentServiceListener = paymentServiceListener;
    }

    public static void injectOrphanedObservers(com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService thalesPaymentHCEService, java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency> set) {
        thalesPaymentHCEService.orphanedObservers = set;
    }
}
