package org.betup.model.remote.entity.user.balance;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class BalanceResponseModel {

    @SerializedName("balanceHistory")
    private List<BalanceDataModel> history;

    public List<BalanceDataModel> getHistory() {
        return this.history;
    }

    public void setHistory(List<BalanceDataModel> history) {
        this.history = history;
    }
}
