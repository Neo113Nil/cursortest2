package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideMatchVarietiesInteractorFactory implements Factory<MatchVarietiesInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideMatchVarietiesInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MatchVarietiesInteractor get() {
        return (MatchVarietiesInteractor) Preconditions.checkNotNull(this.module.provideMatchVarietiesInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideMatchVarietiesInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideMatchVarietiesInteractorFactory(module, contextProvider);
    }

    public static MatchVarietiesInteractor proxyProvideMatchVarietiesInteractor(RestModule instance, Context context) {
        return (MatchVarietiesInteractor) Preconditions.checkNotNull(instance.provideMatchVarietiesInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
