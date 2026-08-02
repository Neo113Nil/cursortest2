package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MatchDetailsResponseModel {

    @SerializedName("match_info")
    @Expose
    private MatchDetailsDataModel match;

    @SerializedName("sub_matches")
    @Expose
    private List<org.betup.model.remote.entity.bets.BetSectionModel> matchDetailsBetModel;

    public MatchDetailsDataModel getMatch() {
        return this.match;
    }

    public void setMatch(MatchDetailsDataModel match) {
        this.match = match;
    }

    public List<org.betup.model.remote.entity.bets.BetSectionModel> getBets() {
        if (this.matchDetailsBetModel == null) {
            this.matchDetailsBetModel = new ArrayList();
        }
        return this.matchDetailsBetModel;
    }

    public void setBets(List<org.betup.model.remote.entity.bets.BetSectionModel> matchDetailsBetModel) {
        this.matchDetailsBetModel = matchDetailsBetModel;
    }
}
