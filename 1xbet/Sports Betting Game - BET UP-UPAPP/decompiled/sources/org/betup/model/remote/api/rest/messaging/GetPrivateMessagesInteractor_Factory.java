package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetPrivateMessagesInteractor_Factory implements Factory<GetPrivateMessagesInteractor> {
    private final Provider<Context> contextProvider;

    public GetPrivateMessagesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetPrivateMessagesInteractor get() {
        return new GetPrivateMessagesInteractor(this.contextProvider.get());
    }

    public static GetPrivateMessagesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetPrivateMessagesInteractor_Factory(contextProvider);
    }
}
