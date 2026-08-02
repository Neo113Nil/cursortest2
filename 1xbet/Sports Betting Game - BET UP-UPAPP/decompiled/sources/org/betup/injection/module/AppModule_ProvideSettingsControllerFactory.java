package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.settings.controller.SettingsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideSettingsControllerFactory implements Factory<SettingsController> {
    private final AppModule module;

    public AppModule_ProvideSettingsControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public SettingsController get() {
        return (SettingsController) Preconditions.checkNotNull(this.module.provideSettingsController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideSettingsControllerFactory create(AppModule module) {
        return new AppModule_ProvideSettingsControllerFactory(module);
    }

    public static SettingsController proxyProvideSettingsController(AppModule instance) {
        return (SettingsController) Preconditions.checkNotNull(instance.provideSettingsController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
