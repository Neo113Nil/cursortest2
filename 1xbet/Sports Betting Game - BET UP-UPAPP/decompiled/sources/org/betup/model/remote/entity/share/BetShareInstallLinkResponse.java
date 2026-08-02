package org.betup.model.remote.entity.share;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class BetShareInstallLinkResponse {

    @SerializedName("installUrl")
    private String installUrl;

    public String getInstallUrl() {
        return this.installUrl;
    }

    public void setInstallUrl(String installUrl) {
        this.installUrl = installUrl;
    }
}
