package org.betup.model.remote.entity.bets;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class BetGroupModel {

    @SerializedName("user_available")
    private boolean available;

    @SerializedName("displayColumns")
    private int displayColumns;

    @SerializedName("expToNextLevel")
    private int expToNextLevel;

    @SerializedName("id")
    private int id;

    @SerializedName("level")
    private int level;

    @SerializedName("levelStartExp")
    private int levelStartExp;

    @SerializedName("name")
    private String name;

    public int getDisplayColumns() {
        return this.displayColumns;
    }

    public void setDisplayColumns(int displayColumns) {
        this.displayColumns = displayColumns;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExpToNextLevel() {
        return this.expToNextLevel;
    }

    public void setExpToNextLevel(int expToNextLevel) {
        this.expToNextLevel = expToNextLevel;
    }

    public int getLevelStartExp() {
        return this.levelStartExp;
    }

    public void setLevelStartExp(int levelStartExp) {
        this.levelStartExp = levelStartExp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
