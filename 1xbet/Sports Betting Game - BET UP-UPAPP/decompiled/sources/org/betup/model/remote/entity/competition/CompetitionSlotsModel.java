package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class CompetitionSlotsModel extends BaseCompetitionModel {

    @SerializedName("slots")
    private int slots;

    public int getSlots() {
        return this.slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }
}
