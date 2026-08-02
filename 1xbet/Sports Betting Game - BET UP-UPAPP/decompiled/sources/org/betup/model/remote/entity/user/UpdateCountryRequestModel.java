package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UpdateCountryRequestModel {

    @SerializedName("countryIso")
    private String countryIso;

    public UpdateCountryRequestModel(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getCountryIso() {
        return this.countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }
}
