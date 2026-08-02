package org.betup.services.offer;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.videoRewards.GetVideoRewardForPlacementStateInteractor;
import org.betup.model.remote.api.rest.videoRewards.RedeemVideoRewardForPlacementInteractor;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.rewarded.RewardedAdController;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class VideoRewardService_Factory implements Factory<VideoRewardService> {
    private final Provider<AdUnitRegistry> adUnitRegistryProvider;
    private final Provider<GetVideoRewardForPlacementStateInteractor> getVideoRewardForPlacementStateInteractorProvider;
    private final Provider<RedeemVideoRewardForPlacementInteractor> redeemVideoRewardForPlacementInteractorProvider;
    private final Provider<RewardedAdController> rewardedAdControllerProvider;
    private final Provider<UserService> userServiceProvider;

    public VideoRewardService_Factory(Provider<UserService> userServiceProvider, Provider<GetVideoRewardForPlacementStateInteractor> getVideoRewardForPlacementStateInteractorProvider, Provider<RedeemVideoRewardForPlacementInteractor> redeemVideoRewardForPlacementInteractorProvider, Provider<RewardedAdController> rewardedAdControllerProvider, Provider<AdUnitRegistry> adUnitRegistryProvider) {
        this.userServiceProvider = userServiceProvider;
        this.getVideoRewardForPlacementStateInteractorProvider = getVideoRewardForPlacementStateInteractorProvider;
        this.redeemVideoRewardForPlacementInteractorProvider = redeemVideoRewardForPlacementInteractorProvider;
        this.rewardedAdControllerProvider = rewardedAdControllerProvider;
        this.adUnitRegistryProvider = adUnitRegistryProvider;
    }

    @Override // javax.inject.Provider
    public VideoRewardService get() {
        return new VideoRewardService(this.userServiceProvider.get(), this.getVideoRewardForPlacementStateInteractorProvider.get(), this.redeemVideoRewardForPlacementInteractorProvider.get(), this.rewardedAdControllerProvider.get(), this.adUnitRegistryProvider.get());
    }

    public static VideoRewardService_Factory create(Provider<UserService> userServiceProvider, Provider<GetVideoRewardForPlacementStateInteractor> getVideoRewardForPlacementStateInteractorProvider, Provider<RedeemVideoRewardForPlacementInteractor> redeemVideoRewardForPlacementInteractorProvider, Provider<RewardedAdController> rewardedAdControllerProvider, Provider<AdUnitRegistry> adUnitRegistryProvider) {
        return new VideoRewardService_Factory(userServiceProvider, getVideoRewardForPlacementStateInteractorProvider, redeemVideoRewardForPlacementInteractorProvider, rewardedAdControllerProvider, adUnitRegistryProvider);
    }
}
