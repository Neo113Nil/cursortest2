package org.betup.model.remote.entity.missions;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3732u;

/* loaded from: classes2.dex */
public class MissionRewardModel {

    @SerializedName(C3732u.j)
    private long amount;

    @SerializedName("type")
    private MissionRewardType type;

    public MissionRewardType getType() {
        return this.type;
    }

    public void setType(MissionRewardType type) {
        this.type = type;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
