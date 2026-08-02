package org.betup.bus;

/* loaded from: classes2.dex */
public class VideoRewardReceivedMessage {
    private long amount;
    private String placementId;

    public VideoRewardReceivedMessage(long amount, String placementId) {
        this.amount = amount;
        this.placementId = placementId;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }
}
