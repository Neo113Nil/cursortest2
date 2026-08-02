package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MatchDetailsBetModel {

    @SerializedName("bets")
    @Expose
    private List<MatchDetailsBetDataModel> bets = new ArrayList();

    @SerializedName("group")
    @Expose
    private MatchDetailsBetGroupModel group;

    public MatchDetailsBetGroupModel getGroup() {
        return this.group;
    }

    public void setGroup(MatchDetailsBetGroupModel group) {
        this.group = group;
    }

    public List<MatchDetailsBetDataModel> getBets() {
        return this.bets;
    }

    public void setBets(List<MatchDetailsBetDataModel> bets) {
        this.bets = bets;
    }
}
