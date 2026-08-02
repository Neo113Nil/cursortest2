package org.betup.ui.fragment.matches;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.NewSpecificChampionshipInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.BillingService;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class SpecificChampionshipFragment_MembersInjector implements MembersInjector<SpecificChampionshipFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<BetListAppender> betListAppenderProvider;
    private final Provider<BetValidator> betValidatorProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewSpecificChampionshipInteractor> newSpecificChampionshipInteractorProvider;
    private final Provider<PromoService> promoServiceProvider;
    private final Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider;
    private final Provider<NewSingleShopInteractor> singleShopInteractorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public SpecificChampionshipFragment_MembersInjector(Provider<PromoService> promoServiceProvider, Provider<NewSpecificChampionshipInteractor> newSpecificChampionshipInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.promoServiceProvider = promoServiceProvider;
        this.newSpecificChampionshipInteractorProvider = newSpecificChampionshipInteractorProvider;
        this.betListAppenderProvider = betListAppenderProvider;
        this.betValidatorProvider = betValidatorProvider;
        this.putFavoriteLeaguesInteractorProvider = putFavoriteLeaguesInteractorProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.singleShopInteractorProvider = singleShopInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<SpecificChampionshipFragment> create(Provider<PromoService> promoServiceProvider, Provider<NewSpecificChampionshipInteractor> newSpecificChampionshipInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new SpecificChampionshipFragment_MembersInjector(promoServiceProvider, newSpecificChampionshipInteractorProvider, betListAppenderProvider, betValidatorProvider, putFavoriteLeaguesInteractorProvider, localPreferencesServiceProvider, billingServiceProvider, firebaseRemoteConfigProvider, singleShopInteractorProvider, analyticsServiceProvider, videoRewardServiceProvider, matchFilterStateProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SpecificChampionshipFragment instance) {
        injectPromoService(instance, this.promoServiceProvider.get());
        injectNewSpecificChampionshipInteractor(instance, this.newSpecificChampionshipInteractorProvider.get());
        injectBetListAppender(instance, this.betListAppenderProvider.get());
        injectBetValidator(instance, this.betValidatorProvider.get());
        injectPutFavoriteLeaguesInteractor(instance, this.putFavoriteLeaguesInteractorProvider.get());
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
        injectSingleShopInteractor(instance, this.singleShopInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectPromoService(SpecificChampionshipFragment instance, PromoService promoService) {
        instance.promoService = promoService;
    }

    public static void injectNewSpecificChampionshipInteractor(SpecificChampionshipFragment instance, NewSpecificChampionshipInteractor newSpecificChampionshipInteractor) {
        instance.newSpecificChampionshipInteractor = newSpecificChampionshipInteractor;
    }

    public static void injectBetListAppender(SpecificChampionshipFragment instance, BetListAppender betListAppender) {
        instance.betListAppender = betListAppender;
    }

    public static void injectBetValidator(SpecificChampionshipFragment instance, BetValidator betValidator) {
        instance.betValidator = betValidator;
    }

    public static void injectPutFavoriteLeaguesInteractor(SpecificChampionshipFragment instance, PutFavoriteLeaguesInteractor putFavoriteLeaguesInteractor) {
        instance.putFavoriteLeaguesInteractor = putFavoriteLeaguesInteractor;
    }

    public static void injectLocalPreferencesService(SpecificChampionshipFragment instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }

    public static void injectBillingService(SpecificChampionshipFragment instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectFirebaseRemoteConfig(SpecificChampionshipFragment instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public static void injectSingleShopInteractor(SpecificChampionshipFragment instance, NewSingleShopInteractor singleShopInteractor) {
        instance.singleShopInteractor = singleShopInteractor;
    }

    public static void injectAnalyticsService(SpecificChampionshipFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectVideoRewardService(SpecificChampionshipFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectMatchFilterState(SpecificChampionshipFragment instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }

    public static void injectAppLanguageObserver(SpecificChampionshipFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
