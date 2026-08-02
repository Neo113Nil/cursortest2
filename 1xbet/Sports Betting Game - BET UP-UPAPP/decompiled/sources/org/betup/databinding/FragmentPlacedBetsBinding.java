package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentPlacedBetsBinding implements ViewBinding {
    public final RecyclerView list;
    public final ProgressBar progress;
    public final RelativeLayout progressBar;
    private final FrameLayout rootView;
    public final SwipeRefreshLayout swipy;

    private FragmentPlacedBetsBinding(FrameLayout rootView, RecyclerView list, ProgressBar progress, RelativeLayout progressBar, SwipeRefreshLayout swipy) {
        this.rootView = rootView;
        this.list = list;
        this.progress = progress;
        this.progressBar = progressBar;
        this.swipy = swipy;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPlacedBetsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentPlacedBetsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_placed_bets, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPlacedBetsBinding bind(View rootView) {
        int i = R.id.list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
        if (recyclerView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                i = R.id.progressBar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                if (relativeLayout != null) {
                    i = R.id.swipy;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipy);
                    if (swipeRefreshLayout != null) {
                        return new FragmentPlacedBetsBinding((FrameLayout) rootView, recyclerView, progressBar, relativeLayout, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
