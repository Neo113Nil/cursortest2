package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UpdateDisplayNameRequestModel {

    @SerializedName("name")
    private String name;

    public UpdateDisplayNameRequestModel(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
