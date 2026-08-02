package org.betup.model.remote.entity.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class UserNumbersModel implements Serializable {

    @SerializedName("all")
    @Expose
    private int all;

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

    public void setReturned(int returned) {
        this.returned = returned;
    }

    public int getPending() {
        return this.pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
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
}
