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
public final class AdapterQuizQuestionPageBinding implements ViewBinding {
    public final ImageView quizQuestionNumberIv;
    public final LinearLayout quizQuestionNumberLl;
    public final TextView quizQuestionNumberTv;
    private final ConstraintLayout rootView;

    private AdapterQuizQuestionPageBinding(ConstraintLayout rootView, ImageView quizQuestionNumberIv, LinearLayout quizQuestionNumberLl, TextView quizQuestionNumberTv) {
        this.rootView = rootView;
        this.quizQuestionNumberIv = quizQuestionNumberIv;
        this.quizQuestionNumberLl = quizQuestionNumberLl;
        this.quizQuestionNumberTv = quizQuestionNumberTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterQuizQuestionPageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AdapterQuizQuestionPageBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.adapter_quiz_question_page, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterQuizQuestionPageBinding bind(View rootView) {
        int i = R.id.quiz_question_number_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.quiz_question_number_iv);
        if (imageView != null) {
            i = R.id.quiz_question_number_ll;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_question_number_ll);
            if (linearLayout != null) {
                i = R.id.quiz_question_number_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_question_number_tv);
                if (textView != null) {
                    return new AdapterQuizQuestionPageBinding((ConstraintLayout) rootView, imageView, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
