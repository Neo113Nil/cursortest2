package org.betup.ui.dialogs.offer;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.analytics.GetSignatureForOfferInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;

/* loaded from: classes2.dex */
public final class SpecialOfferPageFragment_MembersInjector implements MembersInjector<SpecialOfferPageFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<DailyBonusController> dailyBonusControllerProvider;
    private final Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public SpecialOfferPageFragment_MembersInjector(Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<UserService> userServiceProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider) {
        this.getSignatureForOfferInteractorProvider = getSignatureForOfferInteractorProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.dailyBonusControllerProvider = dailyBonusControllerProvider;
    }

    public static MembersInjector<SpecialOfferPageFragment> create(Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<UserService> userServiceProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider) {
        return new SpecialOfferPageFragment_MembersInjector(getSignatureForOfferInteractorProvider, billingServiceProvider, userServiceProvider, analyticsServiceProvider, dailyBonusControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SpecialOfferPageFragment instance) {
        injectGetSignatureForOfferInteractor(instance, this.getSignatureForOfferInteractorProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectDailyBonusController(instance, this.dailyBonusControllerProvider.get());
    }

    public static void injectGetSignatureForOfferInteractor(SpecialOfferPageFragment instance, GetSignatureForOfferInteractor getSignatureForOfferInteractor) {
        instance.getSignatureForOfferInteractor = getSignatureForOfferInteractor;
    }

    public static void injectBillingService(SpecialOfferPageFragment instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectUserService(SpecialOfferPageFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectAnalyticsService(SpecialOfferPageFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectDailyBonusController(SpecialOfferPageFragment instance, DailyBonusController dailyBonusController) {
        instance.dailyBonusController = dailyBonusController;
    }
}
