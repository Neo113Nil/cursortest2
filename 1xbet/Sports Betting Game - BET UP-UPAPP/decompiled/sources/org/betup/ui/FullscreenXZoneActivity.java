package org.betup.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.ironsource.sdk.controller.f;
import org.betup.BetUpApp;
import org.betup.R;

/* loaded from: classes2.dex */
public class FullscreenXZoneActivity extends Activity {
    public static final int PLAYING = 3111;
    public static final int STOP = 3112;
    private String command;

    @BindView(R.id.container)
    ViewGroup container;

    @BindView(R.id.fullscreen)
    ImageView fullscreen;

    @BindView(R.id.play)
    ImageView play;

    @BindView(R.id.progress)
    View progress;

    @BindView(R.id.webView)
    WebView webView;
    private boolean isPlaying = false;
    private Handler handler = new Handler();

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setResult(STOP);
        ((BetUpApp) getApplicationContext()).getComponent().inject(this);
        setContentView(R.layout.activity_xzone);
        Log.d("XZONE", "CREATED!");
        this.command = getIntent().getStringExtra(f.b.g);
        ButterKnife.bind(this);
        this.fullscreen.setImageResource(R.drawable.fullscreen);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setUseWideViewPort(true);
        this.webView.getSettings().setLoadWithOverviewMode(true);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.container.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.betup.ui.FullscreenXZoneActivity.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                FullscreenXZoneActivity.this.container.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                FullscreenXZoneActivity.this.play.performClick();
            }
        });
    }

    @OnClick({R.id.webView})
    public void onWebViewClick() {
        Log.d("XZONE", "WEB VIEW CLICKED!");
    }

    @OnClick({R.id.play})
    public void onPlayClick() {
        Log.d("XZONE", "PLAY CLICKED!");
        this.progress.setVisibility(0);
        if (this.isPlaying) {
            this.isPlaying = false;
            displayPlayButton();
            this.webView.setVisibility(8);
            this.progress.setVisibility(8);
            this.webView.setWebViewClient(null);
            this.webView.loadUrl("about:blank");
            return;
        }
        this.isPlaying = true;
        displayPauseButton(new Runnable() { // from class: org.betup.ui.FullscreenXZoneActivity.2
            @Override // java.lang.Runnable
            public void run() {
                FullscreenXZoneActivity.this.startXZone();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startXZone() {
        this.webView.setVisibility(0);
        this.webView.loadUrl("https://get1xzone.com/getZone/web_nz/index.html");
        this.webView.setWebViewClient(new WebViewClient() { // from class: org.betup.ui.FullscreenXZoneActivity.3
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Log.d("XZONE", "PAGE LOADED");
                Log.d("XZONE", "COMMAND = " + FullscreenXZoneActivity.this.command);
                FullscreenXZoneActivity.this.webView.evaluateJavascript(FullscreenXZoneActivity.this.command, null);
                FullscreenXZoneActivity.this.isPlaying = true;
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: org.betup.ui.FullscreenXZoneActivity.4
            @Override // java.lang.Runnable
            public void run() {
                FullscreenXZoneActivity.this.progress.setVisibility(8);
            }
        }, 1000L);
    }

    @OnClick({R.id.fullscreen})
    public void onFullscreenClick() {
        if (this.isPlaying) {
            setResult(PLAYING);
        } else {
            setResult(STOP);
        }
        finish();
    }

    private void displayPauseButton(final Runnable r) {
        this.progress.setVisibility(0);
        float width = this.container.getWidth();
        float height = this.container.getHeight();
        float width2 = this.play.getWidth();
        float height2 = this.play.getHeight();
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_button_in);
        this.fullscreen.setVisibility(0);
        this.fullscreen.startAnimation(loadAnimation);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.play, PropertyValuesHolder.ofFloat("translationX", (float) ((width / 2.0f) - (width2 * 0.55d))), PropertyValuesHolder.ofFloat("translationY", (float) ((height / 2.0f) - (height2 * 0.55d))), PropertyValuesHolder.ofFloat("scaleX", 0.5f), PropertyValuesHolder.ofFloat("scaleY", 0.5f));
        ofPropertyValuesHolder.setDuration(500L);
        ofPropertyValuesHolder.start();
        this.handler.postDelayed(new Runnable() { // from class: org.betup.ui.FullscreenXZoneActivity.5
            @Override // java.lang.Runnable
            public void run() {
                FullscreenXZoneActivity.this.play.setImageResource(R.drawable.stop);
                r.run();
            }
        }, 500L);
    }

    private void displayPlayButton() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.play, PropertyValuesHolder.ofFloat("translationX", 0.0f), PropertyValuesHolder.ofFloat("translationY", 0.0f), PropertyValuesHolder.ofFloat("scaleX", 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f));
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_button_out);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: org.betup.ui.FullscreenXZoneActivity.6
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                FullscreenXZoneActivity.this.fullscreen.setVisibility(8);
            }
        });
        this.fullscreen.startAnimation(loadAnimation);
        ofPropertyValuesHolder.setDuration(500L);
        ofPropertyValuesHolder.start();
        this.handler.postDelayed(new Runnable() { // from class: org.betup.ui.FullscreenXZoneActivity.7
            @Override // java.lang.Runnable
            public void run() {
                FullscreenXZoneActivity.this.play.setImageResource(R.drawable.play);
            }
        }, 500L);
    }
}
