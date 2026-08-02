package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSupportCategoriesInteractor_Factory implements Factory<GetSupportCategoriesInteractor> {
    private final Provider<Context> contextProvider;

    public GetSupportCategoriesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSupportCategoriesInteractor get() {
        return new GetSupportCategoriesInteractor(this.contextProvider.get());
    }

    public static GetSupportCategoriesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSupportCategoriesInteractor_Factory(contextProvider);
    }
}
