package org.betup.ui.fragment.wheeloffortune;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;
import org.betup.ui.fragment.wheeloffortune.controller.WheelOfFortuneRewardController;

/* loaded from: classes4.dex */
public final class WheelOfFortuneFragment_MembersInjector implements MembersInjector<WheelOfFortuneFragment> {
    private final Provider<HomeVideoBonusController> homeVideoBonusControllerProvider;
    private final Provider<WheelOfFortuneRewardController> rewardControllerProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public WheelOfFortuneFragment_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider, Provider<WheelOfFortuneRewardController> rewardControllerProvider, Provider<HomeVideoBonusController> homeVideoBonusControllerProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.rewardControllerProvider = rewardControllerProvider;
        this.homeVideoBonusControllerProvider = homeVideoBonusControllerProvider;
    }

    public static MembersInjector<WheelOfFortuneFragment> create(Provider<VideoRewardService> videoRewardServiceProvider, Provider<WheelOfFortuneRewardController> rewardControllerProvider, Provider<HomeVideoBonusController> homeVideoBonusControllerProvider) {
        return new WheelOfFortuneFragment_MembersInjector(videoRewardServiceProvider, rewardControllerProvider, homeVideoBonusControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WheelOfFortuneFragment instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectRewardController(instance, this.rewardControllerProvider.get());
        injectHomeVideoBonusController(instance, this.homeVideoBonusControllerProvider.get());
    }

    public static void injectVideoRewardService(WheelOfFortuneFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectRewardController(WheelOfFortuneFragment instance, WheelOfFortuneRewardController rewardController) {
        instance.rewardController = rewardController;
    }

    public static void injectHomeVideoBonusController(WheelOfFortuneFragment instance, HomeVideoBonusController homeVideoBonusController) {
        instance.homeVideoBonusController = homeVideoBonusController;
    }
}
