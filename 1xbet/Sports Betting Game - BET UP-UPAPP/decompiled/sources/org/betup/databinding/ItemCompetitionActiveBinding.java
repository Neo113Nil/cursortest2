package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemCompetitionActiveBinding implements ViewBinding {
    public final ImageView betcoin;
    public final ImageView betcoinPrizePool;
    public final TextView buyInAmount;
    public final TextView buyInTitle;
    public final AppCompatTextView competitionName;
    public final TextView enter;
    public final View footer;
    public final ConstraintLayout itemMyBetsCompetitionGroup;
    public final TextView prizePoolAmount;
    public final TextView prizePoolTitle;
    private final ConstraintLayout rootView;
    public final ImageView sportIcon;
    public final TextView statusText;
    public final TextView statusTitle;

    private ItemCompetitionActiveBinding(ConstraintLayout rootView, ImageView betcoin, ImageView betcoinPrizePool, TextView buyInAmount, TextView buyInTitle, AppCompatTextView competitionName, TextView enter, View footer, ConstraintLayout itemMyBetsCompetitionGroup, TextView prizePoolAmount, TextView prizePoolTitle, ImageView sportIcon, TextView statusText, TextView statusTitle) {
        this.rootView = rootView;
        this.betcoin = betcoin;
        this.betcoinPrizePool = betcoinPrizePool;
        this.buyInAmount = buyInAmount;
        this.buyInTitle = buyInTitle;
        this.competitionName = competitionName;
        this.enter = enter;
        this.footer = footer;
        this.itemMyBetsCompetitionGroup = itemMyBetsCompetitionGroup;
        this.prizePoolAmount = prizePoolAmount;
        this.prizePoolTitle = prizePoolTitle;
        this.sportIcon = sportIcon;
        this.statusText = statusText;
        this.statusTitle = statusTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCompetitionActiveBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCompetitionActiveBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_competition_active, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCompetitionActiveBinding bind(View rootView) {
        int i = R.id.betcoin;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betcoin);
        if (imageView != null) {
            i = R.id.betcoin_prize_pool;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betcoin_prize_pool);
            if (imageView2 != null) {
                i = R.id.buy_in_amount;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.buy_in_amount);
                if (textView != null) {
                    i = R.id.buy_in_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.buy_in_title);
                    if (textView2 != null) {
                        i = R.id.competition_name;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.competition_name);
                        if (appCompatTextView != null) {
                            i = R.id.enter;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.enter);
                            if (textView3 != null) {
                                i = R.id.footer;
                                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.footer);
                                if (findChildViewById != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                    i = R.id.prize_pool_amount;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prize_pool_amount);
                                    if (textView4 != null) {
                                        i = R.id.prize_pool_title;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prize_pool_title);
                                        if (textView5 != null) {
                                            i = R.id.sportIcon;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                                            if (imageView3 != null) {
                                                i = R.id.status_text;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.status_text);
                                                if (textView6 != null) {
                                                    i = R.id.status_title;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.status_title);
                                                    if (textView7 != null) {
                                                        return new ItemCompetitionActiveBinding(constraintLayout, imageView, imageView2, textView, textView2, appCompatTextView, textView3, findChildViewById, constraintLayout, textView4, textView5, imageView3, textView6, textView7);
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
