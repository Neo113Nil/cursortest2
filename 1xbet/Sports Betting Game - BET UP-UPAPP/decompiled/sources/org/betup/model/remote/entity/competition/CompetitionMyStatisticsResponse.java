package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class CompetitionMyStatisticsResponse extends BaseWonCompetitionModel {

    @SerializedName("bets")
    private List<CompetitionBetModel> competitionBetModelList;

    @SerializedName("competition")
    private MyStatsCompetitionModel competitionModel;

    @SerializedName("enter_fee")
    private int enterFee;

    public int getEnterFee() {
        return this.enterFee;
    }

    public void setEnterFee(int enterFee) {
        this.enterFee = enterFee;
    }

    public MyStatsCompetitionModel getCompetitionModel() {
        return this.competitionModel;
    }

    public void setCompetitionModel(MyStatsCompetitionModel competitionModel) {
        this.competitionModel = competitionModel;
    }

    public List<CompetitionBetModel> getCompetitionBetModelList() {
        return this.competitionBetModelList;
    }

    public void setCompetitionBetModelList(List<CompetitionBetModel> competitionBetModelList) {
        this.competitionBetModelList = competitionBetModelList;
    }
}
