package org.betup.model.remote.entity.matches.championship;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ChampionshipLeagueModel {

    @SerializedName("count")
    @Expose
    private int count;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("interest_factor")
    private int interestFactor;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    public int getInterestFactor() {
        return this.interestFactor;
    }

    public void setInterestFactor(int interestFactor) {
        this.interestFactor = interestFactor;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
