package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import org.betup.R;

/* loaded from: classes2.dex */
public final class UserTabStatsBinding implements ViewBinding {
    public final TextView averageBet;
    public final TextView averageOdd;
    public final LineChart balanceChart;
    public final PieChart betChart;
    public final TextView biggestLost;
    public final TextView highscore;
    public final HorizontalBarChart maxChart;
    public final AppCompatRadioButton oneMonth;
    public final AppCompatRadioButton oneYear;
    private final LinearLayout rootView;
    public final TextView totalLost;
    public final TextView totalWon;

    private UserTabStatsBinding(LinearLayout rootView, TextView averageBet, TextView averageOdd, LineChart balanceChart, PieChart betChart, TextView biggestLost, TextView highscore, HorizontalBarChart maxChart, AppCompatRadioButton oneMonth, AppCompatRadioButton oneYear, TextView totalLost, TextView totalWon) {
        this.rootView = rootView;
        this.averageBet = averageBet;
        this.averageOdd = averageOdd;
        this.balanceChart = balanceChart;
        this.betChart = betChart;
        this.biggestLost = biggestLost;
        this.highscore = highscore;
        this.maxChart = maxChart;
        this.oneMonth = oneMonth;
        this.oneYear = oneYear;
        this.totalLost = totalLost;
        this.totalWon = totalWon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static UserTabStatsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static UserTabStatsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.user_tab_stats, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static UserTabStatsBinding bind(View rootView) {
        int i = R.id.average_bet;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.average_bet);
        if (textView != null) {
            i = R.id.average_odd;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.average_odd);
            if (textView2 != null) {
                i = R.id.balanceChart;
                LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.balanceChart);
                if (lineChart != null) {
                    i = R.id.betChart;
                    PieChart pieChart = (PieChart) ViewBindings.findChildViewById(rootView, R.id.betChart);
                    if (pieChart != null) {
                        i = R.id.biggest_lost;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.biggest_lost);
                        if (textView3 != null) {
                            i = R.id.highscore;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.highscore);
                            if (textView4 != null) {
                                i = R.id.maxChart;
                                HorizontalBarChart horizontalBarChart = (HorizontalBarChart) ViewBindings.findChildViewById(rootView, R.id.maxChart);
                                if (horizontalBarChart != null) {
                                    i = R.id.one_month;
                                    AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(rootView, R.id.one_month);
                                    if (appCompatRadioButton != null) {
                                        i = R.id.one_year;
                                        AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(rootView, R.id.one_year);
                                        if (appCompatRadioButton2 != null) {
                                            i = R.id.total_lost;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.total_lost);
                                            if (textView5 != null) {
                                                i = R.id.total_won;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.total_won);
                                                if (textView6 != null) {
                                                    return new UserTabStatsBinding((LinearLayout) rootView, textView, textView2, lineChart, pieChart, textView3, textView4, horizontalBarChart, appCompatRadioButton, appCompatRadioButton2, textView5, textView6);
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
