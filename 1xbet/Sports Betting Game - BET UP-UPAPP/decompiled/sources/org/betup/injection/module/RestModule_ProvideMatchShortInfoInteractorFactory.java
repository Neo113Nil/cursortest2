package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideMatchShortInfoInteractorFactory implements Factory<MatchShortInfoInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideMatchShortInfoInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MatchShortInfoInteractor get() {
        return (MatchShortInfoInteractor) Preconditions.checkNotNull(this.module.provideMatchShortInfoInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideMatchShortInfoInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideMatchShortInfoInteractorFactory(module, contextProvider);
    }

    public static MatchShortInfoInteractor proxyProvideMatchShortInfoInteractor(RestModule instance, Context context) {
        return (MatchShortInfoInteractor) Preconditions.checkNotNull(instance.provideMatchShortInfoInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
