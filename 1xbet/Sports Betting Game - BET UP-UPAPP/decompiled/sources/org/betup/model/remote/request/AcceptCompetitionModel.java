package org.betup.model.remote.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class AcceptCompetitionModel {

    @SerializedName("grabbed_bet_ids")
    @Expose
    private long[] grabbedBetIds;

    public long[] getGrabbedBetIds() {
        return this.grabbedBetIds;
    }

    public void setGrabbedBetIds(long[] grabbedBetIds) {
        this.grabbedBetIds = grabbedBetIds;
    }
}
