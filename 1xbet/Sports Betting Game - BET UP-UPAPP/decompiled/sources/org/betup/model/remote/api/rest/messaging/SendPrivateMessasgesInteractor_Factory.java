package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SendPrivateMessasgesInteractor_Factory implements Factory<SendPrivateMessasgesInteractor> {
    private final Provider<Context> contextProvider;

    public SendPrivateMessasgesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SendPrivateMessasgesInteractor get() {
        return new SendPrivateMessasgesInteractor(this.contextProvider.get());
    }

    public static SendPrivateMessasgesInteractor_Factory create(Provider<Context> contextProvider) {
        return new SendPrivateMessasgesInteractor_Factory(contextProvider);
    }
}
