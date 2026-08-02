package org.betup.model.remote.request;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class FavoriteTeamsModel {

    @SerializedName("fav_team_ids")
    private int[] favoriteTeamsIds;

    public FavoriteTeamsModel(int[] favoriteTeamsIds) {
        this.favoriteTeamsIds = favoriteTeamsIds;
    }

    public int[] getFavoriteTeamsIds() {
        return this.favoriteTeamsIds;
    }

    public void setFavoriteTeamsIds(int[] favoriteTeamsIds) {
        this.favoriteTeamsIds = favoriteTeamsIds;
    }
}
