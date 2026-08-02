package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.NewActiveCompetitionsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideNewActiveCompetitionsInteractorFactory implements Factory<NewActiveCompetitionsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideNewActiveCompetitionsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewActiveCompetitionsInteractor get() {
        return (NewActiveCompetitionsInteractor) Preconditions.checkNotNull(this.module.provideNewActiveCompetitionsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideNewActiveCompetitionsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideNewActiveCompetitionsInteractorFactory(module, contextProvider);
    }

    public static NewActiveCompetitionsInteractor proxyProvideNewActiveCompetitionsInteractor(RestModule instance, Context context) {
        return (NewActiveCompetitionsInteractor) Preconditions.checkNotNull(instance.provideNewActiveCompetitionsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
