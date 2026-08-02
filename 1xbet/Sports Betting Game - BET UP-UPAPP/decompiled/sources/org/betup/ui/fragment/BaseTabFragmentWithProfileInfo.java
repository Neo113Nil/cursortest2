package org.betup.ui.fragment;

import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.betup.BetUpApp;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.services.user.UserService;
import org.betup.services.user.UserServiceAccessor;

/* loaded from: classes4.dex */
public abstract class BaseTabFragmentWithProfileInfo extends BaseTabFragment {
    private FullUserProfileModel fullUserProfileModel;
    private final UserService.UserInfoListener onUserGot = new UserService.UserInfoListener() { // from class: org.betup.ui.fragment.BaseTabFragmentWithProfileInfo.1
        @Override // org.betup.services.user.UserService.UserInfoListener
        public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<UserService.InfoKind> updated, FetchStat stat) {
            if (stat == FetchStat.SUCCESS) {
                BaseTabFragmentWithProfileInfo.this.fullUserProfileModel = fullUserProfileModel;
                if (BaseTabFragmentWithProfileInfo.this.callUserReadyAfterFetch() && BaseTabFragmentWithProfileInfo.this.isActive()) {
                    BaseTabFragmentWithProfileInfo.this.onUserReady(fullUserProfileModel, true);
                }
            }
        }
    };
    private UserServiceAccessor userServiceAccessor = new UserServiceAccessor();

    protected boolean callUserReadyAfterFetch() {
        return true;
    }

    protected abstract void onUserReady(FullUserProfileModel userModel, boolean success);

    protected void onViewReady(View view, Bundle savedInstanceState) {
    }

    public ShortUserProfileModel getShortProfile() {
        return this.userServiceAccessor.getUserService().getShortProfile();
    }

    public FullUserProfileModel getProfileIfFetched() {
        return this.fullUserProfileModel;
    }

    public UserService getUserService() {
        return this.userServiceAccessor.getUserService();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getActivity().getApplicationContext()).getComponent().inject(this.userServiceAccessor);
    }

    protected List<UserService.InfoKind> getMandatoryUserInfoKinds() {
        return Arrays.asList(UserService.InfoKind.GENERAL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindView(view);
        onViewReady(view, savedInstanceState);
        List<UserService.InfoKind> mandatoryUserInfoKinds = getMandatoryUserInfoKinds();
        this.userServiceAccessor.getUserService().getProfile(this.onUserGot, (UserService.InfoKind[]) mandatoryUserInfoKinds.toArray(new UserService.InfoKind[mandatoryUserInfoKinds.size()]));
    }
}
