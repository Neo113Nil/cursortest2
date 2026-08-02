package org.betup.ui.fragment.support.controller;

import dagger.MembersInjector;
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
public final class SupportController_MembersInjector implements MembersInjector<SupportController> {
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

    public SupportController_MembersInjector(Provider<GetV7FAQInteractor> getV7FAQInteractorProvider, Provider<GetV7SupportInfoInteractor> getV7SupportInfoInteractorProvider, Provider<GetV7SupportMessagesInteractor> getV7SupportMessagesInteractorProvider, Provider<SendV7SupportMessageInteractor> sendV7SupportMessageInteractorProvider, Provider<SendV7ReportInteractor> sendV7ReportInteractorProvider, Provider<GetSupportChatsInteractor> getSupportChatsInteractorProvider, Provider<CreateSupportChatInteractor> createSupportChatInteractorProvider, Provider<GetSupportChatInteractor> getSupportChatInteractorProvider, Provider<GetSupportChatMessagesInteractor> getSupportChatMessagesInteractorProvider, Provider<SendSupportChatMessageInteractor> sendSupportChatMessageInteractorProvider, Provider<CloseSupportChatInteractor> closeSupportChatInteractorProvider, Provider<GetSupportCategoriesInteractor> getSupportCategoriesInteractorProvider, Provider<GetDeleteAccountInfoInteractor> getDeleteAccountInfoInteractorProvider, Provider<SendDeleteAccountInteractor> sendDeleteAccountInteractorProvider, Provider<CancelAccountDeletionRequestInteractor> cancelAccountDeletionRequestInteractorProvider, Provider<UserService> userServiceProvider) {
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

    public static MembersInjector<SupportController> create(Provider<GetV7FAQInteractor> getV7FAQInteractorProvider, Provider<GetV7SupportInfoInteractor> getV7SupportInfoInteractorProvider, Provider<GetV7SupportMessagesInteractor> getV7SupportMessagesInteractorProvider, Provider<SendV7SupportMessageInteractor> sendV7SupportMessageInteractorProvider, Provider<SendV7ReportInteractor> sendV7ReportInteractorProvider, Provider<GetSupportChatsInteractor> getSupportChatsInteractorProvider, Provider<CreateSupportChatInteractor> createSupportChatInteractorProvider, Provider<GetSupportChatInteractor> getSupportChatInteractorProvider, Provider<GetSupportChatMessagesInteractor> getSupportChatMessagesInteractorProvider, Provider<SendSupportChatMessageInteractor> sendSupportChatMessageInteractorProvider, Provider<CloseSupportChatInteractor> closeSupportChatInteractorProvider, Provider<GetSupportCategoriesInteractor> getSupportCategoriesInteractorProvider, Provider<GetDeleteAccountInfoInteractor> getDeleteAccountInfoInteractorProvider, Provider<SendDeleteAccountInteractor> sendDeleteAccountInteractorProvider, Provider<CancelAccountDeletionRequestInteractor> cancelAccountDeletionRequestInteractorProvider, Provider<UserService> userServiceProvider) {
        return new SupportController_MembersInjector(getV7FAQInteractorProvider, getV7SupportInfoInteractorProvider, getV7SupportMessagesInteractorProvider, sendV7SupportMessageInteractorProvider, sendV7ReportInteractorProvider, getSupportChatsInteractorProvider, createSupportChatInteractorProvider, getSupportChatInteractorProvider, getSupportChatMessagesInteractorProvider, sendSupportChatMessageInteractorProvider, closeSupportChatInteractorProvider, getSupportCategoriesInteractorProvider, getDeleteAccountInfoInteractorProvider, sendDeleteAccountInteractorProvider, cancelAccountDeletionRequestInteractorProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SupportController instance) {
        injectGetV7FAQInteractor(instance, this.getV7FAQInteractorProvider.get());
        injectGetV7SupportInfoInteractor(instance, this.getV7SupportInfoInteractorProvider.get());
        injectGetV7SupportMessagesInteractor(instance, this.getV7SupportMessagesInteractorProvider.get());
        injectSendV7SupportMessageInteractor(instance, this.sendV7SupportMessageInteractorProvider.get());
        injectSendV7ReportInteractor(instance, this.sendV7ReportInteractorProvider.get());
        injectGetSupportChatsInteractor(instance, this.getSupportChatsInteractorProvider.get());
        injectCreateSupportChatInteractor(instance, this.createSupportChatInteractorProvider.get());
        injectGetSupportChatInteractor(instance, this.getSupportChatInteractorProvider.get());
        injectGetSupportChatMessagesInteractor(instance, this.getSupportChatMessagesInteractorProvider.get());
        injectSendSupportChatMessageInteractor(instance, this.sendSupportChatMessageInteractorProvider.get());
        injectCloseSupportChatInteractor(instance, this.closeSupportChatInteractorProvider.get());
        injectGetSupportCategoriesInteractor(instance, this.getSupportCategoriesInteractorProvider.get());
        injectGetDeleteAccountInfoInteractor(instance, this.getDeleteAccountInfoInteractorProvider.get());
        injectSendDeleteAccountInteractor(instance, this.sendDeleteAccountInteractorProvider.get());
        injectCancelAccountDeletionRequestInteractor(instance, this.cancelAccountDeletionRequestInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectGetV7FAQInteractor(SupportController instance, GetV7FAQInteractor getV7FAQInteractor) {
        instance.getV7FAQInteractor = getV7FAQInteractor;
    }

    public static void injectGetV7SupportInfoInteractor(SupportController instance, GetV7SupportInfoInteractor getV7SupportInfoInteractor) {
        instance.getV7SupportInfoInteractor = getV7SupportInfoInteractor;
    }

    public static void injectGetV7SupportMessagesInteractor(SupportController instance, GetV7SupportMessagesInteractor getV7SupportMessagesInteractor) {
        instance.getV7SupportMessagesInteractor = getV7SupportMessagesInteractor;
    }

    public static void injectSendV7SupportMessageInteractor(SupportController instance, SendV7SupportMessageInteractor sendV7SupportMessageInteractor) {
        instance.sendV7SupportMessageInteractor = sendV7SupportMessageInteractor;
    }

    public static void injectSendV7ReportInteractor(SupportController instance, SendV7ReportInteractor sendV7ReportInteractor) {
        instance.sendV7ReportInteractor = sendV7ReportInteractor;
    }

    public static void injectGetSupportChatsInteractor(SupportController instance, GetSupportChatsInteractor getSupportChatsInteractor) {
        instance.getSupportChatsInteractor = getSupportChatsInteractor;
    }

    public static void injectCreateSupportChatInteractor(SupportController instance, CreateSupportChatInteractor createSupportChatInteractor) {
        instance.createSupportChatInteractor = createSupportChatInteractor;
    }

    public static void injectGetSupportChatInteractor(SupportController instance, GetSupportChatInteractor getSupportChatInteractor) {
        instance.getSupportChatInteractor = getSupportChatInteractor;
    }

    public static void injectGetSupportChatMessagesInteractor(SupportController instance, GetSupportChatMessagesInteractor getSupportChatMessagesInteractor) {
        instance.getSupportChatMessagesInteractor = getSupportChatMessagesInteractor;
    }

    public static void injectSendSupportChatMessageInteractor(SupportController instance, SendSupportChatMessageInteractor sendSupportChatMessageInteractor) {
        instance.sendSupportChatMessageInteractor = sendSupportChatMessageInteractor;
    }

    public static void injectCloseSupportChatInteractor(SupportController instance, CloseSupportChatInteractor closeSupportChatInteractor) {
        instance.closeSupportChatInteractor = closeSupportChatInteractor;
    }

    public static void injectGetSupportCategoriesInteractor(SupportController instance, GetSupportCategoriesInteractor getSupportCategoriesInteractor) {
        instance.getSupportCategoriesInteractor = getSupportCategoriesInteractor;
    }

    public static void injectGetDeleteAccountInfoInteractor(SupportController instance, GetDeleteAccountInfoInteractor getDeleteAccountInfoInteractor) {
        instance.getDeleteAccountInfoInteractor = getDeleteAccountInfoInteractor;
    }

    public static void injectSendDeleteAccountInteractor(SupportController instance, SendDeleteAccountInteractor sendDeleteAccountInteractor) {
        instance.sendDeleteAccountInteractor = sendDeleteAccountInteractor;
    }

    public static void injectCancelAccountDeletionRequestInteractor(SupportController instance, CancelAccountDeletionRequestInteractor cancelAccountDeletionRequestInteractor) {
        instance.cancelAccountDeletionRequestInteractor = cancelAccountDeletionRequestInteractor;
    }

    public static void injectUserService(SupportController instance, UserService userService) {
        instance.userService = userService;
    }
}
