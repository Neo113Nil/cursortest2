package org.betup.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class FullscreenVideoActivity_ViewBinding implements Unbinder {
    private FullscreenVideoActivity target;
    private View view7f0a0325;
    private View view7f0a0569;

    public FullscreenVideoActivity_ViewBinding(FullscreenVideoActivity target) {
        this(target, target.getWindow().getDecorView());
    }

    public FullscreenVideoActivity_ViewBinding(final FullscreenVideoActivity target, View source) {
        this.target = target;
        target.videoView = (VideoView) Utils.findRequiredViewAsType(source, R.id.videoView, "field 'videoView'", VideoView.class);
        target.videoProgress = Utils.findRequiredView(source, R.id.videoProgress, "field 'videoProgress'");
        View findRequiredView = Utils.findRequiredView(source, R.id.play, "field 'play' and method 'onPlayClick'");
        target.play = (ImageView) Utils.castView(findRequiredView, R.id.play, "field 'play'", ImageView.class);
        this.view7f0a0569 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.FullscreenVideoActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onPlayClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.fullscreen, "field 'fullscreen' and method 'closeFullscreen'");
        target.fullscreen = findRequiredView2;
        this.view7f0a0325 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.FullscreenVideoActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.closeFullscreen();
            }
        });
        target.container = Utils.findRequiredView(source, R.id.container, "field 'container'");
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FullscreenVideoActivity fullscreenVideoActivity = this.target;
        if (fullscreenVideoActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        fullscreenVideoActivity.videoView = null;
        fullscreenVideoActivity.videoProgress = null;
        fullscreenVideoActivity.play = null;
        fullscreenVideoActivity.fullscreen = null;
        fullscreenVideoActivity.container = null;
        this.view7f0a0569.setOnClickListener(null);
        this.view7f0a0569 = null;
        this.view7f0a0325.setOnClickListener(null);
        this.view7f0a0325 = null;
    }
}
