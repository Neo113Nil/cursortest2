package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetBetShareInstallLinkInteractorFactory implements Factory<GetBetShareInstallLinkInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetBetShareInstallLinkInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetBetShareInstallLinkInteractor get() {
        return (GetBetShareInstallLinkInteractor) Preconditions.checkNotNull(this.module.provideGetBetShareInstallLinkInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetBetShareInstallLinkInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetBetShareInstallLinkInteractorFactory(module, contextProvider);
    }

    public static GetBetShareInstallLinkInteractor proxyProvideGetBetShareInstallLinkInteractor(RestModule instance, Context context) {
        return (GetBetShareInstallLinkInteractor) Preconditions.checkNotNull(instance.provideGetBetShareInstallLinkInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
