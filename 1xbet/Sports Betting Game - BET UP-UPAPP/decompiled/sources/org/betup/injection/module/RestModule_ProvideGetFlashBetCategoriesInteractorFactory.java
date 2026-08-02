package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetCategoriesInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetFlashBetCategoriesInteractorFactory implements Factory<GetFlashBetCategoriesInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetFlashBetCategoriesInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFlashBetCategoriesInteractor get() {
        return (GetFlashBetCategoriesInteractor) Preconditions.checkNotNull(this.module.provideGetFlashBetCategoriesInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetFlashBetCategoriesInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetFlashBetCategoriesInteractorFactory(module, contextProvider);
    }

    public static GetFlashBetCategoriesInteractor proxyProvideGetFlashBetCategoriesInteractor(RestModule instance, Context context) {
        return (GetFlashBetCategoriesInteractor) Preconditions.checkNotNull(instance.provideGetFlashBetCategoriesInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
