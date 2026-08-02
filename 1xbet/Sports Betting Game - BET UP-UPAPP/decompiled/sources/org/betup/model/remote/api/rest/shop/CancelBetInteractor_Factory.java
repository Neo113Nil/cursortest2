package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CancelBetInteractor_Factory implements Factory<CancelBetInteractor> {
    private final Provider<Context> contextProvider;

    public CancelBetInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CancelBetInteractor get() {
        return new CancelBetInteractor(this.contextProvider.get());
    }

    public static CancelBetInteractor_Factory create(Provider<Context> contextProvider) {
        return new CancelBetInteractor_Factory(contextProvider);
    }
}
