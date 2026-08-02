package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SingleTeamResponseModel {

    @SerializedName("matches")
    @Expose
    private SingleTeamMatchesModel matches;

    @SerializedName("team")
    @Expose
    private SingleTeamDataModel team;

    public SingleTeamDataModel getTeam() {
        return this.team;
    }

    public void setTeam(SingleTeamDataModel team) {
        this.team = team;
    }

    public SingleTeamMatchesModel getMatches() {
        return this.matches;
    }

    public void setMatches(SingleTeamMatchesModel matches) {
        this.matches = matches;
    }
}
