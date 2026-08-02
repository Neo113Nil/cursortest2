package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MessageDetailsInteractor_Factory implements Factory<MessageDetailsInteractor> {
    private final Provider<Context> contextProvider;

    public MessageDetailsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MessageDetailsInteractor get() {
        return new MessageDetailsInteractor(this.contextProvider.get());
    }

    public static MessageDetailsInteractor_Factory create(Provider<Context> contextProvider) {
        return new MessageDetailsInteractor_Factory(contextProvider);
    }
}
