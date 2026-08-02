package org.betup.model.remote.entity.reward;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class DailyRewardInfo {

    @SerializedName("bonuses")
    private List<DailyBonusItem> bonuses;

    @SerializedName("nextRewardAfter")
    private Date nextRewardAfter;

    @SerializedName("nextRewardBefore")
    private Date nextRewardBefore;

    public List<DailyBonusItem> getBonuses() {
        return this.bonuses;
    }

    public void setBonuses(List<DailyBonusItem> bonuses) {
        this.bonuses = bonuses;
    }

    public Date getNextRewardBefore() {
        return this.nextRewardBefore;
    }

    public void setNextRewardBefore(Date nextRewardBefore) {
        this.nextRewardBefore = nextRewardBefore;
    }

    public Date getNextRewardAfter() {
        return this.nextRewardAfter;
    }

    public void setNextRewardAfter(Date nextRewardAfter) {
        this.nextRewardAfter = nextRewardAfter;
    }
}
