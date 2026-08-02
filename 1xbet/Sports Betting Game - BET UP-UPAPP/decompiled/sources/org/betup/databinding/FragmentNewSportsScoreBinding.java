package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentNewSportsScoreBinding implements ViewBinding {
    public final TextView arenaInfo;
    public final View bets;
    public final ConstraintLayout container;
    public final View fans;
    public final View hasBets;
    public final View hasComments;
    public final View history;
    public final TextView kickOff;
    public final TextView leagueName;
    public final LinearLayout linearLayout4;
    public final View notifications;
    public final ProgressBar progress;
    public final TextView raceStatus;
    private final ConstraintLayout rootView;
    public final LinearLayout scoreView;
    public final ImageView sportIcon;

    private FragmentNewSportsScoreBinding(ConstraintLayout rootView, TextView arenaInfo, View bets, ConstraintLayout container, View fans, View hasBets, View hasComments, View history, TextView kickOff, TextView leagueName, LinearLayout linearLayout4, View notifications, ProgressBar progress, TextView raceStatus, LinearLayout scoreView, ImageView sportIcon) {
        this.rootView = rootView;
        this.arenaInfo = arenaInfo;
        this.bets = bets;
        this.container = container;
        this.fans = fans;
        this.hasBets = hasBets;
        this.hasComments = hasComments;
        this.history = history;
        this.kickOff = kickOff;
        this.leagueName = leagueName;
        this.linearLayout4 = linearLayout4;
        this.notifications = notifications;
        this.progress = progress;
        this.raceStatus = raceStatus;
        this.scoreView = scoreView;
        this.sportIcon = sportIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNewSportsScoreBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentNewSportsScoreBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_new_sports_score, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentNewSportsScoreBinding bind(View rootView) {
        int i = R.id.arenaInfo;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.arenaInfo);
        if (textView != null) {
            i = R.id.bets;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bets);
            if (findChildViewById != null) {
                i = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (constraintLayout != null) {
                    i = R.id.fans;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.fans);
                    if (findChildViewById2 != null) {
                        i = R.id.hasBets;
                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.hasBets);
                        if (findChildViewById3 != null) {
                            i = R.id.hasComments;
                            View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.hasComments);
                            if (findChildViewById4 != null) {
                                i = R.id.history;
                                View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.history);
                                if (findChildViewById5 != null) {
                                    i = R.id.kickOff;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.kickOff);
                                    if (textView2 != null) {
                                        i = R.id.leagueName;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.leagueName);
                                        if (textView3 != null) {
                                            i = R.id.linearLayout4;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearLayout4);
                                            if (linearLayout != null) {
                                                i = R.id.notifications;
                                                View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.notifications);
                                                if (findChildViewById6 != null) {
                                                    i = R.id.progress;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                    if (progressBar != null) {
                                                        i = R.id.raceStatus;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.raceStatus);
                                                        if (textView4 != null) {
                                                            i = R.id.scoreView;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.scoreView);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.sportIcon;
                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                                                                if (imageView != null) {
                                                                    return new FragmentNewSportsScoreBinding((ConstraintLayout) rootView, textView, findChildViewById, constraintLayout, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, textView2, textView3, linearLayout, findChildViewById6, progressBar, textView4, linearLayout2, imageView);
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
