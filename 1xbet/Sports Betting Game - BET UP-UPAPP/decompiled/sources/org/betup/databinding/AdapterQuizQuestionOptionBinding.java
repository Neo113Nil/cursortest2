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
public final class AdapterQuizQuestionOptionBinding implements ViewBinding {
    public final ConstraintLayout quizOptionCl;
    public final TextView quizOptionCoefficientTv;
    public final ConstraintLayout quizOptionContainerCl;
    public final TextView quizOptionTv;
    private final ConstraintLayout rootView;

    private AdapterQuizQuestionOptionBinding(ConstraintLayout rootView, ConstraintLayout quizOptionCl, TextView quizOptionCoefficientTv, ConstraintLayout quizOptionContainerCl, TextView quizOptionTv) {
        this.rootView = rootView;
        this.quizOptionCl = quizOptionCl;
        this.quizOptionCoefficientTv = quizOptionCoefficientTv;
        this.quizOptionContainerCl = quizOptionContainerCl;
        this.quizOptionTv = quizOptionTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterQuizQuestionOptionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AdapterQuizQuestionOptionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.adapter_quiz_question_option, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterQuizQuestionOptionBinding bind(View rootView) {
        int i = R.id.quiz_option_cl;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_option_cl);
        if (constraintLayout != null) {
            i = R.id.quiz_option_coefficient_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_option_coefficient_tv);
            if (textView != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) rootView;
                i = R.id.quiz_option_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_option_tv);
                if (textView2 != null) {
                    return new AdapterQuizQuestionOptionBinding(constraintLayout2, constraintLayout, textView, constraintLayout2, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
