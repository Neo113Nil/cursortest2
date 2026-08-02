package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.subscription.DeleteV7MatchSubscriptionInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideDeleteV7MatchSubscriptionInteractorFactory implements Factory<DeleteV7MatchSubscriptionInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideDeleteV7MatchSubscriptionInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteV7MatchSubscriptionInteractor get() {
        return (DeleteV7MatchSubscriptionInteractor) Preconditions.checkNotNull(this.module.provideDeleteV7MatchSubscriptionInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideDeleteV7MatchSubscriptionInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideDeleteV7MatchSubscriptionInteractorFactory(module, contextProvider);
    }

    public static DeleteV7MatchSubscriptionInteractor proxyProvideDeleteV7MatchSubscriptionInteractor(RestModule instance, Context context) {
        return (DeleteV7MatchSubscriptionInteractor) Preconditions.checkNotNull(instance.provideDeleteV7MatchSubscriptionInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
