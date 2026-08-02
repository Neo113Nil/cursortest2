package org.betup.model.remote.entity.bets;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SubMatchModel {

    @SerializedName("id")
    private int id;

    @SerializedName("bets_game_type")
    private String name;

    @SerializedName("param_t_id")
    private long paramTId;

    @SerializedName("score_away")
    private float scoreAway;

    @SerializedName("score_home")
    private float scoreHome;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getScoreAway() {
        return this.scoreAway;
    }

    public void setScoreAway(float scoreAway) {
        this.scoreAway = scoreAway;
    }

    public float getScoreHome() {
        return this.scoreHome;
    }

    public void setScoreHome(float scoreHome) {
        this.scoreHome = scoreHome;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParamTId() {
        return this.paramTId;
    }

    public void setParamTId(long paramTId) {
        this.paramTId = paramTId;
    }
}
