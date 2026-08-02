package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class CompetitionGrabbedBetResponseModel implements Serializable {

    @SerializedName("grabbed_bets")
    private List<CompetitionGrabbedBetModel> competitionGrabbedBetModelList;

    @SerializedName("error_codes")
    private List<Integer> errorCodes;

    @SerializedName("participantId")
    private int participantId;

    public List<CompetitionGrabbedBetModel> getCompetitionGrabbedBetModelList() {
        return this.competitionGrabbedBetModelList;
    }

    public void setCompetitionGrabbedBetModelList(List<CompetitionGrabbedBetModel> competitionGrabbedBetModelList) {
        this.competitionGrabbedBetModelList = competitionGrabbedBetModelList;
    }

    public int getParticipantId() {
        return this.participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public List<Integer> getErrorCodes() {
        return this.errorCodes;
    }

    public void setErrorCodes(List<Integer> errorCodes) {
        this.errorCodes = errorCodes;
    }
}
