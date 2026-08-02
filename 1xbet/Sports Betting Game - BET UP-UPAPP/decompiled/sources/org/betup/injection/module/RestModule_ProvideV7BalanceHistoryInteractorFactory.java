package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.balance.V7BalanceHistoryInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7BalanceHistoryInteractorFactory implements Factory<V7BalanceHistoryInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7BalanceHistoryInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7BalanceHistoryInteractor get() {
        return (V7BalanceHistoryInteractor) Preconditions.checkNotNull(this.module.provideV7BalanceHistoryInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7BalanceHistoryInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7BalanceHistoryInteractorFactory(module, contextProvider);
    }

    public static V7BalanceHistoryInteractor proxyProvideV7BalanceHistoryInteractor(RestModule instance, Context context) {
        return (V7BalanceHistoryInteractor) Preconditions.checkNotNull(instance.provideV7BalanceHistoryInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
