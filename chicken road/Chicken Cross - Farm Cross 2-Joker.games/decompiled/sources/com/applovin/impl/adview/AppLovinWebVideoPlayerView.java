package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.adview.AppLovinWebVideoPlayerView;
import com.applovin.impl.c5;
import com.applovin.impl.s8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class AppLovinWebVideoPlayerView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4113a;
    private Listener b;
    private boolean c;
    private final List d;
    private boolean e;
    private float f;
    private float g;

    public interface Listener {
        default void onBuffering(boolean z) {
        }

        default void onError(String str) {
        }

        default void onPlaybackStateChanged(boolean z) {
        }

        default void onTimeUpdate(float f, float f2) {
        }

        default void onVideoEnded() {
        }

        default void onVideoLoaded(float f) {
        }
    }

    class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f4114a;

        a(com.applovin.impl.sdk.l lVar) {
            this.f4114a = lVar;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            AppLovinWebVideoPlayerView.this.c = true;
            Iterator it = AppLovinWebVideoPlayerView.this.d.iterator();
            while (it.hasNext()) {
                s8.a(AppLovinWebVideoPlayerView.this, (String) it.next(), this.f4114a);
            }
            AppLovinWebVideoPlayerView.this.d.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z) {
            if (AppLovinWebVideoPlayerView.this.b != null) {
                AppLovinWebVideoPlayerView.this.b.onBuffering(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            AppLovinWebVideoPlayerView.this.e = false;
            if (AppLovinWebVideoPlayerView.this.b != null) {
                AppLovinWebVideoPlayerView.this.b.onPlaybackStateChanged(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            AppLovinWebVideoPlayerView.this.e = true;
            if (AppLovinWebVideoPlayerView.this.b != null) {
                AppLovinWebVideoPlayerView.this.b.onPlaybackStateChanged(true);
            }
        }

        @JavascriptInterface
        public void onBuffering(final boolean z) {
            AppLovinWebVideoPlayerView.this.post(new Runnable() { // from class: com.applovin.impl.adview.AppLovinWebVideoPlayerView$b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinWebVideoPlayerView.b.this.a(z);
                }
            });
        }

        @JavascriptInterface
        public void onEnded() {
            AppLovinWebVideoPlayerView.this.post(new Runnable() { // from class: com.applovin.impl.adview.AppLovinWebVideoPlayerView$b$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinWebVideoPlayerView.b.this.a();
                }
            });
        }

        @JavascriptInterface
        public void onError(final String str) {
            AppLovinWebVideoPlayerView.this.post(new Runnable() { // from class: com.applovin.impl.adview.AppLovinWebVideoPlayerView$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinWebVideoPlayerView.b.this.a(str);
                }
            });
        }

        @JavascriptInterface
        public void onLoaded(final float f) {
            AppLovinWebVideoPlayerView.this.post(new Runnable() { // from class: com.applovin.impl.adview.AppLovinWebVideoPlayerView$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinWebVideoPlayerView.b.this.a(f);
                }
            });
        }

        @JavascriptInterface
        public void onPause() {
            AppLovinWebVideoPlayerView.this.post(new Runnable() { // from class: com.applovin.impl.adview.AppLovinWebVideoPlayerView$b$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinWebVideoPlayerView.b.this.b();
                }
            });
        }

        @JavascriptInterface
        public void onPlay() {
            AppLovinWebVideoPlayerView.this.post(new Runnable() { // from class: com.applovin.impl.adview.AppLovinWebVideoPlayerView$b$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinWebVideoPlayerView.b.this.c();
                }
            });
        }

        @JavascriptInterface
        public void onTimeUpdate(final float f, final float f2) {
            AppLovinWebVideoPlayerView.this.post(new Runnable() { // from class: com.applovin.impl.adview.AppLovinWebVideoPlayerView$b$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinWebVideoPlayerView.b.this.a(f, f2);
                }
            });
        }

        /* synthetic */ b(AppLovinWebVideoPlayerView appLovinWebVideoPlayerView, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(float f) {
            AppLovinWebVideoPlayerView.this.g = f;
            if (AppLovinWebVideoPlayerView.this.b != null) {
                AppLovinWebVideoPlayerView.this.b.onVideoLoaded(f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(float f, float f2) {
            AppLovinWebVideoPlayerView.this.f = f;
            AppLovinWebVideoPlayerView.this.g = f2;
            if (AppLovinWebVideoPlayerView.this.b != null) {
                AppLovinWebVideoPlayerView.this.b.onTimeUpdate(f, AppLovinWebVideoPlayerView.this.g);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            if (AppLovinWebVideoPlayerView.this.b != null) {
                AppLovinWebVideoPlayerView.this.b.onError(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (AppLovinWebVideoPlayerView.this.b != null) {
                AppLovinWebVideoPlayerView.this.b.onVideoEnded();
            }
        }
    }

    public AppLovinWebVideoPlayerView(Context context, com.applovin.impl.sdk.l lVar) {
        super(context);
        this.d = new ArrayList();
        this.g = -1.0f;
        this.f4113a = lVar;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setUseWideViewPort(true);
        addJavascriptInterface(new b(this, null), "AndroidBridge");
        setWebViewClient(new a(lVar));
    }

    public float getCurrentPosition() {
        return this.f;
    }

    public float getDuration() {
        return this.g;
    }

    public boolean isPlaying() {
        return this.e;
    }

    public void loadVideo(String str, boolean z, boolean z2) {
        this.c = false;
        this.d.clear();
        loadDataWithBaseURL(null, a(str, z, z2), "text/html", "UTF-8", null);
    }

    public void pause() {
        a("video.pause()");
    }

    public void play() {
        a("video.play()");
    }

    public void seekTo(float f) {
        a("video.currentTime = " + f);
    }

    public void setListener(Listener listener) {
        this.b = listener;
    }

    public void setMuted(boolean z) {
        a("video.muted = " + z);
    }

    public void toggleMute() {
        a("video.muted = !video.muted");
    }

    private void a(String str) {
        if (this.c) {
            s8.a(this, str, this.f4113a);
        } else {
            this.d.add(str);
        }
    }

    private String a(String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder("id=\"video\" playsinline");
        if (z) {
            sb.append(" autoplay");
        }
        if (z2) {
            sb.append(" muted");
        }
        return ((String) this.f4113a.a(c5.E2)).replace("{SOURCE}", str).replace("{ATTRS}", sb.toString());
    }
}
