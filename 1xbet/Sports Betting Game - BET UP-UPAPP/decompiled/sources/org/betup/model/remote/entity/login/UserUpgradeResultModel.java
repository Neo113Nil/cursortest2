package org.betup.model.remote.entity.login;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UserUpgradeResultModel {

    @SerializedName("upgraded")
    private boolean upgraded;

    public UserUpgradeResultModel(boolean upgraded) {
        this.upgraded = upgraded;
    }

    public boolean isUpgraded() {
        return this.upgraded;
    }

    public void setUpgraded(boolean upgraded) {
        this.upgraded = upgraded;
    }
}
