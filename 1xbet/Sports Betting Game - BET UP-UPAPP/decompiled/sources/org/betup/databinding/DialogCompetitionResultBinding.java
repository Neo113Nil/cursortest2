package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class DialogCompetitionResultBinding implements ViewBinding {
    public final RecyclerView bets;
    public final TextView buyinAmount;
    public final LinearLayout buyinAmountContainer;
    public final AppCompatTextView buyinTitle;
    public final View competitionHeader;
    public final AppCompatTextView competitionName;
    public final ConstraintLayout dialogContainer;
    public final ImageView jackpotIcon;
    public final AlphaPressButton okButton;
    public final TextView prizePoolAmount;
    public final LinearLayout prizePoolAmountContainer;
    public final AppCompatTextView prizePoolTitle;
    public final ProgressBar progress;
    public final TextView resultAmount;
    public final LinearLayout resultContainer;
    public final ConstraintLayout resultFirstLine;
    public final ConstraintLayout resultSecondLine;
    public final AppCompatTextView resultTitle;
    private final ConstraintLayout rootView;
    public final TextView wonAmount;
    public final LinearLayout wonContainer;
    public final AppCompatTextView wonTitle;

    private DialogCompetitionResultBinding(ConstraintLayout rootView, RecyclerView bets, TextView buyinAmount, LinearLayout buyinAmountContainer, AppCompatTextView buyinTitle, View competitionHeader, AppCompatTextView competitionName, ConstraintLayout dialogContainer, ImageView jackpotIcon, AlphaPressButton okButton, TextView prizePoolAmount, LinearLayout prizePoolAmountContainer, AppCompatTextView prizePoolTitle, ProgressBar progress, TextView resultAmount, LinearLayout resultContainer, ConstraintLayout resultFirstLine, ConstraintLayout resultSecondLine, AppCompatTextView resultTitle, TextView wonAmount, LinearLayout wonContainer, AppCompatTextView wonTitle) {
        this.rootView = rootView;
        this.bets = bets;
        this.buyinAmount = buyinAmount;
        this.buyinAmountContainer = buyinAmountContainer;
        this.buyinTitle = buyinTitle;
        this.competitionHeader = competitionHeader;
        this.competitionName = competitionName;
        this.dialogContainer = dialogContainer;
        this.jackpotIcon = jackpotIcon;
        this.okButton = okButton;
        this.prizePoolAmount = prizePoolAmount;
        this.prizePoolAmountContainer = prizePoolAmountContainer;
        this.prizePoolTitle = prizePoolTitle;
        this.progress = progress;
        this.resultAmount = resultAmount;
        this.resultContainer = resultContainer;
        this.resultFirstLine = resultFirstLine;
        this.resultSecondLine = resultSecondLine;
        this.resultTitle = resultTitle;
        this.wonAmount = wonAmount;
        this.wonContainer = wonContainer;
        this.wonTitle = wonTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogCompetitionResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogCompetitionResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_competition_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogCompetitionResultBinding bind(View rootView) {
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
                                    i = R.id.jackpotIcon;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.jackpotIcon);
                                    if (imageView != null) {
                                        i = R.id.ok_button;
                                        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok_button);
                                        if (alphaPressButton != null) {
                                            i = R.id.prize_pool_amount;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prize_pool_amount);
                                            if (textView2 != null) {
                                                i = R.id.prize_pool_amount_container;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.prize_pool_amount_container);
                                                if (linearLayout2 != null) {
                                                    i = R.id.prize_pool_title;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.prize_pool_title);
                                                    if (appCompatTextView3 != null) {
                                                        i = R.id.progress;
                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                        if (progressBar != null) {
                                                            i = R.id.result_amount;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.result_amount);
                                                            if (textView3 != null) {
                                                                i = R.id.result_container;
                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.result_container);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.result_first_line;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.result_first_line);
                                                                    if (constraintLayout2 != null) {
                                                                        i = R.id.result_second_line;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.result_second_line);
                                                                        if (constraintLayout3 != null) {
                                                                            i = R.id.result_title;
                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.result_title);
                                                                            if (appCompatTextView4 != null) {
                                                                                i = R.id.won_amount;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.won_amount);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.won_container;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.won_container);
                                                                                    if (linearLayout4 != null) {
                                                                                        i = R.id.won_title;
                                                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.won_title);
                                                                                        if (appCompatTextView5 != null) {
                                                                                            return new DialogCompetitionResultBinding((ConstraintLayout) rootView, recyclerView, textView, linearLayout, appCompatTextView, findChildViewById, appCompatTextView2, constraintLayout, imageView, alphaPressButton, textView2, linearLayout2, appCompatTextView3, progressBar, textView3, linearLayout3, constraintLayout2, constraintLayout3, appCompatTextView4, textView4, linearLayout4, appCompatTextView5);
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
