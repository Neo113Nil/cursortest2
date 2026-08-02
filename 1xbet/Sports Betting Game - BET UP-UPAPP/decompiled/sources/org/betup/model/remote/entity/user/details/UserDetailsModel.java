package org.betup.model.remote.entity.user.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UserDetailsModel {

    @SerializedName("response")
    @Expose
    private UserDetailsResponseModel response;

    public UserDetailsResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(UserDetailsResponseModel response) {
        this.response = response;
    }
}
