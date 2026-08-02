package org.betup.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.VideoView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.share.internal.ShareConstants;
import org.betup.R;
import org.betup.utils.SnackbarHelper;

/* loaded from: classes2.dex */
public class FullscreenVideoActivity extends Activity {

    @BindView(R.id.container)
    View container;

    @BindView(R.id.fullscreen)
    View fullscreen;
    private Handler handler;
    private boolean isPlaying;

    @BindView(R.id.play)
    ImageView play;
    private Uri video;

    @BindView(R.id.videoProgress)
    View videoProgress;

    @BindView(R.id.videoView)
    VideoView videoView;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ButterKnife.bind(this);
        this.container.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.betup.ui.FullscreenVideoActivity.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                FullscreenVideoActivity fullscreenVideoActivity = FullscreenVideoActivity.this;
                fullscreenVideoActivity.video = Uri.parse(fullscreenVideoActivity.getIntent().getStringExtra("link"));
                FullscreenVideoActivity.this.handler = new Handler();
                Log.d(ShareConstants.VIDEO_URL, "LINK " + FullscreenVideoActivity.this.video.toString());
                FullscreenVideoActivity.this.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: org.betup.ui.FullscreenVideoActivity.1.1
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public void onPrepared(MediaPlayer mp) {
                        Log.d(ShareConstants.VIDEO_URL, "PREPARED");
                        FullscreenVideoActivity.this.videoView.start();
                        FullscreenVideoActivity.this.videoProgress.setVisibility(8);
                        FullscreenVideoActivity.this.isPlaying = true;
                    }
                });
                FullscreenVideoActivity.this.videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: org.betup.ui.FullscreenVideoActivity.1.2
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public boolean onError(MediaPlayer mp, int what, int extra) {
                        FullscreenVideoActivity.this.isPlaying = false;
                        FullscreenVideoActivity.this.displayVideoNotAvailable();
                        return true;
                    }
                });
                FullscreenVideoActivity.this.videoProgress.setVisibility(0);
                FullscreenVideoActivity.this.onPlayClick();
                FullscreenVideoActivity.this.videoView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @OnClick({R.id.fullscreen})
    public void closeFullscreen() {
        finish();
    }

    @OnClick({R.id.play})
    public void onPlayClick() {
        long j;
        Log.d(ShareConstants.VIDEO_URL, "IS PLAYED = " + this.isPlaying);
        if (this.isPlaying) {
            this.isPlaying = false;
            this.videoView.stopPlayback();
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.play, PropertyValuesHolder.ofFloat("translationX", 0.0f), PropertyValuesHolder.ofFloat("translationY", 0.0f), PropertyValuesHolder.ofFloat("scaleX", 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f));
            ofPropertyValuesHolder.setDuration(500L);
            ofPropertyValuesHolder.start();
            this.handler.postDelayed(new Runnable() { // from class: org.betup.ui.FullscreenVideoActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    FullscreenVideoActivity.this.play.setImageResource(R.drawable.play);
                }
            }, 500L);
            j = 500;
        } else {
            float width = this.container.getWidth();
            float height = this.container.getHeight();
            float width2 = this.play.getWidth();
            float height2 = this.play.getHeight();
            this.videoProgress.setVisibility(0);
            this.videoView.setVideoURI(this.video);
            this.videoView.requestFocus();
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.play, PropertyValuesHolder.ofFloat("translationX", (float) ((width / 2.0f) - (width2 * 0.55d))), PropertyValuesHolder.ofFloat("translationY", (float) ((height / 2.0f) - (height2 * 0.55d))), PropertyValuesHolder.ofFloat("scaleX", 0.5f), PropertyValuesHolder.ofFloat("scaleY", 0.5f));
            j = 500;
            ofPropertyValuesHolder2.setDuration(500L);
            ofPropertyValuesHolder2.start();
            this.play.setImageResource(R.drawable.stop);
        }
        this.handler.postDelayed(new Runnable() { // from class: org.betup.ui.FullscreenVideoActivity.3
            @Override // java.lang.Runnable
            public void run() {
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displayVideoNotAvailable() {
        this.play.setVisibility(8);
        this.videoProgress.setVisibility(8);
        SnackbarHelper.showShort(this, R.string.video_not_available);
    }
}
