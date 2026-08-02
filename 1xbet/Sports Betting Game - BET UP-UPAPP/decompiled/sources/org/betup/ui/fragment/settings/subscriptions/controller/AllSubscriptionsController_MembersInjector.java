package org.betup.ui.fragment.settings.subscriptions.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.subscription.DeleteAllV7SubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7AllMatchSubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.GetAllV7SubscriptionsInteractor;

/* loaded from: classes4.dex */
public final class AllSubscriptionsController_MembersInjector implements MembersInjector<AllSubscriptionsController> {
    private final Provider<DeleteV7AllMatchSubscriptionsInteractor> deleteAllMatchSubscriptionsInteractorProvider;
    private final Provider<DeleteAllV7SubscriptionsInteractor> deleteAllSubscriptionsInteractorProvider;
    private final Provider<DeleteV7MatchSubscriptionInteractor> deleteMatchSubscriptionInteractorProvider;
    private final Provider<GetAllV7SubscriptionsInteractor> getAllSubscriptionsInteractorProvider;

    public AllSubscriptionsController_MembersInjector(Provider<GetAllV7SubscriptionsInteractor> getAllSubscriptionsInteractorProvider, Provider<DeleteAllV7SubscriptionsInteractor> deleteAllSubscriptionsInteractorProvider, Provider<DeleteV7MatchSubscriptionInteractor> deleteMatchSubscriptionInteractorProvider, Provider<DeleteV7AllMatchSubscriptionsInteractor> deleteAllMatchSubscriptionsInteractorProvider) {
        this.getAllSubscriptionsInteractorProvider = getAllSubscriptionsInteractorProvider;
        this.deleteAllSubscriptionsInteractorProvider = deleteAllSubscriptionsInteractorProvider;
        this.deleteMatchSubscriptionInteractorProvider = deleteMatchSubscriptionInteractorProvider;
        this.deleteAllMatchSubscriptionsInteractorProvider = deleteAllMatchSubscriptionsInteractorProvider;
    }

    public static MembersInjector<AllSubscriptionsController> create(Provider<GetAllV7SubscriptionsInteractor> getAllSubscriptionsInteractorProvider, Provider<DeleteAllV7SubscriptionsInteractor> deleteAllSubscriptionsInteractorProvider, Provider<DeleteV7MatchSubscriptionInteractor> deleteMatchSubscriptionInteractorProvider, Provider<DeleteV7AllMatchSubscriptionsInteractor> deleteAllMatchSubscriptionsInteractorProvider) {
        return new AllSubscriptionsController_MembersInjector(getAllSubscriptionsInteractorProvider, deleteAllSubscriptionsInteractorProvider, deleteMatchSubscriptionInteractorProvider, deleteAllMatchSubscriptionsInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AllSubscriptionsController instance) {
        injectGetAllSubscriptionsInteractor(instance, this.getAllSubscriptionsInteractorProvider.get());
        injectDeleteAllSubscriptionsInteractor(instance, this.deleteAllSubscriptionsInteractorProvider.get());
        injectDeleteMatchSubscriptionInteractor(instance, this.deleteMatchSubscriptionInteractorProvider.get());
        injectDeleteAllMatchSubscriptionsInteractor(instance, this.deleteAllMatchSubscriptionsInteractorProvider.get());
    }

    public static void injectGetAllSubscriptionsInteractor(AllSubscriptionsController instance, GetAllV7SubscriptionsInteractor getAllSubscriptionsInteractor) {
        instance.getAllSubscriptionsInteractor = getAllSubscriptionsInteractor;
    }

    public static void injectDeleteAllSubscriptionsInteractor(AllSubscriptionsController instance, DeleteAllV7SubscriptionsInteractor deleteAllSubscriptionsInteractor) {
        instance.deleteAllSubscriptionsInteractor = deleteAllSubscriptionsInteractor;
    }

    public static void injectDeleteMatchSubscriptionInteractor(AllSubscriptionsController instance, DeleteV7MatchSubscriptionInteractor deleteMatchSubscriptionInteractor) {
        instance.deleteMatchSubscriptionInteractor = deleteMatchSubscriptionInteractor;
    }

    public static void injectDeleteAllMatchSubscriptionsInteractor(AllSubscriptionsController instance, DeleteV7AllMatchSubscriptionsInteractor deleteAllMatchSubscriptionsInteractor) {
        instance.deleteAllMatchSubscriptionsInteractor = deleteAllMatchSubscriptionsInteractor;
    }
}
