package org.betup.bus;

import java.util.List;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class MatchTimerUpdateMessage {
    private List<BetSectionModel> bets;
    private MatchDetailsDataModel match;

    public MatchTimerUpdateMessage(MatchDetailsDataModel match, List<BetSectionModel> bets) {
        this.match = match;
        this.bets = bets;
    }

    public MatchDetailsDataModel getMatch() {
        return this.match;
    }

    public List<BetSectionModel> getBets() {
        return this.bets;
    }

    public void setBets(List<BetSectionModel> bets) {
        this.bets = bets;
    }
}
