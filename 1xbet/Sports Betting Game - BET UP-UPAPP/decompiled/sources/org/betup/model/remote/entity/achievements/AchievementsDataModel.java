package org.betup.model.remote.entity.achievements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class AchievementsDataModel {

    @SerializedName("descr")
    @Expose
    private String descr;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("is_opened")
    @Expose
    private Boolean opened;

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    @SerializedName("price")
    @Expose
    private Integer price;

    @SerializedName("progress")
    @Expose
    private int progress;

    public AchievementsDataModel() {
    }

    public AchievementsDataModel(String name, String photoUrl, String descr, int price) {
        this.name = name;
        this.photoUrl = photoUrl;
        this.descr = descr;
        this.price = Integer.valueOf(price);
    }

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return this.descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getOpened() {
        return this.opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }
}
