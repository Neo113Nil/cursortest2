package org.betup.model.remote.entity.rank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class RankDataModel {

    @SerializedName("ranks")
    @Expose
    private List<RankUserModel> ranks = new ArrayList();

    @SerializedName("updates")
    private RankUpdateModel updates;

    public RankUpdateModel getUpdates() {
        return this.updates;
    }

    public void setUpdates(RankUpdateModel updates) {
        this.updates = updates;
    }

    public List<RankUserModel> getRanks() {
        return this.ranks;
    }

    public void setRanks(List<RankUserModel> ranks) {
        this.ranks = ranks;
    }
}
