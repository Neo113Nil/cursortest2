package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemTipSingleMatchBinding implements ViewBinding {
    public final ImageView awayTeamIcon;
    public final TextView awayTeamName;
    public final Group bottomResults;
    public final TextView chances;
    public final TextView chancesLabel;
    public final TextView copy;
    public final TextView datetime;
    public final View divider;
    public final TextView hintLabel;
    public final TextView hintName;
    public final ImageView homeTeamIcon;
    public final TextView homeTeamName;
    public final TextView league;
    public final LinearLayout matchContainer;
    public final TextView result;
    public final ImageView resultIconBottom;
    public final ImageView resultIconTop;
    private final LinearLayout rootView;
    public final AppCompatTextView score;
    public final ImageView sportIcon;
    public final Group totalGroup;
    public final TextView totalOdds;
    public final TextView totalOddsLabel;

    private ItemTipSingleMatchBinding(LinearLayout rootView, ImageView awayTeamIcon, TextView awayTeamName, Group bottomResults, TextView chances, TextView chancesLabel, TextView copy, TextView datetime, View divider, TextView hintLabel, TextView hintName, ImageView homeTeamIcon, TextView homeTeamName, TextView league, LinearLayout matchContainer, TextView result, ImageView resultIconBottom, ImageView resultIconTop, AppCompatTextView score, ImageView sportIcon, Group totalGroup, TextView totalOdds, TextView totalOddsLabel) {
        this.rootView = rootView;
        this.awayTeamIcon = awayTeamIcon;
        this.awayTeamName = awayTeamName;
        this.bottomResults = bottomResults;
        this.chances = chances;
        this.chancesLabel = chancesLabel;
        this.copy = copy;
        this.datetime = datetime;
        this.divider = divider;
        this.hintLabel = hintLabel;
        this.hintName = hintName;
        this.homeTeamIcon = homeTeamIcon;
        this.homeTeamName = homeTeamName;
        this.league = league;
        this.matchContainer = matchContainer;
        this.result = result;
        this.resultIconBottom = resultIconBottom;
        this.resultIconTop = resultIconTop;
        this.score = score;
        this.sportIcon = sportIcon;
        this.totalGroup = totalGroup;
        this.totalOdds = totalOdds;
        this.totalOddsLabel = totalOddsLabel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemTipSingleMatchBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemTipSingleMatchBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_tip_single_match, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTipSingleMatchBinding bind(View rootView) {
        int i = R.id.awayTeamIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.awayTeamIcon);
        if (imageView != null) {
            i = R.id.awayTeamName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.awayTeamName);
            if (textView != null) {
                i = R.id.bottom_results;
                Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.bottom_results);
                if (group != null) {
                    i = R.id.chances;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.chances);
                    if (textView2 != null) {
                        i = R.id.chances_label;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.chances_label);
                        if (textView3 != null) {
                            i = R.id.copy;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.copy);
                            if (textView4 != null) {
                                i = R.id.datetime;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.datetime);
                                if (textView5 != null) {
                                    i = R.id.divider;
                                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                                    if (findChildViewById != null) {
                                        i = R.id.hint_label;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hint_label);
                                        if (textView6 != null) {
                                            i = R.id.hint_name;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hint_name);
                                            if (textView7 != null) {
                                                i = R.id.homeTeamIcon;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.homeTeamIcon);
                                                if (imageView2 != null) {
                                                    i = R.id.homeTeamName;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.homeTeamName);
                                                    if (textView8 != null) {
                                                        i = R.id.league;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.league);
                                                        if (textView9 != null) {
                                                            i = R.id.match_container;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.match_container);
                                                            if (linearLayout != null) {
                                                                i = R.id.result;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.result);
                                                                if (textView10 != null) {
                                                                    i = R.id.result_icon_bottom;
                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.result_icon_bottom);
                                                                    if (imageView3 != null) {
                                                                        i = R.id.result_icon_top;
                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.result_icon_top);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.score;
                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.score);
                                                                            if (appCompatTextView != null) {
                                                                                i = R.id.sportIcon;
                                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                                                                                if (imageView5 != null) {
                                                                                    i = R.id.total_group;
                                                                                    Group group2 = (Group) ViewBindings.findChildViewById(rootView, R.id.total_group);
                                                                                    if (group2 != null) {
                                                                                        i = R.id.total_odds;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.total_odds);
                                                                                        if (textView11 != null) {
                                                                                            i = R.id.total_odds_label;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.total_odds_label);
                                                                                            if (textView12 != null) {
                                                                                                return new ItemTipSingleMatchBinding((LinearLayout) rootView, imageView, textView, group, textView2, textView3, textView4, textView5, findChildViewById, textView6, textView7, imageView2, textView8, textView9, linearLayout, textView10, imageView3, imageView4, appCompatTextView, imageView5, group2, textView11, textView12);
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
