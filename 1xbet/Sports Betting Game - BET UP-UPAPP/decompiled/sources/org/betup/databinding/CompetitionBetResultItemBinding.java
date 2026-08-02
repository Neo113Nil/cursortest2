package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class CompetitionBetResultItemBinding implements ViewBinding {
    public final TextView bet;
    public final ConstraintLayout container;
    public final TextView datetime;
    public final View divider;
    public final View dividerTop;
    public final TextView odd;
    private final ConstraintLayout rootView;
    public final TextView score;
    public final TextView teamNames;

    private CompetitionBetResultItemBinding(ConstraintLayout rootView, TextView bet, ConstraintLayout container, TextView datetime, View divider, View dividerTop, TextView odd, TextView score, TextView teamNames) {
        this.rootView = rootView;
        this.bet = bet;
        this.container = container;
        this.datetime = datetime;
        this.divider = divider;
        this.dividerTop = dividerTop;
        this.odd = odd;
        this.score = score;
        this.teamNames = teamNames;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CompetitionBetResultItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CompetitionBetResultItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.competition_bet_result_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CompetitionBetResultItemBinding bind(View rootView) {
        int i = R.id.bet;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i = R.id.datetime;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.datetime);
            if (textView2 != null) {
                i = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                if (findChildViewById != null) {
                    i = R.id.dividerTop;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.dividerTop);
                    if (findChildViewById2 != null) {
                        i = R.id.odd;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.odd);
                        if (textView3 != null) {
                            i = R.id.score;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.score);
                            if (textView4 != null) {
                                i = R.id.teamNames;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.teamNames);
                                if (textView5 != null) {
                                    return new CompetitionBetResultItemBinding(constraintLayout, textView, constraintLayout, textView2, findChildViewById, findChildViewById2, textView3, textView4, textView5);
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
