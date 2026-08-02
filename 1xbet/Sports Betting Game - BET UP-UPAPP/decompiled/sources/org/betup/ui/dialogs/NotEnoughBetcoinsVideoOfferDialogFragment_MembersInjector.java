package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class NotEnoughBetcoinsVideoOfferDialogFragment_MembersInjector implements MembersInjector<NotEnoughBetcoinsVideoOfferDialogFragment> {
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public NotEnoughBetcoinsVideoOfferDialogFragment_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider, Provider<UserService> userServiceProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<NotEnoughBetcoinsVideoOfferDialogFragment> create(Provider<VideoRewardService> videoRewardServiceProvider, Provider<UserService> userServiceProvider) {
        return new NotEnoughBetcoinsVideoOfferDialogFragment_MembersInjector(videoRewardServiceProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotEnoughBetcoinsVideoOfferDialogFragment instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectVideoRewardService(NotEnoughBetcoinsVideoOfferDialogFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectUserService(NotEnoughBetcoinsVideoOfferDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
