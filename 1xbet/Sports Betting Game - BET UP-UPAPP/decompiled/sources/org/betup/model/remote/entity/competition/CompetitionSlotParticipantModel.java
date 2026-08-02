package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.betup.model.remote.entity.country.CountryModel;

/* loaded from: classes2.dex */
public class CompetitionSlotParticipantModel implements Serializable {

    @SerializedName("coefficient")
    private float coef;

    @SerializedName("country")
    private CountryModel countryModel;

    @SerializedName("id")
    private int id;

    @SerializedName("level")
    private int level;

    @SerializedName("photo_url")
    private String photoUrl;

    @SerializedName("place_in_slot")
    private int placeInSlot;

    @SerializedName("name")
    private String winnerName;

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

    public CountryModel getCountryModel() {
        return this.countryModel;
    }

    public void setCountryModel(CountryModel countryModel) {
        this.countryModel = countryModel;
    }

    public int getPlaceInSlot() {
        return this.placeInSlot;
    }

    public void setPlaceInSlot(int placeInSlot) {
        this.placeInSlot = placeInSlot;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
