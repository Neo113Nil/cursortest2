package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.matches.TeamsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideTeamsControllerFactory implements Factory<TeamsController> {
    private final AppModule module;

    public AppModule_ProvideTeamsControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TeamsController get() {
        return (TeamsController) Preconditions.checkNotNull(this.module.provideTeamsController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideTeamsControllerFactory create(AppModule module) {
        return new AppModule_ProvideTeamsControllerFactory(module);
    }

    public static TeamsController proxyProvideTeamsController(AppModule instance) {
        return (TeamsController) Preconditions.checkNotNull(instance.provideTeamsController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
