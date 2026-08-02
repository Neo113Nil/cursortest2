package org.betup.model.local.entity;

/* loaded from: classes2.dex */
public enum BetPresentation {
    SHORT("simple_bets"),
    FULL("complex_bets");

    private String betFormatName;

    BetPresentation(String betFormatName) {
        this.betFormatName = betFormatName;
    }

    public String getBetFormatName() {
        return this.betFormatName;
    }

    public void setBetFormatName(String betFormatName) {
        this.betFormatName = betFormatName;
    }

    public static BetPresentation getFromString(String str) {
        BetPresentation betPresentation = SHORT;
        return betPresentation.betFormatName.equals(str) ? betPresentation : FULL;
    }
}
