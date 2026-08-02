package org.betup.model.local.entity.competitions;

import java.util.Map;

/* loaded from: classes2.dex */
public class CompetitionBetsRecord {
    private Map<Integer, CompetitionBetRecord> bets;

    public Map<Integer, CompetitionBetRecord> getBets() {
        return this.bets;
    }

    public void setBets(Map<Integer, CompetitionBetRecord> bets) {
        this.bets = bets;
    }
}
