package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.messaging.GetUserMessagesInteractor;
import org.betup.services.chats.ChatService;

/* loaded from: classes2.dex */
public final class AppModule_ProvideMessagingControllerFactory implements Factory<ChatService> {
    private final Provider<GetUserMessagesInteractor> getUserMessagesInteractorProvider;
    private final AppModule module;

    public AppModule_ProvideMessagingControllerFactory(AppModule module, Provider<GetUserMessagesInteractor> getUserMessagesInteractorProvider) {
        this.module = module;
        this.getUserMessagesInteractorProvider = getUserMessagesInteractorProvider;
    }

    @Override // javax.inject.Provider
    public ChatService get() {
        return (ChatService) Preconditions.checkNotNull(this.module.provideMessagingController(this.getUserMessagesInteractorProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideMessagingControllerFactory create(AppModule module, Provider<GetUserMessagesInteractor> getUserMessagesInteractorProvider) {
        return new AppModule_ProvideMessagingControllerFactory(module, getUserMessagesInteractorProvider);
    }

    public static ChatService proxyProvideMessagingController(AppModule instance, GetUserMessagesInteractor getUserMessagesInteractor) {
        return (ChatService) Preconditions.checkNotNull(instance.provideMessagingController(getUserMessagesInteractor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
