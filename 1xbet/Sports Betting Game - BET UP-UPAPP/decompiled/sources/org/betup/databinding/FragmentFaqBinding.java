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
public final class FragmentFaqBinding implements ViewBinding {
    public final RecyclerView list;
    public final ProgressBar progress;
    private final RelativeLayout rootView;

    private FragmentFaqBinding(RelativeLayout rootView, RecyclerView list, ProgressBar progress) {
        this.rootView = rootView;
        this.list = list;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFaqBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentFaqBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_faq, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFaqBinding bind(View rootView) {
        int i = R.id.list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
        if (recyclerView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                return new FragmentFaqBinding((RelativeLayout) rootView, recyclerView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
