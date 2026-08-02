package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.rewardedprompt.RewardedVideoOfferCoordinator;
import org.betup.services.offer.VideoRewardService;

/* loaded from: classes2.dex */
public final class RewardedVideoOfferDialogFragment_MembersInjector implements MembersInjector<RewardedVideoOfferDialogFragment> {
    private final Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public RewardedVideoOfferDialogFragment_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider, Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.rewardedVideoOfferCoordinatorProvider = rewardedVideoOfferCoordinatorProvider;
    }

    public static MembersInjector<RewardedVideoOfferDialogFragment> create(Provider<VideoRewardService> videoRewardServiceProvider, Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider) {
        return new RewardedVideoOfferDialogFragment_MembersInjector(videoRewardServiceProvider, rewardedVideoOfferCoordinatorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RewardedVideoOfferDialogFragment instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectRewardedVideoOfferCoordinator(instance, this.rewardedVideoOfferCoordinatorProvider.get());
    }

    public static void injectVideoRewardService(RewardedVideoOfferDialogFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectRewardedVideoOfferCoordinator(RewardedVideoOfferDialogFragment instance, RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator) {
        instance.rewardedVideoOfferCoordinator = rewardedVideoOfferCoordinator;
    }
}
