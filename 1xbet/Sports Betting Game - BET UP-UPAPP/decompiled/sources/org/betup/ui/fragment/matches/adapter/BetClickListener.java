package org.betup.ui.fragment.matches.adapter;

import org.betup.services.betlist.BetMatchClickResult;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;

/* loaded from: classes4.dex */
public interface BetClickListener {
    BetMatchClickResult onMatchBetClick(BetModel bet);
}
