package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentGamesListBinding implements ViewBinding {
    public final RecyclerView gameListRecycle;
    public final FrameLayout progress;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;

    private FragmentGamesListBinding(FrameLayout rootView, RecyclerView gameListRecycle, FrameLayout progress, ProgressBar progressBar) {
        this.rootView = rootView;
        this.gameListRecycle = gameListRecycle;
        this.progress = progress;
        this.progressBar = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentGamesListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentGamesListBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_games_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentGamesListBinding bind(View rootView) {
        int i = R.id.gameListRecycle;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.gameListRecycle);
        if (recyclerView != null) {
            i = R.id.progress;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (frameLayout != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                if (progressBar != null) {
                    return new FragmentGamesListBinding((FrameLayout) rootView, recyclerView, frameLayout, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
