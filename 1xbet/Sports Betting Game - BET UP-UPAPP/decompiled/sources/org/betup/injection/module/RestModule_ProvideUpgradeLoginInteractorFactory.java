package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.UpgradeLoginInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideUpgradeLoginInteractorFactory implements Factory<UpgradeLoginInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideUpgradeLoginInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public UpgradeLoginInteractor get() {
        return (UpgradeLoginInteractor) Preconditions.checkNotNull(this.module.provideUpgradeLoginInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideUpgradeLoginInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideUpgradeLoginInteractorFactory(module, contextProvider);
    }

    public static UpgradeLoginInteractor proxyProvideUpgradeLoginInteractor(RestModule instance, Context context) {
        return (UpgradeLoginInteractor) Preconditions.checkNotNull(instance.provideUpgradeLoginInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
