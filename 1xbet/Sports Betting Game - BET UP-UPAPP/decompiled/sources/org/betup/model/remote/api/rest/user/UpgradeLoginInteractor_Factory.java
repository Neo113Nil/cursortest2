package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class UpgradeLoginInteractor_Factory implements Factory<UpgradeLoginInteractor> {
    private final Provider<Context> contextProvider;

    public UpgradeLoginInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public UpgradeLoginInteractor get() {
        return new UpgradeLoginInteractor(this.contextProvider.get());
    }

    public static UpgradeLoginInteractor_Factory create(Provider<Context> contextProvider) {
        return new UpgradeLoginInteractor_Factory(contextProvider);
    }
}
