package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TeamsResponseModel {

    @SerializedName("top_teams")
    @Expose
    private List<TeamsDataModel> teams = new ArrayList();

    public List<TeamsDataModel> getTeams() {
        return this.teams;
    }

    public void setTeams(List<TeamsDataModel> teams) {
        this.teams = teams;
    }
}
