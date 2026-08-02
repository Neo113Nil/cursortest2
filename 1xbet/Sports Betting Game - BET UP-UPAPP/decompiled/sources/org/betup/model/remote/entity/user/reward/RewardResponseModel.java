package org.betup.model.remote.entity.user.reward;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3732u;

/* loaded from: classes2.dex */
public class RewardResponseModel {

    @SerializedName("money_balance")
    private long moneyBalance;

    @SerializedName(C3732u.j)
    private RewardDataModel rewardDataModel;

    public RewardDataModel getRewardDataModel() {
        return this.rewardDataModel;
    }

    public void setRewardDataModel(RewardDataModel rewardDataModel) {
        this.rewardDataModel = rewardDataModel;
    }

    public long getMoneyBalance() {
        return this.moneyBalance;
    }

    public void setMoneyBalance(long moneyBalance) {
        this.moneyBalance = moneyBalance;
    }
}
