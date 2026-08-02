package org.betup.games.doubles.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.games.BaseGameFragment_MembersInjector;
import org.betup.games.doubles.model.interactor.FinishDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.GetConfigDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.GetHistoryDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.StartDoubleGameInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class DoubleGameFragment_MembersInjector implements MembersInjector<DoubleGameFragment> {
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<FinishDoubleGameInteractor> finishGameInteractorProvider;
    private final Provider<GetConfigDoubleGameInteractor> getConfigDoubleGameInteractorProvider;
    private final Provider<GetHistoryDoubleGameInteractor> getHistoryGameInteractorProvider;
    private final Provider<StartDoubleGameInteractor> startGameInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public DoubleGameFragment_MembersInjector(Provider<BalanceHolder> balanceHolderProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<UserService> userServiceProvider, Provider<GetConfigDoubleGameInteractor> getConfigDoubleGameInteractorProvider, Provider<StartDoubleGameInteractor> startGameInteractorProvider, Provider<FinishDoubleGameInteractor> finishGameInteractorProvider, Provider<GetHistoryDoubleGameInteractor> getHistoryGameInteractorProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.getConfigDoubleGameInteractorProvider = getConfigDoubleGameInteractorProvider;
        this.startGameInteractorProvider = startGameInteractorProvider;
        this.finishGameInteractorProvider = finishGameInteractorProvider;
        this.getHistoryGameInteractorProvider = getHistoryGameInteractorProvider;
    }

    public static MembersInjector<DoubleGameFragment> create(Provider<BalanceHolder> balanceHolderProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<UserService> userServiceProvider, Provider<GetConfigDoubleGameInteractor> getConfigDoubleGameInteractorProvider, Provider<StartDoubleGameInteractor> startGameInteractorProvider, Provider<FinishDoubleGameInteractor> finishGameInteractorProvider, Provider<GetHistoryDoubleGameInteractor> getHistoryGameInteractorProvider) {
        return new DoubleGameFragment_MembersInjector(balanceHolderProvider, videoRewardServiceProvider, userServiceProvider, getConfigDoubleGameInteractorProvider, startGameInteractorProvider, finishGameInteractorProvider, getHistoryGameInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DoubleGameFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectGetConfigDoubleGameInteractor(instance, this.getConfigDoubleGameInteractorProvider.get());
        injectStartGameInteractor(instance, this.startGameInteractorProvider.get());
        injectFinishGameInteractor(instance, this.finishGameInteractorProvider.get());
        injectGetHistoryGameInteractor(instance, this.getHistoryGameInteractorProvider.get());
    }

    public static void injectVideoRewardService(DoubleGameFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectUserService(DoubleGameFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectGetConfigDoubleGameInteractor(DoubleGameFragment instance, GetConfigDoubleGameInteractor getConfigDoubleGameInteractor) {
        instance.getConfigDoubleGameInteractor = getConfigDoubleGameInteractor;
    }

    public static void injectStartGameInteractor(DoubleGameFragment instance, StartDoubleGameInteractor startGameInteractor) {
        instance.startGameInteractor = startGameInteractor;
    }

    public static void injectFinishGameInteractor(DoubleGameFragment instance, FinishDoubleGameInteractor finishGameInteractor) {
        instance.finishGameInteractor = finishGameInteractor;
    }

    public static void injectGetHistoryGameInteractor(DoubleGameFragment instance, GetHistoryDoubleGameInteractor getHistoryGameInteractor) {
        instance.getHistoryGameInteractor = getHistoryGameInteractor;
    }
}
