package org.betup.model.remote.entity.betslip;

import androidx.collection.SieveCacheKt;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class GrabbedBetDataModel {

    @SerializedName("grabbed_bets")
    private List<GrabbedBetModel> grabbedBets;

    @SerializedName("max_money_placed")
    private long maxMoneyPlaced;

    public List<GrabbedBetModel> getGrabbedBets() {
        return this.grabbedBets;
    }

    public void setGrabbedBets(List<GrabbedBetModel> grabbedBets) {
        this.grabbedBets = grabbedBets;
    }

    public int getMaxMoneyPlaced() {
        long j = this.maxMoneyPlaced;
        if (j >= SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public void setMaxMoneyPlaced(long maxMoneyPlaced) {
        this.maxMoneyPlaced = maxMoneyPlaced;
    }
}
