package B3;

import B3.q;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import s3.C9589c;

/* renamed from: B3.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2561e implements q {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f2314a;

    /* renamed from: b, reason: collision with root package name */
    private final C2564h f2315b;

    /* renamed from: c, reason: collision with root package name */
    private final r f2316c;

    /* renamed from: d, reason: collision with root package name */
    private final C2571o f2317d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2318e;

    /* renamed from: f, reason: collision with root package name */
    private int f2319f = 0;

    /* renamed from: B3.e$a */
    public static final class a implements q.b {

        /* renamed from: a, reason: collision with root package name */
        private final C2559c f2320a;

        /* renamed from: b, reason: collision with root package name */
        private final C2560d f2321b;

        public a(int i11) {
            C2559c c2559c = new C2559c(i11);
            C2560d c2560d = new C2560d(i11);
            this.f2320a = c2559c;
            this.f2321b = c2560d;
        }

        @Override // B3.q.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2561e a(q.a aVar) throws IOException {
            MediaCodec mediaCodec;
            C2561e c2561e = null;
            try {
                mediaCodec = MediaCodec.createByCodecName(aVar.f2361a.f2369a);
                try {
                    C2561e c2561e2 = new C2561e(mediaCodec, (HandlerThread) this.f2320a.get(), new C2562f(mediaCodec, (HandlerThread) this.f2321b.get()), aVar.f2366f);
                    try {
                        Surface surface = aVar.f2364d;
                        C2561e.p(c2561e2, aVar.f2362b, surface, aVar.f2365e, (surface == null && aVar.f2361a.f2376h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                        return c2561e2;
                    } catch (Exception e11) {
                        e = e11;
                        c2561e = c2561e2;
                        if (c2561e != null) {
                            c2561e.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                mediaCodec = null;
            }
        }
    }

    C2561e(MediaCodec mediaCodec, HandlerThread handlerThread, r rVar, C2571o c2571o) {
        this.f2314a = mediaCodec;
        this.f2315b = new C2564h(handlerThread);
        this.f2316c = rVar;
        this.f2317d = c2571o;
    }

    static void p(C2561e c2561e, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        C2571o c2571o;
        C2564h c2564h = c2561e.f2315b;
        MediaCodec mediaCodec = c2561e.f2314a;
        c2564h.g(mediaCodec);
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i11);
        c2561e.f2316c.start();
        mediaCodec.start();
        if (Build.VERSION.SDK_INT >= 35 && (c2571o = c2561e.f2317d) != null) {
            c2571o.b(mediaCodec);
        }
        c2561e.f2319f = 1;
    }

    static String q(int i11) {
        return s(i11, "ExoPlayer:MediaCodecQueueingThread:");
    }

    static String r(int i11) {
        return s(i11, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    private static String s(int i11, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 1) {
            sb2.append("Audio");
        } else if (i11 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i11);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // B3.q
    public final void a(Bundle bundle) {
        this.f2316c.a(bundle);
    }

    @Override // B3.q
    public final void b(int i11, C9589c c9589c, long j11, int i12) {
        this.f2316c.b(i11, c9589c, j11, i12);
    }

    @Override // B3.q
    public final void c(int i11, int i12, int i13, long j11) {
        this.f2316c.c(i11, i12, i13, j11);
    }

    @Override // B3.q
    public final void d(final q.d dVar, Handler handler) {
        this.f2314a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: B3.b
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                C2561e.this.getClass();
                dVar.a(j11);
            }
        }, handler);
    }

    @Override // B3.q
    public final void e(int i11) {
        this.f2314a.setVideoScalingMode(i11);
    }

    @Override // B3.q
    public final void f(int i11) {
        this.f2314a.releaseOutputBuffer(i11, false);
    }

    @Override // B3.q
    public final void flush() {
        this.f2316c.flush();
        MediaCodec mediaCodec = this.f2314a;
        mediaCodec.flush();
        this.f2315b.d();
        mediaCodec.start();
    }

    @Override // B3.q
    public final void g(int i11, long j11) {
        this.f2314a.releaseOutputBuffer(i11, j11);
    }

    @Override // B3.q
    public final boolean h(q.c cVar) {
        this.f2315b.h(cVar);
        return true;
    }

    @Override // B3.q
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        this.f2316c.d();
        return this.f2315b.c(bufferInfo);
    }

    @Override // B3.q
    public final MediaFormat j() {
        return this.f2315b.f();
    }

    @Override // B3.q
    public final void k() {
        this.f2314a.detachOutputSurface();
    }

    @Override // B3.q
    public final ByteBuffer l(int i11) {
        return this.f2314a.getInputBuffer(i11);
    }

    @Override // B3.q
    public final void m(Surface surface) {
        this.f2314a.setOutputSurface(surface);
    }

    @Override // B3.q
    public final int n() {
        this.f2316c.d();
        return this.f2315b.b();
    }

    @Override // B3.q
    public final ByteBuffer o(int i11) {
        return this.f2314a.getOutputBuffer(i11);
    }

    @Override // B3.q
    public final void release() {
        C2571o c2571o = this.f2317d;
        MediaCodec mediaCodec = this.f2314a;
        try {
            if (this.f2319f == 1) {
                this.f2316c.shutdown();
                this.f2315b.i();
            }
            this.f2319f = 2;
            if (this.f2318e) {
                return;
            }
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30 && i11 < 33) {
                    mediaCodec.stop();
                }
                if (i11 >= 35 && c2571o != null) {
                    c2571o.d(mediaCodec);
                }
                mediaCodec.release();
                this.f2318e = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.f2318e) {
                try {
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 30 && i12 < 33) {
                        mediaCodec.stop();
                    }
                    if (i12 >= 35 && c2571o != null) {
                        c2571o.d(mediaCodec);
                    }
                    mediaCodec.release();
                    this.f2318e = true;
                } finally {
                }
            }
            throw th2;
        }
    }
}
