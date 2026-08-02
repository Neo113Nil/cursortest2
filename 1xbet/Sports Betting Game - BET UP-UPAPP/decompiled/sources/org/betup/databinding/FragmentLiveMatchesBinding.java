package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentLiveMatchesBinding implements ViewBinding {
    public final Button chooseTimeButton;
    public final TextView empty;
    public final RecyclerView matchesList;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final SwipyRefreshLayout swipy;

    private FragmentLiveMatchesBinding(RelativeLayout rootView, Button chooseTimeButton, TextView empty, RecyclerView matchesList, ProgressBar progressBar, SwipyRefreshLayout swipy) {
        this.rootView = rootView;
        this.chooseTimeButton = chooseTimeButton;
        this.empty = empty;
        this.matchesList = matchesList;
        this.progressBar = progressBar;
        this.swipy = swipy;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLiveMatchesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentLiveMatchesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_live_matches, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLiveMatchesBinding bind(View rootView) {
        int i = R.id.chooseTimeButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.chooseTimeButton);
        if (button != null) {
            i = android.R.id.empty;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, android.R.id.empty);
            if (textView != null) {
                i = R.id.matchesList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.matchesList);
                if (recyclerView != null) {
                    i = R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                    if (progressBar != null) {
                        i = R.id.swipy;
                        SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipy);
                        if (swipyRefreshLayout != null) {
                            return new FragmentLiveMatchesBinding((RelativeLayout) rootView, button, textView, recyclerView, progressBar, swipyRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
