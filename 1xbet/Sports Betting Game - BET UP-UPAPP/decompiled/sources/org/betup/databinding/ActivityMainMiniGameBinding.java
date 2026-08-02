package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ActivityMainMiniGameBinding implements ViewBinding {
    public final FrameLayout container;
    public final TextView inetError;
    public final FrameLayout progress;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final ViewToolbarBinding toolbarContainer;

    private ActivityMainMiniGameBinding(ConstraintLayout rootView, FrameLayout container, TextView inetError, FrameLayout progress, ProgressBar progressBar, ViewToolbarBinding toolbarContainer) {
        this.rootView = rootView;
        this.container = container;
        this.inetError = inetError;
        this.progress = progress;
        this.progressBar = progressBar;
        this.toolbarContainer = toolbarContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainMiniGameBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityMainMiniGameBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_main_mini_game, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainMiniGameBinding bind(View rootView) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (frameLayout != null) {
            i = R.id.inetError;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.inetError);
            if (textView != null) {
                i = R.id.progress;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (frameLayout2 != null) {
                    i = R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                    if (progressBar != null) {
                        i = R.id.toolbarContainer;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.toolbarContainer);
                        if (findChildViewById != null) {
                            return new ActivityMainMiniGameBinding((ConstraintLayout) rootView, frameLayout, textView, frameLayout2, progressBar, ViewToolbarBinding.bind(findChildViewById));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
