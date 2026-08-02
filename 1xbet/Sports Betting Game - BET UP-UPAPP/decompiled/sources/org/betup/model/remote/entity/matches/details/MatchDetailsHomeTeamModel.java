package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class MatchDetailsHomeTeamModel {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("last_actions")
    @Expose
    private String lastActions;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

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

    public String getLastActions() {
        return this.lastActions;
    }

    public void setLastActions(String lastActions) {
        this.lastActions = lastActions;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
