package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
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
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinWebVideoPlayerView;
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
public class f2 extends y1 implements AppLovinCommunicatorSubscriber {
    private final e2 N;
    private final View O;
    protected final AppLovinWebVideoPlayerView P;
    protected final com.applovin.impl.a Q;
    protected final com.applovin.impl.adview.g R;
    protected k0 S;
    protected final ImageView T;
    protected final ProgressBar U;
    protected ProgressBar V;
    protected ImageView W;
    private final Handler X;
    private final Handler Y;
    protected final c1 Z;
    protected final c1 a0;
    private final boolean b0;
    protected boolean c0;
    protected float d0;
    private int e0;
    private float f0;
    protected boolean g0;
    private boolean h0;
    private final AtomicBoolean i0;
    private final AtomicBoolean j0;
    private final AtomicBoolean k0;
    private long l0;
    private long m0;

    class a implements c1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4196a;

        a(int i) {
            this.f4196a = i;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            f2 f2Var = f2.this;
            if (f2Var.S != null) {
                float currentPosition = this.f4196a - f2Var.P.getCurrentPosition();
                if (currentPosition <= 0.0f) {
                    f2.this.w = true;
                } else if (f2.this.Q()) {
                    f2.this.S.setProgress((int) currentPosition);
                }
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return f2.this.Q();
        }
    }

    class b implements c1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f4197a;

        b(Integer num) {
            this.f4197a = num;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            f2 f2Var = f2.this;
            if (f2Var.g0) {
                f2Var.U.setVisibility(8);
            } else {
                f2.this.U.setProgress((int) ((f2Var.P.getCurrentPosition() / f2.this.d0) * this.f4197a.intValue()));
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !f2.this.g0;
        }
    }

    class c implements c1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4198a;
        final /* synthetic */ Integer b;
        final /* synthetic */ Long c;

        c(long j, Integer num, Long l) {
            this.f4198a = j;
            this.b = num;
            this.c = l;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            f2.this.V.setProgress((int) ((f2.this.s / this.f4198a) * this.b.intValue()));
            f2.this.s += this.c.longValue();
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return f2.this.s < this.f4198a;
        }
    }

    private class d implements AppLovinWebVideoPlayerView.Listener, AppLovinTouchToClickListener.OnClickListener {
        private d() {
        }

        @Override // com.applovin.impl.adview.AppLovinWebVideoPlayerView.Listener
        public void onBuffering(boolean z) {
            com.applovin.impl.sdk.p pVar = f2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                f2.this.c.a("AppLovinFullscreenActivity", "Video buffering: " + z);
            }
            if (z) {
                f2.this.R();
            } else {
                f2.this.F();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            f2.this.a(motionEvent);
        }

        @Override // com.applovin.impl.adview.AppLovinWebVideoPlayerView.Listener
        public void onError(String str) {
            f2.this.g("Video view error (" + str + ")");
            f2.this.P.play();
        }

        @Override // com.applovin.impl.adview.AppLovinWebVideoPlayerView.Listener
        public void onPlaybackStateChanged(boolean z) {
            if (z && f2.this.i0.compareAndSet(false, true)) {
                f2.this.Z.b();
                f2 f2Var = f2.this;
                if (f2Var.R != null) {
                    f2Var.P();
                }
                f2.this.F();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinWebVideoPlayerView.Listener
        public void onVideoEnded() {
            com.applovin.impl.sdk.p pVar = f2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                f2.this.c.a("AppLovinFullscreenActivity", "Video completed");
            }
            f2.this.h0 = true;
            f2 f2Var = f2.this;
            if (!f2Var.u) {
                f2Var.S();
            } else if (f2Var.h()) {
                f2.this.A();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinWebVideoPlayerView.Listener
        public void onVideoLoaded(float f) {
            f2 f2Var = f2.this;
            f2Var.P.setMuted(f2Var.c0);
            f2 f2Var2 = f2.this;
            f2Var2.v = (int) f;
            f2Var2.d0 = f;
            f2Var2.O();
            com.applovin.impl.sdk.p pVar = f2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                f2.this.c.a("AppLovinFullscreenActivity", "Video loaded");
            }
        }

        /* synthetic */ d(f2 f2Var, a aVar) {
            this();
        }
    }

    private class e implements View.OnClickListener {
        private e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f2 f2Var = f2.this;
            if (view == f2Var.R) {
                f2Var.T();
                return;
            }
            if (view == f2Var.T) {
                f2Var.V();
                return;
            }
            com.applovin.impl.sdk.p pVar = f2Var.c;
            if (com.applovin.impl.sdk.p.a()) {
                f2.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ e(f2 f2Var, a aVar) {
            this();
        }
    }

    public f2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.N = new e2(this.f4559a, this.d, this.b);
        a aVar = null;
        this.W = null;
        Handler handler = new Handler(Looper.getMainLooper());
        this.X = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.Y = handler2;
        c1 c1Var = new c1(handler, this.b);
        this.Z = c1Var;
        this.a0 = new c1(handler2, this.b);
        boolean D0 = this.f4559a.D0();
        this.b0 = D0;
        this.c0 = t7.e(this.b);
        this.f0 = -1.0f;
        this.i0 = new AtomicBoolean();
        this.j0 = new AtomicBoolean();
        this.k0 = new AtomicBoolean();
        this.l0 = -2L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinWebVideoPlayerView appLovinWebVideoPlayerView = new AppLovinWebVideoPlayerView(activity, lVar);
        this.P = appLovinWebVideoPlayerView;
        d dVar = new d(this, aVar);
        appLovinWebVideoPlayerView.setListener(dVar);
        bVar.i().putString("video_view_address", j8.a(appLovinWebVideoPlayerView));
        View view = new View(activity);
        this.O = view;
        boolean z = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        appLovinWebVideoPlayerView.setOnTouchListener(new AppLovinTouchToClickListener(lVar, c5.e0, activity, dVar));
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean a2;
                a2 = f2.a(view2, motionEvent);
                return a2;
            }
        });
        e eVar = new e(this, aVar);
        if (bVar.f0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.X(), activity);
            this.R = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        } else {
            this.R = null;
        }
        if (a(this.c0, lVar)) {
            ImageView imageView = new ImageView(activity);
            this.T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(eVar);
            e(this.c0);
        } else {
            this.T = null;
        }
        if (D0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) lVar.a(c5.p2)).intValue(), R.attr.progressBarStyleLarge);
            this.Q = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.Q = null;
        }
        int c2 = c();
        if (((Boolean) lVar.a(c5.Z1)).booleanValue() && c2 > 0) {
            z = true;
        }
        if (this.S == null && z) {
            this.S = new k0(activity);
            int t = bVar.t();
            this.S.setTextColor(t);
            this.S.setTextSize(((Integer) lVar.a(c5.Y1)).intValue());
            this.S.setFinishedStrokeColor(t);
            this.S.setFinishedStrokeWidth(((Integer) lVar.a(c5.X1)).intValue());
            this.S.setMax(c2);
            this.S.setProgress(c2);
            c1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(c2));
        }
        if (!bVar.m0()) {
            this.U = null;
            return;
        }
        Long l = (Long) lVar.a(c5.m2);
        Integer num = (Integer) lVar.a(c5.n2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.U = progressBar;
        a(progressBar, bVar.l0(), num.intValue());
        c1Var.a("PROGRESS_BAR", l.longValue(), new b(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
            com.applovin.impl.a aVar2 = this.Q;
            Objects.requireNonNull(aVar2);
            a(new d2$$ExternalSyntheticLambda8(aVar2), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        this.l0 = -1L;
        this.m0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        this.r = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.g0) {
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
            if (this.f0 < 0.0f) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a("AppLovinFullscreenActivity", "Invalid last video position");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f0 + "s for VideoView: " + this.P);
            }
            this.P.seekTo(this.f0);
            this.P.play();
            this.Z.b();
            this.f0 = -1.0f;
            a(new Runnable() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    f2.this.J();
                }
            }, 250L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.k0.compareAndSet(false, true)) {
            a(this.R, this.f4559a.f0(), new Runnable() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    f2.this.K();
                }
            });
        }
    }

    private void U() {
        this.e0 = D();
        this.P.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z) {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable == null) {
            ImageViewUtils.setImageUri(this.T, z ? this.f4559a.I() : this.f4559a.d0(), this.b);
            return;
        }
        this.T.setScaleType(ImageView.ScaleType.FIT_XY);
        this.T.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
    }

    @Override // com.applovin.impl.y1
    protected void A() {
        this.N.a(this.l);
        this.r = SystemClock.elapsedRealtime();
    }

    protected float C() {
        float f = this.d0;
        float f2 = f > 0.0f ? f + 0.0f : 0.0f;
        com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f4559a;
        if (!aVar.W0()) {
            return f2;
        }
        float k1 = ((com.applovin.impl.sdk.ad.a) this.f4559a).k1();
        if (k1 > 0.0f) {
            return f2 + k1;
        }
        int s = (int) aVar.s();
        return s > 0 ? f2 + s : f2;
    }

    protected int D() {
        if (this.h0) {
            return 100;
        }
        float currentPosition = this.P.getCurrentPosition();
        return currentPosition > 0.0f ? (int) ((currentPosition / this.d0) * 100.0f) : this.e0;
    }

    public void E() {
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
            S();
        }
    }

    protected void F() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                f2.this.I();
            }
        });
    }

    protected boolean G() {
        if (this.K && this.f4559a.a1()) {
            return true;
        }
        return H();
    }

    protected boolean H() {
        return D() >= this.f4559a.h0();
    }

    protected void O() {
        if (this.f4559a.Q() >= 0 || this.f4559a.R() >= 0) {
            if (this.f4559a.Q() >= 0) {
                c(this.f4559a.g());
            } else {
                c(t7.c((float) (C() * (this.f4559a.R() / 100.0d))));
            }
        }
    }

    protected boolean Q() {
        return (this.w || this.g0 || !this.P.isPlaying()) ? false : true;
    }

    protected void R() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                f2.this.L();
            }
        });
    }

    public void S() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        U();
        long O = this.f4559a.O();
        if (O > 0) {
            this.s = 0L;
            Long l = (Long) this.b.a(c5.u2);
            Integer num = (Integer) this.b.a(c5.x2);
            ProgressBar progressBar = new ProgressBar(this.d, null, R.attr.progressBarStyleHorizontal);
            this.V = progressBar;
            a(progressBar, this.f4559a.N(), num.intValue());
            this.a0.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new c(O, num, l));
            this.a0.b();
        }
        this.N.a(this.k, this.j, b(), this.V);
        a("javascript:al_onPoststitialShow(" + this.z + "," + this.A + ");", this.f4559a.y());
        if (this.k != null) {
            if (this.f4559a.s() >= 0) {
                a(this.k, this.f4559a.s(), new Runnable() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        f2.this.M();
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
        ProgressBar progressBar2 = this.V;
        if (progressBar2 != null) {
            arrayList.add(new m4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f4559a.getAdEventTracker().b(b(), arrayList);
        p();
        this.g0 = true;
    }

    public void T() {
        this.l0 = SystemClock.elapsedRealtime() - this.m0;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.l0 + "ms");
        }
        E();
    }

    protected void V() {
        boolean z = !this.c0;
        this.c0 = z;
        this.P.setMuted(z);
        e(this.c0);
        a(this.c0, 0L);
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        this.N.a((View) this.R);
        if (!h() || this.g0) {
            A();
        }
    }

    protected void g(String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f4559a);
        }
        if (this.j0.compareAndSet(false, true)) {
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
        return "FullscreenWebVideoAdPresenter";
    }

    @Override // com.applovin.impl.y1
    protected void m() {
        super.a(D(), this.b0, G(), this.l0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f4559a.getAdIdNumber() && this.b0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !s0.a(i)) || this.h0 || this.P.isPlaying()) {
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
            if (this.b0) {
                AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinWebVideoPlayerView appLovinWebVideoPlayerView = this.P;
            if (appLovinWebVideoPlayerView != null) {
                s8.a(appLovinWebVideoPlayerView);
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
        this.f0 = this.P.getCurrentPosition();
        this.P.pause();
        this.Z.c();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f0 + CmcdData.Factory.STREAMING_FORMAT_SS);
        }
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.y1
    public void b(long j) {
        a(new Runnable() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                f2.this.N();
            }
        }, j);
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        this.N.a(this.T, this.R, this.Q, this.U, this.S, this.P, this.O, b(), this.j, this.W, viewGroup);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.P.loadVideo(this.f4559a.n0().toString(), true, this.c0);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        if (this.b0) {
            R();
        }
        b().renderAd(this.f4559a);
        if (this.R != null) {
            this.b.s0().a(new x6(this.b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    f2.this.P();
                }
            }), i6.b.TIMEOUT, this.f4559a.g0(), true);
        }
        super.b(this.c0);
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
            if (this.g0) {
                this.a0.b();
                return;
            }
            return;
        }
        if (this.g0) {
            this.a0.c();
        } else {
            v();
        }
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        this.Z.a();
        this.a0.a();
        this.X.removeCallbacksAndMessages(null);
        this.Y.removeCallbacksAndMessages(null);
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
