package org.betup.model.remote.entity.leagues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class LeaguesResponseModel {

    @SerializedName("top_leagues")
    @Expose
    private List<LeaguesDataModel> leagues = new ArrayList();

    public List<LeaguesDataModel> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(List<LeaguesDataModel> leagues) {
        this.leagues = leagues;
    }
}
