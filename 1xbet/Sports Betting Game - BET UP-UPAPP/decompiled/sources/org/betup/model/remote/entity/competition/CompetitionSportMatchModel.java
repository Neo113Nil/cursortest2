package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.sports.SportsDataModel;

/* loaded from: classes2.dex */
public class CompetitionSportMatchModel implements Serializable {

    @SerializedName("date")
    private String date;

    @SerializedName("id")
    private int id;

    @SerializedName("matchState")
    private MatchState matchState;

    @SerializedName("score_away")
    private int scoreAway;

    @SerializedName("score_home")
    private int scoreHome;

    @SerializedName("away_team")
    private SportsDataModel shortAwayTeam;

    @SerializedName("home_team")
    private SportsDataModel shortHomeTeam;

    @SerializedName("sport")
    private SportsDataModel shortSport;

    @SerializedName("league")
    private SportsDataModel sportsDataModel;

    public int getScoreAway() {
        return this.scoreAway;
    }

    public void setScoreAway(int scoreAway) {
        this.scoreAway = scoreAway;
    }

    public int getScoreHome() {
        return this.scoreHome;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SportsDataModel getSportsDataModel() {
        return this.sportsDataModel;
    }

    public void setSportsDataModel(SportsDataModel sportsDataModel) {
        this.sportsDataModel = sportsDataModel;
    }

    public SportsDataModel getShortAwayTeam() {
        return this.shortAwayTeam;
    }

    public void setShortAwayTeam(SportsDataModel shortAwayTeam) {
        this.shortAwayTeam = shortAwayTeam;
    }

    public SportsDataModel getShortHomeTeam() {
        return this.shortHomeTeam;
    }

    public void setShortHomeTeam(SportsDataModel shortHomeTeam) {
        this.shortHomeTeam = shortHomeTeam;
    }

    public SportsDataModel getShortSport() {
        return this.shortSport;
    }

    public void setShortSport(SportsDataModel shortSport) {
        this.shortSport = shortSport;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MatchState getMatchState() {
        return this.matchState;
    }

    public void setMatchState(MatchState matchState) {
        this.matchState = matchState;
    }
}
