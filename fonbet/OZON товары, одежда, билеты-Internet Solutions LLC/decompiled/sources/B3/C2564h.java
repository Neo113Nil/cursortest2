package B3;

import B3.q;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.C5136e;
import androidx.media3.exoplayer.j0;
import java.util.ArrayDeque;

/* renamed from: B3.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2564h extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f2338b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f2339c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f2344h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f2345i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f2346j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f2347k;

    /* renamed from: l, reason: collision with root package name */
    private long f2348l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2349m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f2350n;

    /* renamed from: o, reason: collision with root package name */
    private q.c f2351o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2337a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C5136e f2340d = new C5136e();

    /* renamed from: e, reason: collision with root package name */
    private final C5136e f2341e = new C5136e();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f2342f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f2343g = new ArrayDeque<>();

    C2564h(HandlerThread handlerThread) {
        this.f2338b = handlerThread;
    }

    public static void a(C2564h c2564h) {
        synchronized (c2564h.f2337a) {
            try {
                if (c2564h.f2349m) {
                    return;
                }
                long j11 = c2564h.f2348l - 1;
                c2564h.f2348l = j11;
                if (j11 > 0) {
                    return;
                }
                if (j11 >= 0) {
                    c2564h.e();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (c2564h.f2337a) {
                    c2564h.f2350n = illegalStateException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void e() {
        ArrayDeque<MediaFormat> arrayDeque = this.f2343g;
        if (!arrayDeque.isEmpty()) {
            this.f2345i = arrayDeque.getLast();
        }
        this.f2340d.b();
        this.f2341e.b();
        this.f2342f.clear();
        arrayDeque.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023 A[Catch: all -> 0x0025, DONT_GENERATE, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:18:0x0023, B:21:0x0027, B:24:0x0036, B:26:0x0030, B:28:0x0038, B:29:0x003a, B:30:0x003b, B:31:0x003d, B:32:0x003e, B:33:0x0040), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:18:0x0023, B:21:0x0027, B:24:0x0036, B:26:0x0030, B:28:0x0038, B:29:0x003a, B:30:0x003b, B:31:0x003d, B:32:0x003e, B:33:0x0040), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b() {
        boolean z11;
        synchronized (this.f2337a) {
            try {
                IllegalStateException illegalStateException = this.f2350n;
                if (illegalStateException != null) {
                    this.f2350n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = this.f2346j;
                if (codecException != null) {
                    this.f2346j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = this.f2347k;
                if (cryptoException != null) {
                    this.f2347k = null;
                    throw cryptoException;
                }
                if (this.f2348l <= 0 && !this.f2349m) {
                    z11 = false;
                    int i11 = -1;
                    if (!z11) {
                        return -1;
                    }
                    if (!this.f2340d.c()) {
                        i11 = this.f2340d.d();
                    }
                    return i11;
                }
                z11 = true;
                int i112 = -1;
                if (!z11) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023 A[Catch: all -> 0x0025, DONT_GENERATE, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:18:0x0023, B:21:0x0028, B:23:0x0030, B:25:0x0032, B:27:0x003a, B:28:0x0061, B:32:0x0057, B:34:0x0063, B:35:0x0065, B:36:0x0066, B:37:0x0068, B:38:0x0069, B:39:0x006b), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0028 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:18:0x0023, B:21:0x0028, B:23:0x0030, B:25:0x0032, B:27:0x003a, B:28:0x0061, B:32:0x0057, B:34:0x0063, B:35:0x0065, B:36:0x0066, B:37:0x0068, B:38:0x0069, B:39:0x006b), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(MediaCodec.BufferInfo bufferInfo) {
        boolean z11;
        synchronized (this.f2337a) {
            try {
                IllegalStateException illegalStateException = this.f2350n;
                if (illegalStateException != null) {
                    this.f2350n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = this.f2346j;
                if (codecException != null) {
                    this.f2346j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = this.f2347k;
                if (cryptoException != null) {
                    this.f2347k = null;
                    throw cryptoException;
                }
                if (this.f2348l <= 0 && !this.f2349m) {
                    z11 = false;
                    if (!z11) {
                        return -1;
                    }
                    if (this.f2341e.c()) {
                        return -1;
                    }
                    int d11 = this.f2341e.d();
                    if (d11 >= 0) {
                        G10.a.i(this.f2344h);
                        MediaCodec.BufferInfo remove = this.f2342f.remove();
                        bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                    } else if (d11 == -2) {
                        this.f2344h = this.f2343g.remove();
                    }
                    return d11;
                }
                z11 = true;
                if (!z11) {
                }
            } finally {
            }
        }
    }

    public final void d() {
        synchronized (this.f2337a) {
            this.f2348l++;
            Handler handler = this.f2339c;
            int i11 = m3.N.f74289a;
            handler.post(new Runnable() { // from class: B3.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2564h.a(C2564h.this);
                }
            });
        }
    }

    public final MediaFormat f() {
        MediaFormat mediaFormat;
        synchronized (this.f2337a) {
            try {
                mediaFormat = this.f2344h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public final void g(MediaCodec mediaCodec) {
        G10.a.h(this.f2339c == null);
        HandlerThread handlerThread = this.f2338b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f2339c = handler;
    }

    public final void h(q.c cVar) {
        synchronized (this.f2337a) {
            this.f2351o = cVar;
        }
    }

    public final void i() {
        synchronized (this.f2337a) {
            this.f2349m = true;
            this.f2338b.quit();
            e();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f2337a) {
            this.f2347k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f2337a) {
            this.f2346j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        j0.a aVar;
        j0.a aVar2;
        synchronized (this.f2337a) {
            this.f2340d.a(i11);
            q.c cVar = this.f2351o;
            if (cVar != null) {
                C c11 = C.this;
                aVar = c11.f2236H;
                if (aVar != null) {
                    aVar2 = c11.f2236H;
                    aVar2.b();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        j0.a aVar;
        j0.a aVar2;
        synchronized (this.f2337a) {
            try {
                MediaFormat mediaFormat = this.f2345i;
                if (mediaFormat != null) {
                    this.f2341e.a(-2);
                    this.f2343g.add(mediaFormat);
                    this.f2345i = null;
                }
                this.f2341e.a(i11);
                this.f2342f.add(bufferInfo);
                q.c cVar = this.f2351o;
                if (cVar != null) {
                    C c11 = C.this;
                    aVar = c11.f2236H;
                    if (aVar != null) {
                        aVar2 = c11.f2236H;
                        aVar2.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f2337a) {
            this.f2341e.a(-2);
            this.f2343g.add(mediaFormat);
            this.f2345i = null;
        }
    }
}
