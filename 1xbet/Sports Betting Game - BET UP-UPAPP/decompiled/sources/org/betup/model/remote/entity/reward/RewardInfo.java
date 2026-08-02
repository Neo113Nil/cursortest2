package org.betup.model.remote.entity.reward;

import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.shop.RewardState;

/* loaded from: classes2.dex */
public class RewardInfo {

    @SerializedName("bonus")
    private int bonus;

    @SerializedName("state")
    private RewardState state;

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public RewardState getState() {
        return this.state;
    }

    public void setState(RewardState state) {
        this.state = state;
    }
}
