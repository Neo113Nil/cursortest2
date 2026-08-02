package org.betup.games.warGame.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.games.BaseGameFragment_MembersInjector;
import org.betup.games.warGame.model.interactor.ContinueWarGameInteractor;
import org.betup.games.warGame.model.interactor.GetWarGameConfigInteractor;
import org.betup.games.warGame.model.interactor.StartWarGameInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class WarGameFragment_MembersInjector implements MembersInjector<WarGameFragment> {
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<ContinueWarGameInteractor> continueWarGameInteractorProvider;
    private final Provider<GetWarGameConfigInteractor> getWarGameConfigInteractorProvider;
    private final Provider<StartWarGameInteractor> starWarInteractorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public WarGameFragment_MembersInjector(Provider<BalanceHolder> balanceHolderProvider, Provider<GetWarGameConfigInteractor> getWarGameConfigInteractorProvider, Provider<StartWarGameInteractor> starWarInteractorProvider, Provider<ContinueWarGameInteractor> continueWarGameInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
        this.getWarGameConfigInteractorProvider = getWarGameConfigInteractorProvider;
        this.starWarInteractorProvider = starWarInteractorProvider;
        this.continueWarGameInteractorProvider = continueWarGameInteractorProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
    }

    public static MembersInjector<WarGameFragment> create(Provider<BalanceHolder> balanceHolderProvider, Provider<GetWarGameConfigInteractor> getWarGameConfigInteractorProvider, Provider<StartWarGameInteractor> starWarInteractorProvider, Provider<ContinueWarGameInteractor> continueWarGameInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        return new WarGameFragment_MembersInjector(balanceHolderProvider, getWarGameConfigInteractorProvider, starWarInteractorProvider, continueWarGameInteractorProvider, videoRewardServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WarGameFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectGetWarGameConfigInteractor(instance, this.getWarGameConfigInteractorProvider.get());
        injectStarWarInteractor(instance, this.starWarInteractorProvider.get());
        injectContinueWarGameInteractor(instance, this.continueWarGameInteractorProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
    }

    public static void injectGetWarGameConfigInteractor(WarGameFragment instance, GetWarGameConfigInteractor getWarGameConfigInteractor) {
        instance.getWarGameConfigInteractor = getWarGameConfigInteractor;
    }

    public static void injectStarWarInteractor(WarGameFragment instance, StartWarGameInteractor starWarInteractor) {
        instance.starWarInteractor = starWarInteractor;
    }

    public static void injectContinueWarGameInteractor(WarGameFragment instance, ContinueWarGameInteractor continueWarGameInteractor) {
        instance.continueWarGameInteractor = continueWarGameInteractor;
    }

    public static void injectVideoRewardService(WarGameFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }
}
