package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetPublicChatMessagesInteractor_Factory implements Factory<GetPublicChatMessagesInteractor> {
    private final Provider<Context> contextProvider;

    public GetPublicChatMessagesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetPublicChatMessagesInteractor get() {
        return new GetPublicChatMessagesInteractor(this.contextProvider.get());
    }

    public static GetPublicChatMessagesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetPublicChatMessagesInteractor_Factory(contextProvider);
    }
}
