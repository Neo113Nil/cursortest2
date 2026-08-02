package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class SlideScoreBinding implements ViewBinding {
    public final LinearLayout awayContainer;
    public final ImageView awayImage;
    public final TextView awayTeam;
    public final AppCompatTextView banner;
    public final View bets;
    public final ConstraintLayout betsLayoutContainer;
    public final ConstraintLayout container;
    public final View fans;
    public final ConstraintLayout fansLayoutContainer;
    public final View hasBets;
    public final View hasComments;
    public final View history;
    public final LinearLayout homeContainer;
    public final ImageView homeImage;
    public final TextView homeTeam;
    public final TextView kickOff;
    public final TextView leagueName;
    public final ConstraintLayout leftHeaderButtonsCl;
    public final LinearLayout linearLayout;
    public final View notifications;
    public final ProgressBar progress;
    public final ImageView quizChallengeBtn;
    public final ConstraintLayout rightHeaderButtonsCl;
    private final ConstraintLayout rootView;
    public final AppCompatTextView score;
    public final LinearLayout scoreView;
    public final ConstraintLayout slideScoreHeaderContent;
    public final ImageView sportIcon;
    public final LinearLayout sportNameAndIconContainer;
    public final View stats;
    public final TextView subscore;
    public final TextView timeOrDate;
    public final TextView timeView;

    private SlideScoreBinding(ConstraintLayout rootView, LinearLayout awayContainer, ImageView awayImage, TextView awayTeam, AppCompatTextView banner, View bets, ConstraintLayout betsLayoutContainer, ConstraintLayout container, View fans, ConstraintLayout fansLayoutContainer, View hasBets, View hasComments, View history, LinearLayout homeContainer, ImageView homeImage, TextView homeTeam, TextView kickOff, TextView leagueName, ConstraintLayout leftHeaderButtonsCl, LinearLayout linearLayout, View notifications, ProgressBar progress, ImageView quizChallengeBtn, ConstraintLayout rightHeaderButtonsCl, AppCompatTextView score, LinearLayout scoreView, ConstraintLayout slideScoreHeaderContent, ImageView sportIcon, LinearLayout sportNameAndIconContainer, View stats, TextView subscore, TextView timeOrDate, TextView timeView) {
        this.rootView = rootView;
        this.awayContainer = awayContainer;
        this.awayImage = awayImage;
        this.awayTeam = awayTeam;
        this.banner = banner;
        this.bets = bets;
        this.betsLayoutContainer = betsLayoutContainer;
        this.container = container;
        this.fans = fans;
        this.fansLayoutContainer = fansLayoutContainer;
        this.hasBets = hasBets;
        this.hasComments = hasComments;
        this.history = history;
        this.homeContainer = homeContainer;
        this.homeImage = homeImage;
        this.homeTeam = homeTeam;
        this.kickOff = kickOff;
        this.leagueName = leagueName;
        this.leftHeaderButtonsCl = leftHeaderButtonsCl;
        this.linearLayout = linearLayout;
        this.notifications = notifications;
        this.progress = progress;
        this.quizChallengeBtn = quizChallengeBtn;
        this.rightHeaderButtonsCl = rightHeaderButtonsCl;
        this.score = score;
        this.scoreView = scoreView;
        this.slideScoreHeaderContent = slideScoreHeaderContent;
        this.sportIcon = sportIcon;
        this.sportNameAndIconContainer = sportNameAndIconContainer;
        this.stats = stats;
        this.subscore = subscore;
        this.timeOrDate = timeOrDate;
        this.timeView = timeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SlideScoreBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SlideScoreBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.slide_score, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SlideScoreBinding bind(View rootView) {
        int i = R.id.awayContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.awayContainer);
        if (linearLayout != null) {
            i = R.id.awayImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.awayImage);
            if (imageView != null) {
                i = R.id.awayTeam;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.awayTeam);
                if (textView != null) {
                    i = R.id.banner;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.banner);
                    if (appCompatTextView != null) {
                        i = R.id.bets;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bets);
                        if (findChildViewById != null) {
                            i = R.id.bets_layout_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bets_layout_container);
                            if (constraintLayout != null) {
                                i = R.id.container;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                                if (constraintLayout2 != null) {
                                    i = R.id.fans;
                                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.fans);
                                    if (findChildViewById2 != null) {
                                        i = R.id.fans_layout_container;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.fans_layout_container);
                                        if (constraintLayout3 != null) {
                                            i = R.id.hasBets;
                                            View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.hasBets);
                                            if (findChildViewById3 != null) {
                                                i = R.id.hasComments;
                                                View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.hasComments);
                                                if (findChildViewById4 != null) {
                                                    i = R.id.history;
                                                    View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.history);
                                                    if (findChildViewById5 != null) {
                                                        i = R.id.homeContainer;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.homeContainer);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.homeImage;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.homeImage);
                                                            if (imageView2 != null) {
                                                                i = R.id.homeTeam;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.homeTeam);
                                                                if (textView2 != null) {
                                                                    i = R.id.kickOff;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.kickOff);
                                                                    if (textView3 != null) {
                                                                        i = R.id.leagueName;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.leagueName);
                                                                        if (textView4 != null) {
                                                                            i = R.id.left_header_buttons_cl;
                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.left_header_buttons_cl);
                                                                            if (constraintLayout4 != null) {
                                                                                i = R.id.linearLayout;
                                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearLayout);
                                                                                if (linearLayout3 != null) {
                                                                                    i = R.id.notifications;
                                                                                    View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.notifications);
                                                                                    if (findChildViewById6 != null) {
                                                                                        i = R.id.progress;
                                                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                                                        if (progressBar != null) {
                                                                                            i = R.id.quiz_challenge_btn;
                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.quiz_challenge_btn);
                                                                                            if (imageView3 != null) {
                                                                                                i = R.id.right_header_buttons_cl;
                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.right_header_buttons_cl);
                                                                                                if (constraintLayout5 != null) {
                                                                                                    i = R.id.score;
                                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.score);
                                                                                                    if (appCompatTextView2 != null) {
                                                                                                        i = R.id.scoreView;
                                                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.scoreView);
                                                                                                        if (linearLayout4 != null) {
                                                                                                            i = R.id.slide_score_header_content;
                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.slide_score_header_content);
                                                                                                            if (constraintLayout6 != null) {
                                                                                                                i = R.id.sportIcon;
                                                                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i = R.id.sportNameAndIconContainer;
                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportNameAndIconContainer);
                                                                                                                    if (linearLayout5 != null) {
                                                                                                                        i = R.id.stats;
                                                                                                                        View findChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.stats);
                                                                                                                        if (findChildViewById7 != null) {
                                                                                                                            i = R.id.subscore;
                                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subscore);
                                                                                                                            if (textView5 != null) {
                                                                                                                                i = R.id.timeOrDate;
                                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.timeOrDate);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    i = R.id.timeView;
                                                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.timeView);
                                                                                                                                    if (textView7 != null) {
                                                                                                                                        return new SlideScoreBinding((ConstraintLayout) rootView, linearLayout, imageView, textView, appCompatTextView, findChildViewById, constraintLayout, constraintLayout2, findChildViewById2, constraintLayout3, findChildViewById3, findChildViewById4, findChildViewById5, linearLayout2, imageView2, textView2, textView3, textView4, constraintLayout4, linearLayout3, findChildViewById6, progressBar, imageView3, constraintLayout5, appCompatTextView2, linearLayout4, constraintLayout6, imageView4, linearLayout5, findChildViewById7, textView5, textView6, textView7);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
