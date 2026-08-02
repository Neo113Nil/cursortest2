package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SendPublicChatMessageInteractor_Factory implements Factory<SendPublicChatMessageInteractor> {
    private final Provider<Context> contextProvider;

    public SendPublicChatMessageInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SendPublicChatMessageInteractor get() {
        return new SendPublicChatMessageInteractor(this.contextProvider.get());
    }

    public static SendPublicChatMessageInteractor_Factory create(Provider<Context> contextProvider) {
        return new SendPublicChatMessageInteractor_Factory(contextProvider);
    }
}
