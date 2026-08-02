package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class CompetitionInfoModel extends BaseCompetitionModel {

    @SerializedName("competition_winners")
    private List<CompetitionWinnerDataModel> competitionWinnerDataModelList;

    @SerializedName("isParticipant")
    private boolean isParticipant;

    @SerializedName("slots")
    private int slotAmount;

    public boolean isParticipant() {
        return this.isParticipant;
    }

    public void setParticipant(boolean participant) {
        this.isParticipant = participant;
    }

    public int getSlotAmount() {
        return this.slotAmount;
    }

    public void setSlotAmount(int slotAmount) {
        this.slotAmount = slotAmount;
    }

    public List<CompetitionWinnerDataModel> getCompetitionWinnerDataModelList() {
        return this.competitionWinnerDataModelList;
    }

    public void setCompetitionWinnerDataModelList(List<CompetitionWinnerDataModel> competitionWinnerDataModelList) {
        this.competitionWinnerDataModelList = competitionWinnerDataModelList;
    }
}
