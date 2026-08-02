package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemFavTeamsMatchesBinding implements ViewBinding {
    public final TextView firstTeamName;
    public final LinearLayout header;
    public final ImageView likeIcon;
    public final TextView matchDate;
    public final TextView matchTime;
    private final RelativeLayout rootView;
    public final ImageView secondTeamIcon;
    public final TextView secondTeamName;

    private ItemFavTeamsMatchesBinding(RelativeLayout rootView, TextView firstTeamName, LinearLayout header, ImageView likeIcon, TextView matchDate, TextView matchTime, ImageView secondTeamIcon, TextView secondTeamName) {
        this.rootView = rootView;
        this.firstTeamName = firstTeamName;
        this.header = header;
        this.likeIcon = likeIcon;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.secondTeamIcon = secondTeamIcon;
        this.secondTeamName = secondTeamName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemFavTeamsMatchesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemFavTeamsMatchesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_fav_teams_matches, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFavTeamsMatchesBinding bind(View rootView) {
        int i = R.id.firstTeamName;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstTeamName);
        if (textView != null) {
            i = R.id.header;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
            if (linearLayout != null) {
                i = R.id.likeIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.likeIcon);
                if (imageView != null) {
                    i = R.id.matchDate;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchDate);
                    if (textView2 != null) {
                        i = R.id.matchTime;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchTime);
                        if (textView3 != null) {
                            i = R.id.secondTeamIcon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondTeamIcon);
                            if (imageView2 != null) {
                                i = R.id.secondTeamName;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondTeamName);
                                if (textView4 != null) {
                                    return new ItemFavTeamsMatchesBinding((RelativeLayout) rootView, textView, linearLayout, imageView, textView2, textView3, imageView2, textView4);
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
