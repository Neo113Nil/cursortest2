package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.matches.MatchesController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideMatchesControllerFactory implements Factory<MatchesController> {
    private final AppModule module;

    public AppModule_ProvideMatchesControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public MatchesController get() {
        return (MatchesController) Preconditions.checkNotNull(this.module.provideMatchesController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideMatchesControllerFactory create(AppModule module) {
        return new AppModule_ProvideMatchesControllerFactory(module);
    }

    public static MatchesController proxyProvideMatchesController(AppModule instance) {
        return (MatchesController) Preconditions.checkNotNull(instance.provideMatchesController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
