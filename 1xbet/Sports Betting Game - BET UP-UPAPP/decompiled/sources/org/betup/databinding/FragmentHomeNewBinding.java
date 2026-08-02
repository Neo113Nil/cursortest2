package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.controls.RoiView;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class FragmentHomeNewBinding implements ViewBinding {
    public final RoundedImageView avatar;
    public final AlphaPressButton challenges;
    public final AlphaPressButton competitions;
    public final AlphaPressButton dailyBonus;
    public final ImageView inPlayIcon;
    public final AlphaPressButton leaderboard;
    public final ImageView lostIcon;
    public final TextView lostLabel;
    public final AlphaPressButton miniGames;
    public final TextView missionActionTitle;
    public final ArcTextView missionLabel;
    public final AlphaPressButton missionOk;
    public final ImageView missionsHeader;
    public final AlphaPressButton notifications;
    public final ImageView offerIcon;
    public final TextView offersAmount;
    public final AlphaPressButton oneTimeOffer;
    public final TextView pendingLabel;
    public final ImageView rankIcon;
    public final TextView rankLabel;
    public final RoiView roi;
    private final ConstraintLayout rootView;
    public final ConstraintLayout stats;
    public final ProgressBar taskProgress;
    public final ConstraintLayout tasks;
    public final RecyclerView tasksList;
    public final AlphaPressButton tvbet;
    public final TextView username;
    public final ImageView videoIcon;
    public final AlphaPressButton videoOffer;
    public final TextView videoRewardAmount;
    public final ImageView wonIcon;
    public final TextView wonLabel;

    private FragmentHomeNewBinding(ConstraintLayout rootView, RoundedImageView avatar, AlphaPressButton challenges, AlphaPressButton competitions, AlphaPressButton dailyBonus, ImageView inPlayIcon, AlphaPressButton leaderboard, ImageView lostIcon, TextView lostLabel, AlphaPressButton miniGames, TextView missionActionTitle, ArcTextView missionLabel, AlphaPressButton missionOk, ImageView missionsHeader, AlphaPressButton notifications, ImageView offerIcon, TextView offersAmount, AlphaPressButton oneTimeOffer, TextView pendingLabel, ImageView rankIcon, TextView rankLabel, RoiView roi, ConstraintLayout stats, ProgressBar taskProgress, ConstraintLayout tasks, RecyclerView tasksList, AlphaPressButton tvbet, TextView username, ImageView videoIcon, AlphaPressButton videoOffer, TextView videoRewardAmount, ImageView wonIcon, TextView wonLabel) {
        this.rootView = rootView;
        this.avatar = avatar;
        this.challenges = challenges;
        this.competitions = competitions;
        this.dailyBonus = dailyBonus;
        this.inPlayIcon = inPlayIcon;
        this.leaderboard = leaderboard;
        this.lostIcon = lostIcon;
        this.lostLabel = lostLabel;
        this.miniGames = miniGames;
        this.missionActionTitle = missionActionTitle;
        this.missionLabel = missionLabel;
        this.missionOk = missionOk;
        this.missionsHeader = missionsHeader;
        this.notifications = notifications;
        this.offerIcon = offerIcon;
        this.offersAmount = offersAmount;
        this.oneTimeOffer = oneTimeOffer;
        this.pendingLabel = pendingLabel;
        this.rankIcon = rankIcon;
        this.rankLabel = rankLabel;
        this.roi = roi;
        this.stats = stats;
        this.taskProgress = taskProgress;
        this.tasks = tasks;
        this.tasksList = tasksList;
        this.tvbet = tvbet;
        this.username = username;
        this.videoIcon = videoIcon;
        this.videoOffer = videoOffer;
        this.videoRewardAmount = videoRewardAmount;
        this.wonIcon = wonIcon;
        this.wonLabel = wonLabel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHomeNewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentHomeNewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_home_new, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentHomeNewBinding bind(View rootView) {
        int i = R.id.avatar;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatar);
        if (roundedImageView != null) {
            i = R.id.challenges;
            AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.challenges);
            if (alphaPressButton != null) {
                i = R.id.competitions;
                AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.competitions);
                if (alphaPressButton2 != null) {
                    i = R.id.daily_bonus;
                    AlphaPressButton alphaPressButton3 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.daily_bonus);
                    if (alphaPressButton3 != null) {
                        i = R.id.in_play_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.in_play_icon);
                        if (imageView != null) {
                            i = R.id.leaderboard;
                            AlphaPressButton alphaPressButton4 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.leaderboard);
                            if (alphaPressButton4 != null) {
                                i = R.id.lost_icon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lost_icon);
                                if (imageView2 != null) {
                                    i = R.id.lost_label;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.lost_label);
                                    if (textView != null) {
                                        i = R.id.mini_games;
                                        AlphaPressButton alphaPressButton5 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.mini_games);
                                        if (alphaPressButton5 != null) {
                                            i = R.id.missionActionTitle;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.missionActionTitle);
                                            if (textView2 != null) {
                                                i = R.id.missionLabel;
                                                ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.missionLabel);
                                                if (arcTextView != null) {
                                                    i = R.id.mission_ok;
                                                    AlphaPressButton alphaPressButton6 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.mission_ok);
                                                    if (alphaPressButton6 != null) {
                                                        i = R.id.missionsHeader;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.missionsHeader);
                                                        if (imageView3 != null) {
                                                            i = R.id.notifications;
                                                            AlphaPressButton alphaPressButton7 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.notifications);
                                                            if (alphaPressButton7 != null) {
                                                                i = R.id.offerIcon;
                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.offerIcon);
                                                                if (imageView4 != null) {
                                                                    i = R.id.offersAmount;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.offersAmount);
                                                                    if (textView3 != null) {
                                                                        i = R.id.one_time_offer;
                                                                        AlphaPressButton alphaPressButton8 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.one_time_offer);
                                                                        if (alphaPressButton8 != null) {
                                                                            i = R.id.pending_label;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pending_label);
                                                                            if (textView4 != null) {
                                                                                i = R.id.rank_icon;
                                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.rank_icon);
                                                                                if (imageView5 != null) {
                                                                                    i = R.id.rank_label;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rank_label);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.roi;
                                                                                        RoiView roiView = (RoiView) ViewBindings.findChildViewById(rootView, R.id.roi);
                                                                                        if (roiView != null) {
                                                                                            i = R.id.stats;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.stats);
                                                                                            if (constraintLayout != null) {
                                                                                                i = R.id.taskProgress;
                                                                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.taskProgress);
                                                                                                if (progressBar != null) {
                                                                                                    i = R.id.tasks;
                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tasks);
                                                                                                    if (constraintLayout2 != null) {
                                                                                                        i = R.id.tasksList;
                                                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.tasksList);
                                                                                                        if (recyclerView != null) {
                                                                                                            i = R.id.tvbet;
                                                                                                            AlphaPressButton alphaPressButton9 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.tvbet);
                                                                                                            if (alphaPressButton9 != null) {
                                                                                                                i = R.id.username;
                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.username);
                                                                                                                if (textView6 != null) {
                                                                                                                    i = R.id.videoIcon;
                                                                                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.videoIcon);
                                                                                                                    if (imageView6 != null) {
                                                                                                                        i = R.id.video_offer;
                                                                                                                        AlphaPressButton alphaPressButton10 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.video_offer);
                                                                                                                        if (alphaPressButton10 != null) {
                                                                                                                            i = R.id.videoRewardAmount;
                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.videoRewardAmount);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i = R.id.won_icon;
                                                                                                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.won_icon);
                                                                                                                                if (imageView7 != null) {
                                                                                                                                    i = R.id.won_label;
                                                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.won_label);
                                                                                                                                    if (textView8 != null) {
                                                                                                                                        return new FragmentHomeNewBinding((ConstraintLayout) rootView, roundedImageView, alphaPressButton, alphaPressButton2, alphaPressButton3, imageView, alphaPressButton4, imageView2, textView, alphaPressButton5, textView2, arcTextView, alphaPressButton6, imageView3, alphaPressButton7, imageView4, textView3, alphaPressButton8, textView4, imageView5, textView5, roiView, constraintLayout, progressBar, constraintLayout2, recyclerView, alphaPressButton9, textView6, imageView6, alphaPressButton10, textView7, imageView7, textView8);
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
