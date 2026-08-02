package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7OneClickBetSettingsInteractor_Factory implements Factory<V7OneClickBetSettingsInteractor> {
    private final Provider<Context> contextProvider;

    public V7OneClickBetSettingsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7OneClickBetSettingsInteractor get() {
        return new V7OneClickBetSettingsInteractor(this.contextProvider.get());
    }

    public static V7OneClickBetSettingsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7OneClickBetSettingsInteractor_Factory(contextProvider);
    }
}
