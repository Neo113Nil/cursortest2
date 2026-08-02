package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemMyBetsCompetitionChildBinding implements ViewBinding {
    public final LinearLayout containerCompetitionInfo;
    public final BaseItemCompetitionBetBinding megaWinnersContainer;
    public final View middleDivider;
    public final TextView placeInSlot;
    public final TextView playersAmount;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final TextView slotNumber;
    public final TextView stats;
    public final TextView totalOdds;
    public final TextView winningOdds;

    private ItemMyBetsCompetitionChildBinding(RelativeLayout rootView, LinearLayout containerCompetitionInfo, BaseItemCompetitionBetBinding megaWinnersContainer, View middleDivider, TextView placeInSlot, TextView playersAmount, ProgressBar progressBar, TextView slotNumber, TextView stats, TextView totalOdds, TextView winningOdds) {
        this.rootView = rootView;
        this.containerCompetitionInfo = containerCompetitionInfo;
        this.megaWinnersContainer = megaWinnersContainer;
        this.middleDivider = middleDivider;
        this.placeInSlot = placeInSlot;
        this.playersAmount = playersAmount;
        this.progressBar = progressBar;
        this.slotNumber = slotNumber;
        this.stats = stats;
        this.totalOdds = totalOdds;
        this.winningOdds = winningOdds;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemMyBetsCompetitionChildBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMyBetsCompetitionChildBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_my_bets_competition_child, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMyBetsCompetitionChildBinding bind(View rootView) {
        int i = R.id.container_competition_info;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container_competition_info);
        if (linearLayout != null) {
            i = R.id.mega_winners_container;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.mega_winners_container);
            if (findChildViewById != null) {
                BaseItemCompetitionBetBinding bind = BaseItemCompetitionBetBinding.bind(findChildViewById);
                i = R.id.middle_divider;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.middle_divider);
                if (findChildViewById2 != null) {
                    i = R.id.place_in_slot;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.place_in_slot);
                    if (textView != null) {
                        i = R.id.players_amount;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_amount);
                        if (textView2 != null) {
                            i = R.id.progress_bar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                            if (progressBar != null) {
                                i = R.id.slot_number;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.slot_number);
                                if (textView3 != null) {
                                    i = R.id.stats;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.stats);
                                    if (textView4 != null) {
                                        i = R.id.total_odds;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.total_odds);
                                        if (textView5 != null) {
                                            i = R.id.winning_odds;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.winning_odds);
                                            if (textView6 != null) {
                                                return new ItemMyBetsCompetitionChildBinding((RelativeLayout) rootView, linearLayout, bind, findChildViewById2, textView, textView2, progressBar, textView3, textView4, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
