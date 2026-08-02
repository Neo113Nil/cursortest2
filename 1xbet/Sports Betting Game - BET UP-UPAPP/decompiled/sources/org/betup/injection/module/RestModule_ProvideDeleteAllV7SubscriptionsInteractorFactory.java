package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.subscription.DeleteAllV7SubscriptionsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideDeleteAllV7SubscriptionsInteractorFactory implements Factory<DeleteAllV7SubscriptionsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideDeleteAllV7SubscriptionsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteAllV7SubscriptionsInteractor get() {
        return (DeleteAllV7SubscriptionsInteractor) Preconditions.checkNotNull(this.module.provideDeleteAllV7SubscriptionsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideDeleteAllV7SubscriptionsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideDeleteAllV7SubscriptionsInteractorFactory(module, contextProvider);
    }

    public static DeleteAllV7SubscriptionsInteractor proxyProvideDeleteAllV7SubscriptionsInteractor(RestModule instance, Context context) {
        return (DeleteAllV7SubscriptionsInteractor) Preconditions.checkNotNull(instance.provideDeleteAllV7SubscriptionsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
