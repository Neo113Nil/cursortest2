package org.betup.services.chats;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.messaging.GetUserMessagesInteractor;

/* loaded from: classes2.dex */
public final class DefaultChatService_Factory implements Factory<DefaultChatService> {
    private final Provider<GetUserMessagesInteractor> getUserMessagesInteractorProvider;

    public DefaultChatService_Factory(Provider<GetUserMessagesInteractor> getUserMessagesInteractorProvider) {
        this.getUserMessagesInteractorProvider = getUserMessagesInteractorProvider;
    }

    @Override // javax.inject.Provider
    public DefaultChatService get() {
        return new DefaultChatService(this.getUserMessagesInteractorProvider.get());
    }

    public static DefaultChatService_Factory create(Provider<GetUserMessagesInteractor> getUserMessagesInteractorProvider) {
        return new DefaultChatService_Factory(getUserMessagesInteractorProvider);
    }
}
