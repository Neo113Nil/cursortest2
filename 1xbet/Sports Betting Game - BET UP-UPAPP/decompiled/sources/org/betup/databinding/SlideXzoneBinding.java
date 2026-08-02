package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class SlideXzoneBinding implements ViewBinding {
    public final RelativeLayout container;
    public final ImageView fullscreen;
    public final ImageView play;
    public final ProgressBar progress;
    private final RelativeLayout rootView;
    public final WebView webView;

    private SlideXzoneBinding(RelativeLayout rootView, RelativeLayout container, ImageView fullscreen, ImageView play, ProgressBar progress, WebView webView) {
        this.rootView = rootView;
        this.container = container;
        this.fullscreen = fullscreen;
        this.play = play;
        this.progress = progress;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static SlideXzoneBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SlideXzoneBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.slide_xzone, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SlideXzoneBinding bind(View rootView) {
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
                    i = R.id.webView;
                    WebView webView = (WebView) ViewBindings.findChildViewById(rootView, R.id.webView);
                    if (webView != null) {
                        return new SlideXzoneBinding(relativeLayout, relativeLayout, imageView, imageView2, progressBar, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
