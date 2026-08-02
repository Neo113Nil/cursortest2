package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.home.controller.HomeVideoBonusRefreshGate;

/* loaded from: classes2.dex */
public final class AppModule_ProvideHomeVideoBonusRefreshGateFactory implements Factory<HomeVideoBonusRefreshGate> {
    private final AppModule module;

    public AppModule_ProvideHomeVideoBonusRefreshGateFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public HomeVideoBonusRefreshGate get() {
        return (HomeVideoBonusRefreshGate) Preconditions.checkNotNull(this.module.provideHomeVideoBonusRefreshGate(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideHomeVideoBonusRefreshGateFactory create(AppModule module) {
        return new AppModule_ProvideHomeVideoBonusRefreshGateFactory(module);
    }

    public static HomeVideoBonusRefreshGate proxyProvideHomeVideoBonusRefreshGate(AppModule instance) {
        return (HomeVideoBonusRefreshGate) Preconditions.checkNotNull(instance.provideHomeVideoBonusRefreshGate(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
