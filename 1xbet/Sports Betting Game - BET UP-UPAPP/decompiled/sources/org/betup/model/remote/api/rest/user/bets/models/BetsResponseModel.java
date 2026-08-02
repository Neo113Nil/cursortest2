package org.betup.model.remote.api.rest.user.bets.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BetsResponseModel {

    @SerializedName("betlists")
    @Expose
    private List<BetsListModel> betlists = new ArrayList();

    @SerializedName("state")
    @Expose
    private String state;

    public List<BetsListModel> getBetlists() {
        return this.betlists;
    }

    public void setBetlists(List<BetsListModel> betlists) {
        this.betlists = betlists;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
