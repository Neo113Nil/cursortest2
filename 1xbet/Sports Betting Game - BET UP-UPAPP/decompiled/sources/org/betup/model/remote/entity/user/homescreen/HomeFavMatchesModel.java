package org.betup.model.remote.entity.user.homescreen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;

/* loaded from: classes2.dex */
public class HomeFavMatchesModel {

    @SerializedName("fav_team_next_matches")
    @Expose
    private List<ListedMatchModel> favTeamNextMatches = new ArrayList();

    public List<ListedMatchModel> getFavTeamNextMatches() {
        return this.favTeamNextMatches;
    }

    public void setFavTeamNextMatches(List<ListedMatchModel> favTeamNextMatches) {
        this.favTeamNextMatches = favTeamNextMatches;
    }
}
