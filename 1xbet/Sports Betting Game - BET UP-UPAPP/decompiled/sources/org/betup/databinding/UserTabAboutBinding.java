package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.fragment.home.views.MyNestedScrollView;

/* loaded from: classes2.dex */
public final class UserTabAboutBinding implements ViewBinding {
    public final RecyclerView achievements;
    public final TextView codeInfo;
    public final RelativeLayout container;
    public final ImageView facebookShare;
    public final LinearLayout favSports;
    public final ImageView firebaseShare;
    public final ImageView imageView23;
    public final ImageView imageView25;
    public final ImageView imageView26;
    public final ImageView imageView27;
    public final ImageView imageView5;
    public final TextView inPlay;
    public final TextView inviteLabel;
    public final TextView labelAchievements;
    public final TextView labelFavLeagues;
    public final TextView labelFavSports;
    public final TextView labelFavTeams;
    public final TextView labelStats;
    public final LinearLayout lastMatches;
    public final TextView lost;
    public final LinearLayout nextMatches;
    public final ConstraintLayout profileContainer;
    public final ProgressBar progress;
    public final TextView rank;
    public final TextView referrals;
    private final MyNestedScrollView rootView;
    public final LinearLayout share;
    public final ImageView vkShare;
    public final TextView won;

    private UserTabAboutBinding(MyNestedScrollView rootView, RecyclerView achievements, TextView codeInfo, RelativeLayout container, ImageView facebookShare, LinearLayout favSports, ImageView firebaseShare, ImageView imageView23, ImageView imageView25, ImageView imageView26, ImageView imageView27, ImageView imageView5, TextView inPlay, TextView inviteLabel, TextView labelAchievements, TextView labelFavLeagues, TextView labelFavSports, TextView labelFavTeams, TextView labelStats, LinearLayout lastMatches, TextView lost, LinearLayout nextMatches, ConstraintLayout profileContainer, ProgressBar progress, TextView rank, TextView referrals, LinearLayout share, ImageView vkShare, TextView won) {
        this.rootView = rootView;
        this.achievements = achievements;
        this.codeInfo = codeInfo;
        this.container = container;
        this.facebookShare = facebookShare;
        this.favSports = favSports;
        this.firebaseShare = firebaseShare;
        this.imageView23 = imageView23;
        this.imageView25 = imageView25;
        this.imageView26 = imageView26;
        this.imageView27 = imageView27;
        this.imageView5 = imageView5;
        this.inPlay = inPlay;
        this.inviteLabel = inviteLabel;
        this.labelAchievements = labelAchievements;
        this.labelFavLeagues = labelFavLeagues;
        this.labelFavSports = labelFavSports;
        this.labelFavTeams = labelFavTeams;
        this.labelStats = labelStats;
        this.lastMatches = lastMatches;
        this.lost = lost;
        this.nextMatches = nextMatches;
        this.profileContainer = profileContainer;
        this.progress = progress;
        this.rank = rank;
        this.referrals = referrals;
        this.share = share;
        this.vkShare = vkShare;
        this.won = won;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MyNestedScrollView getRoot() {
        return this.rootView;
    }

    public static UserTabAboutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static UserTabAboutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.user_tab_about, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static UserTabAboutBinding bind(View rootView) {
        int i = R.id.achievements;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.achievements);
        if (recyclerView != null) {
            i = R.id.codeInfo;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.codeInfo);
            if (textView != null) {
                i = R.id.container;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (relativeLayout != null) {
                    i = R.id.facebookShare;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.facebookShare);
                    if (imageView != null) {
                        i = R.id.favSports;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.favSports);
                        if (linearLayout != null) {
                            i = R.id.firebaseShare;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.firebaseShare);
                            if (imageView2 != null) {
                                i = R.id.imageView23;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView23);
                                if (imageView3 != null) {
                                    i = R.id.imageView25;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView25);
                                    if (imageView4 != null) {
                                        i = R.id.imageView26;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView26);
                                        if (imageView5 != null) {
                                            i = R.id.imageView27;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView27);
                                            if (imageView6 != null) {
                                                i = R.id.imageView5;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView5);
                                                if (imageView7 != null) {
                                                    i = R.id.inPlay;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inPlay);
                                                    if (textView2 != null) {
                                                        i = R.id.inviteLabel;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inviteLabel);
                                                        if (textView3 != null) {
                                                            i = R.id.labelAchievements;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelAchievements);
                                                            if (textView4 != null) {
                                                                i = R.id.labelFavLeagues;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelFavLeagues);
                                                                if (textView5 != null) {
                                                                    i = R.id.labelFavSports;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelFavSports);
                                                                    if (textView6 != null) {
                                                                        i = R.id.labelFavTeams;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelFavTeams);
                                                                        if (textView7 != null) {
                                                                            i = R.id.labelStats;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelStats);
                                                                            if (textView8 != null) {
                                                                                i = R.id.lastMatches;
                                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lastMatches);
                                                                                if (linearLayout2 != null) {
                                                                                    i = R.id.lost;
                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.lost);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.nextMatches;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.nextMatches);
                                                                                        if (linearLayout3 != null) {
                                                                                            i = R.id.profileContainer;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.profileContainer);
                                                                                            if (constraintLayout != null) {
                                                                                                i = R.id.progress;
                                                                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                                                                if (progressBar != null) {
                                                                                                    i = R.id.rank;
                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rank);
                                                                                                    if (textView10 != null) {
                                                                                                        i = R.id.referrals;
                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.referrals);
                                                                                                        if (textView11 != null) {
                                                                                                            i = R.id.share;
                                                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share);
                                                                                                            if (linearLayout4 != null) {
                                                                                                                i = R.id.vkShare;
                                                                                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.vkShare);
                                                                                                                if (imageView8 != null) {
                                                                                                                    i = R.id.won;
                                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.won);
                                                                                                                    if (textView12 != null) {
                                                                                                                        return new UserTabAboutBinding((MyNestedScrollView) rootView, recyclerView, textView, relativeLayout, imageView, linearLayout, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, textView2, textView3, textView4, textView5, textView6, textView7, textView8, linearLayout2, textView9, linearLayout3, constraintLayout, progressBar, textView10, textView11, linearLayout4, imageView8, textView12);
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
