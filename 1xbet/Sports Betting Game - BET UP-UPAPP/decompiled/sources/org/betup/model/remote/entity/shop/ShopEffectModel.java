package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ShopEffectModel {

    @SerializedName("descr")
    private String desc;

    @SerializedName("effect_group")
    private int effectGroup;

    @SerializedName("name")
    private String name;

    @SerializedName("photo_url")
    private String photoUrl;

    public int getEffectGroup() {
        return this.effectGroup;
    }

    public void setEffectGroup(int effectGroup) {
        this.effectGroup = effectGroup;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
