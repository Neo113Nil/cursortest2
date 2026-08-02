package org.betup.model.remote.entity.reward;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class RewardBetlistInfo {

    @SerializedName("amount")
    private int amount;

    @SerializedName("countReward")
    private int countReward;

    @SerializedName("rewardAvailable")
    private boolean rewardAvailable;

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCountReward() {
        return this.countReward;
    }

    public void setCountReward(int countReward) {
        this.countReward = countReward;
    }

    public boolean isRewardAvailable() {
        return this.rewardAvailable;
    }

    public void setRewardAvailable(boolean rewardAvailable) {
        this.rewardAvailable = rewardAvailable;
    }
}
