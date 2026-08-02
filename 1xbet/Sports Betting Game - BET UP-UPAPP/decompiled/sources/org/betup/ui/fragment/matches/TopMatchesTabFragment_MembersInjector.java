package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.HotMatchesInteractor;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.offer.PromoService;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes4.dex */
public final class TopMatchesTabFragment_MembersInjector implements MembersInjector<TopMatchesTabFragment> {
    private final Provider<BetListAppender> betListAppenderProvider;
    private final Provider<BetValidator> betValidatorProvider;
    private final Provider<HotMatchesInteractor> hotMatchesInteractorProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<PromoService> promoServiceProvider;

    public TopMatchesTabFragment_MembersInjector(Provider<PromoService> promoServiceProvider, Provider<HotMatchesInteractor> hotMatchesInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.promoServiceProvider = promoServiceProvider;
        this.hotMatchesInteractorProvider = hotMatchesInteractorProvider;
        this.betListAppenderProvider = betListAppenderProvider;
        this.betValidatorProvider = betValidatorProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    public static MembersInjector<TopMatchesTabFragment> create(Provider<PromoService> promoServiceProvider, Provider<HotMatchesInteractor> hotMatchesInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new TopMatchesTabFragment_MembersInjector(promoServiceProvider, hotMatchesInteractorProvider, betListAppenderProvider, betValidatorProvider, localPreferencesServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TopMatchesTabFragment instance) {
        injectPromoService(instance, this.promoServiceProvider.get());
        injectHotMatchesInteractor(instance, this.hotMatchesInteractorProvider.get());
        injectBetListAppender(instance, this.betListAppenderProvider.get());
        injectBetValidator(instance, this.betValidatorProvider.get());
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
    }

    public static void injectPromoService(TopMatchesTabFragment instance, PromoService promoService) {
        instance.promoService = promoService;
    }

    public static void injectHotMatchesInteractor(TopMatchesTabFragment instance, HotMatchesInteractor hotMatchesInteractor) {
        instance.hotMatchesInteractor = hotMatchesInteractor;
    }

    public static void injectBetListAppender(TopMatchesTabFragment instance, BetListAppender betListAppender) {
        instance.betListAppender = betListAppender;
    }

    public static void injectBetValidator(TopMatchesTabFragment instance, BetValidator betValidator) {
        instance.betValidator = betValidator;
    }

    public static void injectLocalPreferencesService(TopMatchesTabFragment instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }
}
