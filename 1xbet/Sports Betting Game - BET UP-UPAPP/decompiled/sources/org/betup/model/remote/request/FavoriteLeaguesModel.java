package org.betup.model.remote.request;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class FavoriteLeaguesModel {

    @SerializedName("fav_league_ids")
    private int[] favoriteLeagueIds;

    public FavoriteLeaguesModel(int[] favoriteLeagueIds) {
        this.favoriteLeagueIds = favoriteLeagueIds;
    }

    public int[] getFavoriteLeagueIds() {
        return this.favoriteLeagueIds;
    }

    public void setFavoriteLeagueIds(int[] favoriteLeagueIds) {
        this.favoriteLeagueIds = favoriteLeagueIds;
    }
}
