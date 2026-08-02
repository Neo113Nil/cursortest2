package org.betup.model.remote.entity.user.homescreen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class HomeScreenResponseModel {

    @SerializedName("homescreen")
    @Expose
    private HomeFavMatchesModel homescren;

    public HomeFavMatchesModel getHomescren() {
        return this.homescren;
    }

    public void setHomescren(HomeFavMatchesModel homescren) {
        this.homescren = homescren;
    }
}
