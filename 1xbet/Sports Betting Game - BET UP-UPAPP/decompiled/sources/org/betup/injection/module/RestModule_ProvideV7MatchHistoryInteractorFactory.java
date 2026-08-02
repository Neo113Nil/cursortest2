package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.V7MatchHistoryInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7MatchHistoryInteractorFactory implements Factory<V7MatchHistoryInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7MatchHistoryInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7MatchHistoryInteractor get() {
        return (V7MatchHistoryInteractor) Preconditions.checkNotNull(this.module.provideV7MatchHistoryInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7MatchHistoryInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7MatchHistoryInteractorFactory(module, contextProvider);
    }

    public static V7MatchHistoryInteractor proxyProvideV7MatchHistoryInteractor(RestModule instance, Context context) {
        return (V7MatchHistoryInteractor) Preconditions.checkNotNull(instance.provideV7MatchHistoryInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
