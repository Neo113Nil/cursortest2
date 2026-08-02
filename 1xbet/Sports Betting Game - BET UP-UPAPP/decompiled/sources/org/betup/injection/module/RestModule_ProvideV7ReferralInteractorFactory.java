package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7ReferralInteractorFactory implements Factory<V7ReferralInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7ReferralInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7ReferralInteractor get() {
        return (V7ReferralInteractor) Preconditions.checkNotNull(this.module.provideV7ReferralInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7ReferralInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7ReferralInteractorFactory(module, contextProvider);
    }

    public static V7ReferralInteractor proxyProvideV7ReferralInteractor(RestModule instance, Context context) {
        return (V7ReferralInteractor) Preconditions.checkNotNull(instance.provideV7ReferralInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
