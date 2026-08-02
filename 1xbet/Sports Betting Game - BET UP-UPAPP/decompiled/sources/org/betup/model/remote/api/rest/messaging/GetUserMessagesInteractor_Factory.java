package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetUserMessagesInteractor_Factory implements Factory<GetUserMessagesInteractor> {
    private final Provider<Context> contextProvider;

    public GetUserMessagesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetUserMessagesInteractor get() {
        return new GetUserMessagesInteractor(this.contextProvider.get());
    }

    public static GetUserMessagesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetUserMessagesInteractor_Factory(contextProvider);
    }
}
