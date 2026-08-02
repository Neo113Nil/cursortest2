package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class AdapterQuizResultAwardBinding implements ViewBinding {
    public final LinearLayout quizRewardAmountLl;
    public final TextView quizRewardAmountTv;
    public final ConstraintLayout quizRewardCl;
    public final ImageView quizRewardIv;
    public final TextView quizRewardMultiplierTv;
    private final ConstraintLayout rootView;

    private AdapterQuizResultAwardBinding(ConstraintLayout rootView, LinearLayout quizRewardAmountLl, TextView quizRewardAmountTv, ConstraintLayout quizRewardCl, ImageView quizRewardIv, TextView quizRewardMultiplierTv) {
        this.rootView = rootView;
        this.quizRewardAmountLl = quizRewardAmountLl;
        this.quizRewardAmountTv = quizRewardAmountTv;
        this.quizRewardCl = quizRewardCl;
        this.quizRewardIv = quizRewardIv;
        this.quizRewardMultiplierTv = quizRewardMultiplierTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterQuizResultAwardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AdapterQuizResultAwardBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.adapter_quiz_result_award, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterQuizResultAwardBinding bind(View rootView) {
        int i = R.id.quiz_reward_amount_ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_reward_amount_ll);
        if (linearLayout != null) {
            i = R.id.quiz_reward_amount_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_reward_amount_tv);
            if (textView != null) {
                i = R.id.quiz_reward_cl;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_reward_cl);
                if (constraintLayout != null) {
                    i = R.id.quiz_reward_iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.quiz_reward_iv);
                    if (imageView != null) {
                        i = R.id.quiz_reward_multiplier_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_reward_multiplier_tv);
                        if (textView2 != null) {
                            return new AdapterQuizResultAwardBinding((ConstraintLayout) rootView, linearLayout, textView, constraintLayout, imageView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
