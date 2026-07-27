package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.hk;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 implements f1, SurfaceHolder.Callback, Player.Listener, hk.b, c2 {

    /* renamed from: a, reason: collision with root package name */
    public final z7 f4702a;
    public final SurfaceView b;
    public final g1 c;
    public final Lazy d;
    public final Lazy e;
    public boolean f;
    public boolean g;

    public c1(Context context, final v7 exoPlayerFactory, z7 exoPlayerMediaItemFactory, SurfaceView surfaceView, g1 g1Var, final oi uiPoster, final Function3 videoProgressFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.checkNotNullParameter(exoPlayerMediaItemFactory, "exoPlayerMediaItemFactory");
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(videoProgressFactory, "videoProgressFactory");
        this.f4702a = exoPlayerMediaItemFactory;
        this.b = surfaceView;
        this.c = g1Var;
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.c1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c1.a(v7.this, this);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.c1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c1.a(Function3.this, this, uiPoster);
            }
        });
    }

    public static final ExoPlayer a(v7 v7Var, c1 c1Var) {
        ExoPlayer b = v7Var.b();
        b.addListener(c1Var);
        return b;
    }

    @Override // com.chartboost.sdk.impl.kg
    public void a(int i, int i2) {
    }

    public final ExoPlayer b() {
        return (ExoPlayer) this.d.getValue();
    }

    @Override // com.chartboost.sdk.impl.f1
    public void c() {
        b().setVolume(1.0f);
    }

    @Override // com.chartboost.sdk.impl.hk.b
    public long d() {
        return b().getCurrentPosition();
    }

    public final hk e() {
        return (hk) this.e.getValue();
    }

    @Override // com.chartboost.sdk.impl.f1
    public void f() {
        b().setVolume(0.0f);
    }

    @Override // com.chartboost.sdk.impl.f1
    public boolean g() {
        return this.f;
    }

    @Override // com.chartboost.sdk.impl.f1
    public float h() {
        return b().getVolume();
    }

    public final void i() {
        stop();
        l();
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.d();
        }
    }

    public final void j() {
        a(this, 0, 0, 3, null);
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.c();
        }
        g1 g1Var2 = this.c;
        if (g1Var2 != null) {
            g1Var2.b(b().getDuration());
        }
    }

    public final void k() {
        hk.a.a(e(), 0L, 1, null);
    }

    public final void l() {
        e().a();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean z) {
        mb.a("onIsPlayingChanged() - isPlaying: " + z, (Throwable) null, 2, (Object) null);
        if (!z) {
            l();
            return;
        }
        this.f = true;
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.a();
        }
        k();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaybackStateChanged(int i) {
        String b;
        b = d1.b(i);
        mb.a("onPlaybackStateChanged() - playbackState: " + b, (Throwable) null, 2, (Object) null);
        if (i == 2) {
            g1 g1Var = this.c;
            if (g1Var != null) {
                g1Var.b();
                return;
            }
            return;
        }
        if (i == 3) {
            j();
        } else {
            if (i != 4) {
                return;
            }
            i();
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        mb.b("ExoPlayer error", error);
        stop();
        g1 g1Var = this.c;
        if (g1Var != null) {
            String message = error.getMessage();
            if (message == null) {
                message = "No error message from ExoPlayer";
            }
            g1Var.a(message);
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public void pause() {
        mb.a("pause()", (Throwable) null, 2, (Object) null);
        b().pause();
    }

    @Override // com.chartboost.sdk.impl.f1
    public void play() {
        mb.a("play()", (Throwable) null, 2, (Object) null);
        b().setVideoSurfaceView(this.b);
        b().play();
        this.g = false;
    }

    @Override // com.chartboost.sdk.impl.f1
    public void stop() {
        mb.a("stop()", (Throwable) null, 2, (Object) null);
        if (b().isPlaying()) {
            b().stop();
        }
        b().release();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        mb.a("surfaceCreated()", (Throwable) null, 2, (Object) null);
        if (this.g) {
            play();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        mb.a("surfaceDestroyed()", (Throwable) null, 2, (Object) null);
    }

    public final MediaItem b(wj wjVar) {
        MediaItem a2 = this.f4702a.a(wjVar);
        mb.a("VideoAsset.toMediaItem() - " + a2, (Throwable) null, 2, (Object) null);
        return a2;
    }

    public static final hk a(Function3 function3, c1 c1Var, oi oiVar) {
        return (hk) function3.invoke(c1Var.c, c1Var, oiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r4 == null) goto L9;
     */
    @Override // com.chartboost.sdk.impl.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(wj asset) {
        Unit unit;
        Intrinsics.checkNotNullParameter(asset, "asset");
        mb.a("asset() - asset: " + asset, (Throwable) null, 2, (Object) null);
        MediaItem b = b(asset);
        if (b != null) {
            ExoPlayer b2 = b();
            b2.addMediaItem(b);
            b2.prepare();
            SurfaceHolder holder = this.b.getHolder();
            if (holder != null) {
                holder.addCallback(this);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        }
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.a("Error retrieving media item");
        }
        mb.b("Error retrieving media item", (Throwable) null, 2, (Object) null);
        this.f = false;
    }

    public final void b(int i, int i2) {
        pk.a(this.b, b8.b(b()), b8.a(b()), i, i2);
    }

    public static /* synthetic */ void a(c1 c1Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c1Var.b.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = c1Var.b.getHeight();
        }
        c1Var.b(i, i2);
    }

    public /* synthetic */ c1(Context context, v7 v7Var, z7 z7Var, SurfaceView surfaceView, g1 g1Var, oi oiVar, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new v7(context, null, null, null, 14, null) : v7Var, z7Var, surfaceView, (i & 16) != 0 ? null : g1Var, oiVar, function3);
    }

    @Override // com.chartboost.sdk.impl.c2
    public void a() {
        this.g = true;
    }
}
