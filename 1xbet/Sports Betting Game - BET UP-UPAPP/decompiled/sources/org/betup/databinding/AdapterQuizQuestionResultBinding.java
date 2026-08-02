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
public final class AdapterQuizQuestionResultBinding implements ViewBinding {
    public final ConstraintLayout coefficientSelectedCl;
    public final ConstraintLayout contentCl;
    public final TextView quizQuestionCoefficientTv;
    public final TextView quizQuestionSelectedTv;
    public final TextView quizQuestionTitleTv;
    private final ConstraintLayout rootView;

    private AdapterQuizQuestionResultBinding(ConstraintLayout rootView, ConstraintLayout coefficientSelectedCl, ConstraintLayout contentCl, TextView quizQuestionCoefficientTv, TextView quizQuestionSelectedTv, TextView quizQuestionTitleTv) {
        this.rootView = rootView;
        this.coefficientSelectedCl = coefficientSelectedCl;
        this.contentCl = contentCl;
        this.quizQuestionCoefficientTv = quizQuestionCoefficientTv;
        this.quizQuestionSelectedTv = quizQuestionSelectedTv;
        this.quizQuestionTitleTv = quizQuestionTitleTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterQuizQuestionResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AdapterQuizQuestionResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.adapter_quiz_question_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterQuizQuestionResultBinding bind(View rootView) {
        int i = R.id.coefficient_selected_cl;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.coefficient_selected_cl);
        if (constraintLayout != null) {
            i = R.id.content_cl;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.content_cl);
            if (constraintLayout2 != null) {
                i = R.id.quiz_question_coefficient_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_question_coefficient_tv);
                if (textView != null) {
                    i = R.id.quiz_question_selected_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_question_selected_tv);
                    if (textView2 != null) {
                        i = R.id.quiz_question_title_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_question_title_tv);
                        if (textView3 != null) {
                            return new AdapterQuizQuestionResultBinding((ConstraintLayout) rootView, constraintLayout, constraintLayout2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
