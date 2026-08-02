package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.MatchesByDateInteractor;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.offer.PromoService;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.ui.fragment.matches.filter.DateFilterState;

/* loaded from: classes4.dex */
public final class MatchesByDateFragment_MembersInjector implements MembersInjector<MatchesByDateFragment> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<BetListAppender> betListAppenderProvider;
    private final Provider<BetValidator> betValidatorProvider;
    private final Provider<DateFilterState> dateFilterStateProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<MatchesByDateInteractor> matchesByDateInteractorProvider;
    private final Provider<PromoService> promoServiceProvider;

    public MatchesByDateFragment_MembersInjector(Provider<PromoService> promoServiceProvider, Provider<MatchesByDateInteractor> matchesByDateInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.promoServiceProvider = promoServiceProvider;
        this.matchesByDateInteractorProvider = matchesByDateInteractorProvider;
        this.betListAppenderProvider = betListAppenderProvider;
        this.betValidatorProvider = betValidatorProvider;
        this.dateFilterStateProvider = dateFilterStateProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<MatchesByDateFragment> create(Provider<PromoService> promoServiceProvider, Provider<MatchesByDateInteractor> matchesByDateInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new MatchesByDateFragment_MembersInjector(promoServiceProvider, matchesByDateInteractorProvider, betListAppenderProvider, betValidatorProvider, dateFilterStateProvider, localPreferencesServiceProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchesByDateFragment instance) {
        injectPromoService(instance, this.promoServiceProvider.get());
        injectMatchesByDateInteractor(instance, this.matchesByDateInteractorProvider.get());
        injectBetListAppender(instance, this.betListAppenderProvider.get());
        injectBetValidator(instance, this.betValidatorProvider.get());
        injectDateFilterState(instance, this.dateFilterStateProvider.get());
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectPromoService(MatchesByDateFragment instance, PromoService promoService) {
        instance.promoService = promoService;
    }

    public static void injectMatchesByDateInteractor(MatchesByDateFragment instance, MatchesByDateInteractor matchesByDateInteractor) {
        instance.matchesByDateInteractor = matchesByDateInteractor;
    }

    public static void injectBetListAppender(MatchesByDateFragment instance, BetListAppender betListAppender) {
        instance.betListAppender = betListAppender;
    }

    public static void injectBetValidator(MatchesByDateFragment instance, BetValidator betValidator) {
        instance.betValidator = betValidator;
    }

    public static void injectDateFilterState(MatchesByDateFragment instance, DateFilterState dateFilterState) {
        instance.dateFilterState = dateFilterState;
    }

    public static void injectLocalPreferencesService(MatchesByDateFragment instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }

    public static void injectAppLanguageObserver(MatchesByDateFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
