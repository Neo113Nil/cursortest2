package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetV7MyInfoInteractor_Factory implements Factory<GetV7MyInfoInteractor> {
    private final Provider<Context> contextProvider;

    public GetV7MyInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetV7MyInfoInteractor get() {
        return new GetV7MyInfoInteractor(this.contextProvider.get());
    }

    public static GetV7MyInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetV7MyInfoInteractor_Factory(contextProvider);
    }
}
