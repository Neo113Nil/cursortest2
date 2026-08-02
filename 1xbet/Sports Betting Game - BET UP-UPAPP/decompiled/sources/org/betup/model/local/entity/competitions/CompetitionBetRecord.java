package org.betup.model.local.entity.competitions;

/* loaded from: classes2.dex */
public class CompetitionBetRecord {
    private float coefficient;
    private long grabbedBetId;
    private int matchId;

    public long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public void setGrabbedBetId(long grabbedBetId) {
        this.grabbedBetId = grabbedBetId;
    }

    public float getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public int getMatchId() {
        return this.matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
}
