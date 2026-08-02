package org.betup.model.remote.entity.user.stats;

/* loaded from: classes2.dex */
public enum StatsType {
    SEVEN_DAYS("7d"),
    ONE_MONTH("30d"),
    ONE_YEAR("1y");

    private String shortTitle;

    StatsType(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getShortTitle() {
        return this.shortTitle;
    }
}
