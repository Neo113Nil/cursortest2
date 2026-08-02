package org.betup.model.remote.entity.videoRewards;

/* loaded from: classes2.dex */
public class VideoRewardPlacementInfo {
    private final boolean available;
    private final int maxPerInterval;
    private final long prizeAmount;
    private final int remainingInInterval;
    private final Long resetsAtEpochMs;
    private final int usedInInterval;

    public VideoRewardPlacementInfo(boolean available, long prizeAmount, int usedInInterval, int maxPerInterval, int remainingInInterval, Long resetsAtEpochMs) {
        this.available = available;
        this.prizeAmount = prizeAmount;
        this.usedInInterval = usedInInterval;
        this.maxPerInterval = maxPerInterval;
        this.remainingInInterval = remainingInInterval;
        this.resetsAtEpochMs = resetsAtEpochMs;
    }

    public static VideoRewardPlacementInfo unavailable() {
        return new VideoRewardPlacementInfo(false, 0L, 0, 0, 0, null);
    }

    public static VideoRewardPlacementInfo fromState(VideoRewardForPlacementState state) {
        if (state == null) {
            return unavailable();
        }
        return new VideoRewardPlacementInfo(state.isAvailable(), state.getPrizeAmount(), state.getUsedInInterval(), state.getMaxPerInterval(), state.getRemainingInInterval(), state.getResetsAtEpochMs());
    }

    public boolean isAvailable() {
        return this.available;
    }

    public long getPrizeAmount() {
        return this.prizeAmount;
    }

    public int getUsedInInterval() {
        return this.usedInInterval;
    }

    public int getMaxPerInterval() {
        return this.maxPerInterval;
    }

    public int getRemainingInInterval() {
        return this.remainingInInterval;
    }

    public Long getResetsAtEpochMs() {
        return this.resetsAtEpochMs;
    }

    public boolean hasQuotaDisplay() {
        return this.maxPerInterval > 0;
    }

    public boolean isIntervalLimitReached() {
        return this.maxPerInterval > 0 && this.remainingInInterval <= 0 && !this.available;
    }

    public boolean isQuotaExhausted() {
        return isIntervalLimitReached();
    }
}
