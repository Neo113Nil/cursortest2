package org.betup.ui.dialogs.webgame;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.ReportDailyQuestClientEventInteractor;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class WebGameDialogFragment_MembersInjector implements MembersInjector<WebGameDialogFragment> {
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<PromoService> promoServiceProvider;
    private final Provider<ReportDailyQuestClientEventInteractor> reportDailyQuestClientEventInteractorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public WebGameDialogFragment_MembersInjector(Provider<BalanceHolder> balanceHolderProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<ReportDailyQuestClientEventInteractor> reportDailyQuestClientEventInteractorProvider, Provider<PromoService> promoServiceProvider) {
        this.balanceHolderProvider = balanceHolderProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.reportDailyQuestClientEventInteractorProvider = reportDailyQuestClientEventInteractorProvider;
        this.promoServiceProvider = promoServiceProvider;
    }

    public static MembersInjector<WebGameDialogFragment> create(Provider<BalanceHolder> balanceHolderProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<ReportDailyQuestClientEventInteractor> reportDailyQuestClientEventInteractorProvider, Provider<PromoService> promoServiceProvider) {
        return new WebGameDialogFragment_MembersInjector(balanceHolderProvider, videoRewardServiceProvider, reportDailyQuestClientEventInteractorProvider, promoServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WebGameDialogFragment instance) {
        injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectReportDailyQuestClientEventInteractor(instance, this.reportDailyQuestClientEventInteractorProvider.get());
        injectPromoService(instance, this.promoServiceProvider.get());
    }

    public static void injectBalanceHolder(WebGameDialogFragment instance, BalanceHolder balanceHolder) {
        instance.balanceHolder = balanceHolder;
    }

    public static void injectVideoRewardService(WebGameDialogFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectReportDailyQuestClientEventInteractor(WebGameDialogFragment instance, ReportDailyQuestClientEventInteractor reportDailyQuestClientEventInteractor) {
        instance.reportDailyQuestClientEventInteractor = reportDailyQuestClientEventInteractor;
    }

    public static void injectPromoService(WebGameDialogFragment instance, PromoService promoService) {
        instance.promoService = promoService;
    }
}
