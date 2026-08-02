package org.betup.model.remote.entity.user;

import org.betup.model.local.entity.FullUserProfileModel;

/* loaded from: classes2.dex */
public class ShortUserProfileModel {
    private BaseUserModel userModel;
    private UserProgressModel userProgressModel;

    public ShortUserProfileModel() {
    }

    public ShortUserProfileModel(FullUserProfileModel fullUserProfileModel) {
        if (fullUserProfileModel == null) {
            return;
        }
        this.userModel = fullUserProfileModel.getUserModel();
        this.userProgressModel = fullUserProfileModel.getUserProgressModel();
    }

    public BaseUserModel getUserModel() {
        return this.userModel;
    }

    public void setUserModel(BaseUserModel userModel) {
        this.userModel = userModel;
    }

    public UserProgressModel getUserProgressModel() {
        return this.userProgressModel;
    }

    public void setUserProgressModel(UserProgressModel userProgressModel) {
        this.userProgressModel = userProgressModel;
    }
}
