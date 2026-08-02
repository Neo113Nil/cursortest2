package org.betup.services.betlist;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;

/* loaded from: classes2.dex */
public final class BetValidatorImpl_Factory implements Factory<BetValidatorImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider;

    public BetValidatorImpl_Factory(Provider<Context> contextProvider, Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider) {
        this.contextProvider = contextProvider;
        this.grabbedBetsInteractorProvider = grabbedBetsInteractorProvider;
    }

    @Override // javax.inject.Provider
    public BetValidatorImpl get() {
        return new BetValidatorImpl(this.contextProvider.get(), this.grabbedBetsInteractorProvider.get());
    }

    public static BetValidatorImpl_Factory create(Provider<Context> contextProvider, Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider) {
        return new BetValidatorImpl_Factory(contextProvider, grabbedBetsInteractorProvider);
    }
}
