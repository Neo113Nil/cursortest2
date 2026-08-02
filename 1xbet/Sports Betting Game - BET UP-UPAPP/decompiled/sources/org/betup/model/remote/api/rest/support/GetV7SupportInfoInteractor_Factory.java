package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetV7SupportInfoInteractor_Factory implements Factory<GetV7SupportInfoInteractor> {
    private final Provider<Context> contextProvider;

    public GetV7SupportInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetV7SupportInfoInteractor get() {
        return new GetV7SupportInfoInteractor(this.contextProvider.get());
    }

    public static GetV7SupportInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetV7SupportInfoInteractor_Factory(contextProvider);
    }
}
