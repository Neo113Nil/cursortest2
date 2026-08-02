package org.betup.ui.fragment.dailybonus;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;

/* loaded from: classes4.dex */
public final class DailyBonusDialogFragment_MembersInjector implements MembersInjector<DailyBonusDialogFragment> {
    private final Provider<DailyBonusController> controllerProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public DailyBonusDialogFragment_MembersInjector(Provider<DailyBonusController> controllerProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        this.controllerProvider = controllerProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
    }

    public static MembersInjector<DailyBonusDialogFragment> create(Provider<DailyBonusController> controllerProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        return new DailyBonusDialogFragment_MembersInjector(controllerProvider, videoRewardServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DailyBonusDialogFragment instance) {
        injectController(instance, this.controllerProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
    }

    public static void injectController(DailyBonusDialogFragment instance, DailyBonusController controller) {
        instance.controller = controller;
    }

    public static void injectVideoRewardService(DailyBonusDialogFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }
}
