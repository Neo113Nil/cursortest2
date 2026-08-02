package org.betup.model.remote.entity.followers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.country.CountryModel;

/* loaded from: classes2.dex */
public class UserFollower {

    @SerializedName("country")
    @Expose
    private CountryModel country;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("level")
    @Expose
    private int level;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    @SerializedName("rank")
    @Expose
    private int rank;

    @SerializedName("rank_day")
    @Expose
    private int rankDay;

    @SerializedName("rank_month")
    @Expose
    private int rankMonth;

    @SerializedName("roi")
    @Expose
    private double roi;

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

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

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRankDay() {
        return this.rankDay;
    }

    public void setRankDay(int rankDay) {
        this.rankDay = rankDay;
    }

    public int getRankMonth() {
        return this.rankMonth;
    }

    public void setRankMonth(int rankMonth) {
        this.rankMonth = rankMonth;
    }

    public CountryModel getCountry() {
        return this.country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getRoi() {
        return this.roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }
}
