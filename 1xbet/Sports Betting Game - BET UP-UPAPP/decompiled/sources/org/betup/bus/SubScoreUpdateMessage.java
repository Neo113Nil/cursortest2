package org.betup.bus;

import org.betup.model.remote.entity.bets.SubMatchModel;

/* loaded from: classes2.dex */
public class SubScoreUpdateMessage {
    private SubMatchModel match;

    public SubScoreUpdateMessage(SubMatchModel match) {
        this.match = match;
    }

    public SubMatchModel getMatch() {
        return this.match;
    }

    public void setMatch(SubMatchModel match) {
        this.match = match;
    }
}
