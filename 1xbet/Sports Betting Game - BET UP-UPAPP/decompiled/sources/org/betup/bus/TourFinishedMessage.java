package org.betup.bus;

/* loaded from: classes2.dex */
public class TourFinishedMessage {
    private final int totalRewardAmount;

    public TourFinishedMessage() {
        this(0);
    }

    public TourFinishedMessage(int totalRewardAmount) {
        this.totalRewardAmount = totalRewardAmount;
    }

    public int getTotalRewardAmount() {
        return this.totalRewardAmount;
    }
}
