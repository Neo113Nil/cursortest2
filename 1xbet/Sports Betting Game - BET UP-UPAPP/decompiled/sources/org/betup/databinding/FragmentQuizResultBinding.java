package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentQuizResultBinding implements ViewBinding {
    public final TextView awayTeamNameTv;
    public final TextView awayTeamScoreTv;
    public final TextView homeTeamNameTv;
    public final TextView homeTeamScoreTv;
    public final ConstraintLayout makeBetCl;
    public final TextView makeBetTv;
    public final RecyclerView quizQuestionResultsRv;
    public final ConstraintLayout quizResultMatchInfoCl;
    public final TextView quizResultMatchNameTv;
    public final LinearLayout quizResultMatchTeamsLl;
    public final ConstraintLayout quizResultTotalCl;
    public final TextView quizResultTotalOddsTv;
    public final FlexboxLayout quizResultTotalPotentialWinFl;
    public final LinearLayout quizResultTotalPotentialWinLl;
    public final TextView quizResultTotalPotentialWinTitleTv;
    public final TextView quizResultTotalPotentialWinTv;
    public final RecyclerView quizRewardOptionRv;
    private final ConstraintLayout rootView;
    public final LinearLayout scoreLl;
    public final TextView separatorTv;

    private FragmentQuizResultBinding(ConstraintLayout rootView, TextView awayTeamNameTv, TextView awayTeamScoreTv, TextView homeTeamNameTv, TextView homeTeamScoreTv, ConstraintLayout makeBetCl, TextView makeBetTv, RecyclerView quizQuestionResultsRv, ConstraintLayout quizResultMatchInfoCl, TextView quizResultMatchNameTv, LinearLayout quizResultMatchTeamsLl, ConstraintLayout quizResultTotalCl, TextView quizResultTotalOddsTv, FlexboxLayout quizResultTotalPotentialWinFl, LinearLayout quizResultTotalPotentialWinLl, TextView quizResultTotalPotentialWinTitleTv, TextView quizResultTotalPotentialWinTv, RecyclerView quizRewardOptionRv, LinearLayout scoreLl, TextView separatorTv) {
        this.rootView = rootView;
        this.awayTeamNameTv = awayTeamNameTv;
        this.awayTeamScoreTv = awayTeamScoreTv;
        this.homeTeamNameTv = homeTeamNameTv;
        this.homeTeamScoreTv = homeTeamScoreTv;
        this.makeBetCl = makeBetCl;
        this.makeBetTv = makeBetTv;
        this.quizQuestionResultsRv = quizQuestionResultsRv;
        this.quizResultMatchInfoCl = quizResultMatchInfoCl;
        this.quizResultMatchNameTv = quizResultMatchNameTv;
        this.quizResultMatchTeamsLl = quizResultMatchTeamsLl;
        this.quizResultTotalCl = quizResultTotalCl;
        this.quizResultTotalOddsTv = quizResultTotalOddsTv;
        this.quizResultTotalPotentialWinFl = quizResultTotalPotentialWinFl;
        this.quizResultTotalPotentialWinLl = quizResultTotalPotentialWinLl;
        this.quizResultTotalPotentialWinTitleTv = quizResultTotalPotentialWinTitleTv;
        this.quizResultTotalPotentialWinTv = quizResultTotalPotentialWinTv;
        this.quizRewardOptionRv = quizRewardOptionRv;
        this.scoreLl = scoreLl;
        this.separatorTv = separatorTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQuizResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentQuizResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_quiz_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentQuizResultBinding bind(View rootView) {
        int i = R.id.away_team_name_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.away_team_name_tv);
        if (textView != null) {
            i = R.id.away_team_score_tv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.away_team_score_tv);
            if (textView2 != null) {
                i = R.id.home_team_name_tv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.home_team_name_tv);
                if (textView3 != null) {
                    i = R.id.home_team_score_tv;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.home_team_score_tv);
                    if (textView4 != null) {
                        i = R.id.make_bet_cl;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.make_bet_cl);
                        if (constraintLayout != null) {
                            i = R.id.make_bet_tv;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.make_bet_tv);
                            if (textView5 != null) {
                                i = R.id.quiz_question_results_rv;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.quiz_question_results_rv);
                                if (recyclerView != null) {
                                    i = R.id.quiz_result_match_info_cl;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_result_match_info_cl);
                                    if (constraintLayout2 != null) {
                                        i = R.id.quiz_result_match_name_tv;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_result_match_name_tv);
                                        if (textView6 != null) {
                                            i = R.id.quiz_result_match_teams_ll;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_result_match_teams_ll);
                                            if (linearLayout != null) {
                                                i = R.id.quiz_result_total_cl;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_result_total_cl);
                                                if (constraintLayout3 != null) {
                                                    i = R.id.quiz_result_total_odds_tv;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_result_total_odds_tv);
                                                    if (textView7 != null) {
                                                        i = R.id.quiz_result_total_potential_win_fl;
                                                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_result_total_potential_win_fl);
                                                        if (flexboxLayout != null) {
                                                            i = R.id.quiz_result_total_potential_win_ll;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.quiz_result_total_potential_win_ll);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.quiz_result_total_potential_win_title_tv;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_result_total_potential_win_title_tv);
                                                                if (textView8 != null) {
                                                                    i = R.id.quiz_result_total_potential_win_tv;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quiz_result_total_potential_win_tv);
                                                                    if (textView9 != null) {
                                                                        i = R.id.quiz_reward_option_rv;
                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.quiz_reward_option_rv);
                                                                        if (recyclerView2 != null) {
                                                                            i = R.id.score_ll;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.score_ll);
                                                                            if (linearLayout3 != null) {
                                                                                i = R.id.separator_tv;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.separator_tv);
                                                                                if (textView10 != null) {
                                                                                    return new FragmentQuizResultBinding((ConstraintLayout) rootView, textView, textView2, textView3, textView4, constraintLayout, textView5, recyclerView, constraintLayout2, textView6, linearLayout, constraintLayout3, textView7, flexboxLayout, linearLayout2, textView8, textView9, recyclerView2, linearLayout3, textView10);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
