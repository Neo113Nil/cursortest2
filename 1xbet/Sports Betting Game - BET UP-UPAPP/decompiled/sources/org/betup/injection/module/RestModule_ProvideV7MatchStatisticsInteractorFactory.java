package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.V7MatchStatisticsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7MatchStatisticsInteractorFactory implements Factory<V7MatchStatisticsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7MatchStatisticsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7MatchStatisticsInteractor get() {
        return (V7MatchStatisticsInteractor) Preconditions.checkNotNull(this.module.provideV7MatchStatisticsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7MatchStatisticsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7MatchStatisticsInteractorFactory(module, contextProvider);
    }

    public static V7MatchStatisticsInteractor proxyProvideV7MatchStatisticsInteractor(RestModule instance, Context context) {
        return (V7MatchStatisticsInteractor) Preconditions.checkNotNull(instance.provideV7MatchStatisticsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
