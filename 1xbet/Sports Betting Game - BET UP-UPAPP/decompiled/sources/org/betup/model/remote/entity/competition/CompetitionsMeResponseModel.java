package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class CompetitionsMeResponseModel implements Serializable {

    @SerializedName("competitions")
    private List<CompetitionsMeModel> competitionsMeModelList;

    @SerializedName("continuationToken")
    private String continuationToken;

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    public List<CompetitionsMeModel> getCompetitionsMeModelList() {
        return this.competitionsMeModelList;
    }

    public void setCompetitionsMeModelList(List<CompetitionsMeModel> competitionsMeModelList) {
        this.competitionsMeModelList = competitionsMeModelList;
    }
}
