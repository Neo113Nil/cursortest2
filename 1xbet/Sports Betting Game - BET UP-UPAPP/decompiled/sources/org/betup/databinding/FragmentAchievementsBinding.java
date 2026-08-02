package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentAchievementsBinding implements ViewBinding {
    public final ListView listView;
    public final ProgressBar progress;
    private final RelativeLayout rootView;

    private FragmentAchievementsBinding(RelativeLayout rootView, ListView listView, ProgressBar progress) {
        this.rootView = rootView;
        this.listView = listView;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAchievementsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentAchievementsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_achievements, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAchievementsBinding bind(View rootView) {
        int i = R.id.listView;
        ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.listView);
        if (listView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                return new FragmentAchievementsBinding((RelativeLayout) rootView, listView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
