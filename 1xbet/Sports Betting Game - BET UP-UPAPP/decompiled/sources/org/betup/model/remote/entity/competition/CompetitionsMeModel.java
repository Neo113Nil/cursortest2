package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class CompetitionsMeModel extends BaseWonCompetitionModel {

    @SerializedName("wonBets")
    private String betsWon;

    @SerializedName("competition")
    private CompetitionSlotsModel competitionSlotsModelList;

    public String getBetsWon() {
        return this.betsWon;
    }

    public void setBetsWon(String betsWon) {
        this.betsWon = betsWon;
    }

    public CompetitionSlotsModel getCompetitionSlotsModel() {
        return this.competitionSlotsModelList;
    }

    public void setCompetitionSlotsModel(CompetitionSlotsModel competitionSlotsModelList) {
        this.competitionSlotsModelList = competitionSlotsModelList;
    }
}
