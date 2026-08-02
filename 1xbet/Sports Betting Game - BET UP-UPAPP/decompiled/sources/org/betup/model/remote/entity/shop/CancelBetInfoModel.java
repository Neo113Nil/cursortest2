package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class CancelBetInfoModel {
    private boolean cancelAvailable;

    @SerializedName("returnAmount")
    private long moneyReturn;

    public boolean isCancelAvailable() {
        return this.cancelAvailable;
    }

    public void setCancelAvailable(boolean cancelAvailable) {
        this.cancelAvailable = cancelAvailable;
    }

    public long getMoneyReturn() {
        return this.moneyReturn;
    }

    public void setMoneyReturn(long moneyReturn) {
        this.moneyReturn = moneyReturn;
    }
}
