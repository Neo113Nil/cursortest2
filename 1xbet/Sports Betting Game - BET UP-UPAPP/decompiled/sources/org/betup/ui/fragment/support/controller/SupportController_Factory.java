package org.betup.ui.fragment.support.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.support.CloseSupportChatInteractor;
import org.betup.model.remote.api.rest.support.CreateSupportChatInteractor;
import org.betup.model.remote.api.rest.support.GetSupportCategoriesInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatMessagesInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatsInteractor;
import org.betup.model.remote.api.rest.support.GetV7FAQInteractor;
import org.betup.model.remote.api.rest.support.GetV7SupportInfoInteractor;
import org.betup.model.remote.api.rest.support.GetV7SupportMessagesInteractor;
import org.betup.model.remote.api.rest.support.SendSupportChatMessageInteractor;
import org.betup.model.remote.api.rest.support.SendV7SupportMessageInteractor;
import org.betup.model.remote.api.rest.user.CancelAccountDeletionRequestInteractor;
import org.betup.model.remote.api.rest.user.GetDeleteAccountInfoInteractor;
import org.betup.model.remote.api.rest.user.SendDeleteAccountInteractor;
import org.betup.model.remote.api.rest.user.SendV7ReportInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class SupportController_Factory implements Factory<SupportController> {
    private final Provider<CancelAccountDeletionRequestInteractor> cancelAccountDeletionRequestInteractorProvider;
    private final Provider<CloseSupportChatInteractor> closeSupportChatInteractorProvider;
    private final Provider<CreateSupportChatInteractor> createSupportChatInteractorProvider;
    private final Provider<GetDeleteAccountInfoInteractor> getDeleteAccountInfoInteractorProvider;
    private final Provider<GetSupportCategoriesInteractor> getSupportCategoriesInteractorProvider;
    private final Provider<GetSupportChatInteractor> getSupportChatInteractorProvider;
    private final Provider<GetSupportChatMessagesInteractor> getSupportChatMessagesInteractorProvider;
    private final Provider<GetSupportChatsInteractor> getSupportChatsInteractorProvider;
    private final Provider<GetV7FAQInteractor> getV7FAQInteractorProvider;
    private final Provider<GetV7SupportInfoInteractor> getV7SupportInfoInteractorProvider;
    private final Provider<GetV7SupportMessagesInteractor> getV7SupportMessagesInteractorProvider;
    private final Provider<SendDeleteAccountInteractor> sendDeleteAccountInteractorProvider;
    private final Provider<SendSupportChatMessageInteractor> sendSupportChatMessageInteractorProvider;
    private final Provider<SendV7ReportInteractor> sendV7ReportInteractorProvider;
    private final Provider<SendV7SupportMessageInteractor> sendV7SupportMessageInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public SupportController_Factory(Provider<GetV7FAQInteractor> getV7FAQInteractorProvider, Provider<GetV7SupportInfoInteractor> getV7SupportInfoInteractorProvider, Provider<GetV7SupportMessagesInteractor> getV7SupportMessagesInteractorProvider, Provider<SendV7SupportMessageInteractor> sendV7SupportMessageInteractorProvider, Provider<SendV7ReportInteractor> sendV7ReportInteractorProvider, Provider<GetSupportChatsInteractor> getSupportChatsInteractorProvider, Provider<CreateSupportChatInteractor> createSupportChatInteractorProvider, Provider<GetSupportChatInteractor> getSupportChatInteractorProvider, Provider<GetSupportChatMessagesInteractor> getSupportChatMessagesInteractorProvider, Provider<SendSupportChatMessageInteractor> sendSupportChatMessageInteractorProvider, Provider<CloseSupportChatInteractor> closeSupportChatInteractorProvider, Provider<GetSupportCategoriesInteractor> getSupportCategoriesInteractorProvider, Provider<GetDeleteAccountInfoInteractor> getDeleteAccountInfoInteractorProvider, Provider<SendDeleteAccountInteractor> sendDeleteAccountInteractorProvider, Provider<CancelAccountDeletionRequestInteractor> cancelAccountDeletionRequestInteractorProvider, Provider<UserService> userServiceProvider) {
        this.getV7FAQInteractorProvider = getV7FAQInteractorProvider;
        this.getV7SupportInfoInteractorProvider = getV7SupportInfoInteractorProvider;
        this.getV7SupportMessagesInteractorProvider = getV7SupportMessagesInteractorProvider;
        this.sendV7SupportMessageInteractorProvider = sendV7SupportMessageInteractorProvider;
        this.sendV7ReportInteractorProvider = sendV7ReportInteractorProvider;
        this.getSupportChatsInteractorProvider = getSupportChatsInteractorProvider;
        this.createSupportChatInteractorProvider = createSupportChatInteractorProvider;
        this.getSupportChatInteractorProvider = getSupportChatInteractorProvider;
        this.getSupportChatMessagesInteractorProvider = getSupportChatMessagesInteractorProvider;
        this.sendSupportChatMessageInteractorProvider = sendSupportChatMessageInteractorProvider;
        this.closeSupportChatInteractorProvider = closeSupportChatInteractorProvider;
        this.getSupportCategoriesInteractorProvider = getSupportCategoriesInteractorProvider;
        this.getDeleteAccountInfoInteractorProvider = getDeleteAccountInfoInteractorProvider;
        this.sendDeleteAccountInteractorProvider = sendDeleteAccountInteractorProvider;
        this.cancelAccountDeletionRequestInteractorProvider = cancelAccountDeletionRequestInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public SupportController get() {
        SupportController supportController = new SupportController();
        SupportController_MembersInjector.injectGetV7FAQInteractor(supportController, this.getV7FAQInteractorProvider.get());
        SupportController_MembersInjector.injectGetV7SupportInfoInteractor(supportController, this.getV7SupportInfoInteractorProvider.get());
        SupportController_MembersInjector.injectGetV7SupportMessagesInteractor(supportController, this.getV7SupportMessagesInteractorProvider.get());
        SupportController_MembersInjector.injectSendV7SupportMessageInteractor(supportController, this.sendV7SupportMessageInteractorProvider.get());
        SupportController_MembersInjector.injectSendV7ReportInteractor(supportController, this.sendV7ReportInteractorProvider.get());
        SupportController_MembersInjector.injectGetSupportChatsInteractor(supportController, this.getSupportChatsInteractorProvider.get());
        SupportController_MembersInjector.injectCreateSupportChatInteractor(supportController, this.createSupportChatInteractorProvider.get());
        SupportController_MembersInjector.injectGetSupportChatInteractor(supportController, this.getSupportChatInteractorProvider.get());
        SupportController_MembersInjector.injectGetSupportChatMessagesInteractor(supportController, this.getSupportChatMessagesInteractorProvider.get());
        SupportController_MembersInjector.injectSendSupportChatMessageInteractor(supportController, this.sendSupportChatMessageInteractorProvider.get());
        SupportController_MembersInjector.injectCloseSupportChatInteractor(supportController, this.closeSupportChatInteractorProvider.get());
        SupportController_MembersInjector.injectGetSupportCategoriesInteractor(supportController, this.getSupportCategoriesInteractorProvider.get());
        SupportController_MembersInjector.injectGetDeleteAccountInfoInteractor(supportController, this.getDeleteAccountInfoInteractorProvider.get());
        SupportController_MembersInjector.injectSendDeleteAccountInteractor(supportController, this.sendDeleteAccountInteractorProvider.get());
        SupportController_MembersInjector.injectCancelAccountDeletionRequestInteractor(supportController, this.cancelAccountDeletionRequestInteractorProvider.get());
        SupportController_MembersInjector.injectUserService(supportController, this.userServiceProvider.get());
        return supportController;
    }

    public static SupportController_Factory create(Provider<GetV7FAQInteractor> getV7FAQInteractorProvider, Provider<GetV7SupportInfoInteractor> getV7SupportInfoInteractorProvider, Provider<GetV7SupportMessagesInteractor> getV7SupportMessagesInteractorProvider, Provider<SendV7SupportMessageInteractor> sendV7SupportMessageInteractorProvider, Provider<SendV7ReportInteractor> sendV7ReportInteractorProvider, Provider<GetSupportChatsInteractor> getSupportChatsInteractorProvider, Provider<CreateSupportChatInteractor> createSupportChatInteractorProvider, Provider<GetSupportChatInteractor> getSupportChatInteractorProvider, Provider<GetSupportChatMessagesInteractor> getSupportChatMessagesInteractorProvider, Provider<SendSupportChatMessageInteractor> sendSupportChatMessageInteractorProvider, Provider<CloseSupportChatInteractor> closeSupportChatInteractorProvider, Provider<GetSupportCategoriesInteractor> getSupportCategoriesInteractorProvider, Provider<GetDeleteAccountInfoInteractor> getDeleteAccountInfoInteractorProvider, Provider<SendDeleteAccountInteractor> sendDeleteAccountInteractorProvider, Provider<CancelAccountDeletionRequestInteractor> cancelAccountDeletionRequestInteractorProvider, Provider<UserService> userServiceProvider) {
        return new SupportController_Factory(getV7FAQInteractorProvider, getV7SupportInfoInteractorProvider, getV7SupportMessagesInteractorProvider, sendV7SupportMessageInteractorProvider, sendV7ReportInteractorProvider, getSupportChatsInteractorProvider, createSupportChatInteractorProvider, getSupportChatInteractorProvider, getSupportChatMessagesInteractorProvider, sendSupportChatMessageInteractorProvider, closeSupportChatInteractorProvider, getSupportCategoriesInteractorProvider, getDeleteAccountInfoInteractorProvider, sendDeleteAccountInteractorProvider, cancelAccountDeletionRequestInteractorProvider, userServiceProvider);
    }

    public static SupportController newSupportController() {
        return new SupportController();
    }
}
