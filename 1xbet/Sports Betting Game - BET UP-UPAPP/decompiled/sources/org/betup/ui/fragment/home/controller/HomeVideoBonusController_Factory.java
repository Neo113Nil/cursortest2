package org.betup.ui.fragment.home.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.offer.VideoRewardService;

/* loaded from: classes4.dex */
public final class HomeVideoBonusController_Factory implements Factory<HomeVideoBonusController> {
    private final Provider<HomeVideoBonusRefreshGate> refreshGateProvider;
    private final Provider<TrackedOverlayDismissRegistry> trackedOverlayDismissRegistryProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public HomeVideoBonusController_Factory(Provider<VideoRewardService> videoRewardServiceProvider, Provider<HomeVideoBonusRefreshGate> refreshGateProvider, Provider<TrackedOverlayDismissRegistry> trackedOverlayDismissRegistryProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.refreshGateProvider = refreshGateProvider;
        this.trackedOverlayDismissRegistryProvider = trackedOverlayDismissRegistryProvider;
    }

    @Override // javax.inject.Provider
    public HomeVideoBonusController get() {
        return new HomeVideoBonusController(this.videoRewardServiceProvider.get(), this.refreshGateProvider.get(), this.trackedOverlayDismissRegistryProvider.get());
    }

    public static HomeVideoBonusController_Factory create(Provider<VideoRewardService> videoRewardServiceProvider, Provider<HomeVideoBonusRefreshGate> refreshGateProvider, Provider<TrackedOverlayDismissRegistry> trackedOverlayDismissRegistryProvider) {
        return new HomeVideoBonusController_Factory(videoRewardServiceProvider, refreshGateProvider, trackedOverlayDismissRegistryProvider);
    }
}
