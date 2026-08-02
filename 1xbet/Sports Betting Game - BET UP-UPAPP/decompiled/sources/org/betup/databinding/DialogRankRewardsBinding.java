package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogRankRewardsBinding implements ViewBinding {
    public final ConstraintLayout dialogContainer;
    public final TextView message;
    public final AlphaPressButton ok;
    public final GradientTextView price;
    public final ProgressBar progress;
    public final RecyclerView rewardList;
    private final ConstraintLayout rootView;

    private DialogRankRewardsBinding(ConstraintLayout rootView, ConstraintLayout dialogContainer, TextView message, AlphaPressButton ok, GradientTextView price, ProgressBar progress, RecyclerView rewardList) {
        this.rootView = rootView;
        this.dialogContainer = dialogContainer;
        this.message = message;
        this.ok = ok;
        this.price = price;
        this.progress = progress;
        this.rewardList = rewardList;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogRankRewardsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogRankRewardsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_rank_rewards, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogRankRewardsBinding bind(View rootView) {
        int i = R.id.dialog_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
        if (constraintLayout != null) {
            i = R.id.message;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.message);
            if (textView != null) {
                i = R.id.ok;
                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (alphaPressButton != null) {
                    i = R.id.price;
                    GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                    if (gradientTextView != null) {
                        i = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                        if (progressBar != null) {
                            i = R.id.rewardList;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rewardList);
                            if (recyclerView != null) {
                                return new DialogRankRewardsBinding((ConstraintLayout) rootView, constraintLayout, textView, alphaPressButton, gradientTextView, progressBar, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
