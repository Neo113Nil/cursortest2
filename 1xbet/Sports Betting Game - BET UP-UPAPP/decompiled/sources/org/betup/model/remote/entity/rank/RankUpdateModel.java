package org.betup.model.remote.entity.rank;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class RankUpdateModel {

    @SerializedName("exp")
    private long exp;

    @SerializedName("refresh")
    private long refresh;

    public long getRefresh() {
        return this.refresh;
    }

    public void setRefresh(long refresh) {
        this.refresh = refresh;
    }

    public long getExp() {
        return this.exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }
}
