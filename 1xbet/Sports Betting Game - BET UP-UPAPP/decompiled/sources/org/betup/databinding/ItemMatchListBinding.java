package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemMatchListBinding implements ViewBinding {
    public final RelativeLayout bets;
    public final RecyclerView betsList;
    public final LinearLayout container;
    public final TextView firstTeamName;
    public final FlexboxLayout header;
    public final ImageView label;
    public final ImageView likeIcon;
    public final LinearLayout matchContainer;
    public final TextView matchDate;
    public final TextView matchTime;
    public final TextView periodScoresTv;
    private final RelativeLayout rootView;
    public final TextView scoreAwayTv;
    public final TextView scoreHomeTv;
    public final ImageView secondTeamIcon;
    public final TextView secondTeamName;

    private ItemMatchListBinding(RelativeLayout rootView, RelativeLayout bets, RecyclerView betsList, LinearLayout container, TextView firstTeamName, FlexboxLayout header, ImageView label, ImageView likeIcon, LinearLayout matchContainer, TextView matchDate, TextView matchTime, TextView periodScoresTv, TextView scoreAwayTv, TextView scoreHomeTv, ImageView secondTeamIcon, TextView secondTeamName) {
        this.rootView = rootView;
        this.bets = bets;
        this.betsList = betsList;
        this.container = container;
        this.firstTeamName = firstTeamName;
        this.header = header;
        this.label = label;
        this.likeIcon = likeIcon;
        this.matchContainer = matchContainer;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.periodScoresTv = periodScoresTv;
        this.scoreAwayTv = scoreAwayTv;
        this.scoreHomeTv = scoreHomeTv;
        this.secondTeamIcon = secondTeamIcon;
        this.secondTeamName = secondTeamName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemMatchListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMatchListBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_match_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMatchListBinding bind(View rootView) {
        int i = R.id.bets;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.bets);
        if (relativeLayout != null) {
            i = R.id.betsList;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.betsList);
            if (recyclerView != null) {
                i = R.id.container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (linearLayout != null) {
                    i = R.id.firstTeamName;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstTeamName);
                    if (textView != null) {
                        i = R.id.header;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                        if (flexboxLayout != null) {
                            i = R.id.label;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.label);
                            if (imageView != null) {
                                i = R.id.likeIcon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.likeIcon);
                                if (imageView2 != null) {
                                    i = R.id.match_container;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.match_container);
                                    if (linearLayout2 != null) {
                                        i = R.id.matchDate;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchDate);
                                        if (textView2 != null) {
                                            i = R.id.matchTime;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchTime);
                                            if (textView3 != null) {
                                                i = R.id.period_scores_tv;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.period_scores_tv);
                                                if (textView4 != null) {
                                                    i = R.id.score_away_tv;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.score_away_tv);
                                                    if (textView5 != null) {
                                                        i = R.id.score_home_tv;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.score_home_tv);
                                                        if (textView6 != null) {
                                                            i = R.id.secondTeamIcon;
                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondTeamIcon);
                                                            if (imageView3 != null) {
                                                                i = R.id.secondTeamName;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondTeamName);
                                                                if (textView7 != null) {
                                                                    return new ItemMatchListBinding((RelativeLayout) rootView, relativeLayout, recyclerView, linearLayout, textView, flexboxLayout, imageView, imageView2, linearLayout2, textView2, textView3, textView4, textView5, textView6, imageView3, textView7);
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
