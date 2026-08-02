package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.subscription.DeleteV7AllMatchSubscriptionsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideDeleteV7AllMatchSubscriptionsInteractorFactory implements Factory<DeleteV7AllMatchSubscriptionsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideDeleteV7AllMatchSubscriptionsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteV7AllMatchSubscriptionsInteractor get() {
        return (DeleteV7AllMatchSubscriptionsInteractor) Preconditions.checkNotNull(this.module.provideDeleteV7AllMatchSubscriptionsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideDeleteV7AllMatchSubscriptionsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideDeleteV7AllMatchSubscriptionsInteractorFactory(module, contextProvider);
    }

    public static DeleteV7AllMatchSubscriptionsInteractor proxyProvideDeleteV7AllMatchSubscriptionsInteractor(RestModule instance, Context context) {
        return (DeleteV7AllMatchSubscriptionsInteractor) Preconditions.checkNotNull(instance.provideDeleteV7AllMatchSubscriptionsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
