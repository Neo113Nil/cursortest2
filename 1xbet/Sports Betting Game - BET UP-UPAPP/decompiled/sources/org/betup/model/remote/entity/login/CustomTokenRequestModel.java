package org.betup.model.remote.entity.login;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class CustomTokenRequestModel {

    @SerializedName(SDKConstants.PARAM_ACCESS_TOKEN)
    private String accessToken;

    @SerializedName("email")
    private String email;

    @SerializedName("type")
    private String type;

    public CustomTokenRequestModel(String accessToken, String email, String type) {
        this.accessToken = accessToken;
        this.email = email;
        this.type = type;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
