package org.betup.model.remote.entity.matches.championship.specific;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.leagues.LeaguesDataModel;

/* loaded from: classes2.dex */
public class SpecificChampResponseModel {

    @SerializedName("league")
    @Expose
    private LeaguesDataModel league;

    @SerializedName("matches")
    @Expose
    private List<ListedMatchModel> matches = new ArrayList();

    @SerializedName("param_date")
    @Expose
    private String paramDate;

    public List<ListedMatchModel> getMatches() {
        return this.matches;
    }

    public void setMatches(List<ListedMatchModel> matches) {
        this.matches = matches;
    }

    public String getParamDate() {
        return this.paramDate;
    }

    public void setParamDate(String paramDate) {
        this.paramDate = paramDate;
    }

    public LeaguesDataModel getLeague() {
        return this.league;
    }

    public void setLeague(LeaguesDataModel league) {
        this.league = league;
    }
}
