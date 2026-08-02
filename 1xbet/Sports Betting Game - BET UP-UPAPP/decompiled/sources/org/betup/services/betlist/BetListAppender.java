package org.betup.services.betlist;

import java.util.List;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;

/* loaded from: classes2.dex */
public interface BetListAppender {
    List<Long> addBetToList(BetModel bet);

    List<Long> addBetsToList(List<BetModel> bets);

    List<Long> addValidatedBetToList(BetModel bet);

    List<Long> addValidatedBetWithClickCoefficient(BetModel bet, double coefficientAtClick);

    void clearBets();

    int getBetsCount();

    Double getCoefficientForBet(long grabbedBetId);

    Double getInitialCoefficientForBet(long grabbedBetId);

    boolean isBetAvailableInSlip(long grabbedBetId);

    boolean isMatchBettedAlready(long groupHash);

    boolean isSelectedBetAlready(long grabbedBetId);

    void removeBet(long grabbedBetId);

    void setInitialCoefficientForBet(long grabbedBetId, double coefficient);

    void syncBetslip(List<BetModel> bets);

    void updateDisplay();
}
