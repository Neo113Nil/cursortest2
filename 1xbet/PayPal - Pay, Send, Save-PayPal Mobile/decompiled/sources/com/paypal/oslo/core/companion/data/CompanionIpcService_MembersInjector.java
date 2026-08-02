package com.paypal.oslo.core.companion.data;

/* loaded from: classes10.dex */
public final class CompanionIpcService_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.core.companion.data.CompanionIpcService> {
    private final dagger.internal.Provider<com.paypal.oslo.core.companion.data.CompanionAppMessageHandler> getHighSpeedVideoFpsRangesFor;

    private CompanionIpcService_MembersInjector(dagger.internal.Provider<com.paypal.oslo.core.companion.data.CompanionAppMessageHandler> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.core.companion.data.CompanionIpcService companionIpcService) {
        injectCompanionAppMessageHandler(companionIpcService, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.core.companion.data.CompanionIpcService> create(dagger.internal.Provider<com.paypal.oslo.core.companion.data.CompanionAppMessageHandler> provider) {
        return new com.paypal.oslo.core.companion.data.CompanionIpcService_MembersInjector(provider);
    }

    public static void injectCompanionAppMessageHandler(com.paypal.oslo.core.companion.data.CompanionIpcService companionIpcService, com.paypal.oslo.core.companion.data.CompanionAppMessageHandler companionAppMessageHandler) {
        companionIpcService.companionAppMessageHandler = companionAppMessageHandler;
    }
}
