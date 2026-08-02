package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class UserBetsTabBinding implements ViewBinding {
    public final ExpandableListView bets;
    public final RelativeLayout progress;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;

    private UserBetsTabBinding(RelativeLayout rootView, ExpandableListView bets, RelativeLayout progress, ProgressBar progressBar) {
        this.rootView = rootView;
        this.bets = bets;
        this.progress = progress;
        this.progressBar = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static UserBetsTabBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static UserBetsTabBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.user_bets_tab, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static UserBetsTabBinding bind(View rootView) {
        int i = R.id.bets;
        ExpandableListView expandableListView = (ExpandableListView) ViewBindings.findChildViewById(rootView, R.id.bets);
        if (expandableListView != null) {
            i = R.id.progress;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (relativeLayout != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                if (progressBar != null) {
                    return new UserBetsTabBinding((RelativeLayout) rootView, expandableListView, relativeLayout, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
