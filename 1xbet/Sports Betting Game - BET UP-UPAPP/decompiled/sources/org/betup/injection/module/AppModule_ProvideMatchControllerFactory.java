package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.matches.details.MatchDetailsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideMatchControllerFactory implements Factory<MatchDetailsController> {
    private final AppModule module;

    public AppModule_ProvideMatchControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public MatchDetailsController get() {
        return (MatchDetailsController) Preconditions.checkNotNull(this.module.provideMatchController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideMatchControllerFactory create(AppModule module) {
        return new AppModule_ProvideMatchControllerFactory(module);
    }

    public static MatchDetailsController proxyProvideMatchController(AppModule instance) {
        return (MatchDetailsController) Preconditions.checkNotNull(instance.provideMatchController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
