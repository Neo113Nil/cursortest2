package org.betup.model.domain;

/* loaded from: classes2.dex */
public class FinalAcceptBetForChallengeModel extends SelectBetForChallengeModel {
    private String betLabel;
    private String betSection;
    private double grabbedBetCoef;
    private long grabbedBetId;

    public String getBetSection() {
        return this.betSection;
    }

    public void setBetSection(String betSection) {
        this.betSection = betSection;
    }

    public long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public void setGrabbedBetId(long grabbedBetId) {
        this.grabbedBetId = grabbedBetId;
    }

    public String getBetLabel() {
        return this.betLabel;
    }

    public void setBetLabel(String betLabel) {
        this.betLabel = betLabel;
    }

    public double getGrabbedBetCoef() {
        return this.grabbedBetCoef;
    }

    public void setGrabbedBetCoef(double grabbedBetCoef) {
        this.grabbedBetCoef = grabbedBetCoef;
    }
}
