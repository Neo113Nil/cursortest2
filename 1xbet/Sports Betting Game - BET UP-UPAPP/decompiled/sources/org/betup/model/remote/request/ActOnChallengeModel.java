package org.betup.model.remote.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ActOnChallengeModel {

    @SerializedName("grabbed_bet_ids")
    @Expose
    private long[] grabbedBetIds;

    @SerializedName("state")
    @Expose
    private String state;

    public long[] getGrabbedBetIds() {
        return this.grabbedBetIds;
    }

    public void setGrabbedBetIds(long[] grabbedBetIds) {
        this.grabbedBetIds = grabbedBetIds;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
