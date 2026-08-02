package org.betup.games.higherLower.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.games.BaseGameFragment_MembersInjector;
import org.betup.games.higherLower.model.interactor.ContinueHighLowGameInteractor;
import org.betup.games.higherLower.model.interactor.HigherLowerGameConfigInteractor;
import org.betup.games.higherLower.model.interactor.StartHighLowGameInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class HigherLowerGameFragment_MembersInjector implements MembersInjector<HigherLowerGameFragment> {
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<HigherLowerGameConfigInteractor> configInteractorProvider;
    private final Provider<ContinueHighLowGameInteractor> continueGameInteractorProvider;
    private final Provider<StartHighLowGameInteractor> startGameInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public HigherLowerGameFragment_MembersInjector(Provider<BalanceHolder> balanceHolderProvider, Provider<HigherLowerGameConfigInteractor> configInteractorProvider, Provider<StartHighLowGameInteractor> startGameInteractorProvider, Provider<ContinueHighLowGameInteractor> continueGameInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<UserService> userServiceProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
        this.configInteractorProvider = configInteractorProvider;
        this.startGameInteractorProvider = startGameInteractorProvider;
        this.continueGameInteractorProvider = continueGameInteractorProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<HigherLowerGameFragment> create(Provider<BalanceHolder> balanceHolderProvider, Provider<HigherLowerGameConfigInteractor> configInteractorProvider, Provider<StartHighLowGameInteractor> startGameInteractorProvider, Provider<ContinueHighLowGameInteractor> continueGameInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<UserService> userServiceProvider) {
        return new HigherLowerGameFragment_MembersInjector(balanceHolderProvider, configInteractorProvider, startGameInteractorProvider, continueGameInteractorProvider, videoRewardServiceProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HigherLowerGameFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectConfigInteractor(instance, this.configInteractorProvider.get());
        injectStartGameInteractor(instance, this.startGameInteractorProvider.get());
        injectContinueGameInteractor(instance, this.continueGameInteractorProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectConfigInteractor(HigherLowerGameFragment instance, HigherLowerGameConfigInteractor configInteractor) {
        instance.configInteractor = configInteractor;
    }

    public static void injectStartGameInteractor(HigherLowerGameFragment instance, StartHighLowGameInteractor startGameInteractor) {
        instance.startGameInteractor = startGameInteractor;
    }

    public static void injectContinueGameInteractor(HigherLowerGameFragment instance, ContinueHighLowGameInteractor continueGameInteractor) {
        instance.continueGameInteractor = continueGameInteractor;
    }

    public static void injectVideoRewardService(HigherLowerGameFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectUserService(HigherLowerGameFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
