package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentH2hTabBinding implements ViewBinding {
    public final LinearLayout awayStats;
    public final LinearLayout homeStats;
    public final RecyclerView list;
    public final ProgressBar progressAway;
    public final TextView progressAwayTitle;
    public final ProgressBar progressDraw;
    public final TextView progressDrawTitle;
    public final ProgressBar progressHome;
    public final TextView progressHomeTitle;
    private final ConstraintLayout rootView;
    public final TextView title;

    private FragmentH2hTabBinding(ConstraintLayout rootView, LinearLayout awayStats, LinearLayout homeStats, RecyclerView list, ProgressBar progressAway, TextView progressAwayTitle, ProgressBar progressDraw, TextView progressDrawTitle, ProgressBar progressHome, TextView progressHomeTitle, TextView title) {
        this.rootView = rootView;
        this.awayStats = awayStats;
        this.homeStats = homeStats;
        this.list = list;
        this.progressAway = progressAway;
        this.progressAwayTitle = progressAwayTitle;
        this.progressDraw = progressDraw;
        this.progressDrawTitle = progressDrawTitle;
        this.progressHome = progressHome;
        this.progressHomeTitle = progressHomeTitle;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentH2hTabBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentH2hTabBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_h2h_tab, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentH2hTabBinding bind(View rootView) {
        int i = R.id.awayStats;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.awayStats);
        if (linearLayout != null) {
            i = R.id.homeStats;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.homeStats);
            if (linearLayout2 != null) {
                i = R.id.list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
                if (recyclerView != null) {
                    i = R.id.progressAway;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressAway);
                    if (progressBar != null) {
                        i = R.id.progressAwayTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.progressAwayTitle);
                        if (textView != null) {
                            i = R.id.progressDraw;
                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressDraw);
                            if (progressBar2 != null) {
                                i = R.id.progressDrawTitle;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.progressDrawTitle);
                                if (textView2 != null) {
                                    i = R.id.progressHome;
                                    ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressHome);
                                    if (progressBar3 != null) {
                                        i = R.id.progressHomeTitle;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.progressHomeTitle);
                                        if (textView3 != null) {
                                            i = R.id.title;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                            if (textView4 != null) {
                                                return new FragmentH2hTabBinding((ConstraintLayout) rootView, linearLayout, linearLayout2, recyclerView, progressBar, textView, progressBar2, textView2, progressBar3, textView3, textView4);
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
