package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UpdateTutorialCompleteRequestModel {

    @SerializedName("giveReward")
    private Boolean giveReward;

    @SerializedName("tourDemoBetType")
    private String tourDemoBetType;

    @SerializedName("tutorialComplete")
    private Boolean tutorialComplete;

    public UpdateTutorialCompleteRequestModel(Boolean tutorialComplete) {
        this.tutorialComplete = tutorialComplete;
        this.giveReward = false;
    }

    public UpdateTutorialCompleteRequestModel(Boolean tutorialComplete, Boolean giveReward) {
        this.tutorialComplete = tutorialComplete;
        this.giveReward = Boolean.valueOf(giveReward != null ? giveReward.booleanValue() : false);
        this.tourDemoBetType = null;
    }

    public UpdateTutorialCompleteRequestModel(Boolean tutorialComplete, Boolean giveReward, String tourDemoBetType) {
        this.tutorialComplete = tutorialComplete;
        this.giveReward = Boolean.valueOf(giveReward != null ? giveReward.booleanValue() : false);
        this.tourDemoBetType = tourDemoBetType;
    }

    public Boolean getTutorialComplete() {
        return this.tutorialComplete;
    }

    public void setTutorialComplete(Boolean tutorialComplete) {
        this.tutorialComplete = tutorialComplete;
    }

    public Boolean getGiveReward() {
        return this.giveReward;
    }

    public void setGiveReward(Boolean giveReward) {
        this.giveReward = Boolean.valueOf(giveReward != null ? giveReward.booleanValue() : false);
    }

    public String getTourDemoBetType() {
        return this.tourDemoBetType;
    }

    public void setTourDemoBetType(String tourDemoBetType) {
        this.tourDemoBetType = tourDemoBetType;
    }
}
