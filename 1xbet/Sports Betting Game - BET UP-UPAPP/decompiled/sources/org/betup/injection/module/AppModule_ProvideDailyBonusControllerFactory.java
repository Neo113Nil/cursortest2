package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideDailyBonusControllerFactory implements Factory<DailyBonusController> {
    private final AppModule module;

    public AppModule_ProvideDailyBonusControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public DailyBonusController get() {
        return (DailyBonusController) Preconditions.checkNotNull(this.module.provideDailyBonusController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideDailyBonusControllerFactory create(AppModule module) {
        return new AppModule_ProvideDailyBonusControllerFactory(module);
    }

    public static DailyBonusController proxyProvideDailyBonusController(AppModule instance) {
        return (DailyBonusController) Preconditions.checkNotNull(instance.provideDailyBonusController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
