package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSupportInfoInteractor_Factory implements Factory<GetSupportInfoInteractor> {
    private final Provider<Context> contextProvider;

    public GetSupportInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSupportInfoInteractor get() {
        return new GetSupportInfoInteractor(this.contextProvider.get());
    }

    public static GetSupportInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSupportInfoInteractor_Factory(contextProvider);
    }
}
