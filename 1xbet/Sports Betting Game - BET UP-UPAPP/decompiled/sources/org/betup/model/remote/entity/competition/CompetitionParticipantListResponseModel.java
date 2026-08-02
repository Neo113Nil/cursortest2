package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class CompetitionParticipantListResponseModel {

    @SerializedName("competitions")
    private List<CompetitionParticipantResponseModel> competitions;

    @SerializedName("continuationToken")
    private String continuationToken;

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    public List<CompetitionParticipantResponseModel> getCompetitions() {
        return this.competitions;
    }

    public void setCompetitions(List<CompetitionParticipantResponseModel> competitions) {
        this.competitions = competitions;
    }
}
