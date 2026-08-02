package org.betup.ui.dialogs.offer;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.analytics.GetSignatureForOfferInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;

/* loaded from: classes2.dex */
public final class OfferFragment_MembersInjector implements MembersInjector<OfferFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<DailyBonusController> dailyBonusControllerProvider;
    private final Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public OfferFragment_MembersInjector(Provider<BillingService> billingServiceProvider, Provider<UserService> userServiceProvider, Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider) {
        this.billingServiceProvider = billingServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.getSignatureForOfferInteractorProvider = getSignatureForOfferInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.dailyBonusControllerProvider = dailyBonusControllerProvider;
    }

    public static MembersInjector<OfferFragment> create(Provider<BillingService> billingServiceProvider, Provider<UserService> userServiceProvider, Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider) {
        return new OfferFragment_MembersInjector(billingServiceProvider, userServiceProvider, getSignatureForOfferInteractorProvider, analyticsServiceProvider, dailyBonusControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OfferFragment instance) {
        injectBillingService(instance, this.billingServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectGetSignatureForOfferInteractor(instance, this.getSignatureForOfferInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectDailyBonusController(instance, this.dailyBonusControllerProvider.get());
    }

    public static void injectBillingService(OfferFragment instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectUserService(OfferFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectGetSignatureForOfferInteractor(OfferFragment instance, GetSignatureForOfferInteractor getSignatureForOfferInteractor) {
        instance.getSignatureForOfferInteractor = getSignatureForOfferInteractor;
    }

    public static void injectAnalyticsService(OfferFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectDailyBonusController(OfferFragment instance, DailyBonusController dailyBonusController) {
        instance.dailyBonusController = dailyBonusController;
    }
}
