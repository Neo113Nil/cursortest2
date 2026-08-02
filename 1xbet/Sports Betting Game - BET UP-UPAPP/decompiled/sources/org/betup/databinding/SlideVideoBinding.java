package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class SlideVideoBinding implements ViewBinding {
    public final RelativeLayout container;
    public final ImageView fullscreen;
    public final ImageView play;
    public final ProgressBar progress;
    private final RelativeLayout rootView;
    public final VideoView videoView;

    private SlideVideoBinding(RelativeLayout rootView, RelativeLayout container, ImageView fullscreen, ImageView play, ProgressBar progress, VideoView videoView) {
        this.rootView = rootView;
        this.container = container;
        this.fullscreen = fullscreen;
        this.play = play;
        this.progress = progress;
        this.videoView = videoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static SlideVideoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SlideVideoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.slide_video, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SlideVideoBinding bind(View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i = R.id.fullscreen;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fullscreen);
        if (imageView != null) {
            i = R.id.play;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.play);
            if (imageView2 != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (progressBar != null) {
                    i = R.id.videoView;
                    VideoView videoView = (VideoView) ViewBindings.findChildViewById(rootView, R.id.videoView);
                    if (videoView != null) {
                        return new SlideVideoBinding(relativeLayout, relativeLayout, imageView, imageView2, progressBar, videoView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
