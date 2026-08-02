package org.betup.games.dice.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.games.BaseGameFragment_MembersInjector;
import org.betup.games.dice.model.interactor.GetDiceGameConfigInteractor;
import org.betup.games.dice.model.interactor.SendDiceGameResultInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class DiceFragment_MembersInjector implements MembersInjector<DiceFragment> {
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<GetDiceGameConfigInteractor> getDiceGameConfigInteractorProvider;
    private final Provider<SendDiceGameResultInteractor> sendDiceGameResultInteractorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public DiceFragment_MembersInjector(Provider<BalanceHolder> balanceHolderProvider, Provider<GetDiceGameConfigInteractor> getDiceGameConfigInteractorProvider, Provider<SendDiceGameResultInteractor> sendDiceGameResultInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
        this.getDiceGameConfigInteractorProvider = getDiceGameConfigInteractorProvider;
        this.sendDiceGameResultInteractorProvider = sendDiceGameResultInteractorProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
    }

    public static MembersInjector<DiceFragment> create(Provider<BalanceHolder> balanceHolderProvider, Provider<GetDiceGameConfigInteractor> getDiceGameConfigInteractorProvider, Provider<SendDiceGameResultInteractor> sendDiceGameResultInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        return new DiceFragment_MembersInjector(balanceHolderProvider, getDiceGameConfigInteractorProvider, sendDiceGameResultInteractorProvider, videoRewardServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DiceFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectGetDiceGameConfigInteractor(instance, this.getDiceGameConfigInteractorProvider.get());
        injectSendDiceGameResultInteractor(instance, this.sendDiceGameResultInteractorProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
    }

    public static void injectGetDiceGameConfigInteractor(DiceFragment instance, GetDiceGameConfigInteractor getDiceGameConfigInteractor) {
        instance.getDiceGameConfigInteractor = getDiceGameConfigInteractor;
    }

    public static void injectSendDiceGameResultInteractor(DiceFragment instance, SendDiceGameResultInteractor sendDiceGameResultInteractor) {
        instance.sendDiceGameResultInteractor = sendDiceGameResultInteractor;
    }

    public static void injectVideoRewardService(DiceFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }
}
