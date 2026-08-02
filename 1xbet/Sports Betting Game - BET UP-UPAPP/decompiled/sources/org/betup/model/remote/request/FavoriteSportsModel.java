package org.betup.model.remote.request;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class FavoriteSportsModel {

    @SerializedName("fav_sport_ids")
    private int[] favoriteSportIds;

    public FavoriteSportsModel(int[] favoriteSportIds) {
        this.favoriteSportIds = favoriteSportIds;
    }

    public int[] getFavoriteSportIds() {
        return this.favoriteSportIds;
    }

    public void setFavoriteSportIds(int[] favoriteSportIds) {
        this.favoriteSportIds = favoriteSportIds;
    }
}
