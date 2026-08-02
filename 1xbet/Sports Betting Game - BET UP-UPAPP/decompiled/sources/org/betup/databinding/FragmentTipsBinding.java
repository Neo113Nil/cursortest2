package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentTipsBinding implements ViewBinding {
    public final ProgressBar progress;
    public final SwipyRefreshLayout refreshContainer;
    private final LinearLayout rootView;
    public final RecyclerView tipsList;

    private FragmentTipsBinding(LinearLayout rootView, ProgressBar progress, SwipyRefreshLayout refreshContainer, RecyclerView tipsList) {
        this.rootView = rootView;
        this.progress = progress;
        this.refreshContainer = refreshContainer;
        this.tipsList = tipsList;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTipsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentTipsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_tips, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTipsBinding bind(View rootView) {
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
        if (progressBar != null) {
            i = R.id.refreshContainer;
            SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.refreshContainer);
            if (swipyRefreshLayout != null) {
                i = R.id.tipsList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.tipsList);
                if (recyclerView != null) {
                    return new FragmentTipsBinding((LinearLayout) rootView, progressBar, swipyRefreshLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
