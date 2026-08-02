package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class DialogCompetitionInfoBinding implements ViewBinding {
    public final View competitionHeader;
    public final AppCompatTextView competitionName;
    public final ConstraintLayout dialogContainer;
    public final TextView eightDescription;
    public final View firstDivider;
    public final TextView jackpotDescription;
    public final TextView moreThanOne;
    public final TextView nineDescription;
    public final AlphaPressButton okButton;
    public final TextView prizePoolMadeFrom;
    public final TextView prizesAwardDescription;
    private final ConstraintLayout rootView;
    public final View secondDivider;
    public final TextView sevenDescription;

    private DialogCompetitionInfoBinding(ConstraintLayout rootView, View competitionHeader, AppCompatTextView competitionName, ConstraintLayout dialogContainer, TextView eightDescription, View firstDivider, TextView jackpotDescription, TextView moreThanOne, TextView nineDescription, AlphaPressButton okButton, TextView prizePoolMadeFrom, TextView prizesAwardDescription, View secondDivider, TextView sevenDescription) {
        this.rootView = rootView;
        this.competitionHeader = competitionHeader;
        this.competitionName = competitionName;
        this.dialogContainer = dialogContainer;
        this.eightDescription = eightDescription;
        this.firstDivider = firstDivider;
        this.jackpotDescription = jackpotDescription;
        this.moreThanOne = moreThanOne;
        this.nineDescription = nineDescription;
        this.okButton = okButton;
        this.prizePoolMadeFrom = prizePoolMadeFrom;
        this.prizesAwardDescription = prizesAwardDescription;
        this.secondDivider = secondDivider;
        this.sevenDescription = sevenDescription;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogCompetitionInfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogCompetitionInfoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_competition_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogCompetitionInfoBinding bind(View rootView) {
        int i = R.id.competition_header;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.competition_header);
        if (findChildViewById != null) {
            i = R.id.competition_name;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.competition_name);
            if (appCompatTextView != null) {
                i = R.id.dialog_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                if (constraintLayout != null) {
                    i = R.id.eight_description;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.eight_description);
                    if (textView != null) {
                        i = R.id.firstDivider;
                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.firstDivider);
                        if (findChildViewById2 != null) {
                            i = R.id.jackpot_description;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.jackpot_description);
                            if (textView2 != null) {
                                i = R.id.more_than_one;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.more_than_one);
                                if (textView3 != null) {
                                    i = R.id.nine_description;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nine_description);
                                    if (textView4 != null) {
                                        i = R.id.ok_button;
                                        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok_button);
                                        if (alphaPressButton != null) {
                                            i = R.id.prize_pool_made_from;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prize_pool_made_from);
                                            if (textView5 != null) {
                                                i = R.id.prizes_award_description;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prizes_award_description);
                                                if (textView6 != null) {
                                                    i = R.id.secondDivider;
                                                    View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.secondDivider);
                                                    if (findChildViewById3 != null) {
                                                        i = R.id.seven_description;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.seven_description);
                                                        if (textView7 != null) {
                                                            return new DialogCompetitionInfoBinding((ConstraintLayout) rootView, findChildViewById, appCompatTextView, constraintLayout, textView, findChildViewById2, textView2, textView3, textView4, alphaPressButton, textView5, textView6, findChildViewById3, textView7);
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
