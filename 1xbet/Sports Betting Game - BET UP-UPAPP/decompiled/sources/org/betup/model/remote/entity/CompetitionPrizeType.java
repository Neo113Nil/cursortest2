package org.betup.model.remote.entity;

/* loaded from: classes2.dex */
public enum CompetitionPrizeType {
    SLOT(1),
    MEGA(2);

    private final int prize;

    CompetitionPrizeType(int prize) {
        this.prize = prize;
    }

    public int getPrize() {
        return this.prize;
    }
}
