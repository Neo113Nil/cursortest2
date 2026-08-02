package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogMissionsBinding implements ViewBinding {
    public final GradientTextView actionTitle;
    public final GradientTextView betcoins;
    public final AlphaPressButton close;
    public final ConstraintLayout dialogContainer;
    public final GradientTextView displayNumber;
    public final GradientTextView earnedLabel;
    public final ImageView imageView;
    public final GradientTextView missionLabel;
    public final AlphaPressButton ok;
    public final ProgressBar progress;
    public final LinearLayout rewardContainer;
    private final ConstraintLayout rootView;
    public final RecyclerView tasks;
    public final GradientTextView tickets;

    private DialogMissionsBinding(ConstraintLayout rootView, GradientTextView actionTitle, GradientTextView betcoins, AlphaPressButton close, ConstraintLayout dialogContainer, GradientTextView displayNumber, GradientTextView earnedLabel, ImageView imageView, GradientTextView missionLabel, AlphaPressButton ok, ProgressBar progress, LinearLayout rewardContainer, RecyclerView tasks, GradientTextView tickets) {
        this.rootView = rootView;
        this.actionTitle = actionTitle;
        this.betcoins = betcoins;
        this.close = close;
        this.dialogContainer = dialogContainer;
        this.displayNumber = displayNumber;
        this.earnedLabel = earnedLabel;
        this.imageView = imageView;
        this.missionLabel = missionLabel;
        this.ok = ok;
        this.progress = progress;
        this.rewardContainer = rewardContainer;
        this.tasks = tasks;
        this.tickets = tickets;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogMissionsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogMissionsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_missions, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogMissionsBinding bind(View rootView) {
        int i = R.id.actionTitle;
        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.actionTitle);
        if (gradientTextView != null) {
            i = R.id.betcoins;
            GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
            if (gradientTextView2 != null) {
                i = R.id.close;
                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
                if (alphaPressButton != null) {
                    i = R.id.dialog_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                    if (constraintLayout != null) {
                        i = R.id.displayNumber;
                        GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.displayNumber);
                        if (gradientTextView3 != null) {
                            i = R.id.earnedLabel;
                            GradientTextView gradientTextView4 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.earnedLabel);
                            if (gradientTextView4 != null) {
                                i = R.id.imageView;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                                if (imageView != null) {
                                    i = R.id.missionLabel;
                                    GradientTextView gradientTextView5 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.missionLabel);
                                    if (gradientTextView5 != null) {
                                        i = R.id.ok;
                                        AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                                        if (alphaPressButton2 != null) {
                                            i = R.id.progress;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                            if (progressBar != null) {
                                                i = R.id.rewardContainer;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.rewardContainer);
                                                if (linearLayout != null) {
                                                    i = R.id.tasks;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.tasks);
                                                    if (recyclerView != null) {
                                                        i = R.id.tickets;
                                                        GradientTextView gradientTextView6 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.tickets);
                                                        if (gradientTextView6 != null) {
                                                            return new DialogMissionsBinding((ConstraintLayout) rootView, gradientTextView, gradientTextView2, alphaPressButton, constraintLayout, gradientTextView3, gradientTextView4, imageView, gradientTextView5, alphaPressButton2, progressBar, linearLayout, recyclerView, gradientTextView6);
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
