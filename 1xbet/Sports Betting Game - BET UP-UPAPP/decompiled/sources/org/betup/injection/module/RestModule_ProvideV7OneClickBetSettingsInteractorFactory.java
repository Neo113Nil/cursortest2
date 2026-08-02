package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7OneClickBetSettingsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7OneClickBetSettingsInteractorFactory implements Factory<V7OneClickBetSettingsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7OneClickBetSettingsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7OneClickBetSettingsInteractor get() {
        return (V7OneClickBetSettingsInteractor) Preconditions.checkNotNull(this.module.provideV7OneClickBetSettingsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7OneClickBetSettingsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7OneClickBetSettingsInteractorFactory(module, contextProvider);
    }

    public static V7OneClickBetSettingsInteractor proxyProvideV7OneClickBetSettingsInteractor(RestModule instance, Context context) {
        return (V7OneClickBetSettingsInteractor) Preconditions.checkNotNull(instance.provideV7OneClickBetSettingsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
