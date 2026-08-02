package org.betup.model.remote.entity.signin;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SignUpResponseModel {

    @SerializedName(SDKConstants.PARAM_ACCESS_TOKEN)
    @Expose
    private String accessToken;

    @SerializedName("expries")
    @Expose
    private String expries;

    @SerializedName("uid")
    @Expose
    private String uid;

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getExpries() {
        return this.expries;
    }

    public void setExpries(String expries) {
        this.expries = expries;
    }
}
