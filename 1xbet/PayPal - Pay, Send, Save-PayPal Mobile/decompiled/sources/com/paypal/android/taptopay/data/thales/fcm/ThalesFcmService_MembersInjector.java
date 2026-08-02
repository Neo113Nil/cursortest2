package com.paypal.android.taptopay.data.thales.fcm;

/* loaded from: classes10.dex */
public final class ThalesFcmService_MembersInjector implements dagger.MembersInjector<com.paypal.android.taptopay.data.thales.fcm.ThalesFcmService> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency>> getHighSpeedVideoFpsRanges;

    public ThalesFcmService_MembersInjector(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> provider, javax.inject.Provider<java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency>> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    public static dagger.MembersInjector<com.paypal.android.taptopay.data.thales.fcm.ThalesFcmService> create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> provider, javax.inject.Provider<java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency>> provider2) {
        return new com.paypal.android.taptopay.data.thales.fcm.ThalesFcmService_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.android.taptopay.data.thales.fcm.ThalesFcmService thalesFcmService) {
        injectFcmHandler(thalesFcmService, this.getHighResolutionOutputSizeshNQ4ISI.get());
        injectOrphanedCardLifecycleDependencies(thalesFcmService, this.getHighSpeedVideoFpsRanges.get());
    }

    public static void injectFcmHandler(com.paypal.android.taptopay.data.thales.fcm.ThalesFcmService thalesFcmService, com.paypal.android.taptopay.data.thales.fcm.FcmHandler fcmHandler) {
        thalesFcmService.fcmHandler = fcmHandler;
    }

    public static void injectOrphanedCardLifecycleDependencies(com.paypal.android.taptopay.data.thales.fcm.ThalesFcmService thalesFcmService, java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency> set) {
        thalesFcmService.orphanedCardLifecycleDependencies = set;
    }
}
