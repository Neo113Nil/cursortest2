package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.user.FollowersDialogController;

/* loaded from: classes2.dex */
public final class FollowersDialog_MembersInjector implements MembersInjector<FollowersDialog> {
    private final Provider<FollowersDialogController> followersDialogControllerProvider;

    public FollowersDialog_MembersInjector(Provider<FollowersDialogController> followersDialogControllerProvider) {
        this.followersDialogControllerProvider = followersDialogControllerProvider;
    }

    public static MembersInjector<FollowersDialog> create(Provider<FollowersDialogController> followersDialogControllerProvider) {
        return new FollowersDialog_MembersInjector(followersDialogControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FollowersDialog instance) {
        injectFollowersDialogController(instance, this.followersDialogControllerProvider.get());
    }

    public static void injectFollowersDialogController(FollowersDialog instance, FollowersDialogController followersDialogController) {
        instance.followersDialogController = followersDialogController;
    }
}
