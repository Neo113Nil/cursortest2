package org.betup.model.remote.entity.videoRewards;

/* loaded from: classes2.dex */
public class VideoRewardForPlacementState {
    public static final String BETCOINS_REWARD_OPTION = "Betcoins";
    public static final String OPEN_BETS_REWARD_OPTION = "OpenBets";
    private boolean available;
    private int maxPerInterval;
    private long prizeAmount;
    private int remainingInInterval;
    private Long resetsAtEpochMs;
    private String rewardOption;
    private int usedInInterval;

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public long getPrizeAmount() {
        return this.prizeAmount;
    }

    public void setPrizeAmount(long prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public String getRewardOption() {
        return this.rewardOption;
    }

    public void setRewardOption(String rewardOption) {
        this.rewardOption = rewardOption;
    }

    public int getUsedInInterval() {
        return this.usedInInterval;
    }

    public void setUsedInInterval(int usedInInterval) {
        this.usedInInterval = usedInInterval;
    }

    public int getMaxPerInterval() {
        return this.maxPerInterval;
    }

    public void setMaxPerInterval(int maxPerInterval) {
        this.maxPerInterval = maxPerInterval;
    }

    public int getRemainingInInterval() {
        return this.remainingInInterval;
    }

    public void setRemainingInInterval(int remainingInInterval) {
        this.remainingInInterval = remainingInInterval;
    }

    public Long getResetsAtEpochMs() {
        return this.resetsAtEpochMs;
    }

    public void setResetsAtEpochMs(Long resetsAtEpochMs) {
        this.resetsAtEpochMs = resetsAtEpochMs;
    }
}
