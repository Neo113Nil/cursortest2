package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0683Sd extends AbstractC0690Td implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: C, reason: collision with root package name */
    public static final HashMap f11537C;

    /* renamed from: A, reason: collision with root package name */
    public boolean f11538A;

    /* renamed from: B, reason: collision with root package name */
    public Integer f11539B;

    /* renamed from: m, reason: collision with root package name */
    public final C0733Ze f11540m;

    /* renamed from: n, reason: collision with root package name */
    public final C0848ce f11541n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11542o;

    /* renamed from: p, reason: collision with root package name */
    public int f11543p;

    /* renamed from: q, reason: collision with root package name */
    public int f11544q;

    /* renamed from: r, reason: collision with root package name */
    public MediaPlayer f11545r;

    /* renamed from: s, reason: collision with root package name */
    public Uri f11546s;

    /* renamed from: t, reason: collision with root package name */
    public int f11547t;

    /* renamed from: u, reason: collision with root package name */
    public int f11548u;

    /* renamed from: v, reason: collision with root package name */
    public int f11549v;

    /* renamed from: w, reason: collision with root package name */
    public C0759ae f11550w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11551x;

    /* renamed from: y, reason: collision with root package name */
    public int f11552y;

    /* renamed from: z, reason: collision with root package name */
    public C0711Wd f11553z;

    static {
        HashMap hashMap = new HashMap();
        f11537C = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC0683Sd(Context context, C0733Ze c0733Ze, boolean z3, boolean z5, C0848ce c0848ce) {
        super(context);
        this.f11543p = 0;
        this.f11544q = 0;
        this.f11538A = false;
        this.f11539B = null;
        setSurfaceTextureListener(this);
        this.f11540m = c0733Ze;
        this.f11541n = c0848ce;
        this.f11551x = z3;
        this.f11542o = z5;
        c0848ce.a(this);
    }

    public final void E() {
        SurfaceTexture surfaceTexture;
        T2.G.m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f11546s == null || surfaceTexture2 == null) {
            return;
        }
        F(false);
        try {
            Q1.j jVar = P2.o.f4767B.f4786t;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11545r = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f11545r.setOnCompletionListener(this);
            this.f11545r.setOnErrorListener(this);
            this.f11545r.setOnInfoListener(this);
            this.f11545r.setOnPreparedListener(this);
            this.f11545r.setOnVideoSizeChangedListener(this);
            this.f11549v = 0;
            if (this.f11551x) {
                C0759ae c0759ae = new C0759ae(getContext());
                this.f11550w = c0759ae;
                int width = getWidth();
                int height = getHeight();
                c0759ae.f12684w = width;
                c0759ae.f12683v = height;
                c0759ae.f12686y = surfaceTexture2;
                this.f11550w.start();
                C0759ae c0759ae2 = this.f11550w;
                if (c0759ae2.f12686y == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        c0759ae2.f12666D.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = c0759ae2.f12685x;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f11550w.c();
                    this.f11550w = null;
                }
            }
            this.f11545r.setDataSource(getContext(), this.f11546s);
            this.f11545r.setSurface(new Surface(surfaceTexture2));
            this.f11545r.setAudioStreamType(3);
            this.f11545r.setScreenOnWhilePlaying(true);
            this.f11545r.prepareAsync();
            G(1);
        } catch (IOException e3) {
            e = e3;
            U2.j.j("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f11546s)), e);
            onError(this.f11545r, 1, 0);
        } catch (IllegalArgumentException e5) {
            e = e5;
            U2.j.j("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f11546s)), e);
            onError(this.f11545r, 1, 0);
        } catch (IllegalStateException e6) {
            e = e6;
            U2.j.j("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f11546s)), e);
            onError(this.f11545r, 1, 0);
        }
    }

    public final void F(boolean z3) {
        T2.G.m("AdMediaPlayerView release");
        C0759ae c0759ae = this.f11550w;
        if (c0759ae != null) {
            c0759ae.c();
            this.f11550w = null;
        }
        MediaPlayer mediaPlayer = this.f11545r;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f11545r.release();
            this.f11545r = null;
            G(0);
            if (z3) {
                this.f11544q = 0;
            }
        }
    }

    public final void G(int i) {
        C0937ee c0937ee = this.f11653l;
        C0848ce c0848ce = this.f11541n;
        if (i == 3) {
            c0848ce.b();
            c0937ee.f13320d = true;
            c0937ee.a();
        } else if (this.f11543p == 3) {
            c0848ce.f13016m = false;
            c0937ee.f13320d = false;
            c0937ee.a();
        }
        this.f11543p = i;
    }

    public final boolean H() {
        int i;
        return (this.f11545r == null || (i = this.f11543p) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int i() {
        if (H()) {
            return this.f11545r.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int j() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT < 26 || !H()) {
            return -1;
        }
        metrics = this.f11545r.getMetrics();
        return metrics.getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int k() {
        if (H()) {
            return this.f11545r.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int l() {
        MediaPlayer mediaPlayer = this.f11545r;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0893de
    public final void m() {
        C0937ee c0937ee = this.f11653l;
        float f = c0937ee.f13319c ? c0937ee.f13321e ? 0.0f : c0937ee.f : 0.0f;
        MediaPlayer mediaPlayer = this.f11545r;
        if (mediaPlayer == null) {
            U2.j.i("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int n() {
        MediaPlayer mediaPlayer = this.f11545r;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long o() {
        return 0L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f11549v = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        T2.G.m("AdMediaPlayerView completion");
        G(5);
        this.f11544q = 5;
        T2.L.f5672l.post(new RunnableC0669Qd(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i5) {
        HashMap hashMap = f11537C;
        String str = (String) hashMap.get(Integer.valueOf(i));
        String str2 = (String) hashMap.get(Integer.valueOf(i5));
        U2.j.i("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        G(-1);
        this.f11544q = -1;
        T2.L.f5672l.post(new RunnableC1362o(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i5) {
        HashMap hashMap = f11537C;
        T2.G.m("AdMediaPlayerView MediaPlayer info: " + ((String) hashMap.get(Integer.valueOf(i))) + ":" + ((String) hashMap.get(Integer.valueOf(i5))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i5) {
        int i6;
        int defaultSize = View.getDefaultSize(this.f11547t, i);
        int defaultSize2 = View.getDefaultSize(this.f11548u, i5);
        if (this.f11547t > 0 && this.f11548u > 0 && this.f11550w == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i5);
            int size2 = View.MeasureSpec.getSize(i5);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i7 = this.f11547t;
                    int i8 = i7 * size2;
                    int i9 = this.f11548u;
                    int i10 = size * i9;
                    if (i8 < i10) {
                        defaultSize = i8 / i9;
                        defaultSize2 = size2;
                    } else {
                        if (i8 > i10) {
                            defaultSize2 = i10 / i7;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i11 = (this.f11548u * size) / this.f11547t;
                if (mode2 != Integer.MIN_VALUE || i11 <= size2) {
                    defaultSize2 = i11;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i6 = (this.f11547t * size2) / this.f11548u;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i12 = this.f11547t;
                    int i13 = this.f11548u;
                    if (mode2 != Integer.MIN_VALUE || i13 <= size2) {
                        i6 = i12;
                        size2 = i13;
                    } else {
                        i6 = (size2 * i12) / i13;
                    }
                    if (mode == Integer.MIN_VALUE && i6 > size) {
                        defaultSize2 = (i13 * size) / i12;
                        defaultSize = size;
                    }
                }
                defaultSize = i6;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        C0759ae c0759ae = this.f11550w;
        if (c0759ae != null) {
            c0759ae.b(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        T2.G.m("AdMediaPlayerView prepared");
        G(2);
        C0848ce c0848ce = this.f11541n;
        if (c0848ce.i && !c0848ce.f13013j) {
            AbstractC1803xs.m(c0848ce.f13010e, c0848ce.f13009d, "vfr2");
            c0848ce.f13013j = true;
        }
        T2.L.f5672l.post(new Kw(13, this, mediaPlayer, false));
        this.f11547t = mediaPlayer.getVideoWidth();
        this.f11548u = mediaPlayer.getVideoHeight();
        int i = this.f11552y;
        if (i != 0) {
            u(i);
        }
        if (this.f11542o && H() && this.f11545r.getCurrentPosition() > 0 && this.f11544q != 3) {
            T2.G.m("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f11545r;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                U2.j.i("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f11545r.start();
            int currentPosition = this.f11545r.getCurrentPosition();
            P2.o.f4767B.f4776j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (H() && this.f11545r.getCurrentPosition() == currentPosition) {
                P2.o.f4767B.f4776j.getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.f11545r.pause();
            m();
        }
        U2.j.h("AdMediaPlayerView stream dimensions: " + this.f11547t + " x " + this.f11548u);
        if (this.f11544q == 3) {
            t();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i5) {
        T2.G.m("AdMediaPlayerView surface created");
        E();
        T2.L.f5672l.post(new RunnableC0669Qd(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        T2.G.m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f11545r;
        if (mediaPlayer != null && this.f11552y == 0) {
            this.f11552y = mediaPlayer.getCurrentPosition();
        }
        C0759ae c0759ae = this.f11550w;
        if (c0759ae != null) {
            c0759ae.c();
        }
        T2.L.f5672l.post(new RunnableC0669Qd(this, 2));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i5) {
        T2.G.m("AdMediaPlayerView surface changed");
        int i6 = this.f11544q;
        boolean z3 = false;
        if (this.f11547t == i && this.f11548u == i5) {
            z3 = true;
        }
        if (this.f11545r != null && i6 == 3 && z3) {
            int i7 = this.f11552y;
            if (i7 != 0) {
                u(i7);
            }
            t();
        }
        C0759ae c0759ae = this.f11550w;
        if (c0759ae != null) {
            c0759ae.b(i, i5);
        }
        T2.L.f5672l.post(new RunnableC0676Rd(this, i, i5, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f11541n.d(this);
        this.f11652k.a(surfaceTexture, this.f11553z);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i5) {
        T2.G.m("AdMediaPlayerView size changed: " + i + " x " + i5);
        this.f11547t = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f11548u = videoHeight;
        if (this.f11547t == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        T2.G.m("AdMediaPlayerView window visibility changed to " + i);
        T2.L.f5672l.post(new RunnableC0920e5(i, 2, this));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long p() {
        if (this.f11539B != null) {
            return (q() * this.f11549v) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long q() {
        if (this.f11539B != null) {
            return k() * this.f11539B.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final String r() {
        return "MediaPlayer".concat(true != this.f11551x ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void s() {
        T2.G.m("AdMediaPlayerView pause");
        if (H() && this.f11545r.isPlaying()) {
            this.f11545r.pause();
            G(4);
            T2.L.f5672l.post(new RunnableC0669Qd(this, 4));
        }
        this.f11544q = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void t() {
        T2.G.m("AdMediaPlayerView play");
        if (H()) {
            this.f11545r.start();
            G(3);
            this.f11652k.f12348c = true;
            T2.L.f5672l.post(new RunnableC0669Qd(this, 3));
        }
        this.f11544q = 3;
    }

    @Override // android.view.View
    public final String toString() {
        return AbstractC0467k.v(TextureViewSurfaceTextureListenerC0683Sd.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void u(int i) {
        T2.G.m("AdMediaPlayerView seek " + i);
        if (!H()) {
            this.f11552y = i;
        } else {
            this.f11545r.seekTo(i);
            this.f11552y = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void v(C0711Wd c0711Wd) {
        this.f11553z = c0711Wd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void w(String str) {
        Uri parse = Uri.parse(str);
        C1459q6 a5 = C1459q6.a(parse);
        if (a5 == null || a5.f15095k != null) {
            if (a5 != null) {
                parse = Uri.parse(a5.f15095k);
            }
            this.f11546s = parse;
            this.f11552y = 0;
            E();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void x() {
        T2.G.m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f11545r;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f11545r.release();
            this.f11545r = null;
            G(0);
            this.f11544q = 0;
        }
        this.f11541n.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void z(float f, float f5) {
        C0759ae c0759ae = this.f11550w;
        if (c0759ae != null) {
            c0759ae.d(f, f5);
        }
    }
}
