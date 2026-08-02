package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UpdatePushTokenAndLangRequestModel {

    @SerializedName("lang")
    private String lang;

    @SerializedName("pushToken")
    private String pushToken;

    public UpdatePushTokenAndLangRequestModel(String pushToken, String lang) {
        this.pushToken = pushToken;
        this.lang = lang;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
