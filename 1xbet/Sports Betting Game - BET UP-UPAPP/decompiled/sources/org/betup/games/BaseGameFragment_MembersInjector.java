package org.betup.games;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class BaseGameFragment_MembersInjector implements MembersInjector<BaseGameFragment> {
    private final Provider<BalanceHolder> balanceHolderProvider;

    public BaseGameFragment_MembersInjector(Provider<BalanceHolder> balanceHolderProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
    }

    public static MembersInjector<BaseGameFragment> create(Provider<BalanceHolder> balanceHolderProvider) {
        return new BaseGameFragment_MembersInjector(balanceHolderProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseGameFragment instance) {
        injectBalanceHolder(instance, this.balanceHolderProvider.get());
    }

    public static void injectBalanceHolder(BaseGameFragment instance, BalanceHolder balanceHolder) {
        instance.balanceHolder = balanceHolder;
    }
}
