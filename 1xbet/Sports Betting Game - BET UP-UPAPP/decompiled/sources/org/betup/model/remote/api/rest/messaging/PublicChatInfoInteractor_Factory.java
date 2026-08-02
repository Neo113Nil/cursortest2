package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PublicChatInfoInteractor_Factory implements Factory<PublicChatInfoInteractor> {
    private final Provider<Context> contextProvider;

    public PublicChatInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PublicChatInfoInteractor get() {
        return new PublicChatInfoInteractor(this.contextProvider.get());
    }

    public static PublicChatInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new PublicChatInfoInteractor_Factory(contextProvider);
    }
}
