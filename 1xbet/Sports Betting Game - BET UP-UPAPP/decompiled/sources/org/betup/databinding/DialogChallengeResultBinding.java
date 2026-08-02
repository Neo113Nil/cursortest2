package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class DialogChallengeResultBinding implements ViewBinding {
    public final AlphaPressButton actionButton;
    public final FrameLayout actionButtonBackground;
    public final TextView actionPrice;
    public final LinearLayout actionPriceContainer;
    public final TextView actionTitle;
    public final RoundedImageView avatarIcon;
    public final ImageView close;
    public final TextView firstBetCoefficient;
    public final LinearLayout firstBetDetailsContainer;
    public final AppCompatTextView firstBetName;
    public final AppCompatTextView firstBetPeriod;
    public final LinearLayout firstPlayerBetContainer;
    public final ImageView firstTeamIcon;
    public final TextView firstTeamName;
    public final Group layoutGroup;
    public final ImageView leagueIcon;
    public final AppCompatTextView leagueName;
    public final TextView matchDate;
    public final LinearLayout matchInfo;
    public final AppCompatTextView matchTime;
    public final TextView noOpponentLabel;
    public final TextView prize;
    public final LinearLayout prizeContainer;
    public final LinearLayout prizeContainerInfo;
    public final TextView prizeTitle;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final RoundedImageView secondAvatarIcon;
    public final FrameLayout secondAvatarIconContainer;
    public final TextView secondBetCoefficient;
    public final LinearLayout secondBetDetailsContainer;
    public final AppCompatTextView secondBetName;
    public final AppCompatTextView secondBetPeriod;
    public final LinearLayout secondPlayerBetContainer;
    public final ImageView secondTeamIcon;
    public final TextView secondTeamName;
    public final ImageView secondUserCountry;
    public final AlphaPressButton selectMyBet;
    public final TextView statusText;
    public final LinearLayout topLevelStatusImagines;
    public final AppCompatTextView topLevelStatusText;
    public final ImageView vsDivider;

    private DialogChallengeResultBinding(ConstraintLayout rootView, AlphaPressButton actionButton, FrameLayout actionButtonBackground, TextView actionPrice, LinearLayout actionPriceContainer, TextView actionTitle, RoundedImageView avatarIcon, ImageView close, TextView firstBetCoefficient, LinearLayout firstBetDetailsContainer, AppCompatTextView firstBetName, AppCompatTextView firstBetPeriod, LinearLayout firstPlayerBetContainer, ImageView firstTeamIcon, TextView firstTeamName, Group layoutGroup, ImageView leagueIcon, AppCompatTextView leagueName, TextView matchDate, LinearLayout matchInfo, AppCompatTextView matchTime, TextView noOpponentLabel, TextView prize, LinearLayout prizeContainer, LinearLayout prizeContainerInfo, TextView prizeTitle, ProgressBar progress, RoundedImageView secondAvatarIcon, FrameLayout secondAvatarIconContainer, TextView secondBetCoefficient, LinearLayout secondBetDetailsContainer, AppCompatTextView secondBetName, AppCompatTextView secondBetPeriod, LinearLayout secondPlayerBetContainer, ImageView secondTeamIcon, TextView secondTeamName, ImageView secondUserCountry, AlphaPressButton selectMyBet, TextView statusText, LinearLayout topLevelStatusImagines, AppCompatTextView topLevelStatusText, ImageView vsDivider) {
        this.rootView = rootView;
        this.actionButton = actionButton;
        this.actionButtonBackground = actionButtonBackground;
        this.actionPrice = actionPrice;
        this.actionPriceContainer = actionPriceContainer;
        this.actionTitle = actionTitle;
        this.avatarIcon = avatarIcon;
        this.close = close;
        this.firstBetCoefficient = firstBetCoefficient;
        this.firstBetDetailsContainer = firstBetDetailsContainer;
        this.firstBetName = firstBetName;
        this.firstBetPeriod = firstBetPeriod;
        this.firstPlayerBetContainer = firstPlayerBetContainer;
        this.firstTeamIcon = firstTeamIcon;
        this.firstTeamName = firstTeamName;
        this.layoutGroup = layoutGroup;
        this.leagueIcon = leagueIcon;
        this.leagueName = leagueName;
        this.matchDate = matchDate;
        this.matchInfo = matchInfo;
        this.matchTime = matchTime;
        this.noOpponentLabel = noOpponentLabel;
        this.prize = prize;
        this.prizeContainer = prizeContainer;
        this.prizeContainerInfo = prizeContainerInfo;
        this.prizeTitle = prizeTitle;
        this.progress = progress;
        this.secondAvatarIcon = secondAvatarIcon;
        this.secondAvatarIconContainer = secondAvatarIconContainer;
        this.secondBetCoefficient = secondBetCoefficient;
        this.secondBetDetailsContainer = secondBetDetailsContainer;
        this.secondBetName = secondBetName;
        this.secondBetPeriod = secondBetPeriod;
        this.secondPlayerBetContainer = secondPlayerBetContainer;
        this.secondTeamIcon = secondTeamIcon;
        this.secondTeamName = secondTeamName;
        this.secondUserCountry = secondUserCountry;
        this.selectMyBet = selectMyBet;
        this.statusText = statusText;
        this.topLevelStatusImagines = topLevelStatusImagines;
        this.topLevelStatusText = topLevelStatusText;
        this.vsDivider = vsDivider;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogChallengeResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogChallengeResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_challenge_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogChallengeResultBinding bind(View rootView) {
        int i = R.id.action_button;
        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.action_button);
        if (alphaPressButton != null) {
            i = R.id.action_button_background;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.action_button_background);
            if (frameLayout != null) {
                i = R.id.actionPrice;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.actionPrice);
                if (textView != null) {
                    i = R.id.actionPriceContainer;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.actionPriceContainer);
                    if (linearLayout != null) {
                        i = R.id.actionTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.actionTitle);
                        if (textView2 != null) {
                            i = R.id.avatarIcon;
                            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatarIcon);
                            if (roundedImageView != null) {
                                i = R.id.close;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close);
                                if (imageView != null) {
                                    i = R.id.firstBetCoefficient;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstBetCoefficient);
                                    if (textView3 != null) {
                                        i = R.id.firstBetDetailsContainer;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.firstBetDetailsContainer);
                                        if (linearLayout2 != null) {
                                            i = R.id.firstBetName;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.firstBetName);
                                            if (appCompatTextView != null) {
                                                i = R.id.firstBetPeriod;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.firstBetPeriod);
                                                if (appCompatTextView2 != null) {
                                                    i = R.id.firstPlayerBetContainer;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.firstPlayerBetContainer);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.firstTeamIcon;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.firstTeamIcon);
                                                        if (imageView2 != null) {
                                                            i = R.id.firstTeamName;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstTeamName);
                                                            if (textView4 != null) {
                                                                i = R.id.layoutGroup;
                                                                Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.layoutGroup);
                                                                if (group != null) {
                                                                    i = R.id.league_icon;
                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.league_icon);
                                                                    if (imageView3 != null) {
                                                                        i = R.id.league_name;
                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.league_name);
                                                                        if (appCompatTextView3 != null) {
                                                                            i = R.id.matchDate;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchDate);
                                                                            if (textView5 != null) {
                                                                                i = R.id.matchInfo;
                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.matchInfo);
                                                                                if (linearLayout4 != null) {
                                                                                    i = R.id.matchTime;
                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.matchTime);
                                                                                    if (appCompatTextView4 != null) {
                                                                                        i = R.id.no_opponent_label;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_opponent_label);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.prize;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prize);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.prizeContainer;
                                                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.prizeContainer);
                                                                                                if (linearLayout5 != null) {
                                                                                                    i = R.id.prizeContainerInfo;
                                                                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.prizeContainerInfo);
                                                                                                    if (linearLayout6 != null) {
                                                                                                        i = R.id.prizeTitle;
                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prizeTitle);
                                                                                                        if (textView8 != null) {
                                                                                                            i = R.id.progress;
                                                                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                                                                            if (progressBar != null) {
                                                                                                                i = R.id.secondAvatarIcon;
                                                                                                                RoundedImageView roundedImageView2 = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.secondAvatarIcon);
                                                                                                                if (roundedImageView2 != null) {
                                                                                                                    i = R.id.secondAvatarIconContainer;
                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.secondAvatarIconContainer);
                                                                                                                    if (frameLayout2 != null) {
                                                                                                                        i = R.id.secondBetCoefficient;
                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondBetCoefficient);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i = R.id.secondBetDetailsContainer;
                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.secondBetDetailsContainer);
                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                i = R.id.secondBetName;
                                                                                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.secondBetName);
                                                                                                                                if (appCompatTextView5 != null) {
                                                                                                                                    i = R.id.secondBetPeriod;
                                                                                                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.secondBetPeriod);
                                                                                                                                    if (appCompatTextView6 != null) {
                                                                                                                                        i = R.id.secondPlayerBetContainer;
                                                                                                                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.secondPlayerBetContainer);
                                                                                                                                        if (linearLayout8 != null) {
                                                                                                                                            i = R.id.secondTeamIcon;
                                                                                                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondTeamIcon);
                                                                                                                                            if (imageView4 != null) {
                                                                                                                                                i = R.id.secondTeamName;
                                                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondTeamName);
                                                                                                                                                if (textView10 != null) {
                                                                                                                                                    i = R.id.secondUserCountry;
                                                                                                                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondUserCountry);
                                                                                                                                                    if (imageView5 != null) {
                                                                                                                                                        i = R.id.select_my_bet;
                                                                                                                                                        AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.select_my_bet);
                                                                                                                                                        if (alphaPressButton2 != null) {
                                                                                                                                                            i = R.id.statusText;
                                                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.statusText);
                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                i = R.id.top_level_status_imagines;
                                                                                                                                                                LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.top_level_status_imagines);
                                                                                                                                                                if (linearLayout9 != null) {
                                                                                                                                                                    i = R.id.top_level_status_text;
                                                                                                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.top_level_status_text);
                                                                                                                                                                    if (appCompatTextView7 != null) {
                                                                                                                                                                        i = R.id.vs_divider;
                                                                                                                                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.vs_divider);
                                                                                                                                                                        if (imageView6 != null) {
                                                                                                                                                                            return new DialogChallengeResultBinding((ConstraintLayout) rootView, alphaPressButton, frameLayout, textView, linearLayout, textView2, roundedImageView, imageView, textView3, linearLayout2, appCompatTextView, appCompatTextView2, linearLayout3, imageView2, textView4, group, imageView3, appCompatTextView3, textView5, linearLayout4, appCompatTextView4, textView6, textView7, linearLayout5, linearLayout6, textView8, progressBar, roundedImageView2, frameLayout2, textView9, linearLayout7, appCompatTextView5, appCompatTextView6, linearLayout8, imageView4, textView10, imageView5, alphaPressButton2, textView11, linearLayout9, appCompatTextView7, imageView6);
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
