package org.betup.ui.fragment.bets.betslip.adapter.model;

import android.util.Log;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.betslip.GrabbedBetModel;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.PlacedBetInfoModel;
import org.betup.utils.BetHelper;

/* loaded from: classes4.dex */
public class BetModel {
    private MatchDetailsBetDataModel bet;
    private boolean isSelected;
    private MatchDetailsDataModel match;
    private boolean isAvailable = true;
    private boolean deleted = false;
    private stat status = stat.NONE;

    public enum stat {
        NONE,
        INCREASED,
        DECREASED
    }

    public BetModel(MatchDetailsBetDataModel bet, MatchDetailsDataModel match, SubMatchModel subMatchModel) {
        if (bet == null) {
            Log.d("TAPCOLOR", "BET NULL!");
        }
        if (match == null) {
            Log.d("TAPCOLOR", "MATCH NULL");
        }
        if (bet != null) {
            bet.setSubMatch(subMatchModel);
        }
        setBet(bet);
        setMatch(match);
        setAvailable(bet != null && Boolean.TRUE.equals(bet.getIsAvailable()));
    }

    public BetModel(PlacedBetInfoModel model, MatchDetailsDataModel matchModel) {
        this.match = matchModel;
        SubMatchModel subMatchModel = new SubMatchModel();
        subMatchModel.setName(model.getBet().getBetsGameType());
        MatchDetailsBetDataModel matchDetailsBetDataModel = new MatchDetailsBetDataModel();
        this.bet = matchDetailsBetDataModel;
        matchDetailsBetDataModel.setBetName(model.getBet().getBetName());
        this.bet.setBetTypeId(model.getBet().getBetTypeId());
        this.bet.setGrabbedBetId(Long.valueOf(model.getGrabbedBet().getGrabbedBetId()));
        this.bet.setIsAvailable(Boolean.valueOf(model.getGrabbedBet().isAvailable()));
        this.bet.setGrabbedCoeficient(model.getGrabbedBet().getGrabbedCoefficient());
        this.bet.setSubMatch(subMatchModel);
    }

    public BetModel(BetsPlaceModel betModel, GrabbedBetModel grabbedBetModel) {
        this.match = betModel.getSportMatch();
        SubMatchModel subMatchModel = new SubMatchModel();
        subMatchModel.setName(betModel.getBetsGameType());
        MatchDetailsBetDataModel matchDetailsBetDataModel = new MatchDetailsBetDataModel();
        this.bet = matchDetailsBetDataModel;
        matchDetailsBetDataModel.setBetName(betModel.getBetName());
        this.bet.setBetTypeId(grabbedBetModel.getBetTypeGroup().getId());
        this.bet.setGrabbedBetId(Long.valueOf(grabbedBetModel.getGrabbedBetId()));
        this.bet.setIsAvailable(Boolean.valueOf(grabbedBetModel.isAvailable()));
        this.bet.setGrabbedCoeficient(grabbedBetModel.getGrabbedCoefficient());
        this.bet.setSubMatch(subMatchModel);
    }

    public BetModel(BetHelper.BetType betType, ListedMatchModel match) {
        BetSectionModel betSectionModel = match.getBetSections().get(0);
        for (MatchDetailsBetDataModel matchDetailsBetDataModel : betSectionModel.getGroups().get(0).getBets()) {
            if (matchDetailsBetDataModel.getBetTypeId().intValue() == betType.getId()) {
                this.bet = matchDetailsBetDataModel;
            }
        }
        MatchDetailsBetDataModel matchDetailsBetDataModel2 = this.bet;
        if (matchDetailsBetDataModel2 == null) {
            throw new IllegalArgumentException("Match has no bets!");
        }
        matchDetailsBetDataModel2.setSubMatch(betSectionModel.getSection());
        this.match = match.getMatch();
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public stat getStatus() {
        return this.status;
    }

    public void setStatus(stat status) {
        this.status = status;
    }

    public MatchDetailsDataModel getMatch() {
        return this.match;
    }

    public void setMatch(MatchDetailsDataModel match) {
        this.match = match;
    }

    public MatchDetailsBetDataModel getBet() {
        return this.bet;
    }

    public void setBet(MatchDetailsBetDataModel bet) {
        this.bet = bet;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public long getGrabbedBetId() {
        return this.bet.getGrabbedBetId().longValue();
    }
}
