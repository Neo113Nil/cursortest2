package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class CompetitionsHistoryResponse implements Serializable {

    @SerializedName("competitions")
    private List<CompetitionInfoModel> competitionInfoModelList;

    @SerializedName("continuationToken")
    private String continuationToken;

    public List<CompetitionInfoModel> getCompetitionInfoModelList() {
        return this.competitionInfoModelList;
    }

    public void setCompetitionInfoModelList(List<CompetitionInfoModel> competitionInfoModelList) {
        this.competitionInfoModelList = competitionInfoModelList;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }
}
