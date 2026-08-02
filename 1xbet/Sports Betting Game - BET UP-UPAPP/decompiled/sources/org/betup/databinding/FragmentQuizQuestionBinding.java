package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentQuizQuestionBinding implements ViewBinding {
    public final RecyclerView quizOptionsRv;
    public final RecyclerView quizQuestionNumberRv;
    public final TextView quizQuestionTv;
    private final ConstraintLayout rootView;
    public final TextView totalOddsCoefTv;
    public final FlexboxLayout totalOddsFl;

    private FragmentQuizQuestionBinding(ConstraintLayout rootView, RecyclerView quizOptionsRv, RecyclerView quizQuestionNumberRv, TextView quizQuestionTv, TextView totalOddsCoefTv, FlexboxLayout totalOddsFl) {
        this.rootView = rootView;
        this.quizOptionsRv = quizOptionsRv;
        this.quizQuestionNumberRv = quizQuestionNumberRv;
        this.quizQuestionTv = quizQuestionTv;
        this.totalOddsCoefTv = totalOddsCoefTv;
        this.totalOddsFl = totalOddsFl;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQuizQuestionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentQuizQuestionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_quiz_question, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentQuizQuestionBinding bind(View rootView) {
        int i = R.id.quiz_options_rv;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.quiz_options_rv);
        if (recyclerView != null) {
            i = R.id.quiz_question_number_rv;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.quiz_question_number_rv);
            if (recyclerView2 != null) {
                i = R.id.quiz_question_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_question_tv);
                if (textView != null) {
                    i = R.id.total_odds_coef_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.total_odds_coef_tv);
                    if (textView2 != null) {
                        i = R.id.total_odds_fl;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.total_odds_fl);
                        if (flexboxLayout != null) {
                            return new FragmentQuizQuestionBinding((ConstraintLayout) rootView, recyclerView, recyclerView2, textView, textView2, flexboxLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
