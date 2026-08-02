package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.matches.LeaguesController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideLeaguesControllerFactory implements Factory<LeaguesController> {
    private final AppModule module;

    public AppModule_ProvideLeaguesControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public LeaguesController get() {
        return (LeaguesController) Preconditions.checkNotNull(this.module.provideLeaguesController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideLeaguesControllerFactory create(AppModule module) {
        return new AppModule_ProvideLeaguesControllerFactory(module);
    }

    public static LeaguesController proxyProvideLeaguesController(AppModule instance) {
        return (LeaguesController) Preconditions.checkNotNull(instance.provideLeaguesController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
