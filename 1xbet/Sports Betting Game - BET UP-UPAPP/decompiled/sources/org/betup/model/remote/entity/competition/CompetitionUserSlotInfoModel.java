package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class CompetitionUserSlotInfoModel implements Serializable {

    @SerializedName("slot_participants")
    private List<CompetitionSlotParticipantModel> competitionSlotParticipantModelList;

    @SerializedName("id")
    private int id;

    @SerializedName("slot_number")
    private int slotNumber;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlotNumber() {
        return this.slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public List<CompetitionSlotParticipantModel> getCompetitionSlotParticipantModelList() {
        return this.competitionSlotParticipantModelList;
    }

    public void setCompetitionSlotParticipantModelList(List<CompetitionSlotParticipantModel> competitionSlotParticipantModelList) {
        this.competitionSlotParticipantModelList = competitionSlotParticipantModelList;
    }
}
