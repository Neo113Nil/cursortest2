package org.betup.ui.fragment.shop;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.ShopEntitlementClaimInteractor;
import org.betup.model.remote.api.rest.shop.ShopLayoutInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes4.dex */
public final class ShopBetcoinsFragmentK_MembersInjector implements MembersInjector<ShopBetcoinsFragmentK> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<DailyBonusController> dailyBonusControllerProvider;
    private final Provider<ShopEntitlementClaimInteractor> shopEntitlementClaimInteractorProvider;
    private final Provider<ShopLayoutInteractor> shopLayoutInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public ShopBetcoinsFragmentK_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider, Provider<BillingService> billingServiceProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<UserService> userServiceProvider, Provider<ShopLayoutInteractor> shopLayoutInteractorProvider, Provider<ShopEntitlementClaimInteractor> shopEntitlementClaimInteractorProvider, Provider<DailyBonusController> dailyBonusControllerProvider, Provider<BalanceHolder> balanceHolderProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.shopLayoutInteractorProvider = shopLayoutInteractorProvider;
        this.shopEntitlementClaimInteractorProvider = shopEntitlementClaimInteractorProvider;
        this.dailyBonusControllerProvider = dailyBonusControllerProvider;
        this.balanceHolderProvider = balanceHolderProvider;
    }

    public static MembersInjector<ShopBetcoinsFragmentK> create(Provider<VideoRewardService> videoRewardServiceProvider, Provider<BillingService> billingServiceProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<UserService> userServiceProvider, Provider<ShopLayoutInteractor> shopLayoutInteractorProvider, Provider<ShopEntitlementClaimInteractor> shopEntitlementClaimInteractorProvider, Provider<DailyBonusController> dailyBonusControllerProvider, Provider<BalanceHolder> balanceHolderProvider) {
        return new ShopBetcoinsFragmentK_MembersInjector(videoRewardServiceProvider, billingServiceProvider, analyticsServiceProvider, userServiceProvider, shopLayoutInteractorProvider, shopEntitlementClaimInteractorProvider, dailyBonusControllerProvider, balanceHolderProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ShopBetcoinsFragmentK instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectShopLayoutInteractor(instance, this.shopLayoutInteractorProvider.get());
        injectShopEntitlementClaimInteractor(instance, this.shopEntitlementClaimInteractorProvider.get());
        injectDailyBonusController(instance, this.dailyBonusControllerProvider.get());
        injectBalanceHolder(instance, this.balanceHolderProvider.get());
    }

    public static void injectVideoRewardService(ShopBetcoinsFragmentK instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectBillingService(ShopBetcoinsFragmentK instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectAnalyticsService(ShopBetcoinsFragmentK instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectUserService(ShopBetcoinsFragmentK instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectShopLayoutInteractor(ShopBetcoinsFragmentK instance, ShopLayoutInteractor shopLayoutInteractor) {
        instance.shopLayoutInteractor = shopLayoutInteractor;
    }

    public static void injectShopEntitlementClaimInteractor(ShopBetcoinsFragmentK instance, ShopEntitlementClaimInteractor shopEntitlementClaimInteractor) {
        instance.shopEntitlementClaimInteractor = shopEntitlementClaimInteractor;
    }

    public static void injectDailyBonusController(ShopBetcoinsFragmentK instance, DailyBonusController dailyBonusController) {
        instance.dailyBonusController = dailyBonusController;
    }

    public static void injectBalanceHolder(ShopBetcoinsFragmentK instance, BalanceHolder balanceHolder) {
        instance.balanceHolder = balanceHolder;
    }
}
