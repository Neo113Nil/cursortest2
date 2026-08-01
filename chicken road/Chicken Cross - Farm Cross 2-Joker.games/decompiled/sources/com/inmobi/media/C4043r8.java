package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.transition.TransitionManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.U3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4043r8 {
    public final C3987p8 A;
    public final C3815j8 B;
    public final MutableSharedFlow C;

    /* renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f7345a;
    public final Y9 b;
    public final CoroutineScope c;
    public final CoroutineScope d;
    public final HtmlVideoPlayerConfig e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final List i;
    public final AtomicReference j;
    public final MutableSharedFlow k;
    public final C8 l;
    public final ProgressBar m;
    public final ExoPlayer n;
    public String o;
    public WeakReference p;
    public final List q;
    public Kh r;
    public long s;
    public Job t;
    public Mo u;
    public Mo v;
    public final C3783i3 w;
    public final V6 x;
    public final C4182w8 y;
    public final U8 z;

    public C4043r8(Context context, AdConfig.HybridNativeConfig hybridNativeConfig, CoroutineScope coroutineScope, HtmlVideoPlayerRequest htmlVideoPlayerRequest, Y9 y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(htmlVideoPlayerRequest, "htmlVideoPlayerRequest");
        this.f7345a = htmlVideoPlayerRequest;
        this.b = y9;
        this.c = AbstractC4012q5.a(coroutineScope, new C3959o8(CoroutineExceptionHandler.INSTANCE, this));
        CoroutineScope a2 = AbstractC4012q5.a(coroutineScope);
        this.d = a2;
        HtmlVideoPlayerConfig config = htmlVideoPlayerRequest.getConfig();
        this.e = config;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.i = synchronizedList;
        Kh kh = Kh.f6674a;
        this.j = new AtomicReference(kh);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.k = MutableSharedFlow$default;
        C8 c8 = new C8(context);
        this.l = c8;
        this.m = new ProgressBar(context);
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.n = build;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList2, "synchronizedList(...)");
        this.q = synchronizedList2;
        this.r = kh;
        this.u = new Mo();
        this.v = new Mo();
        this.w = (C3783i3) C3783i3.g.getValue();
        this.x = new V6(build, hybridNativeConfig, a2, config.getPlaybackUpdateInterval(), MutableSharedFlow$default, config.getTrackPercentages());
        Context context2 = c8.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.y = new C4182w8(context2, a2, build, config.getMuted(), MutableSharedFlow$default);
        U8 u8 = new U8(a2, build, c8, y9);
        C3647d8 c3647d8 = new C3647d8(this);
        C4099t8 c4099t8 = u8.d;
        c4099t8.f = c3647d8;
        c4099t8.f7388a.setOnPositionChangeListener(c3647d8);
        this.z = u8;
        this.A = new C3987p8(this);
        this.B = new C3815j8(this);
        this.C = MutableSharedFlow$default;
    }

    public final void a(AbstractC3691eo abstractC3691eo) {
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C3843k8(this, abstractC3691eo, null), 3, null);
    }

    public final HtmlVideoPlaybackState b() {
        String str;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        int ordinal = c().ordinal();
        if (ordinal == 2) {
            P8[] p8Arr = P8.f6778a;
            str = U3.i.s;
        } else if (ordinal == 3) {
            P8[] p8Arr2 = P8.f6778a;
            str = U3.i.f0;
        } else if (ordinal == 4) {
            P8[] p8Arr3 = P8.f6778a;
            str = U3.i.e0;
        } else if (ordinal == 5) {
            P8[] p8Arr4 = P8.f6778a;
            str = U3.i.h0;
        } else if (ordinal != 6) {
            P8[] p8Arr5 = P8.f6778a;
            str = "loading";
        } else {
            P8[] p8Arr6 = P8.f6778a;
            str = U3.i.t;
        }
        htmlVideoPlaybackState.setState(str);
        htmlVideoPlaybackState.setDuration(this.n.getDuration() / 1000.0f);
        htmlVideoPlaybackState.setTime(this.n.getCurrentPosition() / 1000.0f);
        htmlVideoPlaybackState.setMuted(this.y.e);
        return htmlVideoPlaybackState;
    }

    public final Kh c() {
        Object obj = this.j.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Kh) obj;
    }

    public final void d() {
        if (!this.h.get() && c() == Kh.d) {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C3759h8(null, this), 3, null);
                return;
            }
            this.n.pause();
            this.x.a();
            C4182w8 c4182w8 = this.y;
            c4182w8.b.setVolume(0.0f);
            c4182w8.d.a();
            this.j.set(Kh.e);
            a(new C3636cp(this.n.getCurrentPosition()));
        }
    }

    public final void e() {
        Job launch$default;
        Job launch$default2;
        if (this.h.get()) {
            return;
        }
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).b("HtmlMediaPlayer", "playVideo called");
        }
        if (c() != Kh.e && c() != Kh.c && c() != Kh.f) {
            Y9 y92 = this.b;
            if (y92 != null) {
                ((Z9) y92).b("HtmlMediaPlayer", "playVideo: Player not in playable state");
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C3788i8(null, this), 3, null);
            return;
        }
        if (c() == Kh.f) {
            this.n.seekTo(0L);
            this.j.set(Kh.c);
        }
        C4182w8 c4182w8 = this.y;
        if (c4182w8.e) {
            c4182w8.a();
            c4182w8.d.a();
        } else {
            AbstractC4012q5.a(c4182w8.f7453a, new C4155v8(c4182w8, null));
        }
        V6 v6 = this.x;
        if (!v6.d.getAndSet(true)) {
            CoroutineScope coroutineScope = v6.b;
            long j = v6.k;
            T6 action = new T6(v6, null);
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain().getImmediate(), null, new C3643d4(j, null, action), 2, null);
            v6.e = launch$default;
            CoroutineScope coroutineScope2 = v6.b;
            long j2 = v6.l;
            U6 action2 = new U6(v6, null);
            Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
            Intrinsics.checkNotNullParameter(action2, "action");
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain().getImmediate(), null, new C3643d4(j2, null, action2), 2, null);
            v6.f = launch$default2;
        }
        this.n.play();
        this.j.set(Kh.d);
        a(new C4172vp(this.n.getCurrentPosition()));
    }

    public final void f() {
        Job launch$default;
        if (this.h.get()) {
            return;
        }
        String str = this.o;
        if (str != null) {
            for (HtmlVideoFile htmlVideoFile : this.q) {
                if (Intrinsics.areEqual(htmlVideoFile.getUrl(), str)) {
                    break;
                }
            }
        }
        htmlVideoFile = null;
        if (htmlVideoFile == null) {
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).b("HtmlMediaPlayer", "start() called before successful load – ignoring");
                return;
            }
            return;
        }
        if (!this.g.get()) {
            this.g.set(true);
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new X7(new C3562a8(this.C), null, this), 3, null);
            List activeJobs = this.i;
            Intrinsics.checkNotNullParameter(launch$default, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
        }
        if (!this.f.get()) {
            this.f.set(true);
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                this.n.addListener(this.B);
            } else {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new V7(null, this), 3, null);
            }
        }
        if (this.e.getAutoplay()) {
            e();
        }
    }

    public final void g() {
        if (this.h.get()) {
            return;
        }
        if (c() == Kh.d) {
            d();
        }
        if (this.f.get()) {
            this.f.set(false);
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                this.n.removeListener(this.B);
            } else {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C3902m8(null, this), 3, null);
            }
        }
        this.x.a();
        this.g.set(false);
        AbstractC4012q5.a(this.i);
    }

    public final void a(RelativeLayout parentView) {
        Y9 y9;
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (this.h.get()) {
            return;
        }
        this.p = new WeakReference(parentView);
        U8 u8 = this.z;
        C3987p8 surfaceViewabilityListener = this.A;
        u8.getClass();
        Intrinsics.checkNotNullParameter(surfaceViewabilityListener, "surfaceViewabilityListener");
        AbstractC4012q5.a(u8.f6886a, new S8(u8, surfaceViewabilityListener, null));
        C8 c8 = this.l;
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        VideoViewPosition videoViewPosition2 = this.e.getVideoViewPosition();
        if (this.e.getFullscreenEnabled()) {
            videoViewPosition.setX(0);
            videoViewPosition.setY(0);
            videoViewPosition.setWidth(-1);
            videoViewPosition.setHeight(-1);
        } else {
            videoViewPosition.setX(videoViewPosition2 != null ? (int) (AbstractC3841k6.b() * videoViewPosition2.getX()) : 0);
            videoViewPosition.setY(videoViewPosition2 != null ? (int) (AbstractC3841k6.b() * videoViewPosition2.getY()) : 0);
            videoViewPosition.setWidth(videoViewPosition2 != null ? (int) (AbstractC3841k6.b() * videoViewPosition2.getWidth()) : -2);
            videoViewPosition.setHeight(videoViewPosition2 != null ? (int) (AbstractC3841k6.b() * videoViewPosition2.getHeight()) : -2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(videoViewPosition.getWidth(), videoViewPosition.getHeight());
        if (this.e.getFullscreenEnabled()) {
            layoutParams.addRule(13, -1);
        } else {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        c8.setLayoutParams(layoutParams);
        this.l.setOnPositionChangeListener(new C3703f8(this));
        ViewParent parent = this.m.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.m);
        }
        ProgressBar progressBar = this.m;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(100, 100);
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setVisibility(0);
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.l.addView(this.m, 0);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C3930n8(null, this), 3, null);
        }
        C8 c82 = this.l;
        if (ViewCompat.isAttachedToWindow(c82)) {
            Y9 y92 = this.b;
            if (y92 != null) {
                ((Z9) y92).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
            }
            a(W8.f6927a);
        } else {
            c82.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3674e8(c82, this));
        }
        parentView.addView(this.l, 0);
        if (c() == Kh.c || (y9 = this.b) == null) {
            return;
        }
        ((Z9) y9).b("HtmlMediaPlayer", "inflate() called before successful load – waiting for load to complete");
    }

    public final void a(VideoViewPosition newVideoViewPosition) {
        Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
        if (this.h.get()) {
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C4015q8(null, this, newVideoViewPosition), 3, null);
            return;
        }
        TransitionManager.beginDelayedTransition(this.l);
        this.e.setVideoViewPosition(newVideoViewPosition);
        int b = (int) (AbstractC3841k6.b() * newVideoViewPosition.getWidth());
        int b2 = (int) (AbstractC3841k6.b() * newVideoViewPosition.getHeight());
        C8 c8 = this.l;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b2);
        if (this.e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (AbstractC3841k6.b() * newVideoViewPosition.getX()), (int) (AbstractC3841k6.b() * newVideoViewPosition.getY()), 0, 0);
        }
        c8.setLayoutParams(layoutParams);
        this.l.requestLayout();
    }

    public final void a(K8 k8) {
        Surface surface;
        if (k8 instanceof L8) {
            L8 l8 = (L8) k8;
            this.o = l8.f6691a;
            this.t = null;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C3619c8(null, this, l8), 3, null);
                return;
            }
            this.j.set(Kh.c);
            this.n.seekTo(0L);
            U8 u8 = this.z;
            if (!u8.g && (surface = u8.e) != null) {
                u8.g = true;
                u8.b.setVideoSurface(surface);
            }
            HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
            htmlVideoPlaybackState.setDuration(l8.b / 1000.0f);
            htmlVideoPlaybackState.setVideoUrl(l8.f6691a);
            htmlVideoPlaybackState.setLatency(Long.valueOf(System.currentTimeMillis() - this.s));
            htmlVideoPlaybackState.setMuted(this.y.e);
            P8[] p8Arr = P8.f6778a;
            htmlVideoPlaybackState.setState(U3.i.s);
            htmlVideoPlaybackState.setTime(this.n.getCurrentPosition() / 1000.0f);
            a(new M8(htmlVideoPlaybackState, l8.c));
            return;
        }
        if (k8 instanceof I8) {
            this.j.set(Kh.g);
            this.t = null;
            a(new H8(this.f7345a, ((I8) k8).f6621a.f6768a.f6531a));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a() {
        Mo mo = this.u;
        if (mo.c <= 0 || mo.d <= 0) {
            return;
        }
        Mo mo2 = this.v;
        if (mo2.c <= 0 || mo2.d <= 0) {
            return;
        }
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        videoViewPosition.setX(AbstractC3727g4.a(this.u.f6726a + this.v.f6726a));
        videoViewPosition.setY(AbstractC3727g4.a(this.u.b + this.v.b));
        videoViewPosition.setWidth(AbstractC3727g4.a(this.v.c));
        videoViewPosition.setHeight(AbstractC3727g4.a(this.v.d));
        a(new Q8(videoViewPosition));
    }
}
