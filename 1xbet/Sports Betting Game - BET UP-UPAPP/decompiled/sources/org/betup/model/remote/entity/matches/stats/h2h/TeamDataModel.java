package org.betup.model.remote.entity.matches.stats.h2h;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class TeamDataModel {

    @SerializedName("future")
    private List<MatchDetailsDataModel> future;

    @SerializedName("recent")
    private List<MatchDetailsDataModel> recent;

    public List<MatchDetailsDataModel> getRecent() {
        return this.recent;
    }

    public void setRecent(List<MatchDetailsDataModel> recent) {
        this.recent = recent;
    }

    public List<MatchDetailsDataModel> getFuture() {
        return this.future;
    }

    public void setFuture(List<MatchDetailsDataModel> future) {
        this.future = future;
    }
}
