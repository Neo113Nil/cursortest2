package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentRankingsTabBinding implements ViewBinding {
    public final FrameLayout header;
    public final RecyclerView list;
    public final ItemRankingBinding myRank;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;

    private FragmentRankingsTabBinding(ConstraintLayout rootView, FrameLayout header, RecyclerView list, ItemRankingBinding myRank, ProgressBar progress) {
        this.rootView = rootView;
        this.header = header;
        this.list = list;
        this.myRank = myRank;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRankingsTabBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentRankingsTabBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_rankings_tab, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentRankingsTabBinding bind(View rootView) {
        int i = R.id.header;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.header);
        if (frameLayout != null) {
            i = R.id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
            if (recyclerView != null) {
                i = R.id.my_rank;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.my_rank);
                if (findChildViewById != null) {
                    ItemRankingBinding bind = ItemRankingBinding.bind(findChildViewById);
                    i = R.id.progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                    if (progressBar != null) {
                        return new FragmentRankingsTabBinding((ConstraintLayout) rootView, frameLayout, recyclerView, bind, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
