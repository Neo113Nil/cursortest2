package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SupportCategoryDto {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
