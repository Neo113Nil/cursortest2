package org.betup.games.doubles.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.offer.VideoRewardService;

/* loaded from: classes2.dex */
public final class ResultDoubleGameDialog_MembersInjector implements MembersInjector<ResultDoubleGameDialog> {
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public ResultDoubleGameDialog_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
    }

    public static MembersInjector<ResultDoubleGameDialog> create(Provider<VideoRewardService> videoRewardServiceProvider) {
        return new ResultDoubleGameDialog_MembersInjector(videoRewardServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ResultDoubleGameDialog instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
    }

    public static void injectVideoRewardService(ResultDoubleGameDialog instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }
}
