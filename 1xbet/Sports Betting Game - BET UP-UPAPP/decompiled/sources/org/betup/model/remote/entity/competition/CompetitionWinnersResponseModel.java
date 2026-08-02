package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class CompetitionWinnersResponseModel extends BaseCompetitionModel {

    @SerializedName("competition_winners")
    private List<CompetitionWinnerDataModel> competitionWinnerDataModels;

    public List<CompetitionWinnerDataModel> getCompetitionWinnerDataModels() {
        return this.competitionWinnerDataModels;
    }

    public void setCompetitionWinnerDataModels(List<CompetitionWinnerDataModel> competitionWinnerDataModels) {
        this.competitionWinnerDataModels = competitionWinnerDataModels;
    }
}
