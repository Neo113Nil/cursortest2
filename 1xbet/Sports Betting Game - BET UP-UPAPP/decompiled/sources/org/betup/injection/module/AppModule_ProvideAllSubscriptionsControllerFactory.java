package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideAllSubscriptionsControllerFactory implements Factory<AllSubscriptionsController> {
    private final AppModule module;

    public AppModule_ProvideAllSubscriptionsControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public AllSubscriptionsController get() {
        return (AllSubscriptionsController) Preconditions.checkNotNull(this.module.provideAllSubscriptionsController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideAllSubscriptionsControllerFactory create(AppModule module) {
        return new AppModule_ProvideAllSubscriptionsControllerFactory(module);
    }

    public static AllSubscriptionsController proxyProvideAllSubscriptionsController(AppModule instance) {
        return (AllSubscriptionsController) Preconditions.checkNotNull(instance.provideAllSubscriptionsController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
