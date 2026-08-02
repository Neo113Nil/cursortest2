package org.betup.model.remote.entity.user.balance;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class BalanceActionModel {

    @SerializedName("description")
    private String description;

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
