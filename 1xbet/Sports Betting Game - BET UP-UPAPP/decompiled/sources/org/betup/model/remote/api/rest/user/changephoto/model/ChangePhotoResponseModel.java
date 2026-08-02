package org.betup.model.remote.api.rest.user.changephoto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ChangePhotoResponseModel {

    @SerializedName("photo")
    @Expose
    private ChangePotoUrlModel photo;

    public ChangePotoUrlModel getPhoto() {
        return this.photo;
    }

    public void setPhoto(ChangePotoUrlModel photo) {
        this.photo = photo;
    }
}
