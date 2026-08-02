package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class UnlockOneClickBetInteractor_Factory implements Factory<UnlockOneClickBetInteractor> {
    private final Provider<Context> contextProvider;

    public UnlockOneClickBetInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public UnlockOneClickBetInteractor get() {
        return new UnlockOneClickBetInteractor(this.contextProvider.get());
    }

    public static UnlockOneClickBetInteractor_Factory create(Provider<Context> contextProvider) {
        return new UnlockOneClickBetInteractor_Factory(contextProvider);
    }
}
