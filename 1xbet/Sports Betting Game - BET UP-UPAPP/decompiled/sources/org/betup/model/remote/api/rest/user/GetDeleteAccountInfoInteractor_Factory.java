package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetDeleteAccountInfoInteractor_Factory implements Factory<GetDeleteAccountInfoInteractor> {
    private final Provider<Context> contextProvider;

    public GetDeleteAccountInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetDeleteAccountInfoInteractor get() {
        return new GetDeleteAccountInfoInteractor(this.contextProvider.get());
    }

    public static GetDeleteAccountInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetDeleteAccountInfoInteractor_Factory(contextProvider);
    }
}
