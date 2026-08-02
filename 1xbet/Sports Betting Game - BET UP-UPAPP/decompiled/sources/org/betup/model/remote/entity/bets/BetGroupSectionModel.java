package org.betup.model.remote.entity.bets;

import java.util.List;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;

/* loaded from: classes2.dex */
public class BetGroupSectionModel {
    private List<MatchDetailsBetDataModel> bets;
    private BetGroupModel group;

    public BetGroupModel getGroup() {
        return this.group;
    }

    public void setGroup(BetGroupModel group) {
        this.group = group;
    }

    public MatchDetailsBetDataModel getBetAtIndexIfHas(int index) {
        List<MatchDetailsBetDataModel> list = this.bets;
        if (list == null || list.size() <= index) {
            return null;
        }
        return this.bets.get(index);
    }

    public List<MatchDetailsBetDataModel> getBets() {
        return this.bets;
    }

    public void setBets(List<MatchDetailsBetDataModel> bets) {
        this.bets = bets;
    }

    public boolean hasBets() {
        List<MatchDetailsBetDataModel> list = this.bets;
        return list != null && list.size() > 0;
    }
}
