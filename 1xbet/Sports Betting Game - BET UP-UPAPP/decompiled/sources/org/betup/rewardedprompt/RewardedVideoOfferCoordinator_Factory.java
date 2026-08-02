package org.betup.rewardedprompt;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.rewardedprompt.GetEligibleRewardedPromptsInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.GetRewardedPromptCampaignInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.PostRewardedPromptActionInteractor;
import org.betup.model.remote.api.rest.videoRewards.GetVideoRewardForPlacementStateInteractor;
import org.betup.presentation.ScreenTracker;
import org.betup.services.offer.VideoRewardService;

/* loaded from: classes2.dex */
public final class RewardedVideoOfferCoordinator_Factory implements Factory<RewardedVideoOfferCoordinator> {
    private final Provider<GetEligibleRewardedPromptsInteractor> getEligibleRewardedPromptsInteractorProvider;
    private final Provider<GetRewardedPromptCampaignInteractor> getRewardedPromptCampaignInteractorProvider;
    private final Provider<GetVideoRewardForPlacementStateInteractor> getVideoRewardForPlacementStateInteractorProvider;
    private final Provider<PostRewardedPromptActionInteractor> postRewardedPromptActionInteractorProvider;
    private final Provider<ScreenTracker> screenTrackerProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public RewardedVideoOfferCoordinator_Factory(Provider<GetEligibleRewardedPromptsInteractor> getEligibleRewardedPromptsInteractorProvider, Provider<GetRewardedPromptCampaignInteractor> getRewardedPromptCampaignInteractorProvider, Provider<PostRewardedPromptActionInteractor> postRewardedPromptActionInteractorProvider, Provider<GetVideoRewardForPlacementStateInteractor> getVideoRewardForPlacementStateInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<ScreenTracker> screenTrackerProvider) {
        this.getEligibleRewardedPromptsInteractorProvider = getEligibleRewardedPromptsInteractorProvider;
        this.getRewardedPromptCampaignInteractorProvider = getRewardedPromptCampaignInteractorProvider;
        this.postRewardedPromptActionInteractorProvider = postRewardedPromptActionInteractorProvider;
        this.getVideoRewardForPlacementStateInteractorProvider = getVideoRewardForPlacementStateInteractorProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.screenTrackerProvider = screenTrackerProvider;
    }

    @Override // javax.inject.Provider
    public RewardedVideoOfferCoordinator get() {
        return new RewardedVideoOfferCoordinator(this.getEligibleRewardedPromptsInteractorProvider.get(), this.getRewardedPromptCampaignInteractorProvider.get(), this.postRewardedPromptActionInteractorProvider.get(), this.getVideoRewardForPlacementStateInteractorProvider.get(), this.videoRewardServiceProvider.get(), this.screenTrackerProvider.get());
    }

    public static RewardedVideoOfferCoordinator_Factory create(Provider<GetEligibleRewardedPromptsInteractor> getEligibleRewardedPromptsInteractorProvider, Provider<GetRewardedPromptCampaignInteractor> getRewardedPromptCampaignInteractorProvider, Provider<PostRewardedPromptActionInteractor> postRewardedPromptActionInteractorProvider, Provider<GetVideoRewardForPlacementStateInteractor> getVideoRewardForPlacementStateInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<ScreenTracker> screenTrackerProvider) {
        return new RewardedVideoOfferCoordinator_Factory(getEligibleRewardedPromptsInteractorProvider, getRewardedPromptCampaignInteractorProvider, postRewardedPromptActionInteractorProvider, getVideoRewardForPlacementStateInteractorProvider, videoRewardServiceProvider, screenTrackerProvider);
    }
}
