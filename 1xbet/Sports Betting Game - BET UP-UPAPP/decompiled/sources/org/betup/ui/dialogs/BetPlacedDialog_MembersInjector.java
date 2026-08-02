package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;
import org.betup.presentation.ScreenTracker;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.bets.BetsPlacedController;

/* loaded from: classes2.dex */
public final class BetPlacedDialog_MembersInjector implements MembersInjector<BetPlacedDialog> {
    private final Provider<BetsPlacedController> betsPlacedControllerProvider;
    private final Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider;
    private final Provider<ScreenTracker> screenTrackerProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public BetPlacedDialog_MembersInjector(Provider<BetsPlacedController> betsPlacedControllerProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<UserService> userServiceProvider, Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider, Provider<ScreenTracker> screenTrackerProvider) {
        this.betsPlacedControllerProvider = betsPlacedControllerProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.getBetShareInstallLinkInteractorProvider = getBetShareInstallLinkInteractorProvider;
        this.screenTrackerProvider = screenTrackerProvider;
    }

    public static MembersInjector<BetPlacedDialog> create(Provider<BetsPlacedController> betsPlacedControllerProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<UserService> userServiceProvider, Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider, Provider<ScreenTracker> screenTrackerProvider) {
        return new BetPlacedDialog_MembersInjector(betsPlacedControllerProvider, videoRewardServiceProvider, userServiceProvider, getBetShareInstallLinkInteractorProvider, screenTrackerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetPlacedDialog instance) {
        injectBetsPlacedController(instance, this.betsPlacedControllerProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectGetBetShareInstallLinkInteractor(instance, this.getBetShareInstallLinkInteractorProvider.get());
        injectScreenTracker(instance, this.screenTrackerProvider.get());
    }

    public static void injectBetsPlacedController(BetPlacedDialog instance, BetsPlacedController betsPlacedController) {
        instance.betsPlacedController = betsPlacedController;
    }

    public static void injectVideoRewardService(BetPlacedDialog instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectUserService(BetPlacedDialog instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectGetBetShareInstallLinkInteractor(BetPlacedDialog instance, GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor) {
        instance.getBetShareInstallLinkInteractor = getBetShareInstallLinkInteractor;
    }

    public static void injectScreenTracker(BetPlacedDialog instance, ScreenTracker screenTracker) {
        instance.screenTracker = screenTracker;
    }
}
