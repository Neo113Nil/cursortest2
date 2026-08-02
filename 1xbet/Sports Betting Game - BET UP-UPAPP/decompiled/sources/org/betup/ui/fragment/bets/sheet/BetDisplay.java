package org.betup.ui.fragment.bets.sheet;

import java.util.List;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;

/* loaded from: classes4.dex */
public interface BetDisplay {
    void displayBets(List<BetModel> bets);

    void hideBets();

    void showBets();
}
