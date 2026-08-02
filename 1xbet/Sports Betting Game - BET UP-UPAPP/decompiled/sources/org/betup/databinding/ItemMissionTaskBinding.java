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
public final class ItemMissionTaskBinding implements ViewBinding {
    public final ProgressBar progressBar;
    public final TextView progressDescription;
    private final ConstraintLayout rootView;
    public final ImageView taskIcon;
    public final ImageView tick;
    public final TextView title;

    private ItemMissionTaskBinding(ConstraintLayout rootView, ProgressBar progressBar, TextView progressDescription, ImageView taskIcon, ImageView tick, TextView title) {
        this.rootView = rootView;
        this.progressBar = progressBar;
        this.progressDescription = progressDescription;
        this.taskIcon = taskIcon;
        this.tick = tick;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemMissionTaskBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMissionTaskBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_mission_task, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMissionTaskBinding bind(View rootView) {
        int i = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
        if (progressBar != null) {
            i = R.id.progressDescription;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.progressDescription);
            if (textView != null) {
                i = R.id.taskIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.taskIcon);
                if (imageView != null) {
                    i = R.id.tick;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tick);
                    if (imageView2 != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                        if (textView2 != null) {
                            return new ItemMissionTaskBinding((ConstraintLayout) rootView, progressBar, textView, imageView, imageView2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
