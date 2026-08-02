package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class CompetitionListData implements Serializable {

    @SerializedName("today")
    private CompetitionDataModel todayCompetition;

    @SerializedName("tomorrow")
    private CompetitionDataModel tomorrowCompetition;

    public CompetitionDataModel getTodayCompetition() {
        return this.todayCompetition;
    }

    public void setTodayCompetition(CompetitionDataModel todayCompetition) {
        this.todayCompetition = todayCompetition;
    }

    public CompetitionDataModel getTomorrowCompetition() {
        return this.tomorrowCompetition;
    }

    public void setTomorrowCompetition(CompetitionDataModel tomorrowCompetition) {
        this.tomorrowCompetition = tomorrowCompetition;
    }
}
