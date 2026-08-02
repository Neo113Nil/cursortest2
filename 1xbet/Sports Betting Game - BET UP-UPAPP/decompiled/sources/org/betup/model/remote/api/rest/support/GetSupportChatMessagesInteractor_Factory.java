package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSupportChatMessagesInteractor_Factory implements Factory<GetSupportChatMessagesInteractor> {
    private final Provider<Context> contextProvider;

    public GetSupportChatMessagesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSupportChatMessagesInteractor get() {
        return new GetSupportChatMessagesInteractor(this.contextProvider.get());
    }

    public static GetSupportChatMessagesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSupportChatMessagesInteractor_Factory(contextProvider);
    }
}
