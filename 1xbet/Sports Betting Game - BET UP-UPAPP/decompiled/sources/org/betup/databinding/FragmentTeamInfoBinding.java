package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentTeamInfoBinding implements ViewBinding {
    public final RelativeLayout container;
    public final ImageView fav;
    public final RelativeLayout header;
    public final ImageView icon;
    public final TextView labelFavLeagues;
    public final TextView labelFavTeams;
    public final LinearLayout lastMatches;
    public final LinearLayout nextMatches;
    public final ProgressBar progress;
    private final RelativeLayout rootView;
    public final LinearLayout stats;
    public final TextView teamName;

    private FragmentTeamInfoBinding(RelativeLayout rootView, RelativeLayout container, ImageView fav, RelativeLayout header, ImageView icon, TextView labelFavLeagues, TextView labelFavTeams, LinearLayout lastMatches, LinearLayout nextMatches, ProgressBar progress, LinearLayout stats, TextView teamName) {
        this.rootView = rootView;
        this.container = container;
        this.fav = fav;
        this.header = header;
        this.icon = icon;
        this.labelFavLeagues = labelFavLeagues;
        this.labelFavTeams = labelFavTeams;
        this.lastMatches = lastMatches;
        this.nextMatches = nextMatches;
        this.progress = progress;
        this.stats = stats;
        this.teamName = teamName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTeamInfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentTeamInfoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_team_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTeamInfoBinding bind(View rootView) {
        int i = R.id.container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (relativeLayout != null) {
            i = R.id.fav;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fav);
            if (imageView != null) {
                i = R.id.header;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                if (relativeLayout2 != null) {
                    i = R.id.icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                    if (imageView2 != null) {
                        i = R.id.labelFavLeagues;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelFavLeagues);
                        if (textView != null) {
                            i = R.id.labelFavTeams;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelFavTeams);
                            if (textView2 != null) {
                                i = R.id.lastMatches;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lastMatches);
                                if (linearLayout != null) {
                                    i = R.id.nextMatches;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.nextMatches);
                                    if (linearLayout2 != null) {
                                        i = R.id.progress;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                        if (progressBar != null) {
                                            i = R.id.stats;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stats);
                                            if (linearLayout3 != null) {
                                                i = R.id.teamName;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.teamName);
                                                if (textView3 != null) {
                                                    return new FragmentTeamInfoBinding((RelativeLayout) rootView, relativeLayout, imageView, relativeLayout2, imageView2, textView, textView2, linearLayout, linearLayout2, progressBar, linearLayout3, textView3);
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
