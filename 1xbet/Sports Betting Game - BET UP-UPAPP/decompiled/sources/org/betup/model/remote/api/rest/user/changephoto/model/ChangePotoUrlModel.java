package org.betup.model.remote.api.rest.user.changephoto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ChangePotoUrlModel {

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
