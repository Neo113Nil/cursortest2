package org.betup.model.remote.entity.user.referrals;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class ReferralResponse {

    @SerializedName(Mechanism.JsonKeys.META)
    public MetaModel metaModel;

    @SerializedName("money_balance")
    private long moneyBalance;

    @SerializedName("money_get")
    private int moneyGet;

    public int getMoneyGet() {
        return this.moneyGet;
    }

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public void setMoneyGet(int moneyGet) {
        this.moneyGet = moneyGet;
    }

    public long getMoneyBalance() {
        return this.moneyBalance;
    }

    public void setMoneyBalance(long moneyBalance) {
        this.moneyBalance = moneyBalance;
    }
}
