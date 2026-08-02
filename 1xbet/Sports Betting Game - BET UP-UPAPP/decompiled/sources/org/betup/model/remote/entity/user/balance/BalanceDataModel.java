package org.betup.model.remote.entity.user.balance;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class BalanceDataModel {

    @SerializedName("action")
    private BalanceActionModel action;

    @SerializedName("balance_change")
    private long balanceChange;

    @SerializedName("context_code")
    private String contextCode;

    @SerializedName("date")
    private String date;

    @SerializedName("new_balance")
    private long newBalance;

    @SerializedName("old_balance")
    private long oldBalance;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getOldBalance() {
        return this.oldBalance;
    }

    public void setOldBalance(long oldBalance) {
        this.oldBalance = oldBalance;
    }

    public long getBalanceChange() {
        return this.balanceChange;
    }

    public void setBalanceChange(long balanceChange) {
        this.balanceChange = balanceChange;
    }

    public long getNewBalance() {
        return this.newBalance;
    }

    public void setNewBalance(long newBalance) {
        this.newBalance = newBalance;
    }

    public String getContextCode() {
        return this.contextCode;
    }

    public void setContextCode(String contextCode) {
        this.contextCode = contextCode;
    }

    public BalanceActionModel getAction() {
        return this.action;
    }

    public void setAction(BalanceActionModel action) {
        this.action = action;
    }
}
