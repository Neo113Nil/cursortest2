package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetFlashBetCategoriesInteractor_Factory implements Factory<GetFlashBetCategoriesInteractor> {
    private final Provider<Context> contextProvider;

    public GetFlashBetCategoriesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFlashBetCategoriesInteractor get() {
        return new GetFlashBetCategoriesInteractor(this.contextProvider.get());
    }

    public static GetFlashBetCategoriesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetFlashBetCategoriesInteractor_Factory(contextProvider);
    }
}
