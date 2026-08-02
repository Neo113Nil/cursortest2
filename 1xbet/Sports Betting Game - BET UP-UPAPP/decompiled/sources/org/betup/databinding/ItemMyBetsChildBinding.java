package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class ItemMyBetsChildBinding implements ViewBinding {
    public final TextView bet;
    public final Group betActionsGroup;
    public final TextView betAmount;
    public final TextView betAmountTitle;
    public final ImageView betCoin;
    public final Group buttonGroup;
    public final AlphaPressButton cancelBet;
    public final TextView congratulations;
    public final ConstraintLayout container;
    public final TextView datetime;
    public final View divider;
    public final View dividerBottom;
    public final View dividerHorizontal;
    public final View dividerHorizontalPlaceholder;
    public final View dividerTop;
    public final View footer;
    public final TextView odd;
    public final TextView oddTitle;
    public final TextView results;
    public final TextView returnAmount;
    public final TextView returnAmountTitle;
    public final ImageView returnCoin;
    private final ConstraintLayout rootView;
    public final AlphaPressButton sellBet;
    public final TextView singleOdd;
    public final TextView teamNames;

    private ItemMyBetsChildBinding(ConstraintLayout rootView, TextView bet, Group betActionsGroup, TextView betAmount, TextView betAmountTitle, ImageView betCoin, Group buttonGroup, AlphaPressButton cancelBet, TextView congratulations, ConstraintLayout container, TextView datetime, View divider, View dividerBottom, View dividerHorizontal, View dividerHorizontalPlaceholder, View dividerTop, View footer, TextView odd, TextView oddTitle, TextView results, TextView returnAmount, TextView returnAmountTitle, ImageView returnCoin, AlphaPressButton sellBet, TextView singleOdd, TextView teamNames) {
        this.rootView = rootView;
        this.bet = bet;
        this.betActionsGroup = betActionsGroup;
        this.betAmount = betAmount;
        this.betAmountTitle = betAmountTitle;
        this.betCoin = betCoin;
        this.buttonGroup = buttonGroup;
        this.cancelBet = cancelBet;
        this.congratulations = congratulations;
        this.container = container;
        this.datetime = datetime;
        this.divider = divider;
        this.dividerBottom = dividerBottom;
        this.dividerHorizontal = dividerHorizontal;
        this.dividerHorizontalPlaceholder = dividerHorizontalPlaceholder;
        this.dividerTop = dividerTop;
        this.footer = footer;
        this.odd = odd;
        this.oddTitle = oddTitle;
        this.results = results;
        this.returnAmount = returnAmount;
        this.returnAmountTitle = returnAmountTitle;
        this.returnCoin = returnCoin;
        this.sellBet = sellBet;
        this.singleOdd = singleOdd;
        this.teamNames = teamNames;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemMyBetsChildBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMyBetsChildBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_my_bets_child, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMyBetsChildBinding bind(View rootView) {
        int i = R.id.bet;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet);
        if (textView != null) {
            i = R.id.betActionsGroup;
            Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.betActionsGroup);
            if (group != null) {
                i = R.id.bet_amount;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_amount);
                if (textView2 != null) {
                    i = R.id.bet_amount_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_amount_title);
                    if (textView3 != null) {
                        i = R.id.bet_coin;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bet_coin);
                        if (imageView != null) {
                            i = R.id.buttonGroup;
                            Group group2 = (Group) ViewBindings.findChildViewById(rootView, R.id.buttonGroup);
                            if (group2 != null) {
                                i = R.id.cancel_bet;
                                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.cancel_bet);
                                if (alphaPressButton != null) {
                                    i = R.id.congratulations;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.congratulations);
                                    if (textView4 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                        i = R.id.datetime;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.datetime);
                                        if (textView5 != null) {
                                            i = R.id.divider;
                                            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                                            if (findChildViewById != null) {
                                                i = R.id.dividerBottom;
                                                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.dividerBottom);
                                                if (findChildViewById2 != null) {
                                                    i = R.id.divider_horizontal;
                                                    View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.divider_horizontal);
                                                    if (findChildViewById3 != null) {
                                                        i = R.id.divider_horizontal_placeholder;
                                                        View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.divider_horizontal_placeholder);
                                                        if (findChildViewById4 != null) {
                                                            i = R.id.dividerTop;
                                                            View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.dividerTop);
                                                            if (findChildViewById5 != null) {
                                                                i = R.id.footer;
                                                                View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.footer);
                                                                if (findChildViewById6 != null) {
                                                                    i = R.id.odd;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.odd);
                                                                    if (textView6 != null) {
                                                                        i = R.id.odd_title;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.odd_title);
                                                                        if (textView7 != null) {
                                                                            i = R.id.results;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.results);
                                                                            if (textView8 != null) {
                                                                                i = R.id.return_amount;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.return_amount);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.return_amount_title;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.return_amount_title);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.return_coin;
                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.return_coin);
                                                                                        if (imageView2 != null) {
                                                                                            i = R.id.sell_bet;
                                                                                            AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.sell_bet);
                                                                                            if (alphaPressButton2 != null) {
                                                                                                i = R.id.singleOdd;
                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.singleOdd);
                                                                                                if (textView11 != null) {
                                                                                                    i = R.id.teamNames;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.teamNames);
                                                                                                    if (textView12 != null) {
                                                                                                        return new ItemMyBetsChildBinding(constraintLayout, textView, group, textView2, textView3, imageView, group2, alphaPressButton, textView4, constraintLayout, textView5, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, textView6, textView7, textView8, textView9, textView10, imageView2, alphaPressButton2, textView11, textView12);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
