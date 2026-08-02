package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class TeamDetailsResponseModel {

    @SerializedName("futureMatches")
    @Expose
    private List<MatchDetailsDataModel> futureMatches;

    @SerializedName("isFavourite")
    @Expose
    private Boolean isFavourite;

    @SerializedName("pastMatches")
    @Expose
    private List<MatchDetailsDataModel> pastMatches;

    @SerializedName("team")
    @Expose
    private SingleTeamDataModel team;

    public SingleTeamDataModel getTeam() {
        return this.team;
    }

    public void setTeam(SingleTeamDataModel team) {
        this.team = team;
    }

    public List<MatchDetailsDataModel> getFutureMatches() {
        return this.futureMatches;
    }

    public void setFutureMatches(List<MatchDetailsDataModel> futureMatches) {
        this.futureMatches = futureMatches;
    }

    public List<MatchDetailsDataModel> getPastMatches() {
        return this.pastMatches;
    }

    public void setPastMatches(List<MatchDetailsDataModel> pastMatches) {
        this.pastMatches = pastMatches;
    }

    public Boolean getIsFavourite() {
        return this.isFavourite;
    }

    public void setIsFavourite(Boolean isFavourite) {
        this.isFavourite = isFavourite;
    }
}
