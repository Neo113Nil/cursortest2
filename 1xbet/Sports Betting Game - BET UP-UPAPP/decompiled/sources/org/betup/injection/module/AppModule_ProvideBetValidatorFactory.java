package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;
import org.betup.services.betlist.BetValidator;

/* loaded from: classes2.dex */
public final class AppModule_ProvideBetValidatorFactory implements Factory<BetValidator> {
    private final Provider<Context> contextProvider;
    private final Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider;
    private final AppModule module;

    public AppModule_ProvideBetValidatorFactory(AppModule module, Provider<Context> contextProvider, Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
        this.grabbedBetsInteractorProvider = grabbedBetsInteractorProvider;
    }

    @Override // javax.inject.Provider
    public BetValidator get() {
        return (BetValidator) Preconditions.checkNotNull(this.module.provideBetValidator(this.contextProvider.get(), this.grabbedBetsInteractorProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideBetValidatorFactory create(AppModule module, Provider<Context> contextProvider, Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider) {
        return new AppModule_ProvideBetValidatorFactory(module, contextProvider, grabbedBetsInteractorProvider);
    }

    public static BetValidator proxyProvideBetValidator(AppModule instance, Context context, V7GrabbedBetsInteractor grabbedBetsInteractor) {
        return (BetValidator) Preconditions.checkNotNull(instance.provideBetValidator(context, grabbedBetsInteractor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
