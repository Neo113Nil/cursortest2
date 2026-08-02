package org.betup.ui.fragment.search.model;

import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.leagues.LeaguesDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.teams.TeamsDataModel;

/* loaded from: classes4.dex */
public class AllSearchResultModel {
    private String term;
    private List<TeamsDataModel> teams = new ArrayList();
    private List<LeaguesDataModel> leagues = new ArrayList();
    private List<MatchDetailsDataModel> matches = new ArrayList();

    public String getTerm() {
        return this.term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<TeamsDataModel> getTeams() {
        return this.teams;
    }

    public void setTeams(List<TeamsDataModel> teams) {
        this.teams = teams;
    }

    public List<LeaguesDataModel> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(List<LeaguesDataModel> leagues) {
        this.leagues = leagues;
    }

    public List<MatchDetailsDataModel> getMatches() {
        return this.matches;
    }

    public void setMatches(List<MatchDetailsDataModel> matches) {
        this.matches = matches;
    }
}
