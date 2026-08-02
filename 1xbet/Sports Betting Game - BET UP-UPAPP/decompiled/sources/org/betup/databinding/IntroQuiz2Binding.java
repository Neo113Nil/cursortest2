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
public final class IntroQuiz2Binding implements ViewBinding {
    public final TextView bottomDescriptionTv;
    public final ConstraintLayout icon;
    public final ImageView quizIntro2Example1;
    public final LinearLayout quizIntro2Ll;
    private final ConstraintLayout rootView;
    public final TextView titleTv;

    private IntroQuiz2Binding(ConstraintLayout rootView, TextView bottomDescriptionTv, ConstraintLayout icon, ImageView quizIntro2Example1, LinearLayout quizIntro2Ll, TextView titleTv) {
        this.rootView = rootView;
        this.bottomDescriptionTv = bottomDescriptionTv;
        this.icon = icon;
        this.quizIntro2Example1 = quizIntro2Example1;
        this.quizIntro2Ll = quizIntro2Ll;
        this.titleTv = titleTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntroQuiz2Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IntroQuiz2Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.intro_quiz_2, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntroQuiz2Binding bind(View rootView) {
        int i = R.id.bottom_description_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bottom_description_tv);
        if (textView != null) {
            i = R.id.icon;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (constraintLayout != null) {
                i = R.id.quiz_intro_2_example_1;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.quiz_intro_2_example_1);
                if (imageView != null) {
                    i = R.id.quiz_intro_2_ll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_intro_2_ll);
                    if (linearLayout != null) {
                        i = R.id.title_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                        if (textView2 != null) {
                            return new IntroQuiz2Binding((ConstraintLayout) rootView, textView, constraintLayout, imageView, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
