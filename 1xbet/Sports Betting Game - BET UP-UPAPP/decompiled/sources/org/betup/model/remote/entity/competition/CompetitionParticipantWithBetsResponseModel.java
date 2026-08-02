package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;

/* loaded from: classes2.dex */
public class CompetitionParticipantWithBetsResponseModel extends CompetitionParticipantResponseModel {

    @SerializedName("bets")
    private List<BetsPlaceModel> bets;

    public List<BetsPlaceModel> getBets() {
        return this.bets;
    }

    public void setBets(List<BetsPlaceModel> bets) {
        this.bets = bets;
    }
}
