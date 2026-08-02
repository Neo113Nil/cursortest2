package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentEventsBinding implements ViewBinding {
    public final FloatingActionButton cleanButton;
    public final RecyclerView list;
    private final ConstraintLayout rootView;
    public final SwipyRefreshLayout swipeRefreshLayout;

    private FragmentEventsBinding(ConstraintLayout rootView, FloatingActionButton cleanButton, RecyclerView list, SwipyRefreshLayout swipeRefreshLayout) {
        this.rootView = rootView;
        this.cleanButton = cleanButton;
        this.list = list;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEventsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentEventsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_events, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentEventsBinding bind(View rootView) {
        int i = R.id.cleanButton;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.cleanButton);
        if (floatingActionButton != null) {
            i = R.id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
            if (recyclerView != null) {
                i = R.id.swipeRefreshLayout;
                SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                if (swipyRefreshLayout != null) {
                    return new FragmentEventsBinding((ConstraintLayout) rootView, floatingActionButton, recyclerView, swipyRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
