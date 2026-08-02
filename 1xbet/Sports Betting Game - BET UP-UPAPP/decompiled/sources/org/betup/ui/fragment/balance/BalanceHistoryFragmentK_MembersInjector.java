package org.betup.ui.fragment.balance;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.games.common.remote.interactor.WebGamesListInteractor;
import org.betup.model.remote.api.rest.user.balance.V7BalanceHistoryInteractor;

/* loaded from: classes4.dex */
public final class BalanceHistoryFragmentK_MembersInjector implements MembersInjector<BalanceHistoryFragmentK> {
    private final Provider<V7BalanceHistoryInteractor> v7BalanceHistoryInteractorProvider;
    private final Provider<WebGamesListInteractor> webGamesListInteractorProvider;

    public BalanceHistoryFragmentK_MembersInjector(Provider<V7BalanceHistoryInteractor> v7BalanceHistoryInteractorProvider, Provider<WebGamesListInteractor> webGamesListInteractorProvider) {
        this.v7BalanceHistoryInteractorProvider = v7BalanceHistoryInteractorProvider;
        this.webGamesListInteractorProvider = webGamesListInteractorProvider;
    }

    public static MembersInjector<BalanceHistoryFragmentK> create(Provider<V7BalanceHistoryInteractor> v7BalanceHistoryInteractorProvider, Provider<WebGamesListInteractor> webGamesListInteractorProvider) {
        return new BalanceHistoryFragmentK_MembersInjector(v7BalanceHistoryInteractorProvider, webGamesListInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BalanceHistoryFragmentK instance) {
        injectV7BalanceHistoryInteractor(instance, this.v7BalanceHistoryInteractorProvider.get());
        injectWebGamesListInteractor(instance, this.webGamesListInteractorProvider.get());
    }

    public static void injectV7BalanceHistoryInteractor(BalanceHistoryFragmentK instance, V7BalanceHistoryInteractor v7BalanceHistoryInteractor) {
        instance.v7BalanceHistoryInteractor = v7BalanceHistoryInteractor;
    }

    public static void injectWebGamesListInteractor(BalanceHistoryFragmentK instance, WebGamesListInteractor webGamesListInteractor) {
        instance.webGamesListInteractor = webGamesListInteractor;
    }
}
