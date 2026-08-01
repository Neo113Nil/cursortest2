package com.chartboost.sdk.impl;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.hk;
import com.chartboost.sdk.impl.yj;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class e1 implements f1, SurfaceHolder.Callback, hk.b, yj.b, c2 {

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f4740a;
    public SurfaceView b;
    public g1 c;
    public final oi d;
    public final Function4 e;
    public final CoroutineDispatcher f;
    public final k8 g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public SurfaceHolder n;
    public jf o;
    public yj p;
    public final hk q;
    public boolean r;
    public float s;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
        public a(Object obj) {
            super(0, obj, e1.class, "startMediaPlayer", "startMediaPlayer$ChartboostMonetization_9_13_0_release()V", 0);
        }

        public final void a() {
            ((e1) this.receiver).n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public e1(MediaPlayer mediaPlayer, SurfaceView surfaceView, g1 g1Var, oi uiPoster, Function3 videoProgressFactory, Function4 videoBufferFactory, CoroutineDispatcher coroutineDispatcher, k8 fileCache) {
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(videoProgressFactory, "videoProgressFactory");
        Intrinsics.checkNotNullParameter(videoBufferFactory, "videoBufferFactory");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        this.f4740a = mediaPlayer;
        this.b = surfaceView;
        this.c = g1Var;
        this.d = uiPoster;
        this.e = videoBufferFactory;
        this.f = coroutineDispatcher;
        this.g = fileCache;
        this.n = surfaceView != null ? surfaceView.getHolder() : null;
        this.q = (hk) videoProgressFactory.invoke(this.c, this, uiPoster);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r2 == null) goto L12;
     */
    @Override // com.chartboost.sdk.impl.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(wj asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Unit unit = null;
        mb.a("asset() - asset: " + asset, (Throwable) null, 2, (Object) null);
        if (this.f4740a != null) {
            yj yjVar = (yj) this.e.invoke(asset, this, this.f, this.g);
            this.p = yjVar;
            this.o = yjVar != null ? yjVar.d() : null;
            SurfaceHolder surfaceHolder = this.n;
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this);
                unit = Unit.INSTANCE;
            }
        }
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.a("Missing media player during startMediaPlayer");
            Unit unit2 = Unit.INSTANCE;
        }
        this.r = false;
    }

    @Override // com.chartboost.sdk.impl.yj.b
    public void b() {
        this.j = true;
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        l();
        MediaPlayer mediaPlayer2 = this.f4740a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.prepareAsync();
        }
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.c();
        }
    }

    public final void c(int i, int i2) {
        mb.b("MediaPlayer error: " + ("error: " + i + " extra: " + i2), (Throwable) null, 2, (Object) null);
        if (this.i) {
            e();
        }
    }

    @Override // com.chartboost.sdk.impl.hk.b
    public long d() {
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer == null) {
            return 0L;
        }
        long currentPosition = mediaPlayer.getCurrentPosition();
        this.h = currentPosition;
        return currentPosition;
    }

    public final void e() {
        if (!this.j || this.l) {
            return;
        }
        yj yjVar = this.p;
        if (yjVar != null) {
            yjVar.a();
        }
        this.l = false;
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.b();
        }
        pause();
        yj yjVar2 = this.p;
        if (yjVar2 != null) {
            yjVar2.c();
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public void f() {
        this.s = 0.0f;
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public boolean g() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.f1
    public float h() {
        return this.s;
    }

    public final void i() {
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.c = null;
        this.f4740a = null;
        this.n = null;
        this.b = null;
        this.p = null;
    }

    public final void j() {
        this.q.a();
    }

    public final void k() {
        hk.a.a(this.q, 0L, 1, null);
    }

    public final void l() {
        FileDescriptor b;
        Unit unit;
        try {
            jf jfVar = this.o;
            if (jfVar != null && (b = jfVar.b()) != null) {
                MediaPlayer mediaPlayer = this.f4740a;
                if (mediaPlayer != null) {
                    mediaPlayer.setDataSource(b);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
            }
            g1 g1Var = this.c;
            if (g1Var != null) {
                g1Var.a("Missing video asset");
            } else {
                mb.b("MediaPlayer missing callback on error", (Throwable) null, 2, (Object) null);
            }
        } catch (IOException e) {
            g1 g1Var2 = this.c;
            if (g1Var2 != null) {
                g1Var2.a(e.toString());
            } else {
                mb.b("MediaPlayer missing callback on IOException", e);
            }
        }
    }

    public final void m() {
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.chartboost.sdk.impl.e1$$ExternalSyntheticLambda0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    e1.this.a(mediaPlayer2);
                }
            });
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.chartboost.sdk.impl.e1$$ExternalSyntheticLambda1
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    return e1.a(e1.this, mediaPlayer2, i, i2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.chartboost.sdk.impl.e1$$ExternalSyntheticLambda2
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    e1.a(e1.this, mediaPlayer2);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.chartboost.sdk.impl.e1$$ExternalSyntheticLambda3
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    return e1.b(e1.this, mediaPlayer2, i, i2);
                }
            });
        }
    }

    public final void n() {
        Unit unit;
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
                this.r = true;
                k();
                g1 g1Var = this.c;
                if (g1Var != null) {
                    g1Var.a();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(this.h, 3);
                } else {
                    mediaPlayer.seekTo((int) this.h);
                }
                unit = Unit.INSTANCE;
            } catch (IllegalStateException e) {
                g1 g1Var2 = this.c;
                if (g1Var2 != null) {
                    g1Var2.a(e.toString());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        g1 g1Var3 = this.c;
        if (g1Var3 != null) {
            g1Var3.a("Missing video player during startVideoPlayer");
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void o() {
        this.d.a(500L, new a(this));
    }

    @Override // com.chartboost.sdk.impl.f1
    public void pause() {
        mb.a("pause()", (Throwable) null, 2, (Object) null);
        if (this.i && this.j) {
            yj yjVar = this.p;
            if (yjVar != null) {
                yjVar.e();
            }
            j();
            try {
                MediaPlayer mediaPlayer = this.f4740a;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Exception e) {
                g1 g1Var = this.c;
                if (g1Var != null) {
                    g1Var.a(e.toString());
                }
            }
            this.h = d();
            this.j = false;
            this.k = true;
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public void play() {
        mb.a("play()", (Throwable) null, 2, (Object) null);
        if (this.i && !this.j) {
            o();
        }
        this.j = true;
        this.k = this.m;
        this.m = false;
    }

    @Override // com.chartboost.sdk.impl.f1
    public void stop() {
        mb.a("stop()", (Throwable) null, 2, (Object) null);
        if (this.i) {
            yj yjVar = this.p;
            if (yjVar != null) {
                yjVar.e();
            }
            this.p = null;
            this.h = 0L;
            j();
            try {
                MediaPlayer mediaPlayer = this.f4740a;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
            } catch (Exception e) {
                g1 g1Var = this.c;
                if (g1Var != null) {
                    g1Var.a(e.toString());
                }
            }
            this.j = false;
            this.k = false;
            jf jfVar = this.o;
            if (jfVar != null) {
                jfVar.a();
            }
            this.o = null;
            i();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.k) {
            MediaPlayer mediaPlayer = this.f4740a;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(holder);
            }
            play();
            return;
        }
        try {
            m();
            l();
            MediaPlayer mediaPlayer2 = this.f4740a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepareAsync();
            }
            MediaPlayer mediaPlayer3 = this.f4740a;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDisplay(holder);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            mb.b("SurfaceCreated exception", e);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(null);
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public void c() {
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    private final void b(int i, int i2) {
        MediaPlayer mediaPlayer = this.f4740a;
        if (mediaPlayer == null) {
            return;
        }
        SurfaceView surfaceView = this.b;
        int videoHeight = mediaPlayer != null ? mediaPlayer.getVideoHeight() : 1;
        MediaPlayer mediaPlayer2 = this.f4740a;
        pk.a(surfaceView, mediaPlayer2 != null ? mediaPlayer2.getVideoWidth() : 1, videoHeight, i, i2);
    }

    public static final boolean b(e1 e1Var, MediaPlayer mediaPlayer, int i, int i2) {
        e1Var.c(i, i2);
        return true;
    }

    @Override // com.chartboost.sdk.impl.c2
    public void a() {
        this.m = true;
    }

    @Override // com.chartboost.sdk.impl.kg
    public void a(int i, int i2) {
        b(i2, i);
    }

    public final void a(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        this.l = false;
        int duration = mp.getDuration();
        SurfaceView surfaceView = this.b;
        int width = surfaceView != null ? surfaceView.getWidth() : 0;
        SurfaceView surfaceView2 = this.b;
        b(width, surfaceView2 != null ? surfaceView2.getHeight() : 0);
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.b(duration);
        }
        this.i = true;
        yj yjVar = this.p;
        if (yjVar != null) {
            yjVar.a(duration);
        }
        if (this.j) {
            n();
        }
    }

    public /* synthetic */ e1(MediaPlayer mediaPlayer, SurfaceView surfaceView, g1 g1Var, oi oiVar, Function3 function3, Function4 function4, CoroutineDispatcher coroutineDispatcher, k8 k8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MediaPlayer() : mediaPlayer, surfaceView, g1Var, oiVar, function3, function4, (i & 64) != 0 ? Dispatchers.getMain() : coroutineDispatcher, k8Var);
    }

    public static final boolean a(e1 e1Var, MediaPlayer mediaPlayer, int i, int i2) {
        if ((i != 805 && i != 804) || i2 != -1004) {
            return true;
        }
        e1Var.e();
        return true;
    }

    public static final void a(e1 e1Var, MediaPlayer mediaPlayer) {
        if (e1Var.h >= mediaPlayer.getDuration() - (mediaPlayer.getDuration() * 0.05d)) {
            g1 g1Var = e1Var.c;
            if (g1Var != null) {
                g1Var.d();
                return;
            }
            return;
        }
        e1Var.e();
    }
}
