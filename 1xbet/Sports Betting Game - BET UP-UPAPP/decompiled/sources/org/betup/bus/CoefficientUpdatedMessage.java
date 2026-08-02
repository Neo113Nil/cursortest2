package org.betup.bus;

/* loaded from: classes2.dex */
public class CoefficientUpdatedMessage {
    private final Long matchId;

    public CoefficientUpdatedMessage() {
        this.matchId = null;
    }

    public CoefficientUpdatedMessage(Long matchId) {
        this.matchId = matchId;
    }

    public Long getMatchId() {
        return this.matchId;
    }
}
