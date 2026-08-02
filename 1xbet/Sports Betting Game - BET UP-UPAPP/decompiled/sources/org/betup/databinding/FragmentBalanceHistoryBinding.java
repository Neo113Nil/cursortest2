package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentBalanceHistoryBinding implements ViewBinding {
    public final RecyclerView balanceList;
    public final ProgressBar progress;
    public final RelativeLayout progressBar;
    private final RelativeLayout rootView;

    private FragmentBalanceHistoryBinding(RelativeLayout rootView, RecyclerView balanceList, ProgressBar progress, RelativeLayout progressBar) {
        this.rootView = rootView;
        this.balanceList = balanceList;
        this.progress = progress;
        this.progressBar = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBalanceHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentBalanceHistoryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_balance_history, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBalanceHistoryBinding bind(View rootView) {
        int i = R.id.balanceList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.balanceList);
        if (recyclerView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                i = R.id.progressBar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                if (relativeLayout != null) {
                    return new FragmentBalanceHistoryBinding((RelativeLayout) rootView, recyclerView, progressBar, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
