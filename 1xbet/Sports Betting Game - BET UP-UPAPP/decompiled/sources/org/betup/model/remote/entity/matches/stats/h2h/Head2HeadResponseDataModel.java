package org.betup.model.remote.entity.matches.stats.h2h;

import com.google.gson.annotations.SerializedName;
import com.vk.sdk.api.model.VKApiUserFull;
import java.util.List;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class Head2HeadResponseDataModel {

    @SerializedName("away")
    private TeamDataModel away;

    @SerializedName(VKApiUserFull.GAMES)
    private List<MatchDetailsDataModel> games;

    @SerializedName("h2h")
    private Head2HeadDataModel headToHead;

    @SerializedName("home")
    private TeamDataModel home;

    public TeamDataModel getHome() {
        return this.home;
    }

    public void setHome(TeamDataModel home) {
        this.home = home;
    }

    public TeamDataModel getAway() {
        return this.away;
    }

    public void setAway(TeamDataModel away) {
        this.away = away;
    }

    public Head2HeadDataModel getHeadToHead() {
        return this.headToHead;
    }

    public void setHeadToHead(Head2HeadDataModel headToHead) {
        this.headToHead = headToHead;
    }

    public List<MatchDetailsDataModel> getGames() {
        return this.games;
    }

    public void setGames(List<MatchDetailsDataModel> games) {
        this.games = games;
    }
}
