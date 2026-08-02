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
public final class ItemTopMatchBinding implements ViewBinding {
    public final RelativeLayout bets;
    public final RecyclerView betsList;
    public final LinearLayout container;
    public final TextView firstTeamName;
    public final FlexboxLayout header;
    public final ImageView label;
    public final ImageView leagueIcon;
    public final TextView leagueName;
    public final ImageView likeIcon;
    public final LinearLayout matchContainer;
    public final TextView matchDate;
    public final TextView matchTime;
    private final LinearLayout rootView;
    public final TextView scoreAwayTv;
    public final TextView scoreHomeTv;
    public final ImageView secondTeamIcon;
    public final TextView secondTeamName;
    public final ImageView sportIcon;
    public final LinearLayout sportLeagueHeader;
    public final TextView sportName;

    private ItemTopMatchBinding(LinearLayout rootView, RelativeLayout bets, RecyclerView betsList, LinearLayout container, TextView firstTeamName, FlexboxLayout header, ImageView label, ImageView leagueIcon, TextView leagueName, ImageView likeIcon, LinearLayout matchContainer, TextView matchDate, TextView matchTime, TextView scoreAwayTv, TextView scoreHomeTv, ImageView secondTeamIcon, TextView secondTeamName, ImageView sportIcon, LinearLayout sportLeagueHeader, TextView sportName) {
        this.rootView = rootView;
        this.bets = bets;
        this.betsList = betsList;
        this.container = container;
        this.firstTeamName = firstTeamName;
        this.header = header;
        this.label = label;
        this.leagueIcon = leagueIcon;
        this.leagueName = leagueName;
        this.likeIcon = likeIcon;
        this.matchContainer = matchContainer;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.scoreAwayTv = scoreAwayTv;
        this.scoreHomeTv = scoreHomeTv;
        this.secondTeamIcon = secondTeamIcon;
        this.secondTeamName = secondTeamName;
        this.sportIcon = sportIcon;
        this.sportLeagueHeader = sportLeagueHeader;
        this.sportName = sportName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemTopMatchBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemTopMatchBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_top_match, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTopMatchBinding bind(View rootView) {
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
                                i = R.id.leagueIcon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.leagueIcon);
                                if (imageView2 != null) {
                                    i = R.id.leagueName;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.leagueName);
                                    if (textView2 != null) {
                                        i = R.id.likeIcon;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.likeIcon);
                                        if (imageView3 != null) {
                                            i = R.id.match_container;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.match_container);
                                            if (linearLayout2 != null) {
                                                i = R.id.matchDate;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchDate);
                                                if (textView3 != null) {
                                                    i = R.id.matchTime;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchTime);
                                                    if (textView4 != null) {
                                                        i = R.id.score_away_tv;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.score_away_tv);
                                                        if (textView5 != null) {
                                                            i = R.id.score_home_tv;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.score_home_tv);
                                                            if (textView6 != null) {
                                                                i = R.id.secondTeamIcon;
                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondTeamIcon);
                                                                if (imageView4 != null) {
                                                                    i = R.id.secondTeamName;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondTeamName);
                                                                    if (textView7 != null) {
                                                                        i = R.id.sportIcon;
                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                                                                        if (imageView5 != null) {
                                                                            i = R.id.sportLeagueHeader;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportLeagueHeader);
                                                                            if (linearLayout3 != null) {
                                                                                i = R.id.sportName;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sportName);
                                                                                if (textView8 != null) {
                                                                                    return new ItemTopMatchBinding((LinearLayout) rootView, relativeLayout, recyclerView, linearLayout, textView, flexboxLayout, imageView, imageView2, textView2, imageView3, linearLayout2, textView3, textView4, textView5, textView6, imageView4, textView7, imageView5, linearLayout3, textView8);
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
