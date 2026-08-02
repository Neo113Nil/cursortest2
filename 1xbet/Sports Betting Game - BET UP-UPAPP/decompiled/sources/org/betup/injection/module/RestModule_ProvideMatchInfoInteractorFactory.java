package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.MatchInfoInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideMatchInfoInteractorFactory implements Factory<MatchInfoInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideMatchInfoInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MatchInfoInteractor get() {
        return (MatchInfoInteractor) Preconditions.checkNotNull(this.module.provideMatchInfoInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideMatchInfoInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideMatchInfoInteractorFactory(module, contextProvider);
    }

    public static MatchInfoInteractor proxyProvideMatchInfoInteractor(RestModule instance, Context context) {
        return (MatchInfoInteractor) Preconditions.checkNotNull(instance.provideMatchInfoInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
