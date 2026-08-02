package org.betup.model.remote.entity.login;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class CustomTokenResponseModel {

    @SerializedName("uid")
    private String uid;

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
