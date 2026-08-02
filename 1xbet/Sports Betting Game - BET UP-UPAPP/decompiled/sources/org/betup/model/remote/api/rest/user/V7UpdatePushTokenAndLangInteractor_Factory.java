package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UpdatePushTokenAndLangInteractor_Factory implements Factory<V7UpdatePushTokenAndLangInteractor> {
    private final Provider<Context> contextProvider;

    public V7UpdatePushTokenAndLangInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UpdatePushTokenAndLangInteractor get() {
        return new V7UpdatePushTokenAndLangInteractor(this.contextProvider.get());
    }

    public static V7UpdatePushTokenAndLangInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UpdatePushTokenAndLangInteractor_Factory(contextProvider);
    }
}
