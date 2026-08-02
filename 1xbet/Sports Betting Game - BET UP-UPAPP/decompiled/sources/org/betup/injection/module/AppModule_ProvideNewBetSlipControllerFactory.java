package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideNewBetSlipControllerFactory implements Factory<BetsController> {
    private final AppModule module;

    public AppModule_ProvideNewBetSlipControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public BetsController get() {
        return (BetsController) Preconditions.checkNotNull(this.module.provideNewBetSlipController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideNewBetSlipControllerFactory create(AppModule module) {
        return new AppModule_ProvideNewBetSlipControllerFactory(module);
    }

    public static BetsController proxyProvideNewBetSlipController(AppModule instance) {
        return (BetsController) Preconditions.checkNotNull(instance.provideNewBetSlipController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
