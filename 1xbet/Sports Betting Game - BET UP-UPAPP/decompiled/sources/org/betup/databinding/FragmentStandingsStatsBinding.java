package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentStandingsStatsBinding implements ViewBinding {
    public final RecyclerView list;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final TextView teamLabel;
    public final TextView textView20;
    public final TextView textView21;
    public final TextView textView22;
    public final TextView textView23;
    public final TextView textView24;
    public final TextView textView25;

    private FragmentStandingsStatsBinding(ConstraintLayout rootView, RecyclerView list, ProgressBar progress, TextView teamLabel, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25) {
        this.rootView = rootView;
        this.list = list;
        this.progress = progress;
        this.teamLabel = teamLabel;
        this.textView20 = textView20;
        this.textView21 = textView21;
        this.textView22 = textView22;
        this.textView23 = textView23;
        this.textView24 = textView24;
        this.textView25 = textView25;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentStandingsStatsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentStandingsStatsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_standings_stats, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentStandingsStatsBinding bind(View rootView) {
        int i = R.id.list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
        if (recyclerView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                i = R.id.teamLabel;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.teamLabel);
                if (textView != null) {
                    i = R.id.textView20;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView20);
                    if (textView2 != null) {
                        i = R.id.textView21;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView21);
                        if (textView3 != null) {
                            i = R.id.textView22;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView22);
                            if (textView4 != null) {
                                i = R.id.textView23;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView23);
                                if (textView5 != null) {
                                    i = R.id.textView24;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView24);
                                    if (textView6 != null) {
                                        i = R.id.textView25;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView25);
                                        if (textView7 != null) {
                                            return new FragmentStandingsStatsBinding((ConstraintLayout) rootView, recyclerView, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
