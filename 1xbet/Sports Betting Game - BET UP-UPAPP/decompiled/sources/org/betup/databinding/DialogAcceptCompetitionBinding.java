package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class DialogAcceptCompetitionBinding implements ViewBinding {
    public final RecyclerView bets;
    public final TextView buyinAmount;
    public final LinearLayout buyinAmountContainer;
    public final AppCompatTextView buyinTitle;
    public final View competitionHeader;
    public final AppCompatTextView competitionName;
    public final ConstraintLayout dialogContainer;
    public final View footer;
    public final AlphaPressButton okButton;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;

    private DialogAcceptCompetitionBinding(ConstraintLayout rootView, RecyclerView bets, TextView buyinAmount, LinearLayout buyinAmountContainer, AppCompatTextView buyinTitle, View competitionHeader, AppCompatTextView competitionName, ConstraintLayout dialogContainer, View footer, AlphaPressButton okButton, ProgressBar progress) {
        this.rootView = rootView;
        this.bets = bets;
        this.buyinAmount = buyinAmount;
        this.buyinAmountContainer = buyinAmountContainer;
        this.buyinTitle = buyinTitle;
        this.competitionHeader = competitionHeader;
        this.competitionName = competitionName;
        this.dialogContainer = dialogContainer;
        this.footer = footer;
        this.okButton = okButton;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogAcceptCompetitionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogAcceptCompetitionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_accept_competition, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAcceptCompetitionBinding bind(View rootView) {
        int i = R.id.bets;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.bets);
        if (recyclerView != null) {
            i = R.id.buyin_amount;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.buyin_amount);
            if (textView != null) {
                i = R.id.buyin_amount_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.buyin_amount_container);
                if (linearLayout != null) {
                    i = R.id.buyin_title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.buyin_title);
                    if (appCompatTextView != null) {
                        i = R.id.competition_header;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.competition_header);
                        if (findChildViewById != null) {
                            i = R.id.competition_name;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.competition_name);
                            if (appCompatTextView2 != null) {
                                i = R.id.dialog_container;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                                if (constraintLayout != null) {
                                    i = R.id.footer;
                                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.footer);
                                    if (findChildViewById2 != null) {
                                        i = R.id.ok_button;
                                        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok_button);
                                        if (alphaPressButton != null) {
                                            i = R.id.progress;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                            if (progressBar != null) {
                                                return new DialogAcceptCompetitionBinding((ConstraintLayout) rootView, recyclerView, textView, linearLayout, appCompatTextView, findChildViewById, appCompatTextView2, constraintLayout, findChildViewById2, alphaPressButton, progressBar);
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
