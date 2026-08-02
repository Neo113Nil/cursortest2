package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetChatsInteractor_Factory implements Factory<GetChatsInteractor> {
    private final Provider<Context> contextProvider;

    public GetChatsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetChatsInteractor get() {
        return new GetChatsInteractor(this.contextProvider.get());
    }

    public static GetChatsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetChatsInteractor_Factory(contextProvider);
    }
}
