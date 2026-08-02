package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentBetsBinding implements ViewBinding {
    public final ExpandableListView betsList;
    public final FloatingActionButton fabNew;
    public final ProgressBar progress;
    public final RelativeLayout progressBar;
    private final RelativeLayout rootView;
    public final SwipeRefreshLayout swipeRefreshLayout;

    private FragmentBetsBinding(RelativeLayout rootView, ExpandableListView betsList, FloatingActionButton fabNew, ProgressBar progress, RelativeLayout progressBar, SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = rootView;
        this.betsList = betsList;
        this.fabNew = fabNew;
        this.progress = progress;
        this.progressBar = progressBar;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBetsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentBetsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_bets, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBetsBinding bind(View rootView) {
        int i = R.id.betsList;
        ExpandableListView expandableListView = (ExpandableListView) ViewBindings.findChildViewById(rootView, R.id.betsList);
        if (expandableListView != null) {
            i = R.id.fab_new;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.fab_new);
            if (floatingActionButton != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (progressBar != null) {
                    i = R.id.progressBar;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                    if (relativeLayout != null) {
                        i = R.id.swipeRefreshLayout;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                        if (swipeRefreshLayout != null) {
                            return new FragmentBetsBinding((RelativeLayout) rootView, expandableListView, floatingActionButton, progressBar, relativeLayout, swipeRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
