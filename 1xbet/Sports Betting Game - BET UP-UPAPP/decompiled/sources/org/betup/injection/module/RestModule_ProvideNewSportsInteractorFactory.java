package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideNewSportsInteractorFactory implements Factory<NewSportsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideNewSportsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewSportsInteractor get() {
        return (NewSportsInteractor) Preconditions.checkNotNull(this.module.provideNewSportsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideNewSportsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideNewSportsInteractorFactory(module, contextProvider);
    }

    public static NewSportsInteractor proxyProvideNewSportsInteractor(RestModule instance, Context context) {
        return (NewSportsInteractor) Preconditions.checkNotNull(instance.provideNewSportsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
