package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class BoostLevelDataModel {

    @SerializedName("addedEffects")
    private List<ShopEffectModel> effects;

    @SerializedName("moneyCost")
    private int moneyCost;

    @SerializedName("nextLevel")
    private int nextLevel;

    public int getNextLevel() {
        return this.nextLevel;
    }

    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
    }

    public int getMoneyCost() {
        return this.moneyCost;
    }

    public void setMoneyCost(int moneyCost) {
        this.moneyCost = moneyCost;
    }

    public List<ShopEffectModel> getEffects() {
        return this.effects;
    }

    public void setEffects(List<ShopEffectModel> effects) {
        this.effects = effects;
    }
}
