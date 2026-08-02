package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogBetPlacedBinding implements ViewBinding {
    public final RecyclerView bets;
    public final Button close;
    public final LinearLayout consolationPrize;
    public final TextView consolationPrizeAmount;
    public final ConstraintLayout dialogContainer;
    public final ImageView imageView;
    public final ImageView label;
    public final AppCompatTextView multiplyBonusTitle;
    public final GradientTextView odds;
    public final GradientTextView placed;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final LinearLayout stats;
    public final AlphaPressButton videoButton;
    public final ImageView videoRewardIcon;

    private DialogBetPlacedBinding(ConstraintLayout rootView, RecyclerView bets, Button close, LinearLayout consolationPrize, TextView consolationPrizeAmount, ConstraintLayout dialogContainer, ImageView imageView, ImageView label, AppCompatTextView multiplyBonusTitle, GradientTextView odds, GradientTextView placed, ProgressBar progress, LinearLayout stats, AlphaPressButton videoButton, ImageView videoRewardIcon) {
        this.rootView = rootView;
        this.bets = bets;
        this.close = close;
        this.consolationPrize = consolationPrize;
        this.consolationPrizeAmount = consolationPrizeAmount;
        this.dialogContainer = dialogContainer;
        this.imageView = imageView;
        this.label = label;
        this.multiplyBonusTitle = multiplyBonusTitle;
        this.odds = odds;
        this.placed = placed;
        this.progress = progress;
        this.stats = stats;
        this.videoButton = videoButton;
        this.videoRewardIcon = videoRewardIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogBetPlacedBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogBetPlacedBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_bet_placed, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBetPlacedBinding bind(View rootView) {
        int i = R.id.bets;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.bets);
        if (recyclerView != null) {
            i = R.id.close;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.close);
            if (button != null) {
                i = R.id.consolation_prize;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.consolation_prize);
                if (linearLayout != null) {
                    i = R.id.consolationPrizeAmount;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.consolationPrizeAmount);
                    if (textView != null) {
                        i = R.id.dialog_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                        if (constraintLayout != null) {
                            i = R.id.imageView;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                            if (imageView != null) {
                                i = R.id.label;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.label);
                                if (imageView2 != null) {
                                    i = R.id.multiplyBonusTitle;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.multiplyBonusTitle);
                                    if (appCompatTextView != null) {
                                        i = R.id.odds;
                                        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.odds);
                                        if (gradientTextView != null) {
                                            i = R.id.placed;
                                            GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.placed);
                                            if (gradientTextView2 != null) {
                                                i = R.id.progress;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                if (progressBar != null) {
                                                    i = R.id.stats;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stats);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.videoButton;
                                                        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.videoButton);
                                                        if (alphaPressButton != null) {
                                                            i = R.id.videoRewardIcon;
                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.videoRewardIcon);
                                                            if (imageView3 != null) {
                                                                return new DialogBetPlacedBinding((ConstraintLayout) rootView, recyclerView, button, linearLayout, textView, constraintLayout, imageView, imageView2, appCompatTextView, gradientTextView, gradientTextView2, progressBar, linearLayout2, alphaPressButton, imageView3);
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
