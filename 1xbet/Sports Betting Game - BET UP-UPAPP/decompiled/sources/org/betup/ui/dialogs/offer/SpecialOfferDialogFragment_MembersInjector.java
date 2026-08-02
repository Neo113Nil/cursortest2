package org.betup.ui.dialogs.offer;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.analytics.GetSignatureForOfferInteractor;
import org.betup.model.remote.api.rest.analytics.GetSingleOfferInfoInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;

/* loaded from: classes2.dex */
public final class SpecialOfferDialogFragment_MembersInjector implements MembersInjector<SpecialOfferDialogFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<DailyBonusController> dailyBonusControllerProvider;
    private final Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider;
    private final Provider<GetSingleOfferInfoInteractor> getSingleOfferInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public SpecialOfferDialogFragment_MembersInjector(Provider<GetSingleOfferInfoInteractor> getSingleOfferInteractorProvider, Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<UserService> userServiceProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider) {
        this.getSingleOfferInteractorProvider = getSingleOfferInteractorProvider;
        this.getSignatureForOfferInteractorProvider = getSignatureForOfferInteractorProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.dailyBonusControllerProvider = dailyBonusControllerProvider;
    }

    public static MembersInjector<SpecialOfferDialogFragment> create(Provider<GetSingleOfferInfoInteractor> getSingleOfferInteractorProvider, Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<UserService> userServiceProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider) {
        return new SpecialOfferDialogFragment_MembersInjector(getSingleOfferInteractorProvider, getSignatureForOfferInteractorProvider, billingServiceProvider, userServiceProvider, analyticsServiceProvider, dailyBonusControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SpecialOfferDialogFragment instance) {
        injectGetSingleOfferInteractor(instance, this.getSingleOfferInteractorProvider.get());
        injectGetSignatureForOfferInteractor(instance, this.getSignatureForOfferInteractorProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectDailyBonusController(instance, this.dailyBonusControllerProvider.get());
    }

    public static void injectGetSingleOfferInteractor(SpecialOfferDialogFragment instance, GetSingleOfferInfoInteractor getSingleOfferInteractor) {
        instance.getSingleOfferInteractor = getSingleOfferInteractor;
    }

    public static void injectGetSignatureForOfferInteractor(SpecialOfferDialogFragment instance, GetSignatureForOfferInteractor getSignatureForOfferInteractor) {
        instance.getSignatureForOfferInteractor = getSignatureForOfferInteractor;
    }

    public static void injectBillingService(SpecialOfferDialogFragment instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectUserService(SpecialOfferDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectAnalyticsService(SpecialOfferDialogFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectDailyBonusController(SpecialOfferDialogFragment instance, DailyBonusController dailyBonusController) {
        instance.dailyBonusController = dailyBonusController;
    }
}
