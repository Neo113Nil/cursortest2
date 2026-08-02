package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetCancelBetInfoInteractor_Factory implements Factory<GetCancelBetInfoInteractor> {
    private final Provider<Context> contextProvider;

    public GetCancelBetInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetCancelBetInfoInteractor get() {
        return new GetCancelBetInfoInteractor(this.contextProvider.get());
    }

    public static GetCancelBetInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetCancelBetInfoInteractor_Factory(contextProvider);
    }
}
