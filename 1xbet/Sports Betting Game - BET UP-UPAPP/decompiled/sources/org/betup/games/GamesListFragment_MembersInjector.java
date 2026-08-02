package org.betup.games;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.games.common.remote.interactor.WebGameSessionCodeInteractor;
import org.betup.games.common.remote.interactor.WebGamesListInteractor;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class GamesListFragment_MembersInjector implements MembersInjector<GamesListFragment> {
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<WebGameSessionCodeInteractor> webGameSessionCodeInteractorProvider;
    private final Provider<WebGamesListInteractor> webGamesListInteractorProvider;

    public GamesListFragment_MembersInjector(Provider<BalanceHolder> balanceHolderProvider, Provider<WebGamesListInteractor> webGamesListInteractorProvider, Provider<WebGameSessionCodeInteractor> webGameSessionCodeInteractorProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
        this.webGamesListInteractorProvider = webGamesListInteractorProvider;
        this.webGameSessionCodeInteractorProvider = webGameSessionCodeInteractorProvider;
    }

    public static MembersInjector<GamesListFragment> create(Provider<BalanceHolder> balanceHolderProvider, Provider<WebGamesListInteractor> webGamesListInteractorProvider, Provider<WebGameSessionCodeInteractor> webGameSessionCodeInteractorProvider) {
        return new GamesListFragment_MembersInjector(balanceHolderProvider, webGamesListInteractorProvider, webGameSessionCodeInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GamesListFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectWebGamesListInteractor(instance, this.webGamesListInteractorProvider.get());
        injectWebGameSessionCodeInteractor(instance, this.webGameSessionCodeInteractorProvider.get());
    }

    public static void injectWebGamesListInteractor(GamesListFragment instance, WebGamesListInteractor webGamesListInteractor) {
        instance.webGamesListInteractor = webGamesListInteractor;
    }

    public static void injectWebGameSessionCodeInteractor(GamesListFragment instance, WebGameSessionCodeInteractor webGameSessionCodeInteractor) {
        instance.webGameSessionCodeInteractor = webGameSessionCodeInteractor;
    }
}
