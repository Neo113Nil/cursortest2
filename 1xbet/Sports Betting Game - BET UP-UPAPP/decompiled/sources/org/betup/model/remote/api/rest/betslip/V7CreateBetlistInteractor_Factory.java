package org.betup.model.remote.api.rest.betslip;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7CreateBetlistInteractor_Factory implements Factory<V7CreateBetlistInteractor> {
    private final Provider<Context> contextProvider;

    public V7CreateBetlistInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7CreateBetlistInteractor get() {
        return new V7CreateBetlistInteractor(this.contextProvider.get());
    }

    public static V7CreateBetlistInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7CreateBetlistInteractor_Factory(contextProvider);
    }
}
