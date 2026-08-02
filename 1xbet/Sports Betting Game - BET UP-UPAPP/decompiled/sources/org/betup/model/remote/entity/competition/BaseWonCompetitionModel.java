package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class BaseWonCompetitionModel implements Serializable {

    @SerializedName("coefficient")
    private float coeff;

    @SerializedName("id")
    private int id;

    @SerializedName("max_coefficient")
    private float maxCoeff;

    @SerializedName("overall")
    private int overAll;

    @SerializedName("place_in_slot")
    private int placeInSlot;

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

    public float getMaxCoeff() {
        return this.maxCoeff;
    }

    public void setMaxCoeff(float maxCoeff) {
        this.maxCoeff = maxCoeff;
    }

    public int getOverAll() {
        return this.overAll;
    }

    public void setOverAll(int overAll) {
        this.overAll = overAll;
    }

    public int getPlaceInSlot() {
        return this.placeInSlot;
    }

    public void setPlaceInSlot(int placeInSlot) {
        this.placeInSlot = placeInSlot;
    }
}
