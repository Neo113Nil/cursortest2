package B3;

import B3.q;
import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import s3.C9589c;

/* loaded from: classes.dex */
public final class O implements q {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f2308a;

    /* renamed from: b, reason: collision with root package name */
    private final C2571o f2309b;

    public static class a implements q.b {
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        @Override // B3.q.b
        @SuppressLint({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final q a(q.a aVar) throws IOException {
            MediaCodec mediaCodec = null;
            try {
                t tVar = aVar.f2361a;
                mediaCodec = MediaCodec.createByCodecName(tVar.f2369a);
                Surface surface = aVar.f2364d;
                mediaCodec.configure(aVar.f2362b, surface, aVar.f2365e, (surface == null && tVar.f2376h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                mediaCodec.start();
                return new O(mediaCodec, aVar.f2366f);
            } catch (IOException e11) {
                e = e11;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                if (mediaCodec != null) {
                }
                throw e;
            }
        }
    }

    O(MediaCodec mediaCodec, C2571o c2571o) {
        this.f2308a = mediaCodec;
        this.f2309b = c2571o;
        if (Build.VERSION.SDK_INT < 35 || c2571o == null) {
            return;
        }
        c2571o.b(mediaCodec);
    }

    @Override // B3.q
    public final void a(Bundle bundle) {
        this.f2308a.setParameters(bundle);
    }

    @Override // B3.q
    public final void b(int i11, C9589c c9589c, long j11, int i12) {
        this.f2308a.queueSecureInputBuffer(i11, 0, c9589c.a(), j11, i12);
    }

    @Override // B3.q
    public final void c(int i11, int i12, int i13, long j11) {
        this.f2308a.queueInputBuffer(i11, 0, i12, j11, i13);
    }

    @Override // B3.q
    public final void d(final q.d dVar, Handler handler) {
        this.f2308a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: B3.N
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                O.this.getClass();
                dVar.a(j11);
            }
        }, handler);
    }

    @Override // B3.q
    public final void e(int i11) {
        this.f2308a.setVideoScalingMode(i11);
    }

    @Override // B3.q
    public final void f(int i11) {
        this.f2308a.releaseOutputBuffer(i11, false);
    }

    @Override // B3.q
    public final void flush() {
        this.f2308a.flush();
    }

    @Override // B3.q
    public final void g(int i11, long j11) {
        this.f2308a.releaseOutputBuffer(i11, j11);
    }

    @Override // B3.q
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f2308a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // B3.q
    public final MediaFormat j() {
        return this.f2308a.getOutputFormat();
    }

    @Override // B3.q
    public final void k() {
        this.f2308a.detachOutputSurface();
    }

    @Override // B3.q
    public final ByteBuffer l(int i11) {
        return this.f2308a.getInputBuffer(i11);
    }

    @Override // B3.q
    public final void m(Surface surface) {
        this.f2308a.setOutputSurface(surface);
    }

    @Override // B3.q
    public final int n() {
        return this.f2308a.dequeueInputBuffer(0L);
    }

    @Override // B3.q
    public final ByteBuffer o(int i11) {
        return this.f2308a.getOutputBuffer(i11);
    }

    @Override // B3.q
    public final void release() {
        C2571o c2571o = this.f2309b;
        MediaCodec mediaCodec = this.f2308a;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && i11 < 33) {
                mediaCodec.stop();
            }
            if (i11 >= 35 && c2571o != null) {
                c2571o.d(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && c2571o != null) {
                c2571o.d(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }
}
