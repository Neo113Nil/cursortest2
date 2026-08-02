package org.betup.model.remote.entity.sports;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.Entity;

/* loaded from: classes2.dex */
public class SportsDataModel implements Entity {

    @SerializedName("id")
    @Expose
    private Integer id;
    private boolean isFavorite;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    public boolean isFavorite() {
        return this.isFavorite;
    }

    public void setFavorite(boolean favorite) {
        this.isFavorite = favorite;
    }

    @Override // org.betup.model.remote.entity.Entity
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
