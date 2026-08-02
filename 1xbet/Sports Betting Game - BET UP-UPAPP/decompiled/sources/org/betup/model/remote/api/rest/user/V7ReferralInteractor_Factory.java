package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7ReferralInteractor_Factory implements Factory<V7ReferralInteractor> {
    private final Provider<Context> contextProvider;

    public V7ReferralInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7ReferralInteractor get() {
        return new V7ReferralInteractor(this.contextProvider.get());
    }

    public static V7ReferralInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7ReferralInteractor_Factory(contextProvider);
    }
}
