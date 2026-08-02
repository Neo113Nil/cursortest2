package org.betup.ui.fragment.settings.subscriptions.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.subscription.DeleteAllV7SubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7AllMatchSubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.GetAllV7SubscriptionsInteractor;

/* loaded from: classes4.dex */
public final class AllSubscriptionsController_Factory implements Factory<AllSubscriptionsController> {
    private final Provider<DeleteV7AllMatchSubscriptionsInteractor> deleteAllMatchSubscriptionsInteractorProvider;
    private final Provider<DeleteAllV7SubscriptionsInteractor> deleteAllSubscriptionsInteractorProvider;
    private final Provider<DeleteV7MatchSubscriptionInteractor> deleteMatchSubscriptionInteractorProvider;
    private final Provider<GetAllV7SubscriptionsInteractor> getAllSubscriptionsInteractorProvider;

    public AllSubscriptionsController_Factory(Provider<GetAllV7SubscriptionsInteractor> getAllSubscriptionsInteractorProvider, Provider<DeleteAllV7SubscriptionsInteractor> deleteAllSubscriptionsInteractorProvider, Provider<DeleteV7MatchSubscriptionInteractor> deleteMatchSubscriptionInteractorProvider, Provider<DeleteV7AllMatchSubscriptionsInteractor> deleteAllMatchSubscriptionsInteractorProvider) {
        this.getAllSubscriptionsInteractorProvider = getAllSubscriptionsInteractorProvider;
        this.deleteAllSubscriptionsInteractorProvider = deleteAllSubscriptionsInteractorProvider;
        this.deleteMatchSubscriptionInteractorProvider = deleteMatchSubscriptionInteractorProvider;
        this.deleteAllMatchSubscriptionsInteractorProvider = deleteAllMatchSubscriptionsInteractorProvider;
    }

    @Override // javax.inject.Provider
    public AllSubscriptionsController get() {
        AllSubscriptionsController allSubscriptionsController = new AllSubscriptionsController();
        AllSubscriptionsController_MembersInjector.injectGetAllSubscriptionsInteractor(allSubscriptionsController, this.getAllSubscriptionsInteractorProvider.get());
        AllSubscriptionsController_MembersInjector.injectDeleteAllSubscriptionsInteractor(allSubscriptionsController, this.deleteAllSubscriptionsInteractorProvider.get());
        AllSubscriptionsController_MembersInjector.injectDeleteMatchSubscriptionInteractor(allSubscriptionsController, this.deleteMatchSubscriptionInteractorProvider.get());
        AllSubscriptionsController_MembersInjector.injectDeleteAllMatchSubscriptionsInteractor(allSubscriptionsController, this.deleteAllMatchSubscriptionsInteractorProvider.get());
        return allSubscriptionsController;
    }

    public static AllSubscriptionsController_Factory create(Provider<GetAllV7SubscriptionsInteractor> getAllSubscriptionsInteractorProvider, Provider<DeleteAllV7SubscriptionsInteractor> deleteAllSubscriptionsInteractorProvider, Provider<DeleteV7MatchSubscriptionInteractor> deleteMatchSubscriptionInteractorProvider, Provider<DeleteV7AllMatchSubscriptionsInteractor> deleteAllMatchSubscriptionsInteractorProvider) {
        return new AllSubscriptionsController_Factory(getAllSubscriptionsInteractorProvider, deleteAllSubscriptionsInteractorProvider, deleteMatchSubscriptionInteractorProvider, deleteAllMatchSubscriptionsInteractorProvider);
    }

    public static AllSubscriptionsController newAllSubscriptionsController() {
        return new AllSubscriptionsController();
    }
}
