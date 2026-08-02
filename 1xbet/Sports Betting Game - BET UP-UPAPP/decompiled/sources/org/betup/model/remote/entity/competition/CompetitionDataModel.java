package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;
import org.betup.model.remote.entity.sports.SportsDataModel;

/* loaded from: classes2.dex */
public class CompetitionDataModel extends BaseCompetitionModel {

    @SerializedName("enter_fee")
    private int enterFee;

    @SerializedName("isParticipant")
    private boolean isParticipant;

    @SerializedName("jack_pot")
    private long jackpot;

    @SerializedName("matches")
    private List<ListedMatchModel> matchDetailsDataModelList;

    @SerializedName("prize_pool")
    private long prizePool;

    @SerializedName("sport")
    private SportsDataModel sport;

    public int getEnterFee() {
        return this.enterFee;
    }

    public void setEnterFee(int enterFee) {
        this.enterFee = enterFee;
    }

    public boolean isParticipant() {
        return this.isParticipant;
    }

    public void setParticipant(boolean participant) {
        this.isParticipant = participant;
    }

    public List<ListedMatchModel> getMatchDetailsDataModelList() {
        return this.matchDetailsDataModelList;
    }

    public void setMatchDetailsDataModelList(List<ListedMatchModel> matchDetailsDataModelList) {
        this.matchDetailsDataModelList = matchDetailsDataModelList;
    }

    public long getPrizePool() {
        return this.prizePool;
    }

    public void setPrizePool(long prizePool) {
        this.prizePool = prizePool;
    }

    public SportsDataModel getSport() {
        return this.sport;
    }

    public void setSport(SportsDataModel sport) {
        this.sport = sport;
    }

    public long getJackpot() {
        return this.jackpot;
    }

    public void setJackpot(long jackpot) {
        this.jackpot = jackpot;
    }
}
