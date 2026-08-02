package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.achievements.controller.AchievementsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideAchievementsControllerFactory implements Factory<AchievementsController> {
    private final AppModule module;

    public AppModule_ProvideAchievementsControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public AchievementsController get() {
        return (AchievementsController) Preconditions.checkNotNull(this.module.provideAchievementsController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideAchievementsControllerFactory create(AppModule module) {
        return new AppModule_ProvideAchievementsControllerFactory(module);
    }

    public static AchievementsController proxyProvideAchievementsController(AppModule instance) {
        return (AchievementsController) Preconditions.checkNotNull(instance.provideAchievementsController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
