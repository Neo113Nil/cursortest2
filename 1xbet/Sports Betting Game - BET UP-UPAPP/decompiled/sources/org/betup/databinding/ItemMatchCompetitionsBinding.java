package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemMatchCompetitionsBinding implements ViewBinding {
    public final ImageView awayTeamIcon;
    public final TextView awayTeamName;
    public final TextView betType;
    public final TextView betTypeName;
    public final TextView coefContainer;
    public final ConstraintLayout competitionItemMatch;
    public final LinearLayout containerDateTime;
    public final TextView date;
    public final ImageView homeTeamIcon;
    public final TextView homeTeamName;
    private final ConstraintLayout rootView;
    public final ImageView statusIcon;
    public final TextView time;
    public final LinearLayout titleContainer;
    public final TextView titleSport;
    public final ImageView titleSportIcon;
    public final ConstraintLayout topContainer;

    private ItemMatchCompetitionsBinding(ConstraintLayout rootView, ImageView awayTeamIcon, TextView awayTeamName, TextView betType, TextView betTypeName, TextView coefContainer, ConstraintLayout competitionItemMatch, LinearLayout containerDateTime, TextView date, ImageView homeTeamIcon, TextView homeTeamName, ImageView statusIcon, TextView time, LinearLayout titleContainer, TextView titleSport, ImageView titleSportIcon, ConstraintLayout topContainer) {
        this.rootView = rootView;
        this.awayTeamIcon = awayTeamIcon;
        this.awayTeamName = awayTeamName;
        this.betType = betType;
        this.betTypeName = betTypeName;
        this.coefContainer = coefContainer;
        this.competitionItemMatch = competitionItemMatch;
        this.containerDateTime = containerDateTime;
        this.date = date;
        this.homeTeamIcon = homeTeamIcon;
        this.homeTeamName = homeTeamName;
        this.statusIcon = statusIcon;
        this.time = time;
        this.titleContainer = titleContainer;
        this.titleSport = titleSport;
        this.titleSportIcon = titleSportIcon;
        this.topContainer = topContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemMatchCompetitionsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMatchCompetitionsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_match_competitions, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMatchCompetitionsBinding bind(View rootView) {
        int i = R.id.away_team_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.away_team_icon);
        if (imageView != null) {
            i = R.id.away_team_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.away_team_name);
            if (textView != null) {
                i = R.id.bet_type;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_type);
                if (textView2 != null) {
                    i = R.id.bet_type_name;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_type_name);
                    if (textView3 != null) {
                        i = R.id.coef_container;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.coef_container);
                        if (textView4 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                            i = R.id.container_date_time;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container_date_time);
                            if (linearLayout != null) {
                                i = R.id.date;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                                if (textView5 != null) {
                                    i = R.id.home_team_icon;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.home_team_icon);
                                    if (imageView2 != null) {
                                        i = R.id.home_team_name;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.home_team_name);
                                        if (textView6 != null) {
                                            i = R.id.status_icon;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.status_icon);
                                            if (imageView3 != null) {
                                                i = R.id.time;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                if (textView7 != null) {
                                                    i = R.id.title_container;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.title_container);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.title_sport;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_sport);
                                                        if (textView8 != null) {
                                                            i = R.id.title_sport_icon;
                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.title_sport_icon);
                                                            if (imageView4 != null) {
                                                                i = R.id.top_container;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.top_container);
                                                                if (constraintLayout2 != null) {
                                                                    return new ItemMatchCompetitionsBinding(constraintLayout, imageView, textView, textView2, textView3, textView4, constraintLayout, linearLayout, textView5, imageView2, textView6, imageView3, textView7, linearLayout2, textView8, imageView4, constraintLayout2);
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
