package org.betup.model.remote.entity.user.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UserBetStatsModel {

    @SerializedName("all_bets")
    @Expose
    private int all;

    @SerializedName("high_score")
    private long highscore;

    @SerializedName("lost")
    @Expose
    private int lost;

    @SerializedName("pending")
    @Expose
    private int pending;

    @SerializedName("returned")
    @Expose
    private int returned;

    @SerializedName("won")
    @Expose
    private int won;

    public int getReturned() {
        return this.returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned.intValue();
    }

    public int getPending() {
        return this.pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending.intValue();
    }

    public int getWon() {
        return this.won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return this.lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getAll() {
        return this.all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public long getHighscore() {
        return this.highscore;
    }

    public void setHighscore(long highscore) {
        this.highscore = highscore;
    }
}
