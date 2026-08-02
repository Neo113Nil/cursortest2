package org.betup.games.luckyCells.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.games.BaseGameFragment_MembersInjector;
import org.betup.games.luckyCells.model.interactor.CompleteLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.ContinueLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.GetConfigLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.StartLuckyCellsGameInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class LuckyCellsGameFragment_MembersInjector implements MembersInjector<LuckyCellsGameFragment> {
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<CompleteLuckyCellsGameInteractor> completeLuckyCellsGameInteractorProvider;
    private final Provider<ContinueLuckyCellsGameInteractor> continueGameInteractorProvider;
    private final Provider<GetConfigLuckyCellsGameInteractor> getGameConfigInteractorProvider;
    private final Provider<StartLuckyCellsGameInteractor> startGameInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public LuckyCellsGameFragment_MembersInjector(Provider<BalanceHolder> balanceHolderProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<GetConfigLuckyCellsGameInteractor> getGameConfigInteractorProvider, Provider<StartLuckyCellsGameInteractor> startGameInteractorProvider, Provider<ContinueLuckyCellsGameInteractor> continueGameInteractorProvider, Provider<CompleteLuckyCellsGameInteractor> completeLuckyCellsGameInteractorProvider, Provider<UserService> userServiceProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.getGameConfigInteractorProvider = getGameConfigInteractorProvider;
        this.startGameInteractorProvider = startGameInteractorProvider;
        this.continueGameInteractorProvider = continueGameInteractorProvider;
        this.completeLuckyCellsGameInteractorProvider = completeLuckyCellsGameInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<LuckyCellsGameFragment> create(Provider<BalanceHolder> balanceHolderProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<GetConfigLuckyCellsGameInteractor> getGameConfigInteractorProvider, Provider<StartLuckyCellsGameInteractor> startGameInteractorProvider, Provider<ContinueLuckyCellsGameInteractor> continueGameInteractorProvider, Provider<CompleteLuckyCellsGameInteractor> completeLuckyCellsGameInteractorProvider, Provider<UserService> userServiceProvider) {
        return new LuckyCellsGameFragment_MembersInjector(balanceHolderProvider, videoRewardServiceProvider, getGameConfigInteractorProvider, startGameInteractorProvider, continueGameInteractorProvider, completeLuckyCellsGameInteractorProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LuckyCellsGameFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectGetGameConfigInteractor(instance, this.getGameConfigInteractorProvider.get());
        injectStartGameInteractor(instance, this.startGameInteractorProvider.get());
        injectContinueGameInteractor(instance, this.continueGameInteractorProvider.get());
        injectCompleteLuckyCellsGameInteractor(instance, this.completeLuckyCellsGameInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectVideoRewardService(LuckyCellsGameFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectGetGameConfigInteractor(LuckyCellsGameFragment instance, GetConfigLuckyCellsGameInteractor getGameConfigInteractor) {
        instance.getGameConfigInteractor = getGameConfigInteractor;
    }

    public static void injectStartGameInteractor(LuckyCellsGameFragment instance, StartLuckyCellsGameInteractor startGameInteractor) {
        instance.startGameInteractor = startGameInteractor;
    }

    public static void injectContinueGameInteractor(LuckyCellsGameFragment instance, ContinueLuckyCellsGameInteractor continueGameInteractor) {
        instance.continueGameInteractor = continueGameInteractor;
    }

    public static void injectCompleteLuckyCellsGameInteractor(LuckyCellsGameFragment instance, CompleteLuckyCellsGameInteractor completeLuckyCellsGameInteractor) {
        instance.completeLuckyCellsGameInteractor = completeLuckyCellsGameInteractor;
    }

    public static void injectUserService(LuckyCellsGameFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
