package org.betup.model.remote.entity.matches.stats.h2h;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class Head2HeadDataModel {

    @SerializedName("awayStats")
    private List<StatModel> awayStats;

    @SerializedName("awayWins")
    private int awayWins;

    @SerializedName("draws")
    private int draws;

    @SerializedName("homeStats")
    private List<StatModel> homeStats;

    @SerializedName("homeWins")
    private int homeWins;

    @SerializedName("matchCount")
    private int matchCount;

    public int getHomeWins() {
        return this.homeWins;
    }

    public void setHomeWins(int homeWins) {
        this.homeWins = homeWins;
    }

    public int getAwayWins() {
        return this.awayWins;
    }

    public void setAwayWins(int awayWins) {
        this.awayWins = awayWins;
    }

    public int getDraws() {
        return this.draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getMatchCount() {
        return this.matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }

    public List<StatModel> getHomeStats() {
        return this.homeStats;
    }

    public void setHomeStats(List<StatModel> homeStats) {
        this.homeStats = homeStats;
    }

    public List<StatModel> getAwayStats() {
        return this.awayStats;
    }

    public void setAwayStats(List<StatModel> awayStats) {
        this.awayStats = awayStats;
    }
}
