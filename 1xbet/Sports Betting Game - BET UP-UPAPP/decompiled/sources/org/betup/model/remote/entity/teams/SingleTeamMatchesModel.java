package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class SingleTeamMatchesModel {

    @SerializedName("future")
    @Expose
    private List<MatchDetailsDataModel> future;

    @SerializedName("old")
    @Expose
    private List<MatchDetailsDataModel> old;

    public List<MatchDetailsDataModel> getOld() {
        return this.old;
    }

    public void setOld(List<MatchDetailsDataModel> old) {
        this.old = old;
    }

    public List<MatchDetailsDataModel> getFuture() {
        return this.future;
    }

    public void setFuture(List<MatchDetailsDataModel> future) {
        this.future = future;
    }
}
