package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.bonus.V7DailyBonusInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7DailyBonusInteractorFactory implements Factory<V7DailyBonusInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7DailyBonusInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7DailyBonusInteractor get() {
        return (V7DailyBonusInteractor) Preconditions.checkNotNull(this.module.provideV7DailyBonusInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7DailyBonusInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7DailyBonusInteractorFactory(module, contextProvider);
    }

    public static V7DailyBonusInteractor proxyProvideV7DailyBonusInteractor(RestModule instance, Context context) {
        return (V7DailyBonusInteractor) Preconditions.checkNotNull(instance.provideV7DailyBonusInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
