package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class IntroQuiz3Binding implements ViewBinding {
    public final TextView betQuizHeaderTv;
    public final ConstraintLayout icon;
    public final TextView quizIntro3CommentTv;
    public final ImageView quizIntro3Iv;
    public final TextView quizIntro3ShareTv;
    public final TextView quizIntro3Tv;
    private final ConstraintLayout rootView;
    public final TextView topDescriptionTv;

    private IntroQuiz3Binding(ConstraintLayout rootView, TextView betQuizHeaderTv, ConstraintLayout icon, TextView quizIntro3CommentTv, ImageView quizIntro3Iv, TextView quizIntro3ShareTv, TextView quizIntro3Tv, TextView topDescriptionTv) {
        this.rootView = rootView;
        this.betQuizHeaderTv = betQuizHeaderTv;
        this.icon = icon;
        this.quizIntro3CommentTv = quizIntro3CommentTv;
        this.quizIntro3Iv = quizIntro3Iv;
        this.quizIntro3ShareTv = quizIntro3ShareTv;
        this.quizIntro3Tv = quizIntro3Tv;
        this.topDescriptionTv = topDescriptionTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntroQuiz3Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IntroQuiz3Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.intro_quiz_3, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntroQuiz3Binding bind(View rootView) {
        int i = R.id.bet_quiz_header_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_quiz_header_tv);
        if (textView != null) {
            i = R.id.icon;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (constraintLayout != null) {
                i = R.id.quiz_intro_3_comment_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_intro_3_comment_tv);
                if (textView2 != null) {
                    i = R.id.quiz_intro_3_iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.quiz_intro_3_iv);
                    if (imageView != null) {
                        i = R.id.quiz_intro_3_share_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_intro_3_share_tv);
                        if (textView3 != null) {
                            i = R.id.quiz_intro_3_tv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_intro_3_tv);
                            if (textView4 != null) {
                                i = R.id.top_description_tv;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.top_description_tv);
                                if (textView5 != null) {
                                    return new IntroQuiz3Binding((ConstraintLayout) rootView, textView, constraintLayout, textView2, imageView, textView3, textView4, textView5);
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
