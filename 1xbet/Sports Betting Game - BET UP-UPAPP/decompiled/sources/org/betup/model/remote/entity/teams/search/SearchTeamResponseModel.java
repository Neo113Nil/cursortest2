package org.betup.model.remote.entity.teams.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.vk.sdk.api.VKApiConst;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.search.SearchResultModel;
import org.betup.model.remote.entity.teams.TeamsDataModel;

/* loaded from: classes2.dex */
public class SearchTeamResponseModel implements SearchResultModel<TeamsDataModel> {

    @SerializedName(VKApiConst.Q)
    @Expose
    private String q;

    @SerializedName("teams")
    @Expose
    private List<TeamsDataModel> teams = new ArrayList();

    public List<TeamsDataModel> getTeams() {
        return this.teams;
    }

    public void setTeams(List<TeamsDataModel> teams) {
        this.teams = teams;
    }

    public String getQ() {
        return this.q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    @Override // org.betup.model.remote.entity.search.SearchResultModel
    public List<TeamsDataModel> getItems() {
        return getTeams();
    }
}
