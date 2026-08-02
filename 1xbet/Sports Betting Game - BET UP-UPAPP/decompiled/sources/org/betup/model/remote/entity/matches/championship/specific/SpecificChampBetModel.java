package org.betup.model.remote.entity.matches.championship.specific;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SpecificChampBetModel {

    @SerializedName("bets")
    @Expose
    private List<SpecificChampBetBetModel> bets = new ArrayList();

    @SerializedName("group")
    @Expose
    private SpecificChampGroupModel group;

    public SpecificChampGroupModel getGroup() {
        return this.group;
    }

    public void setGroup(SpecificChampGroupModel group) {
        this.group = group;
    }

    public List<SpecificChampBetBetModel> getBets() {
        return this.bets;
    }

    public void setBets(List<SpecificChampBetBetModel> bets) {
        this.bets = bets;
    }
}
