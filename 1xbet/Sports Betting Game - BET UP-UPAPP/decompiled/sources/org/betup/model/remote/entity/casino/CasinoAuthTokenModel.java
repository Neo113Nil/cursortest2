package org.betup.model.remote.entity.casino;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class CasinoAuthTokenModel {

    @SerializedName("authenticationToken")
    private String authenticationToken;

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }
}
