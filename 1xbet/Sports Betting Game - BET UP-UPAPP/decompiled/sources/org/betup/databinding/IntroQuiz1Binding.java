package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class IntroQuiz1Binding implements ViewBinding {
    public final TextView betQuizHeaderTv;
    public final TextView bottomDescriptionTv;
    public final FlexboxLayout flexboxLayout;
    public final ConstraintLayout icon;
    public final TextView introQuiz1TitleTv;
    public final TextView introducingTv;
    public final ConstraintLayout quizContainerCl;
    public final ConstraintLayout quizOptionCl;
    public final TextView quizOptionCoefficientTv;
    public final ConstraintLayout quizOptionContainerCl;
    public final ConstraintLayout quizOptionSecondCl;
    public final TextView quizOptionSecondCoefficientTv;
    public final ConstraintLayout quizOptionSecondContainerCl;
    public final TextView quizOptionSecondTv;
    public final TextView quizOptionTv;
    private final ConstraintLayout rootView;
    public final TextView topDescriptionTv;

    private IntroQuiz1Binding(ConstraintLayout rootView, TextView betQuizHeaderTv, TextView bottomDescriptionTv, FlexboxLayout flexboxLayout, ConstraintLayout icon, TextView introQuiz1TitleTv, TextView introducingTv, ConstraintLayout quizContainerCl, ConstraintLayout quizOptionCl, TextView quizOptionCoefficientTv, ConstraintLayout quizOptionContainerCl, ConstraintLayout quizOptionSecondCl, TextView quizOptionSecondCoefficientTv, ConstraintLayout quizOptionSecondContainerCl, TextView quizOptionSecondTv, TextView quizOptionTv, TextView topDescriptionTv) {
        this.rootView = rootView;
        this.betQuizHeaderTv = betQuizHeaderTv;
        this.bottomDescriptionTv = bottomDescriptionTv;
        this.flexboxLayout = flexboxLayout;
        this.icon = icon;
        this.introQuiz1TitleTv = introQuiz1TitleTv;
        this.introducingTv = introducingTv;
        this.quizContainerCl = quizContainerCl;
        this.quizOptionCl = quizOptionCl;
        this.quizOptionCoefficientTv = quizOptionCoefficientTv;
        this.quizOptionContainerCl = quizOptionContainerCl;
        this.quizOptionSecondCl = quizOptionSecondCl;
        this.quizOptionSecondCoefficientTv = quizOptionSecondCoefficientTv;
        this.quizOptionSecondContainerCl = quizOptionSecondContainerCl;
        this.quizOptionSecondTv = quizOptionSecondTv;
        this.quizOptionTv = quizOptionTv;
        this.topDescriptionTv = topDescriptionTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntroQuiz1Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IntroQuiz1Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.intro_quiz_1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntroQuiz1Binding bind(View rootView) {
        int i = R.id.bet_quiz_header_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_quiz_header_tv);
        if (textView != null) {
            i = R.id.bottom_description_tv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bottom_description_tv);
            if (textView2 != null) {
                i = R.id.flexbox_layout;
                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.flexbox_layout);
                if (flexboxLayout != null) {
                    i = R.id.icon;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.icon);
                    if (constraintLayout != null) {
                        i = R.id.intro_quiz_1_title_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.intro_quiz_1_title_tv);
                        if (textView3 != null) {
                            i = R.id.introducing_tv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.introducing_tv);
                            if (textView4 != null) {
                                i = R.id.quiz_container_cl;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_container_cl);
                                if (constraintLayout2 != null) {
                                    i = R.id.quiz_option_cl;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_option_cl);
                                    if (constraintLayout3 != null) {
                                        i = R.id.quiz_option_coefficient_tv;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_option_coefficient_tv);
                                        if (textView5 != null) {
                                            i = R.id.quiz_option_container_cl;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_option_container_cl);
                                            if (constraintLayout4 != null) {
                                                i = R.id.quiz_option_second_cl;
                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_option_second_cl);
                                                if (constraintLayout5 != null) {
                                                    i = R.id.quiz_option_second_coefficient_tv;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_option_second_coefficient_tv);
                                                    if (textView6 != null) {
                                                        i = R.id.quiz_option_second_container_cl;
                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_option_second_container_cl);
                                                        if (constraintLayout6 != null) {
                                                            i = R.id.quiz_option_second_tv;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_option_second_tv);
                                                            if (textView7 != null) {
                                                                i = R.id.quiz_option_tv;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_option_tv);
                                                                if (textView8 != null) {
                                                                    i = R.id.top_description_tv;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.top_description_tv);
                                                                    if (textView9 != null) {
                                                                        return new IntroQuiz1Binding((ConstraintLayout) rootView, textView, textView2, flexboxLayout, constraintLayout, textView3, textView4, constraintLayout2, constraintLayout3, textView5, constraintLayout4, constraintLayout5, textView6, constraintLayout6, textView7, textView8, textView9);
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
