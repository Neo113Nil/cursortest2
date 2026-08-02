package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentNotificationsBinding implements ViewBinding {
    public final ListView notifications;
    public final ProgressBar progress;
    public final RelativeLayout progressBar;
    public final TextView removeAllButton;
    private final FrameLayout rootView;

    private FragmentNotificationsBinding(FrameLayout rootView, ListView notifications, ProgressBar progress, RelativeLayout progressBar, TextView removeAllButton) {
        this.rootView = rootView;
        this.notifications = notifications;
        this.progress = progress;
        this.progressBar = progressBar;
        this.removeAllButton = removeAllButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNotificationsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentNotificationsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_notifications, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentNotificationsBinding bind(View rootView) {
        int i = R.id.notifications;
        ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.notifications);
        if (listView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                i = R.id.progressBar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                if (relativeLayout != null) {
                    i = R.id.removeAllButton;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.removeAllButton);
                    if (textView != null) {
                        return new FragmentNotificationsBinding((FrameLayout) rootView, listView, progressBar, relativeLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
