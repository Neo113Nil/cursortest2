package org.betup.ui.dialogs.webgame;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;

/* loaded from: classes2.dex */
public final class WebGameWinVideoOfferDialogFragment_MembersInjector implements MembersInjector<WebGameWinVideoOfferDialogFragment> {
    private final Provider<PromoService> promoServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public WebGameWinVideoOfferDialogFragment_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider, Provider<PromoService> promoServiceProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.promoServiceProvider = promoServiceProvider;
    }

    public static MembersInjector<WebGameWinVideoOfferDialogFragment> create(Provider<VideoRewardService> videoRewardServiceProvider, Provider<PromoService> promoServiceProvider) {
        return new WebGameWinVideoOfferDialogFragment_MembersInjector(videoRewardServiceProvider, promoServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WebGameWinVideoOfferDialogFragment instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectPromoService(instance, this.promoServiceProvider.get());
    }

    public static void injectVideoRewardService(WebGameWinVideoOfferDialogFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectPromoService(WebGameWinVideoOfferDialogFragment instance, PromoService promoService) {
        instance.promoService = promoService;
    }
}
