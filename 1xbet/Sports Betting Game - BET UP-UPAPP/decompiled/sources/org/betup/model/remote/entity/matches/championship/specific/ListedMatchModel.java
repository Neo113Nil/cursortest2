package org.betup.model.remote.entity.matches.championship.specific;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class ListedMatchModel {

    @SerializedName("sub_matches")
    @Expose
    private List<BetSectionModel> betSections = new ArrayList();

    @SerializedName("match_info")
    @Expose
    private MatchDetailsDataModel match;

    public MatchDetailsDataModel getMatch() {
        return this.match;
    }

    public void setMatch(MatchDetailsDataModel match) {
        this.match = match;
    }

    public List<BetSectionModel> getBetSections() {
        return this.betSections;
    }

    public void setBetSections(List<BetSectionModel> betSections) {
        this.betSections = betSections;
    }
}
