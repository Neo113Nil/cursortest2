package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MyProgressInteractor_Factory implements Factory<MyProgressInteractor> {
    private final Provider<Context> contextProvider;

    public MyProgressInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MyProgressInteractor get() {
        return new MyProgressInteractor(this.contextProvider.get());
    }

    public static MyProgressInteractor_Factory create(Provider<Context> contextProvider) {
        return new MyProgressInteractor_Factory(contextProvider);
    }
}
