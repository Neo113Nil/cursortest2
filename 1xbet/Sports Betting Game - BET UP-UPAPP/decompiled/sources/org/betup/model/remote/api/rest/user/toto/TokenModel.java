package org.betup.model.remote.api.rest.user.toto;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class TokenModel {

    @SerializedName("response")
    private TokenResponseModel tokenResponseModel;

    public TokenModel(TokenResponseModel tokenResponseModel) {
        this.tokenResponseModel = tokenResponseModel;
    }

    public TokenResponseModel getTokenResponseModel() {
        return this.tokenResponseModel;
    }

    public void setTokenResponseModel(TokenResponseModel tokenResponseModel) {
        this.tokenResponseModel = tokenResponseModel;
    }
}
