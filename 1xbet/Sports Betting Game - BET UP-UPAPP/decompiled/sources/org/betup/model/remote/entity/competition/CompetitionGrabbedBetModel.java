package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class CompetitionGrabbedBetModel implements Serializable {

    @SerializedName("bet_name")
    private String betName;

    @SerializedName("grabbed_coeficient")
    private float coeff;

    @SerializedName("grabbed_bet_id")
    private int id;

    @SerializedName("is_available")
    private boolean isAvailable;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCoeff() {
        return this.coeff;
    }

    public void setCoeff(float coeff) {
        this.coeff = coeff;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public String getBetName() {
        return this.betName;
    }

    public void setBetName(String betName) {
        this.betName = betName;
    }
}
