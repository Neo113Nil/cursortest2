package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import com.vk.sdk.api.model.VKApiCommunityFull;
import java.io.Serializable;
import org.betup.model.remote.entity.country.CountryModel;

/* loaded from: classes2.dex */
public class CompetitionWinnerDataModel implements Serializable {

    @SerializedName("coefficient")
    private float coef;

    @SerializedName("country")
    private CountryModel countryModel;

    @SerializedName("id")
    private int id;

    @SerializedName("photo_url")
    private String photoUrl;

    @SerializedName(VKApiCommunityFull.PLACE)
    private int place;

    @SerializedName("prize")
    private long prize;

    @SerializedName("rank")
    private int rank;

    @SerializedName("name")
    private String winnerName;

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWinnerName() {
        return this.winnerName;
    }

    public void setWinnerName(String winnerName) {
        this.winnerName = winnerName;
    }

    public float getCoef() {
        return this.coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    public int getPlace() {
        return this.place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public long getPrize() {
        return this.prize;
    }

    public void setPrize(long prize) {
        this.prize = prize;
    }

    public CountryModel getCountryModel() {
        return this.countryModel;
    }

    public void setCountryModel(CountryModel countryModel) {
        this.countryModel = countryModel;
    }
}
