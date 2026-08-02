package org.betup.model.remote.entity.rewards;

/* loaded from: classes2.dex */
public class AchievementRewardRequest {
    private long achievementId;
    private long amount;

    public AchievementRewardRequest(long achievementId, long amount) {
        this.achievementId = achievementId;
        this.amount = amount;
    }

    public long getAchievementId() {
        return this.achievementId;
    }

    public void setAchievementId(long achievementId) {
        this.achievementId = achievementId;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
