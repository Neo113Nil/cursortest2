package org.betup.model.remote.entity.matches.stats.standings;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class TeamStanding {

    @SerializedName("draw")
    private int draw;

    @SerializedName("f/a")
    private String f_a;

    @SerializedName("lost")
    private int lost;

    @SerializedName("photoUrl")
    private String photoUrl;

    @SerializedName("played")
    private int played;

    @SerializedName("points")
    private int points;

    @SerializedName("position")
    private int position;

    @SerializedName("teamId")
    private int teamId;

    @SerializedName("teamName")
    private String teamName;

    @SerializedName("won")
    private int won;

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWon() {
        return this.won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDraw() {
        return this.draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLost() {
        return this.lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getPlayed() {
        return this.played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public String getF_a() {
        return this.f_a;
    }

    public void setF_a(String f_a) {
        this.f_a = f_a;
    }
}
