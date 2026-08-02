package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentChallengeStatsBinding implements ViewBinding {
    public final RoundedImageView avatarIcon;
    public final RecyclerView list;
    public final LinearLayout lostContainer;
    public final TextView noChallenges;
    public final ProgressBar progress;
    public final RelativeLayout progressBar;
    public final LinearLayout ratingContainer;
    private final ConstraintLayout rootView;
    public final ConstraintLayout statsTopPanel;
    public final SwipeRefreshLayout swipeRefreshLayout;
    public final TextView totalLost;
    public final TextView totalRating;
    public final TextView totalWon;
    public final LinearLayout wonContainer;

    private FragmentChallengeStatsBinding(ConstraintLayout rootView, RoundedImageView avatarIcon, RecyclerView list, LinearLayout lostContainer, TextView noChallenges, ProgressBar progress, RelativeLayout progressBar, LinearLayout ratingContainer, ConstraintLayout statsTopPanel, SwipeRefreshLayout swipeRefreshLayout, TextView totalLost, TextView totalRating, TextView totalWon, LinearLayout wonContainer) {
        this.rootView = rootView;
        this.avatarIcon = avatarIcon;
        this.list = list;
        this.lostContainer = lostContainer;
        this.noChallenges = noChallenges;
        this.progress = progress;
        this.progressBar = progressBar;
        this.ratingContainer = ratingContainer;
        this.statsTopPanel = statsTopPanel;
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.totalLost = totalLost;
        this.totalRating = totalRating;
        this.totalWon = totalWon;
        this.wonContainer = wonContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChallengeStatsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentChallengeStatsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_challenge_stats, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentChallengeStatsBinding bind(View rootView) {
        int i = R.id.avatarIcon;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatarIcon);
        if (roundedImageView != null) {
            i = R.id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
            if (recyclerView != null) {
                i = R.id.lost_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lost_container);
                if (linearLayout != null) {
                    i = R.id.no_challenges;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_challenges);
                    if (textView != null) {
                        i = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                        if (progressBar != null) {
                            i = R.id.progressBar;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                            if (relativeLayout != null) {
                                i = R.id.rating_container;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.rating_container);
                                if (linearLayout2 != null) {
                                    i = R.id.stats_top_panel;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.stats_top_panel);
                                    if (constraintLayout != null) {
                                        i = R.id.swipeRefreshLayout;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                                        if (swipeRefreshLayout != null) {
                                            i = R.id.totalLost;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.totalLost);
                                            if (textView2 != null) {
                                                i = R.id.totalRating;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.totalRating);
                                                if (textView3 != null) {
                                                    i = R.id.totalWon;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.totalWon);
                                                    if (textView4 != null) {
                                                        i = R.id.won_container;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.won_container);
                                                        if (linearLayout3 != null) {
                                                            return new FragmentChallengeStatsBinding((ConstraintLayout) rootView, roundedImageView, recyclerView, linearLayout, textView, progressBar, relativeLayout, linearLayout2, constraintLayout, swipeRefreshLayout, textView2, textView3, textView4, linearLayout3);
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
