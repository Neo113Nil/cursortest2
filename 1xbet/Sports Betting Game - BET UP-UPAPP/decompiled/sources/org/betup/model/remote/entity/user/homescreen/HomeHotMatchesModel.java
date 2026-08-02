package org.betup.model.remote.entity.user.homescreen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;

/* loaded from: classes2.dex */
public class HomeHotMatchesModel {

    @SerializedName("hot_matches_soon")
    @Expose
    private List<ListedMatchModel> hotMatchesSoon = new ArrayList();

    public List<ListedMatchModel> getHotMatchesSoon() {
        return this.hotMatchesSoon;
    }

    public void setHotMatchesSoon(List<ListedMatchModel> hotMatchesSoon) {
        this.hotMatchesSoon = hotMatchesSoon;
    }
}
