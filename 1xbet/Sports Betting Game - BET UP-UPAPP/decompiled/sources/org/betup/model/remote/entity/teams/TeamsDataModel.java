package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.Entity;
import org.betup.model.remote.entity.sports.SportsDataModel;

/* loaded from: classes2.dex */
public class TeamsDataModel implements Entity {

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
    private String photoURL;

    @SerializedName("sport")
    private SportsDataModel sport;

    public SportsDataModel getSport() {
        return this.sport;
    }

    public void setSport(SportsDataModel sport) {
        this.sport = sport;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getPhotoURL() {
        return this.photoURL;
    }

    @Override // org.betup.model.remote.entity.Entity
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
}
