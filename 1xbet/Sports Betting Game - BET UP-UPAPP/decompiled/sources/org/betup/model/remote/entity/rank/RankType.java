package org.betup.model.remote.entity.rank;

/* loaded from: classes2.dex */
public enum RankType {
    DAY("day"),
    WEEK("week"),
    MONTH("month");

    private String name;

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    RankType(String name) {
        this.name = name;
    }
}
