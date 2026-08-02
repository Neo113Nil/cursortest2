package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SendSupportChatMessageInteractor_Factory implements Factory<SendSupportChatMessageInteractor> {
    private final Provider<Context> contextProvider;

    public SendSupportChatMessageInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SendSupportChatMessageInteractor get() {
        return new SendSupportChatMessageInteractor(this.contextProvider.get());
    }

    public static SendSupportChatMessageInteractor_Factory create(Provider<Context> contextProvider) {
        return new SendSupportChatMessageInteractor_Factory(contextProvider);
    }
}
