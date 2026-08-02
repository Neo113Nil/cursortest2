package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.offer.VideoRewardService;

/* loaded from: classes2.dex */
public final class RewardReceivedDialog_MembersInjector implements MembersInjector<RewardReceivedDialog> {
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public RewardReceivedDialog_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
    }

    public static MembersInjector<RewardReceivedDialog> create(Provider<VideoRewardService> videoRewardServiceProvider) {
        return new RewardReceivedDialog_MembersInjector(videoRewardServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RewardReceivedDialog instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
    }

    public static void injectVideoRewardService(RewardReceivedDialog instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }
}
