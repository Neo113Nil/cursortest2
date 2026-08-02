package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.matches.details.TeamDetailsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideTeamDetailsControllerFactory implements Factory<TeamDetailsController> {
    private final AppModule module;

    public AppModule_ProvideTeamDetailsControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TeamDetailsController get() {
        return (TeamDetailsController) Preconditions.checkNotNull(this.module.provideTeamDetailsController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideTeamDetailsControllerFactory create(AppModule module) {
        return new AppModule_ProvideTeamDetailsControllerFactory(module);
    }

    public static TeamDetailsController proxyProvideTeamDetailsController(AppModule instance) {
        return (TeamDetailsController) Preconditions.checkNotNull(instance.provideTeamDetailsController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
