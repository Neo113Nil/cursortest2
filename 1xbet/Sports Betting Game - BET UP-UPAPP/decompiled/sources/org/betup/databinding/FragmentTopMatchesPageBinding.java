package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentTopMatchesPageBinding implements ViewBinding {
    public final TextView empty;
    public final RecyclerView listView;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;
    public final SwipyRefreshLayout swipeRefreshLayout;

    private FragmentTopMatchesPageBinding(FrameLayout rootView, TextView empty, RecyclerView listView, ProgressBar progressBar, SwipyRefreshLayout swipeRefreshLayout) {
        this.rootView = rootView;
        this.empty = empty;
        this.listView = listView;
        this.progressBar = progressBar;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTopMatchesPageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentTopMatchesPageBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_top_matches_page, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTopMatchesPageBinding bind(View rootView) {
        int i = android.R.id.empty;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, android.R.id.empty);
        if (textView != null) {
            i = R.id.listView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.listView);
            if (recyclerView != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.swipeRefreshLayout;
                    SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                    if (swipyRefreshLayout != null) {
                        return new FragmentTopMatchesPageBinding((FrameLayout) rootView, textView, recyclerView, progressBar, swipyRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
