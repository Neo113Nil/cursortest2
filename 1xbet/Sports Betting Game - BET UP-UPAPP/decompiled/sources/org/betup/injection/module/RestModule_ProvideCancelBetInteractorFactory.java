package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.CancelBetInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideCancelBetInteractorFactory implements Factory<CancelBetInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideCancelBetInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CancelBetInteractor get() {
        return (CancelBetInteractor) Preconditions.checkNotNull(this.module.provideCancelBetInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideCancelBetInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideCancelBetInteractorFactory(module, contextProvider);
    }

    public static CancelBetInteractor proxyProvideCancelBetInteractor(RestModule instance, Context context) {
        return (CancelBetInteractor) Preconditions.checkNotNull(instance.provideCancelBetInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
