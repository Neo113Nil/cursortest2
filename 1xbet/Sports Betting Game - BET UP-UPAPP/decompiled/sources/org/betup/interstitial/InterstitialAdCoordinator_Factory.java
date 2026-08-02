package org.betup.interstitial;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.interstitial.GetInterstitialCampaignInteractor;
import org.betup.model.remote.api.rest.interstitial.PostInterstitialActionInteractor;
import org.betup.presentation.ScreenTracker;

/* loaded from: classes2.dex */
public final class InterstitialAdCoordinator_Factory implements Factory<InterstitialAdCoordinator> {
    private final Provider<GetInterstitialCampaignInteractor> getInterstitialCampaignInteractorProvider;
    private final Provider<PostInterstitialActionInteractor> postInterstitialActionInteractorProvider;
    private final Provider<ScreenTracker> screenTrackerProvider;

    public InterstitialAdCoordinator_Factory(Provider<GetInterstitialCampaignInteractor> getInterstitialCampaignInteractorProvider, Provider<PostInterstitialActionInteractor> postInterstitialActionInteractorProvider, Provider<ScreenTracker> screenTrackerProvider) {
        this.getInterstitialCampaignInteractorProvider = getInterstitialCampaignInteractorProvider;
        this.postInterstitialActionInteractorProvider = postInterstitialActionInteractorProvider;
        this.screenTrackerProvider = screenTrackerProvider;
    }

    @Override // javax.inject.Provider
    public InterstitialAdCoordinator get() {
        return new InterstitialAdCoordinator(this.getInterstitialCampaignInteractorProvider.get(), this.postInterstitialActionInteractorProvider.get(), this.screenTrackerProvider.get());
    }

    public static InterstitialAdCoordinator_Factory create(Provider<GetInterstitialCampaignInteractor> getInterstitialCampaignInteractorProvider, Provider<PostInterstitialActionInteractor> postInterstitialActionInteractorProvider, Provider<ScreenTracker> screenTrackerProvider) {
        return new InterstitialAdCoordinator_Factory(getInterstitialCampaignInteractorProvider, postInterstitialActionInteractorProvider, screenTrackerProvider);
    }
}
