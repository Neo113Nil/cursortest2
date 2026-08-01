package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.vungle.ads.internal.o1;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.nativead.NativeVideoListener;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes7.dex */
public final class d extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12167a;
    public final ViewTreeObserver.OnScrollChangedListener b;
    public final ViewTreeObserver.OnGlobalLayoutListener c;
    public float d;
    public TextureView e;
    public Surface f;
    public MediaPlayer g;
    public Uri h;
    public AtomicBoolean i;
    public AtomicBoolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public com.vungle.ads.nativead.b t;
    public b u;
    public int v;
    public final Handler w;
    public final a x;
    public Function0 y;

    public /* synthetic */ d(Context context) {
        this(context, null);
    }

    public static final void a(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c();
    }

    public static final void b(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c();
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    public final void c() {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.f12167a) {
            if (!e() || !this.k || this.l) {
                if (this.i.get() && (mediaPlayer = this.g) != null && mediaPlayer.isPlaying()) {
                    boolean z = u.f12190a;
                    t.a("NativeAd-Video", "auto-pause: visibility NOT enough");
                    g();
                    return;
                }
                return;
            }
            if (!this.i.get() || (surface = this.f) == null || !surface.isValid()) {
                k();
                return;
            }
            MediaPlayer mediaPlayer2 = this.g;
            if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.q) {
                boolean z2 = u.f12190a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("auto-resume: visibility OK, start() at pos=");
                MediaPlayer mediaPlayer3 = this.g;
                t.a("NativeAd-Video", a2.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null).append(" ms").toString());
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                f();
            }
        }
    }

    public final void d() {
        if (this.g != null) {
            return;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) this.y.invoke();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                d.a(d.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda1
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i, int i2) {
                d.a(d.this, mediaPlayer2, i, i2);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                d.b(d.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda3
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return d.b(d.this, mediaPlayer2, i, i2);
            }
        });
        this.g = mediaPlayer;
    }

    public final boolean e() {
        if (!isShown()) {
            return false;
        }
        if (!getGlobalVisibleRect(new Rect())) {
            return false;
        }
        long height = getHeight() * getWidth();
        return height > 0 && ((float) (r0.height() * r0.width())) / ((float) height) >= this.d;
    }

    public final void f() {
        NativeVideoListener nativeVideoListener;
        this.w.removeCallbacks(this.x);
        this.w.post(this.x);
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar == null || (nativeVideoListener = ((m) bVar).getNativeVideoListener()) == null) {
            return;
        }
        nativeVideoListener.onVideoPlay();
    }

    public final void g() {
        Object m8079constructorimpl;
        NativeVideoListener nativeVideoListener;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null && this.i.get() && mediaPlayer.isPlaying()) {
            boolean z = u.f12190a;
            t.a("NativeAd-Video", com.iab.omid.library.vungle.internal.l.a("pauseInternal(): pos=").append(mediaPlayer.getCurrentPosition()).append(" ms").toString());
            mediaPlayer.pause();
            this.w.removeCallbacks(this.x);
            b();
            com.vungle.ads.nativead.b bVar = this.t;
            if (bVar != null && (nativeVideoListener = ((m) bVar).getNativeVideoListener()) != null) {
                nativeVideoListener.onVideoPause();
            }
        } else {
            boolean z2 = u.f12190a;
            t.a("NativeAd-Video", "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.m));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(this.m);
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = valueOf;
        }
        this.m = ((Number) m8079constructorimpl).intValue();
    }

    public final int getCurrentPositionMs() {
        Object m8079constructorimpl;
        if (!this.i.get()) {
            return RangesKt.coerceAtLeast(this.m, 0);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.g;
            m8079constructorimpl = Result.m8079constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.m));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(this.m);
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = valueOf;
        }
        return RangesKt.coerceAtLeast(((Number) m8079constructorimpl).intValue(), 0);
    }

    public final int getDurationMs() {
        return this.n;
    }

    public final Function0<MediaPlayer> getMediaPlayerFactory$vungle_ads_release() {
        return this.y;
    }

    public final Surface getSurface$vungle_ads_release() {
        return this.f;
    }

    public final TextureView getTexture$vungle_ads_release() {
        return this.e;
    }

    public final void h() {
        this.l = true;
        g();
    }

    public final void i() {
        Surface surface;
        this.k = true;
        this.l = false;
        this.q = false;
        boolean z = u.f12190a;
        StringBuilder append = com.iab.omid.library.vungle.internal.l.a("play(): prepared=").append(this.i).append(", surfaceValid=");
        Surface surface2 = this.f;
        t.a("NativeAd-Video", append.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null).append(", visible=").append(e()).toString());
        if (!this.i.get() || (surface = this.f) == null || !surface.isValid() || !e()) {
            k();
            return;
        }
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("play(): pos=");
            MediaPlayer mediaPlayer2 = this.g;
            t.a("NativeAd-Video", a2.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null).append(" ms").toString());
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.start();
            }
            f();
        }
    }

    public final void j() {
        if (this.k && this.l && !this.q) {
            i();
        }
    }

    public final void k() {
        Object m8079constructorimpl;
        Uri uri;
        try {
            Result.Companion companion = Result.INSTANCE;
            uri = this.h;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (uri != null && !this.i.get() && !this.j.get()) {
            d();
            this.j.set(true);
            this.i.set(false);
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = this.g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setLooping(this.p);
            }
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setSurface(this.f);
            }
            MediaPlayer mediaPlayer4 = this.g;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setDataSource(getContext(), uri);
            }
            boolean z = u.f12190a;
            StringBuilder append = new StringBuilder("prepareAsync(): uri=").append(uri).append(", surfaceValid=");
            Surface surface = this.f;
            Unit unit = null;
            t.a("NativeAd-Video", append.append(surface != null ? Boolean.valueOf(surface.isValid()) : null).toString());
            MediaPlayer mediaPlayer5 = this.g;
            if (mediaPlayer5 != null) {
                mediaPlayer5.prepareAsync();
                unit = Unit.INSTANCE;
            }
            m8079constructorimpl = Result.m8079constructorimpl(unit);
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
            if (m8082exceptionOrNullimpl != null) {
                String valueOf = String.valueOf(m8082exceptionOrNullimpl.getLocalizedMessage());
                com.vungle.ads.nativead.b bVar = this.t;
                if (bVar != null) {
                    ((m) bVar).a(valueOf, -1);
                }
            }
        }
    }

    public final void l() {
        Object m8079constructorimpl;
        Object m8079constructorimpl2;
        Object m8079constructorimpl3;
        Unit unit;
        Unit unit2;
        Unit unit3;
        boolean z = u.f12190a;
        t.a("NativeAd-Video", "release()");
        StringBuilder sb = new StringBuilder("pause() at pos=");
        MediaPlayer mediaPlayer = this.g;
        t.a("NativeAd-Video", sb.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null).append(" ms").toString());
        this.l = true;
        this.k = false;
        g();
        this.w.removeCallbacks(this.x);
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer2 = this.g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setSurface(null);
                unit3 = Unit.INSTANCE;
            } else {
                unit3 = null;
            }
            m8079constructorimpl = Result.m8079constructorimpl(unit3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            boolean z2 = u.f12190a;
            t.a("NativeAd-Video", "Failed to clear Surface", m8082exceptionOrNullimpl);
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.stop();
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            m8079constructorimpl2 = Result.m8079constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m8082exceptionOrNullimpl2 = Result.m8082exceptionOrNullimpl(m8079constructorimpl2);
        if (m8082exceptionOrNullimpl2 != null) {
            boolean z3 = u.f12190a;
            t.a("NativeAd-Video", "Failed to stop MediaPlayer", m8082exceptionOrNullimpl2);
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            MediaPlayer mediaPlayer4 = this.g;
            if (mediaPlayer4 != null) {
                mediaPlayer4.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m8079constructorimpl3 = Result.m8079constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable m8082exceptionOrNullimpl3 = Result.m8082exceptionOrNullimpl(m8079constructorimpl3);
        if (m8082exceptionOrNullimpl3 != null) {
            boolean z4 = u.f12190a;
            t.a("NativeAd-Video", "Failed to release MediaPlayer", m8082exceptionOrNullimpl3);
        }
        this.g = null;
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
        this.i.set(false);
        this.j.set(false);
    }

    public final void m() {
        boolean z = u.f12190a;
        t.a("NativeAd-Video", "setAutoVisibility enabled=true threshold=0.01");
        this.f12167a = true;
        this.d = RangesKt.coerceIn(0.01f, 0.0f, 1.0f);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z = u.f12190a;
        t.a("NativeAd-Video", "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.b);
        getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z = u.f12190a;
        t.a("NativeAd-Video", "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.b);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
        g();
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture st, int i, int i2) {
        Object m8079constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(st, "st");
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(st);
        this.f = surface2;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface2);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m8079constructorimpl = Result.m8079constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            boolean z = u.f12190a;
            t.a("NativeAd-Video", "Failed to set surface", m8082exceptionOrNullimpl);
        }
        boolean m8086isSuccessimpl = Result.m8086isSuccessimpl(m8079constructorimpl);
        boolean z2 = u.f12190a;
        t.a("NativeAd-Video", "onSurfaceTextureAvailable(): " + i + " x " + i2 + ", prepared=" + this.i + ", wantPlay=" + this.k + ", surfaceRet=" + m8086isSuccessimpl);
        if (m8086isSuccessimpl && this.i.get() && this.k) {
            t.a("NativeAd-Video", com.iab.omid.library.vungle.internal.l.a("onSurfaceTextureAvailable and videoCompleted=").append(this.q).toString());
            if (this.q) {
                this.m = RangesKt.coerceAtLeast(this.n, 0);
                t.a("NativeAd-Video", com.iab.omid.library.vungle.internal.l.a("seekTo ").append(this.m).toString());
                if (this.i.get()) {
                    MediaPlayer mediaPlayer2 = this.g;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.seekTo(this.m);
                    }
                    b();
                }
                MediaPlayer mediaPlayer3 = this.g;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.pause();
                }
            } else {
                MediaPlayer mediaPlayer5 = this.g;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.start();
                }
                f();
            }
        } else {
            k();
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
        Object m8079constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(st, "st");
        boolean z = u.f12190a;
        t.a("NativeAd-Video", "onSurfaceTextureDestroyed()");
        g();
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m8079constructorimpl = Result.m8079constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            boolean z2 = u.f12190a;
            t.a("NativeAd-Video", "Failed to clear surface", m8082exceptionOrNullimpl);
        }
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
        this.w.removeCallbacks(this.x);
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture st, int i, int i2) {
        Intrinsics.checkNotNullParameter(st, "st");
        boolean z = u.f12190a;
        t.a("NativeAd-Video", "onSurfaceTextureSizeChanged() width=" + i + " height=" + i2);
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
    }

    public final void setLooping(boolean z) {
        boolean z2 = u.f12190a;
        t.a("NativeAd-Video", com.iab.omid.library.vungle.internal.l.a("setLooping to ").append(this.p).toString());
        this.p = z;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(z);
    }

    public final void setMediaPlayerFactory$vungle_ads_release(Function0<? extends MediaPlayer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.y = function0;
    }

    public final void setMuted(boolean z) {
        boolean z2 = u.f12190a;
        t.a("NativeAd-Video", "setMuted to " + z);
        this.o = z;
        float f = z ? 0.0f : 1.0f;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar != null) {
            m mVar = (m) bVar;
            if (z) {
                o1.a(mVar.getInternal(), "video.mute");
                mVar.getInternal().a(9, (Map) null);
                NativeVideoListener nativeVideoListener = mVar.getNativeVideoListener();
                if (nativeVideoListener != null) {
                    nativeVideoListener.onVideoMute();
                    return;
                }
                return;
            }
            o1.a(mVar.getInternal(), "video.unmute");
            mVar.getInternal().a(10, (Map) null);
            NativeVideoListener nativeVideoListener2 = mVar.getNativeVideoListener();
            if (nativeVideoListener2 != null) {
                nativeVideoListener2.onVideoUnmute();
            }
        }
    }

    public final void setSource(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.h = uri;
        this.i.set(false);
        this.j.set(false);
        this.r = 0;
        this.s = 0;
        k();
    }

    public final void setSurface$vungle_ads_release(Surface surface) {
        this.f = surface;
    }

    public final void setTexture$vungle_ads_release(TextureView textureView) {
        Intrinsics.checkNotNullParameter(textureView, "<set-?>");
        this.e = textureView;
    }

    public final void setVideoLifecycleCallback(com.vungle.ads.nativead.b lifecycleCallback) {
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        this.t = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(b bVar) {
        this.u = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda4
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                d.b(d.this);
            }
        };
        this.c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.a(d.this);
            }
        };
        this.d = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.e = textureView;
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.v = -1;
        this.w = new Handler(Looper.getMainLooper());
        this.x = new a(this);
        this.y = c.f12166a;
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.e, new FrameLayout.LayoutParams(-1, -1));
    }

    public static final void a(d this$0, MediaPlayer mediaPlayer) {
        Surface surface;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.nativead.b bVar = this$0.t;
        if (bVar != null) {
            ((m) bVar).b();
        }
        this$0.n = mediaPlayer.getDuration();
        this$0.j.set(false);
        this$0.i.set(true);
        int i = this$0.m;
        if (i > 0) {
            mediaPlayer.seekTo(i);
        }
        float f = this$0.o ? 0.0f : 1.0f;
        MediaPlayer mediaPlayer2 = this$0.g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(f, f);
        }
        boolean z = u.f12190a;
        t.a("NativeAd-Video", com.iab.omid.library.vungle.internal.l.a("onPrepared(): duration=").append(this$0.n).append(" ms lastPos=").append(this$0.m).append(" wantPlay=").append(this$0.k).toString());
        if (this$0.k && (surface = this$0.f) != null && surface.isValid()) {
            t.a("NativeAd-Video", "start video on prepared.");
            mediaPlayer.start();
            this$0.f();
        }
    }

    public static final void b(d this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = u.f12190a;
        t.a("NativeAd-Video", "onCompletion()");
        this$0.m = this$0.n;
        this$0.q = true;
        this$0.w.removeCallbacks(this$0.x);
        this$0.b();
        this$0.v = 100;
        com.vungle.ads.nativead.b bVar = this$0.t;
        if (bVar != null) {
            ((m) bVar).a(100);
        }
        com.vungle.ads.nativead.b bVar2 = this$0.t;
        if (bVar2 != null) {
            m mVar = (m) bVar2;
            o1.a(mVar.getInternal(), "video.close");
            mVar.getInternal().a(3, (Map) null);
            NativeVideoListener nativeVideoListener = mVar.getNativeVideoListener();
            if (nativeVideoListener != null) {
                nativeVideoListener.onVideoEnd();
            }
        }
    }

    public static final boolean b(d this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = u.f12190a;
        t.c("NativeAd-Video", "onError(): what=" + i + ", extra=" + i2);
        this$0.j.set(false);
        this$0.i.set(false);
        String valueOf = String.valueOf(i2);
        com.vungle.ads.nativead.b bVar = this$0.t;
        if (bVar == null) {
            return true;
        }
        ((m) bVar).a(valueOf, i);
        return true;
    }

    public final void b() {
        int coerceIn;
        int i = this.n;
        if (i <= 0 || !this.i.get() || (coerceIn = RangesKt.coerceIn((int) ((getCurrentPositionMs() * 100) / i), 0, 100)) == this.v) {
            return;
        }
        this.v = coerceIn;
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar != null) {
            ((m) bVar).a(coerceIn);
        }
    }

    public static final void a(d this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this$0.r = i;
        this$0.s = i2;
        SurfaceTexture surfaceTexture = this$0.e.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this$0.a();
    }

    public final void a() {
        float f;
        if (this.r <= 0 || this.s <= 0) {
            return;
        }
        int width = this.e.getWidth();
        int height = this.e.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = this.r / this.s;
        Matrix matrix = new Matrix();
        if (f4 > f5) {
            f = f3 / this.s;
        } else {
            f = f2 / this.r;
        }
        matrix.setScale((this.r * f) / f2, (this.s * f) / f3, f2 / 2.0f, f3 / 2.0f);
        this.e.setTransform(matrix);
        this.e.invalidate();
        float f6 = (f2 - (this.r * f)) / 2.0f;
        float f7 = (f3 - (this.s * f)) / 2.0f;
        b bVar = this.u;
        if (bVar != null) {
            bVar.a(this.e.getX() + f6, this.e.getY() + f7);
        }
    }
}
