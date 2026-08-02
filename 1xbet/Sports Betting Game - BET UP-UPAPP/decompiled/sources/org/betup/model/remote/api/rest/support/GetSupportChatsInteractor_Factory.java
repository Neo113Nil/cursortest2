package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSupportChatsInteractor_Factory implements Factory<GetSupportChatsInteractor> {
    private final Provider<Context> contextProvider;

    public GetSupportChatsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSupportChatsInteractor get() {
        return new GetSupportChatsInteractor(this.contextProvider.get());
    }

    public static GetSupportChatsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSupportChatsInteractor_Factory(contextProvider);
    }
}
