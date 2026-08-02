package org.betup.model.remote.entity.matches.championship.specific;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SpecificChampBetBetModel {

    @SerializedName("bet_name")
    @Expose
    private String betName;

    @SerializedName("bet_type_id")
    @Expose
    private Integer betTypeId;

    @SerializedName("grabbed_bet_id")
    @Expose
    private Integer grabbedBetId;

    @SerializedName("grabbed_coeficient")
    @Expose
    private Double grabbedCoeficient;

    @SerializedName("is_available")
    @Expose
    private Boolean isAvailable;

    public String getBetName() {
        return this.betName;
    }

    public void setBetName(String betName) {
        this.betName = betName;
    }

    public Integer getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public void setGrabbedBetId(Integer grabbedBetId) {
        this.grabbedBetId = grabbedBetId;
    }

    public Double getGrabbedCoeficient() {
        return this.grabbedCoeficient;
    }

    public void setGrabbedCoeficient(Double grabbedCoeficient) {
        this.grabbedCoeficient = grabbedCoeficient;
    }

    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Integer getBetTypeId() {
        return this.betTypeId;
    }

    public void setBetTypeId(Integer betTypeId) {
        this.betTypeId = betTypeId;
    }
}
