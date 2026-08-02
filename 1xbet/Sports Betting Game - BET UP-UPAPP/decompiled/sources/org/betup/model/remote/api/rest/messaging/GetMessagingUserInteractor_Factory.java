package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetMessagingUserInteractor_Factory implements Factory<GetMessagingUserInteractor> {
    private final Provider<Context> contextProvider;

    public GetMessagingUserInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetMessagingUserInteractor get() {
        return new GetMessagingUserInteractor(this.contextProvider.get());
    }

    public static GetMessagingUserInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetMessagingUserInteractor_Factory(contextProvider);
    }
}
