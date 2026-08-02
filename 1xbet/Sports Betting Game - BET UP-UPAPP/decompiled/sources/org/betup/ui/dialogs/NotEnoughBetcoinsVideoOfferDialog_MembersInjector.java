package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.offer.VideoRewardService;

/* loaded from: classes2.dex */
public final class NotEnoughBetcoinsVideoOfferDialog_MembersInjector implements MembersInjector<NotEnoughBetcoinsVideoOfferDialog> {
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public NotEnoughBetcoinsVideoOfferDialog_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
    }

    public static MembersInjector<NotEnoughBetcoinsVideoOfferDialog> create(Provider<VideoRewardService> videoRewardServiceProvider) {
        return new NotEnoughBetcoinsVideoOfferDialog_MembersInjector(videoRewardServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotEnoughBetcoinsVideoOfferDialog instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
    }

    public static void injectVideoRewardService(NotEnoughBetcoinsVideoOfferDialog instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }
}
