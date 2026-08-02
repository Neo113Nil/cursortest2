package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class OneClickBetSettingsModel {

    @SerializedName("dialogTitle")
    private String dialogTitle;

    @SerializedName("minStakeBetcoins")
    private long minStakeBetcoins = 100;

    @SerializedName("maxStakeBetcoins")
    private long maxStakeBetcoins = 500000;

    @SerializedName("unlockCostBetcoins")
    private long unlockCostBetcoins = 0;

    @SerializedName("presetStakeBetcoins1")
    private long presetStakeBetcoins1 = 5000;

    @SerializedName("presetStakeBetcoins2")
    private long presetStakeBetcoins2 = 10000;

    public long getMinStakeBetcoins() {
        return this.minStakeBetcoins;
    }

    public void setMinStakeBetcoins(long minStakeBetcoins) {
        this.minStakeBetcoins = minStakeBetcoins;
    }

    public long getMaxStakeBetcoins() {
        return this.maxStakeBetcoins;
    }

    public void setMaxStakeBetcoins(long maxStakeBetcoins) {
        this.maxStakeBetcoins = maxStakeBetcoins;
    }

    public long getUnlockCostBetcoins() {
        return this.unlockCostBetcoins;
    }

    public void setUnlockCostBetcoins(long unlockCostBetcoins) {
        this.unlockCostBetcoins = unlockCostBetcoins;
    }

    public String getDialogTitle() {
        return this.dialogTitle;
    }

    public void setDialogTitle(String dialogTitle) {
        this.dialogTitle = dialogTitle;
    }

    public long getPresetStakeBetcoins1() {
        return this.presetStakeBetcoins1;
    }

    public void setPresetStakeBetcoins1(long presetStakeBetcoins1) {
        this.presetStakeBetcoins1 = presetStakeBetcoins1;
    }

    public long getPresetStakeBetcoins2() {
        return this.presetStakeBetcoins2;
    }

    public void setPresetStakeBetcoins2(long presetStakeBetcoins2) {
        this.presetStakeBetcoins2 = presetStakeBetcoins2;
    }
}
