package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.c1;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class d2 extends y1 implements AppLovinCommunicatorSubscriber {
    private final e2 N;
    private MediaPlayer O;
    private final View P;
    protected final AppLovinVideoView Q;
    protected final com.applovin.impl.a R;
    protected final com.applovin.impl.adview.g S;
    protected k0 T;
    protected final ImageView U;
    protected final ProgressBar V;
    protected ProgressBar W;
    protected ImageView X;
    private final d Y;
    private final Handler Z;
    private final Handler a0;
    protected final c1 b0;
    protected final c1 c0;
    private final boolean d0;
    protected boolean e0;
    protected long f0;
    private int g0;
    private int h0;
    protected boolean i0;
    private boolean j0;
    private final AtomicBoolean k0;
    private final AtomicBoolean l0;
    private long m0;
    private long n0;

    class a implements c1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4171a;

        a(int i) {
            this.f4171a = i;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            if (d2.this.T != null) {
                long seconds = this.f4171a - TimeUnit.MILLISECONDS.toSeconds(r0.Q.getCurrentPosition());
                if (seconds <= 0) {
                    d2.this.w = true;
                } else if (d2.this.P()) {
                    d2.this.T.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return d2.this.P();
        }
    }

    class b implements c1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f4172a;

        b(Integer num) {
            this.f4172a = num;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            d2 d2Var = d2.this;
            if (d2Var.i0) {
                d2Var.V.setVisibility(8);
            } else {
                d2.this.V.setProgress((int) ((d2Var.Q.getCurrentPosition() / d2.this.f0) * this.f4172a.intValue()));
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !d2.this.i0;
        }
    }

    class c implements c1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4173a;
        final /* synthetic */ Integer b;
        final /* synthetic */ Long c;

        c(long j, Integer num, Long l) {
            this.f4173a = j;
            this.b = num;
            this.c = l;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            d2.this.W.setProgress((int) ((d2.this.s / this.f4173a) * this.b.intValue()));
            d2.this.s += this.c.longValue();
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return d2.this.s < this.f4173a;
        }
    }

    private class d implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private d() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            d2.this.a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.p pVar = d2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                d2.this.c.a("AppLovinFullscreenActivity", "Video completed");
            }
            d2.this.j0 = true;
            d2 d2Var = d2.this;
            if (!d2Var.u) {
                d2Var.R();
            } else if (d2Var.h()) {
                d2.this.A();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            d2.this.g("Video view error (" + i + "," + i2 + ")");
            d2.this.Q.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            com.applovin.impl.sdk.p pVar = d2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                d2.this.c.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                d2.this.Q();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                d2.this.E();
                return false;
            }
            d2.this.b0.b();
            d2 d2Var = d2.this;
            if (d2Var.S != null) {
                d2Var.O();
            }
            d2.this.E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            d2.this.O = mediaPlayer;
            mediaPlayer.setOnInfoListener(d2.this.Y);
            mediaPlayer.setOnErrorListener(d2.this.Y);
            float f = !d2.this.e0 ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            d2.this.v = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            d2.this.d(mediaPlayer.getDuration());
            d2.this.N();
            com.applovin.impl.sdk.p pVar = d2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                d2.this.c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + d2.this.O);
            }
        }

        /* synthetic */ d(d2 d2Var, a aVar) {
            this();
        }
    }

    private class e implements View.OnClickListener {
        private e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d2 d2Var = d2.this;
            if (view == d2Var.S) {
                d2Var.S();
                return;
            }
            if (view == d2Var.U) {
                d2Var.T();
                return;
            }
            com.applovin.impl.sdk.p pVar = d2Var.c;
            if (com.applovin.impl.sdk.p.a()) {
                d2.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ e(d2 d2Var, a aVar) {
            this();
        }
    }

    public d2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.N = new e2(this.f4559a, this.d, this.b);
        a aVar = null;
        this.X = null;
        d dVar = new d(this, aVar);
        this.Y = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Z = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.a0 = handler2;
        c1 c1Var = new c1(handler, this.b);
        this.b0 = c1Var;
        this.c0 = new c1(handler2, this.b);
        boolean D0 = this.f4559a.D0();
        this.d0 = D0;
        this.e0 = t7.e(this.b);
        this.h0 = -1;
        this.k0 = new AtomicBoolean();
        this.l0 = new AtomicBoolean();
        this.m0 = -2L;
        this.n0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.Q = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(dVar);
        appLovinVideoView.setOnCompletionListener(dVar);
        appLovinVideoView.setOnErrorListener(dVar);
        bVar.i().putString("video_view_address", j8.a(appLovinVideoView));
        View view = new View(activity);
        this.P = view;
        boolean z = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) lVar.a(c5.r1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(lVar, c5.e0, activity, dVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(lVar, c5.e0, activity, dVar));
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.d2$$ExternalSyntheticLambda2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean a2;
                    a2 = d2.a(view2, motionEvent);
                    return a2;
                }
            });
        }
        e eVar = new e(this, aVar);
        if (bVar.f0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.X(), activity);
            this.S = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        } else {
            this.S = null;
        }
        if (a(this.e0, lVar)) {
            ImageView imageView = new ImageView(activity);
            this.U = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(eVar);
            e(this.e0);
        } else {
            this.U = null;
        }
        if (D0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) lVar.a(c5.p2)).intValue(), R.attr.progressBarStyleLarge);
            this.R = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.R = null;
        }
        int c2 = c();
        if (((Boolean) lVar.a(c5.Z1)).booleanValue() && c2 > 0) {
            z = true;
        }
        if (this.T == null && z) {
            this.T = new k0(activity);
            int t = bVar.t();
            this.T.setTextColor(t);
            this.T.setTextSize(((Integer) lVar.a(c5.Y1)).intValue());
            this.T.setFinishedStrokeColor(t);
            this.T.setFinishedStrokeWidth(((Integer) lVar.a(c5.X1)).intValue());
            this.T.setMax(c2);
            this.T.setProgress(c2);
            c1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(c2));
        }
        if (!bVar.m0()) {
            this.V = null;
            return;
        }
        Long l = (Long) lVar.a(c5.m2);
        Integer num = (Integer) lVar.a(c5.n2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.V = progressBar;
        a(progressBar, bVar.l0(), num.intValue());
        c1Var.a("PROGRESS_BAR", l.longValue(), new b(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.a();
            com.applovin.impl.a aVar2 = this.R;
            Objects.requireNonNull(aVar2);
            a(new d2$$ExternalSyntheticLambda8(aVar2), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.m0 = -1L;
        this.n0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.r = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.i0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.b.o0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else {
            if (this.h0 < 0) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a("AppLovinFullscreenActivity", "Invalid last video position");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.h0 + "ms for MediaPlayer: " + this.O);
            }
            this.Q.seekTo(this.h0);
            this.Q.start();
            this.b0.b();
            this.h0 = -1;
            a(new Runnable() { // from class: com.applovin.impl.d2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    d2.this.I();
                }
            }, 250L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.l0.compareAndSet(false, true)) {
            a(this.S, this.f4559a.f0(), new Runnable() { // from class: com.applovin.impl.d2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    d2.this.J();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z) {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable == null) {
            ImageViewUtils.setImageUri(this.U, z ? this.f4559a.I() : this.f4559a.d0(), this.b);
            return;
        }
        this.U.setScaleType(ImageView.ScaleType.FIT_XY);
        this.U.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
    }

    private void f(boolean z) {
        this.g0 = C();
        if (z) {
            this.Q.pause();
        } else {
            this.Q.stopPlayback();
        }
    }

    @Override // com.applovin.impl.y1
    protected void A() {
        this.N.a(this.l);
        this.r = SystemClock.elapsedRealtime();
    }

    protected int C() {
        long currentPosition = this.Q.getCurrentPosition();
        if (this.j0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f0) * 100.0f) : this.g0;
    }

    public void D() {
        this.z++;
        if (this.f4559a.v()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            R();
        }
    }

    protected void E() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.d2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                d2.this.H();
            }
        });
    }

    protected boolean F() {
        if (this.K && this.f4559a.a1()) {
            return true;
        }
        return G();
    }

    protected boolean G() {
        return C() >= this.f4559a.h0();
    }

    protected void N() {
        long R;
        long millis;
        if (this.f4559a.Q() >= 0 || this.f4559a.R() >= 0) {
            if (this.f4559a.Q() >= 0) {
                R = this.f4559a.Q();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f4559a;
                long j = this.f0;
                long j2 = j > 0 ? j : 0L;
                if (aVar.W0()) {
                    int k1 = (int) ((com.applovin.impl.sdk.ad.a) this.f4559a).k1();
                    if (k1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(k1);
                    } else {
                        int s = (int) aVar.s();
                        if (s > 0) {
                            millis = TimeUnit.SECONDS.toMillis(s);
                        }
                    }
                    j2 += millis;
                }
                R = (long) (j2 * (this.f4559a.R() / 100.0d));
            }
            c(R);
        }
    }

    protected boolean P() {
        return (this.w || this.i0 || !this.Q.isPlaying()) ? false : true;
    }

    protected void Q() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.d2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d2.this.K();
            }
        });
    }

    public void R() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f4559a.d1());
        long O = this.f4559a.O();
        if (O > 0) {
            this.s = 0L;
            Long l = (Long) this.b.a(c5.u2);
            Integer num = (Integer) this.b.a(c5.x2);
            ProgressBar progressBar = new ProgressBar(this.d, null, R.attr.progressBarStyleHorizontal);
            this.W = progressBar;
            a(progressBar, this.f4559a.N(), num.intValue());
            this.c0.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new c(O, num, l));
            this.c0.b();
        }
        this.N.a(this.k, this.j, b(), this.W);
        a("javascript:al_onPoststitialShow(" + this.z + "," + this.A + ");", this.f4559a.y());
        if (this.k != null) {
            if (this.f4559a.s() >= 0) {
                a(this.k, this.f4559a.s(), new Runnable() { // from class: com.applovin.impl.d2$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        d2.this.L();
                    }
                });
            } else {
                this.k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.k;
        if (gVar != null) {
            arrayList.add(new m4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new m4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = this.W;
        if (progressBar2 != null) {
            arrayList.add(new m4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f4559a.getAdEventTracker().b(b(), arrayList);
        p();
        this.i0 = true;
    }

    public void S() {
        this.m0 = SystemClock.elapsedRealtime() - this.n0;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.m0 + "ms");
        }
        D();
    }

    protected void T() {
        MediaPlayer mediaPlayer = this.O;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f = this.e0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            boolean z = !this.e0;
            this.e0 = z;
            e(z);
            a(this.e0, 0L);
        } catch (Throwable unused) {
        }
    }

    protected void d(long j) {
        this.f0 = j;
    }

    protected void g(String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f4559a);
        }
        if (this.k0.compareAndSet(false, true)) {
            if (((Boolean) this.b.a(c5.P0)).booleanValue()) {
                this.b.I().d(this.f4559a, com.applovin.impl.sdk.l.p());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.G;
            if (appLovinAdDisplayListener instanceof p2) {
                ((p2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f4559a instanceof u7 ? "handleVastVideoError" : "handleVideoError";
            this.b.E().a(str2, str, this.f4559a);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            this.b.g().a(h2.I, this.f4559a, hashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.y1
    protected void m() {
        super.a(C(), this.d0, F(), this.m0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f4559a.getAdIdNumber() && this.d0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !s0.a(i)) || this.j0 || this.Q.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.y1
    public void r() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.d0) {
                AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.Q;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.Q.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.O;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.r();
    }

    @Override // com.applovin.impl.y1
    public void v() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.h0 = this.Q.getCurrentPosition();
        this.Q.pause();
        this.b0.c();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Paused video at position " + this.h0 + "ms");
        }
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.y1
    public void b(long j) {
        a(new Runnable() { // from class: com.applovin.impl.d2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                d2.this.M();
            }
        }, j);
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        String str;
        this.N.a(this.U, this.S, this.R, this.V, this.T, this.Q, this.P, b(), this.j, this.X, viewGroup);
        if (p0.d() && (str = this.b.p0().getExtraParameters().get("audio_focus_request")) != null) {
            this.Q.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.Q.setVideoURI(this.f4559a.n0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.Q.start();
        if (this.d0) {
            Q();
        }
        b().renderAd(this.f4559a);
        if (this.S != null) {
            this.b.s0().a(new x6(this.b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.d2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    d2.this.O();
                }
            }), i6.b.TIMEOUT, this.f4559a.g0(), true);
        }
        super.b(this.e0);
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        this.N.a((View) this.S);
        if (!h() || this.i0) {
            A();
        }
    }

    @Override // com.applovin.impl.y1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.y1
    protected void a(String str, long j) {
        super.a(str, j);
    }

    private void a(ProgressBar progressBar, int i, int i2) {
        progressBar.setMax(i2);
        progressBar.setPadding(0, 0, 0, 0);
        progressBar.setProgressTintList(ColorStateList.valueOf(i));
    }

    @Override // com.applovin.impl.y1
    public void a(boolean z) {
        super.a(z);
        if (z) {
            b(0L);
            if (this.i0) {
                this.c0.b();
                return;
            }
            return;
        }
        if (this.i0) {
            this.c0.c();
        } else {
            v();
        }
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        this.b0.a();
        this.c0.a();
        this.Z.removeCallbacksAndMessages(null);
        this.a0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.b.a(c5.W6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f4559a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    protected void a(MotionEvent motionEvent) {
        Context context;
        if (this.f4559a.C0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri e0 = this.f4559a.e0();
            if (e0 != null) {
                if (!((Boolean) this.b.a(c5.w)).booleanValue() || (context = this.d) == null) {
                    context = b() != null ? b().getContext() : com.applovin.impl.sdk.l.p();
                }
                this.b.l().trackAndLaunchVideoClick(this.f4559a, e0, motionEvent, this, context);
                x2.a(this.F, this.f4559a);
                this.A++;
            }
        }
    }

    private static boolean a(boolean z, com.applovin.impl.sdk.l lVar) {
        if (!((Boolean) lVar.a(c5.e2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) lVar.a(c5.f2)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) lVar.a(c5.h2)).booleanValue();
    }
}
