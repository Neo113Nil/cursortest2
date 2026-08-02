package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.bets.BetsPlacedController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideBetsPlacedControllerFactory implements Factory<BetsPlacedController> {
    private final AppModule module;

    public AppModule_ProvideBetsPlacedControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public BetsPlacedController get() {
        return (BetsPlacedController) Preconditions.checkNotNull(this.module.provideBetsPlacedController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideBetsPlacedControllerFactory create(AppModule module) {
        return new AppModule_ProvideBetsPlacedControllerFactory(module);
    }

    public static BetsPlacedController proxyProvideBetsPlacedController(AppModule instance) {
        return (BetsPlacedController) Preconditions.checkNotNull(instance.provideBetsPlacedController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
