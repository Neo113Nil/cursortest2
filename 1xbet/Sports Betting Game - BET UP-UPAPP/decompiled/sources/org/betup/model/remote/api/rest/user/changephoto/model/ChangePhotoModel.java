package org.betup.model.remote.api.rest.user.changephoto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ChangePhotoModel {

    @SerializedName("response")
    @Expose
    private ChangePhotoResponseModel response;

    public ChangePhotoResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(ChangePhotoResponseModel response) {
        this.response = response;
    }
}
