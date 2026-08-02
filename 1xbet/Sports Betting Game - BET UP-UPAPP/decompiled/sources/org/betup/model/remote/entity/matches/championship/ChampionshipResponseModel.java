package org.betup.model.remote.entity.matches.championship;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.sports.SportsDataModel;

/* loaded from: classes2.dex */
public class ChampionshipResponseModel {

    @SerializedName("leagues")
    @Expose
    private List<ChampionshipLeagueModel> leagues = new ArrayList();

    @SerializedName("param_date")
    @Expose
    private String paramDate;

    @SerializedName("sport")
    @Expose
    private SportsDataModel sport;

    public List<ChampionshipLeagueModel> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(List<ChampionshipLeagueModel> leagues) {
        this.leagues = leagues;
    }

    public String getParamDate() {
        return this.paramDate;
    }

    public void setParamDate(String paramDate) {
        this.paramDate = paramDate;
    }

    public SportsDataModel getSport() {
        return this.sport;
    }

    public void setSport(SportsDataModel sport) {
        this.sport = sport;
    }
}
