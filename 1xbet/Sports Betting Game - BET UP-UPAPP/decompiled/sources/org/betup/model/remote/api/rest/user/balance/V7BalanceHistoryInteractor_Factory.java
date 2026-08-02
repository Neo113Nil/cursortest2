package org.betup.model.remote.api.rest.user.balance;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7BalanceHistoryInteractor_Factory implements Factory<V7BalanceHistoryInteractor> {
    private final Provider<Context> contextProvider;

    public V7BalanceHistoryInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7BalanceHistoryInteractor get() {
        return new V7BalanceHistoryInteractor(this.contextProvider.get());
    }

    public static V7BalanceHistoryInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7BalanceHistoryInteractor_Factory(contextProvider);
    }
}
