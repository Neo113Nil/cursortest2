package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import org.betup.model.remote.entity.CompetitionState;

/* loaded from: classes2.dex */
public class CompetitionRankModel implements Serializable {

    @SerializedName("competition")
    private CompetitionDataModel competitionDataModel;

    @SerializedName("users_slot_info")
    private CompetitionUserSlotInfoModel competitionUserSlotInfoModel;

    @SerializedName("mega_winners")
    private List<CompetitionWinnerDataModel> competitionWinnerDataModelList;

    @SerializedName("enter_fee")
    private int enterFee;

    @SerializedName("id")
    private int id;

    @SerializedName("players")
    private int playersAmount;

    @SerializedName("state")
    private CompetitionState state;

    public CompetitionDataModel getCompetitionDataModel() {
        return this.competitionDataModel;
    }

    public void setCompetitionDataModel(CompetitionDataModel competitionDataModel) {
        this.competitionDataModel = competitionDataModel;
    }

    public CompetitionDataModel getCompetitionModel() {
        return this.competitionDataModel;
    }

    public void setCompetitionModel(CompetitionDataModel competitionDataModel) {
        this.competitionDataModel = competitionDataModel;
    }

    public CompetitionState getState() {
        return this.state;
    }

    public void setState(CompetitionState state) {
        this.state = state;
    }

    public List<CompetitionWinnerDataModel> getCompetitionWinnerDataModelList() {
        return this.competitionWinnerDataModelList;
    }

    public void setCompetitionWinnerDataModelList(List<CompetitionWinnerDataModel> competitionWinnerDataModelList) {
        this.competitionWinnerDataModelList = competitionWinnerDataModelList;
    }

    public CompetitionUserSlotInfoModel getCompetitionUserSlotInfoModel() {
        return this.competitionUserSlotInfoModel;
    }

    public void setCompetitionUserSlotInfoModel(CompetitionUserSlotInfoModel competitionUserSlotInfoModel) {
        this.competitionUserSlotInfoModel = competitionUserSlotInfoModel;
    }

    public int getPlayersAmount() {
        return this.playersAmount;
    }

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterFee() {
        return this.enterFee;
    }

    public void setEnterFee(int enterFee) {
        this.enterFee = enterFee;
    }
}
