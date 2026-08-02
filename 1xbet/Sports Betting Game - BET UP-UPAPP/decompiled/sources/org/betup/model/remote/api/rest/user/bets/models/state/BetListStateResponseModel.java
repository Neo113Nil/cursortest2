package org.betup.model.remote.api.rest.user.bets.models.state;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BetListStateResponseModel {

    @SerializedName("betlists")
    @Expose
    private List<BetListStateDataModel> betlists = new ArrayList();

    @SerializedName("state")
    @Expose
    private String state;

    public List<BetListStateDataModel> getBetlists() {
        return this.betlists;
    }

    public void setBetlists(List<BetListStateDataModel> betlists) {
        this.betlists = betlists;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
