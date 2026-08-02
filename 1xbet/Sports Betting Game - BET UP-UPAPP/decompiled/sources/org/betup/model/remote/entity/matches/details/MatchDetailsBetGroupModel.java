package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class MatchDetailsBetGroupModel {

    @SerializedName("user_available")
    @Expose
    private boolean available;

    @SerializedName("displayColumns")
    private int displayColumns;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("level")
    private int level;

    @SerializedName("name")
    @Expose
    private String name;

    public int getDisplayColumns() {
        return this.displayColumns;
    }

    public void setDisplayColumns(int displayColumns) {
        this.displayColumns = displayColumns;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
