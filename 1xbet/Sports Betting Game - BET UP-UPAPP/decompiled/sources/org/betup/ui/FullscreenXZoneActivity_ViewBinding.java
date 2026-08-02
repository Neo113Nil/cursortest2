package org.betup.ui;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class FullscreenXZoneActivity_ViewBinding implements Unbinder {
    private FullscreenXZoneActivity target;
    private View view7f0a0325;
    private View view7f0a0569;
    private View view7f0a07da;

    public FullscreenXZoneActivity_ViewBinding(FullscreenXZoneActivity target) {
        this(target, target.getWindow().getDecorView());
    }

    public FullscreenXZoneActivity_ViewBinding(final FullscreenXZoneActivity target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.webView, "field 'webView' and method 'onWebViewClick'");
        target.webView = (WebView) Utils.castView(findRequiredView, R.id.webView, "field 'webView'", WebView.class);
        this.view7f0a07da = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.FullscreenXZoneActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onWebViewClick();
            }
        });
        target.progress = Utils.findRequiredView(source, R.id.progress, "field 'progress'");
        View findRequiredView2 = Utils.findRequiredView(source, R.id.play, "field 'play' and method 'onPlayClick'");
        target.play = (ImageView) Utils.castView(findRequiredView2, R.id.play, "field 'play'", ImageView.class);
        this.view7f0a0569 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.FullscreenXZoneActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onPlayClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.fullscreen, "field 'fullscreen' and method 'onFullscreenClick'");
        target.fullscreen = (ImageView) Utils.castView(findRequiredView3, R.id.fullscreen, "field 'fullscreen'", ImageView.class);
        this.view7f0a0325 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.FullscreenXZoneActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onFullscreenClick();
            }
        });
        target.container = (ViewGroup) Utils.findRequiredViewAsType(source, R.id.container, "field 'container'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FullscreenXZoneActivity fullscreenXZoneActivity = this.target;
        if (fullscreenXZoneActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        fullscreenXZoneActivity.webView = null;
        fullscreenXZoneActivity.progress = null;
        fullscreenXZoneActivity.play = null;
        fullscreenXZoneActivity.fullscreen = null;
        fullscreenXZoneActivity.container = null;
        this.view7f0a07da.setOnClickListener(null);
        this.view7f0a07da = null;
        this.view7f0a0569.setOnClickListener(null);
        this.view7f0a0569 = null;
        this.view7f0a0325.setOnClickListener(null);
        this.view7f0a0325 = null;
    }
}
