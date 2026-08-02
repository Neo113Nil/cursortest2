package org.betup.utils.balance;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class BalanceHolder_Factory implements Factory<BalanceHolder> {
    private final Provider<UserService> userServiceProvider;

    public BalanceHolder_Factory(Provider<UserService> userServiceProvider) {
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public BalanceHolder get() {
        return new BalanceHolder(this.userServiceProvider.get());
    }

    public static BalanceHolder_Factory create(Provider<UserService> userServiceProvider) {
        return new BalanceHolder_Factory(userServiceProvider);
    }
}
