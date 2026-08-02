package org.betup.model.remote.entity.login;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class LoginResponseModel {

    @SerializedName("profileCreated")
    private boolean profileCreated;

    public LoginResponseModel(boolean profileCreated) {
        this.profileCreated = profileCreated;
    }

    public boolean isProfileCreated() {
        return this.profileCreated;
    }

    public void setProfileCreated(boolean profileCreated) {
        this.profileCreated = profileCreated;
    }
}
