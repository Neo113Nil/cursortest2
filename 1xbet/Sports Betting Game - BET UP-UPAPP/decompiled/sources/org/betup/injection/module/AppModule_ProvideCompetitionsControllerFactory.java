package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideCompetitionsControllerFactory implements Factory<CompetitionsController> {
    private final AppModule module;

    public AppModule_ProvideCompetitionsControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CompetitionsController get() {
        return (CompetitionsController) Preconditions.checkNotNull(this.module.provideCompetitionsController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideCompetitionsControllerFactory create(AppModule module) {
        return new AppModule_ProvideCompetitionsControllerFactory(module);
    }

    public static CompetitionsController proxyProvideCompetitionsController(AppModule instance) {
        return (CompetitionsController) Preconditions.checkNotNull(instance.provideCompetitionsController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
