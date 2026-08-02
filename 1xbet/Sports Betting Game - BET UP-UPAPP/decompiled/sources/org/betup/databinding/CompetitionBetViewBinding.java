package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class CompetitionBetViewBinding implements ViewBinding {
    public final AppCompatTextView betCoef;
    public final AppCompatTextView betName;
    private final ConstraintLayout rootView;

    private CompetitionBetViewBinding(ConstraintLayout rootView, AppCompatTextView betCoef, AppCompatTextView betName) {
        this.rootView = rootView;
        this.betCoef = betCoef;
        this.betName = betName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CompetitionBetViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CompetitionBetViewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.competition_bet_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CompetitionBetViewBinding bind(View rootView) {
        int i = R.id.bet_coef;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.bet_coef);
        if (appCompatTextView != null) {
            i = R.id.bet_name;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.bet_name);
            if (appCompatTextView2 != null) {
                return new CompetitionBetViewBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
