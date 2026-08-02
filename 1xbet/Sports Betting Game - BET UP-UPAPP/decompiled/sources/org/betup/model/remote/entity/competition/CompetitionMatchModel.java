package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.sports.SportsDataModel;

/* loaded from: classes2.dex */
public class CompetitionMatchModel implements Serializable {

    @SerializedName("away_team")
    private SportsDataModel away_team;

    @SerializedName("date")
    private Date date;

    @SerializedName("home_team")
    private SportsDataModel home_team;

    @SerializedName("id")
    private int id;

    @SerializedName("league")
    private SportsDataModel league;

    @SerializedName("matchState")
    private MatchState matchState;

    @SerializedName("score_away")
    private int scoreAway;

    @SerializedName("score_home")
    private int scoreHome;

    @SerializedName("sport")
    private SportsDataModel sport;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MatchState getMatchState() {
        return this.matchState;
    }

    public void setMatchState(MatchState matchState) {
        this.matchState = matchState;
    }

    public SportsDataModel getLeague() {
        return this.league;
    }

    public void setLeague(SportsDataModel league) {
        this.league = league;
    }

    public SportsDataModel getAway_team() {
        return this.away_team;
    }

    public void setAway_team(SportsDataModel away_team) {
        this.away_team = away_team;
    }

    public SportsDataModel getHome_team() {
        return this.home_team;
    }

    public void setHome_team(SportsDataModel home_team) {
        this.home_team = home_team;
    }

    public SportsDataModel getSport() {
        return this.sport;
    }

    public void setSport(SportsDataModel sport) {
        this.sport = sport;
    }

    public int getScoreHome() {
        return this.scoreHome;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getScoreAway() {
        return this.scoreAway;
    }

    public void setScoreAway(int scoreAway) {
        this.scoreAway = scoreAway;
    }
}
