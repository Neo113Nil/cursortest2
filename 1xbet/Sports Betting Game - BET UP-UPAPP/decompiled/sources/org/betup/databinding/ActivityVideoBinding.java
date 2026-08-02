package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ActivityVideoBinding implements ViewBinding {
    public final RelativeLayout container;
    public final ImageView fullscreen;
    public final ImageView play;
    private final LinearLayout rootView;
    public final ProgressBar videoProgress;
    public final VideoView videoView;

    private ActivityVideoBinding(LinearLayout rootView, RelativeLayout container, ImageView fullscreen, ImageView play, ProgressBar videoProgress, VideoView videoView) {
        this.rootView = rootView;
        this.container = container;
        this.fullscreen = fullscreen;
        this.play = play;
        this.videoProgress = videoProgress;
        this.videoView = videoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityVideoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityVideoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_video, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityVideoBinding bind(View rootView) {
        int i = R.id.container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (relativeLayout != null) {
            i = R.id.fullscreen;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fullscreen);
            if (imageView != null) {
                i = R.id.play;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.play);
                if (imageView2 != null) {
                    i = R.id.videoProgress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.videoProgress);
                    if (progressBar != null) {
                        i = R.id.videoView;
                        VideoView videoView = (VideoView) ViewBindings.findChildViewById(rootView, R.id.videoView);
                        if (videoView != null) {
                            return new ActivityVideoBinding((LinearLayout) rootView, relativeLayout, imageView, imageView2, progressBar, videoView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
