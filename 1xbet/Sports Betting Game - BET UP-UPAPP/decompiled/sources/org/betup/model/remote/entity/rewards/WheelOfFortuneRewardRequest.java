package org.betup.model.remote.entity.rewards;

/* loaded from: classes2.dex */
public class WheelOfFortuneRewardRequest {
    private long dailyBonusId;
    private int multiplier;

    public WheelOfFortuneRewardRequest(long dailyBonusId, int multiplier) {
        this.dailyBonusId = dailyBonusId;
        this.multiplier = multiplier;
    }

    public long getDailyBonusId() {
        return this.dailyBonusId;
    }

    public void setDailyBonusId(long dailyBonusId) {
        this.dailyBonusId = dailyBonusId;
    }

    public int getMultiplier() {
        return this.multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
