package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSellBetInfoInteractor_Factory implements Factory<GetSellBetInfoInteractor> {
    private final Provider<Context> contextProvider;

    public GetSellBetInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSellBetInfoInteractor get() {
        return new GetSellBetInfoInteractor(this.contextProvider.get());
    }

    public static GetSellBetInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSellBetInfoInteractor_Factory(contextProvider);
    }
}
