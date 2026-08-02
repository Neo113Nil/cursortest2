package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ChangeV7NameInteractor_Factory implements Factory<ChangeV7NameInteractor> {
    private final Provider<Context> contextProvider;

    public ChangeV7NameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ChangeV7NameInteractor get() {
        return new ChangeV7NameInteractor(this.contextProvider.get());
    }

    public static ChangeV7NameInteractor_Factory create(Provider<Context> contextProvider) {
        return new ChangeV7NameInteractor_Factory(contextProvider);
    }
}
