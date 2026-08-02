package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.CompetitionBetView;

/* loaded from: classes2.dex */
public final class CompetitionMatchViewSmallBinding implements ViewBinding {
    public final LinearLayout awayTeamBox;
    public final ImageView awayTeamIcon;
    public final AppCompatTextView awayTeamName;
    public final AppCompatTextView date;
    public final CompetitionBetView double1xBet;
    public final CompetitionBetView doubleX2Bet;
    public final CompetitionBetView drawBet;
    public final ConstraintLayout firstBetSection;
    public final AppCompatTextView firstSectionTitle;
    public final ConstraintLayout fourthBetSection;
    public final AppCompatTextView fourthSectionTitle;
    public final CompetitionBetView handicap1Bet;
    public final CompetitionBetView handicap2Bet;
    public final LinearLayout header;
    public final LinearLayout homeTeamBox;
    public final ImageView homeTeamIcon;
    public final AppCompatTextView homeTeamName;
    public final AppCompatTextView leagueName;
    private final ConstraintLayout rootView;
    public final ConstraintLayout secondBetSection;
    public final AppCompatTextView secondSectionTitle;
    public final ImageView sportIcon;
    public final ConstraintLayout thirdBetSection;
    public final AppCompatTextView thirdSectionTitle;
    public final AppCompatTextView time;
    public final CompetitionBetView totalOverBet;
    public final CompetitionBetView totalUnderBet;
    public final CompetitionBetView win1Bet;
    public final CompetitionBetView win2Bet;

    private CompetitionMatchViewSmallBinding(ConstraintLayout rootView, LinearLayout awayTeamBox, ImageView awayTeamIcon, AppCompatTextView awayTeamName, AppCompatTextView date, CompetitionBetView double1xBet, CompetitionBetView doubleX2Bet, CompetitionBetView drawBet, ConstraintLayout firstBetSection, AppCompatTextView firstSectionTitle, ConstraintLayout fourthBetSection, AppCompatTextView fourthSectionTitle, CompetitionBetView handicap1Bet, CompetitionBetView handicap2Bet, LinearLayout header, LinearLayout homeTeamBox, ImageView homeTeamIcon, AppCompatTextView homeTeamName, AppCompatTextView leagueName, ConstraintLayout secondBetSection, AppCompatTextView secondSectionTitle, ImageView sportIcon, ConstraintLayout thirdBetSection, AppCompatTextView thirdSectionTitle, AppCompatTextView time, CompetitionBetView totalOverBet, CompetitionBetView totalUnderBet, CompetitionBetView win1Bet, CompetitionBetView win2Bet) {
        this.rootView = rootView;
        this.awayTeamBox = awayTeamBox;
        this.awayTeamIcon = awayTeamIcon;
        this.awayTeamName = awayTeamName;
        this.date = date;
        this.double1xBet = double1xBet;
        this.doubleX2Bet = doubleX2Bet;
        this.drawBet = drawBet;
        this.firstBetSection = firstBetSection;
        this.firstSectionTitle = firstSectionTitle;
        this.fourthBetSection = fourthBetSection;
        this.fourthSectionTitle = fourthSectionTitle;
        this.handicap1Bet = handicap1Bet;
        this.handicap2Bet = handicap2Bet;
        this.header = header;
        this.homeTeamBox = homeTeamBox;
        this.homeTeamIcon = homeTeamIcon;
        this.homeTeamName = homeTeamName;
        this.leagueName = leagueName;
        this.secondBetSection = secondBetSection;
        this.secondSectionTitle = secondSectionTitle;
        this.sportIcon = sportIcon;
        this.thirdBetSection = thirdBetSection;
        this.thirdSectionTitle = thirdSectionTitle;
        this.time = time;
        this.totalOverBet = totalOverBet;
        this.totalUnderBet = totalUnderBet;
        this.win1Bet = win1Bet;
        this.win2Bet = win2Bet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CompetitionMatchViewSmallBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CompetitionMatchViewSmallBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.competition_match_view_small, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CompetitionMatchViewSmallBinding bind(View rootView) {
        int i = R.id.awayTeamBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.awayTeamBox);
        if (linearLayout != null) {
            i = R.id.awayTeamIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.awayTeamIcon);
            if (imageView != null) {
                i = R.id.awayTeamName;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.awayTeamName);
                if (appCompatTextView != null) {
                    i = R.id.date;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.date);
                    if (appCompatTextView2 != null) {
                        i = R.id.double_1x_bet;
                        CompetitionBetView competitionBetView = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.double_1x_bet);
                        if (competitionBetView != null) {
                            i = R.id.double_x2_bet;
                            CompetitionBetView competitionBetView2 = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.double_x2_bet);
                            if (competitionBetView2 != null) {
                                i = R.id.draw_bet;
                                CompetitionBetView competitionBetView3 = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.draw_bet);
                                if (competitionBetView3 != null) {
                                    i = R.id.firstBetSection;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.firstBetSection);
                                    if (constraintLayout != null) {
                                        i = R.id.firstSectionTitle;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.firstSectionTitle);
                                        if (appCompatTextView3 != null) {
                                            i = R.id.fourthBetSection;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.fourthBetSection);
                                            if (constraintLayout2 != null) {
                                                i = R.id.fourthSectionTitle;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.fourthSectionTitle);
                                                if (appCompatTextView4 != null) {
                                                    i = R.id.handicap_1_bet;
                                                    CompetitionBetView competitionBetView4 = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.handicap_1_bet);
                                                    if (competitionBetView4 != null) {
                                                        i = R.id.handicap_2_bet;
                                                        CompetitionBetView competitionBetView5 = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.handicap_2_bet);
                                                        if (competitionBetView5 != null) {
                                                            i = R.id.header;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.homeTeamBox;
                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.homeTeamBox);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.homeTeamIcon;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.homeTeamIcon);
                                                                    if (imageView2 != null) {
                                                                        i = R.id.homeTeamName;
                                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.homeTeamName);
                                                                        if (appCompatTextView5 != null) {
                                                                            i = R.id.leagueName;
                                                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.leagueName);
                                                                            if (appCompatTextView6 != null) {
                                                                                i = R.id.secondBetSection;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.secondBetSection);
                                                                                if (constraintLayout3 != null) {
                                                                                    i = R.id.secondSectionTitle;
                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.secondSectionTitle);
                                                                                    if (appCompatTextView7 != null) {
                                                                                        i = R.id.sportIcon;
                                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                                                                                        if (imageView3 != null) {
                                                                                            i = R.id.thirdBetSection;
                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.thirdBetSection);
                                                                                            if (constraintLayout4 != null) {
                                                                                                i = R.id.thirdSectionTitle;
                                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.thirdSectionTitle);
                                                                                                if (appCompatTextView8 != null) {
                                                                                                    i = R.id.time;
                                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                                                                    if (appCompatTextView9 != null) {
                                                                                                        i = R.id.total_over_bet;
                                                                                                        CompetitionBetView competitionBetView6 = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.total_over_bet);
                                                                                                        if (competitionBetView6 != null) {
                                                                                                            i = R.id.total_under_bet;
                                                                                                            CompetitionBetView competitionBetView7 = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.total_under_bet);
                                                                                                            if (competitionBetView7 != null) {
                                                                                                                i = R.id.win_1_bet;
                                                                                                                CompetitionBetView competitionBetView8 = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.win_1_bet);
                                                                                                                if (competitionBetView8 != null) {
                                                                                                                    i = R.id.win_2_bet;
                                                                                                                    CompetitionBetView competitionBetView9 = (CompetitionBetView) ViewBindings.findChildViewById(rootView, R.id.win_2_bet);
                                                                                                                    if (competitionBetView9 != null) {
                                                                                                                        return new CompetitionMatchViewSmallBinding((ConstraintLayout) rootView, linearLayout, imageView, appCompatTextView, appCompatTextView2, competitionBetView, competitionBetView2, competitionBetView3, constraintLayout, appCompatTextView3, constraintLayout2, appCompatTextView4, competitionBetView4, competitionBetView5, linearLayout2, linearLayout3, imageView2, appCompatTextView5, appCompatTextView6, constraintLayout3, appCompatTextView7, imageView3, constraintLayout4, appCompatTextView8, appCompatTextView9, competitionBetView6, competitionBetView7, competitionBetView8, competitionBetView9);
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
