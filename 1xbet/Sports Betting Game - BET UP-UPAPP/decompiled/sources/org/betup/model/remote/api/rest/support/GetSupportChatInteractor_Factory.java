package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSupportChatInteractor_Factory implements Factory<GetSupportChatInteractor> {
    private final Provider<Context> contextProvider;

    public GetSupportChatInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSupportChatInteractor get() {
        return new GetSupportChatInteractor(this.contextProvider.get());
    }

    public static GetSupportChatInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSupportChatInteractor_Factory(contextProvider);
    }
}
