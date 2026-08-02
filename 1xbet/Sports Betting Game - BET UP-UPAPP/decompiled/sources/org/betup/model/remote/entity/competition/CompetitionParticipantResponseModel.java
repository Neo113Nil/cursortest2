package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import com.vk.sdk.api.model.VKApiCommunityFull;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class CompetitionParticipantResponseModel implements Serializable {

    @SerializedName("betsTotal")
    private int betsTotal;

    @SerializedName("betsWon")
    private int betsWon;

    @SerializedName("competition")
    private CompetitionDataModel competitionInfoParticipantModel;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("id")
    private int participantId;

    @SerializedName(VKApiCommunityFull.PLACE)
    private int place;

    @SerializedName("prize")
    private int prize;

    @SerializedName("result")
    private CompetitionParticipantState state;

    public int getPrize() {
        return this.prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getBetsWon() {
        return this.betsWon;
    }

    public void setBetsWon(int betsWon) {
        this.betsWon = betsWon;
    }

    public int getBetsTotal() {
        return this.betsTotal;
    }

    public void setBetsTotal(int betsTotal) {
        this.betsTotal = betsTotal;
    }

    public int getParticipantId() {
        return this.participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public int getPlace() {
        return this.place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public CompetitionDataModel getCompetitionInfoParticipantModel() {
        return this.competitionInfoParticipantModel;
    }

    public void setCompetitionInfoParticipantModel(CompetitionDataModel competitionInfoParticipantModel) {
        this.competitionInfoParticipantModel = competitionInfoParticipantModel;
    }

    public CompetitionParticipantState getState() {
        return this.state;
    }

    public void setState(CompetitionParticipantState state) {
        this.state = state;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
