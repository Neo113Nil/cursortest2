package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UpdateAppVersionRequestModel {

    @SerializedName("appVersion")
    private String appVersion;

    public UpdateAppVersionRequestModel(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
