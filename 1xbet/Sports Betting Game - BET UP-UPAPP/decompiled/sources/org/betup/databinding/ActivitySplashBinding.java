package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ActivitySplashBinding implements ViewBinding {
    public final ImageView imageView12;
    public final TextView info;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final TextView textView2;

    private ActivitySplashBinding(ConstraintLayout rootView, ImageView imageView12, TextView info, ProgressBar progress, TextView textView2) {
        this.rootView = rootView;
        this.imageView12 = imageView12;
        this.info = info;
        this.progress = progress;
        this.textView2 = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySplashBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivitySplashBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_splash, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySplashBinding bind(View rootView) {
        int i = R.id.imageView12;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView12);
        if (imageView != null) {
            i = R.id.info;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.info);
            if (textView != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (progressBar != null) {
                    i = R.id.textView2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView2);
                    if (textView2 != null) {
                        return new ActivitySplashBinding((ConstraintLayout) rootView, imageView, textView, progressBar, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
