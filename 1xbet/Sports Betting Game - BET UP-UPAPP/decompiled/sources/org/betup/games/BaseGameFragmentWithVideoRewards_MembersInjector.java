package org.betup.games;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class BaseGameFragmentWithVideoRewards_MembersInjector implements MembersInjector<BaseGameFragmentWithVideoRewards> {
    private final Provider<BalanceHolder> balanceHolderProvider;

    public BaseGameFragmentWithVideoRewards_MembersInjector(Provider<BalanceHolder> balanceHolderProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
    }

    public static MembersInjector<BaseGameFragmentWithVideoRewards> create(Provider<BalanceHolder> balanceHolderProvider) {
        return new BaseGameFragmentWithVideoRewards_MembersInjector(balanceHolderProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseGameFragmentWithVideoRewards instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
    }
}
