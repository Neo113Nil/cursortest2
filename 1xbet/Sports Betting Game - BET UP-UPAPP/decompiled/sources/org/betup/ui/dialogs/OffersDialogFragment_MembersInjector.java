package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.analytics.GetOffersListInteractor;
import org.betup.model.remote.api.rest.analytics.GetSingleOfferInfoInteractor;
import org.betup.services.analytics.AnalyticsService;

/* loaded from: classes2.dex */
public final class OffersDialogFragment_MembersInjector implements MembersInjector<OffersDialogFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<GetOffersListInteractor> getOffersListInteractorProvider;
    private final Provider<GetSingleOfferInfoInteractor> singleSingleOfferInteractorProvider;

    public OffersDialogFragment_MembersInjector(Provider<GetOffersListInteractor> getOffersListInteractorProvider, Provider<GetSingleOfferInfoInteractor> singleSingleOfferInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider) {
        this.getOffersListInteractorProvider = getOffersListInteractorProvider;
        this.singleSingleOfferInteractorProvider = singleSingleOfferInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
    }

    public static MembersInjector<OffersDialogFragment> create(Provider<GetOffersListInteractor> getOffersListInteractorProvider, Provider<GetSingleOfferInfoInteractor> singleSingleOfferInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider) {
        return new OffersDialogFragment_MembersInjector(getOffersListInteractorProvider, singleSingleOfferInteractorProvider, analyticsServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OffersDialogFragment instance) {
        injectGetOffersListInteractor(instance, this.getOffersListInteractorProvider.get());
        injectSingleSingleOfferInteractor(instance, this.singleSingleOfferInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
    }

    public static void injectGetOffersListInteractor(OffersDialogFragment instance, GetOffersListInteractor getOffersListInteractor) {
        instance.getOffersListInteractor = getOffersListInteractor;
    }

    public static void injectSingleSingleOfferInteractor(OffersDialogFragment instance, GetSingleOfferInfoInteractor singleSingleOfferInteractor) {
        instance.singleSingleOfferInteractor = singleSingleOfferInteractor;
    }

    public static void injectAnalyticsService(OffersDialogFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }
}
