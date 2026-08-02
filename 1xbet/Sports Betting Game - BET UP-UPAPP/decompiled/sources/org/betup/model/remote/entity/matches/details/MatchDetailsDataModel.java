package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.betup.model.remote.entity.matches.MatchState;

/* loaded from: classes2.dex */
public class MatchDetailsDataModel implements Serializable {

    @SerializedName("away_team")
    @Expose
    private MatchDetailsAwayTeamModel awayTeam;

    @SerializedName("bets")
    private int bets;

    @SerializedName("comment")
    private int comments;

    @SerializedName("current_period")
    @Expose
    private String currentPeriod;

    @SerializedName("current_time")
    @Expose
    private String currentTime;

    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("game")
    @Expose
    private String game;

    @SerializedName("home_team")
    @Expose
    private MatchDetailsHomeTeamModel homeTeam;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("info_json")
    @Expose
    private MatchDetailsInfoJsonModel infoJson;

    @SerializedName("league")
    @Expose
    private MatchDetailsLeagueModel league;

    @SerializedName("isLiked")
    private boolean liked;

    @SerializedName("likes")
    private int likes;

    @SerializedName("matchState")
    @Expose
    private int matchState;

    @SerializedName("overtimed")
    @Expose
    private boolean overtimed;

    @SerializedName("reposts")
    private int reposts;

    @SerializedName("result_general")
    @Expose
    private String resultGeneral;

    @SerializedName("resultRegular")
    @Expose
    private String resultRegular;

    @SerializedName("result_raw")
    @Expose
    private String resultRow;

    @SerializedName("score_away")
    @Expose
    private Float scoreAway;

    @SerializedName("score_home")
    @Expose
    private Float scoreHome;

    @SerializedName("serve")
    @Expose
    private String serve;

    @SerializedName("short_name")
    @Expose
    private String shortName;

    @SerializedName("sport")
    @Expose
    private MatchDetailsSportModel sport;

    @SerializedName("vb")
    @Expose
    private String vb;

    @SerializedName("views")
    private int views;

    @SerializedName("xZone")
    private String xZone;

    public String getCurrentPeriod() {
        return this.currentPeriod;
    }

    public void setCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public boolean isOvertimed() {
        return this.overtimed;
    }

    public void setOvertimed(boolean overtimed) {
        this.overtimed = overtimed;
    }

    public MatchState getState() {
        return MatchState.fromInt(this.matchState);
    }

    public void setState(MatchState state) {
        this.matchState = state.getVal();
    }

    public int getReposts() {
        return this.reposts;
    }

    public void setReposts(int reposts) {
        this.reposts = reposts;
    }

    public boolean isLiked() {
        return this.liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getBets() {
        return this.bets;
    }

    public void setBets(int bets) {
        this.bets = bets;
    }

    public int getComments() {
        return this.comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String[] getGame() {
        String str = this.game;
        if (str == null || str.equals("")) {
            return null;
        }
        return this.game.split("-");
    }

    public Integer getServe() {
        try {
            String str = this.serve;
            if (str != null && !str.equals("") && Integer.valueOf(this.serve).intValue() != 0) {
                return Integer.valueOf(this.serve);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void setVb(String vb) {
        this.vb = vb;
    }

    public String getVb() {
        return this.vb;
    }

    public String getResultRow() {
        return this.resultRow;
    }

    public void setResultRow(String resultRow) {
        this.resultRow = resultRow;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MatchDetailsLeagueModel getLeague() {
        return this.league;
    }

    public void setLeague(MatchDetailsLeagueModel league) {
        this.league = league;
    }

    public MatchDetailsAwayTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    public void setAwayTeam(MatchDetailsAwayTeamModel awayTeam) {
        this.awayTeam = awayTeam;
    }

    public MatchDetailsHomeTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    public void setHomeTeam(MatchDetailsHomeTeamModel homeTeam) {
        this.homeTeam = homeTeam;
    }

    public MatchDetailsSportModel getSport() {
        return this.sport;
    }

    public void setSport(MatchDetailsSportModel sport) {
        this.sport = sport;
    }

    public String getResultGeneral() {
        return this.resultGeneral;
    }

    public void setResultGeneral(String resultGeneral) {
        this.resultGeneral = resultGeneral;
    }

    public Float getScoreAway() {
        return this.scoreAway;
    }

    public void setScoreAway(Float scoreAway) {
        this.scoreAway = scoreAway;
    }

    public Float getScoreHome() {
        return this.scoreHome;
    }

    public void setScoreHome(Float scoreHome) {
        this.scoreHome = scoreHome;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MatchDetailsInfoJsonModel getInfoJson() {
        return this.infoJson;
    }

    public void setInfoJson(MatchDetailsInfoJsonModel infoJson) {
        this.infoJson = infoJson;
    }

    public String getCurrentTime() {
        return this.currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getXZoneCommand() {
        return this.xZone;
    }

    public String getResultRegular() {
        return this.resultRegular;
    }

    public void setResultRegular(String resultRegular) {
        this.resultRegular = resultRegular;
    }
}
