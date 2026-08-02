package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogLeaderboardBinding implements ViewBinding {
    public final TextView betAmount;
    public final TextView desc;
    public final View divider;
    public final LinearLayout formulaContainer;
    public final TextView investment;
    public final TextView moneyWon;
    public final TextView ok;
    public final TextView question;
    public final TextView roi1;
    private final ConstraintLayout rootView;
    public final TextView theMore;
    public final TextView title;

    private DialogLeaderboardBinding(ConstraintLayout rootView, TextView betAmount, TextView desc, View divider, LinearLayout formulaContainer, TextView investment, TextView moneyWon, TextView ok, TextView question, TextView roi1, TextView theMore, TextView title) {
        this.rootView = rootView;
        this.betAmount = betAmount;
        this.desc = desc;
        this.divider = divider;
        this.formulaContainer = formulaContainer;
        this.investment = investment;
        this.moneyWon = moneyWon;
        this.ok = ok;
        this.question = question;
        this.roi1 = roi1;
        this.theMore = theMore;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogLeaderboardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogLeaderboardBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_leaderboard, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogLeaderboardBinding bind(View rootView) {
        int i = R.id.betAmount;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betAmount);
        if (textView != null) {
            i = R.id.desc;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
            if (textView2 != null) {
                i = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                if (findChildViewById != null) {
                    i = R.id.formula_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.formula_container);
                    if (linearLayout != null) {
                        i = R.id.investment;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.investment);
                        if (textView3 != null) {
                            i = R.id.moneyWon;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.moneyWon);
                            if (textView4 != null) {
                                i = R.id.ok;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                                if (textView5 != null) {
                                    i = R.id.question;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.question);
                                    if (textView6 != null) {
                                        i = R.id.roi1;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.roi1);
                                        if (textView7 != null) {
                                            i = R.id.theMore;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.theMore);
                                            if (textView8 != null) {
                                                i = R.id.title;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                                if (textView9 != null) {
                                                    return new DialogLeaderboardBinding((ConstraintLayout) rootView, textView, textView2, findChildViewById, linearLayout, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
