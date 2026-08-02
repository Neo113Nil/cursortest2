package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetV7FAQInteractor_Factory implements Factory<GetV7FAQInteractor> {
    private final Provider<Context> contextProvider;

    public GetV7FAQInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetV7FAQInteractor get() {
        return new GetV7FAQInteractor(this.contextProvider.get());
    }

    public static GetV7FAQInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetV7FAQInteractor_Factory(contextProvider);
    }
}
