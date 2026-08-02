package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.NewCompetitionsHistoryInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideNewCompetitionsHistoryInteractorFactory implements Factory<NewCompetitionsHistoryInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideNewCompetitionsHistoryInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewCompetitionsHistoryInteractor get() {
        return (NewCompetitionsHistoryInteractor) Preconditions.checkNotNull(this.module.provideNewCompetitionsHistoryInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideNewCompetitionsHistoryInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideNewCompetitionsHistoryInteractorFactory(module, contextProvider);
    }

    public static NewCompetitionsHistoryInteractor proxyProvideNewCompetitionsHistoryInteractor(RestModule instance, Context context) {
        return (NewCompetitionsHistoryInteractor) Preconditions.checkNotNull(instance.provideNewCompetitionsHistoryInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
