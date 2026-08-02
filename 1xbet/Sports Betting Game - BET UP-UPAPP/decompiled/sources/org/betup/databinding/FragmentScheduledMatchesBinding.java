package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;
import org.betup.ui.views.OvalFloatingButton;

/* loaded from: classes2.dex */
public final class FragmentScheduledMatchesBinding implements ViewBinding {
    public final FloatingActionButton fab;
    public final OvalFloatingButton fabNew;
    public final RecyclerView matchesList;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final SwipyRefreshLayout swipy;

    private FragmentScheduledMatchesBinding(RelativeLayout rootView, FloatingActionButton fab, OvalFloatingButton fabNew, RecyclerView matchesList, ProgressBar progressBar, SwipyRefreshLayout swipy) {
        this.rootView = rootView;
        this.fab = fab;
        this.fabNew = fabNew;
        this.matchesList = matchesList;
        this.progressBar = progressBar;
        this.swipy = swipy;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentScheduledMatchesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentScheduledMatchesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_scheduled_matches, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentScheduledMatchesBinding bind(View rootView) {
        int i = R.id.fab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.fab);
        if (floatingActionButton != null) {
            i = R.id.fab_new;
            OvalFloatingButton ovalFloatingButton = (OvalFloatingButton) ViewBindings.findChildViewById(rootView, R.id.fab_new);
            if (ovalFloatingButton != null) {
                i = R.id.matchesList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.matchesList);
                if (recyclerView != null) {
                    i = R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                    if (progressBar != null) {
                        i = R.id.swipy;
                        SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipy);
                        if (swipyRefreshLayout != null) {
                            return new FragmentScheduledMatchesBinding((RelativeLayout) rootView, floatingActionButton, ovalFloatingButton, recyclerView, progressBar, swipyRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
