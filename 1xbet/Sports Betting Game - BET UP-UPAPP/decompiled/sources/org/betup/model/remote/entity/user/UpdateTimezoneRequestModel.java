package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UpdateTimezoneRequestModel {

    @SerializedName("timezone")
    private String timezone;

    public UpdateTimezoneRequestModel(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
