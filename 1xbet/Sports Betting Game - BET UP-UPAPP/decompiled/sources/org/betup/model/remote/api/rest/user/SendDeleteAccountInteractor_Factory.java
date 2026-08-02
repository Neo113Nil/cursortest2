package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SendDeleteAccountInteractor_Factory implements Factory<SendDeleteAccountInteractor> {
    private final Provider<Context> contextProvider;

    public SendDeleteAccountInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SendDeleteAccountInteractor get() {
        return new SendDeleteAccountInteractor(this.contextProvider.get());
    }

    public static SendDeleteAccountInteractor_Factory create(Provider<Context> contextProvider) {
        return new SendDeleteAccountInteractor_Factory(contextProvider);
    }
}
