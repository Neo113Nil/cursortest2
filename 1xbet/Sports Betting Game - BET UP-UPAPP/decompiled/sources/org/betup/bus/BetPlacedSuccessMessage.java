package org.betup.bus;

/* loaded from: classes2.dex */
public class BetPlacedSuccessMessage {
    private final int matchId;

    public BetPlacedSuccessMessage(int matchId) {
        this.matchId = matchId;
    }

    public int getMatchId() {
        return this.matchId;
    }
}
