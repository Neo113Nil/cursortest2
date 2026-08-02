package R1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f5902b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f5903c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f5908h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f5909i;
    public MediaCodec.CodecException j;

    /* renamed from: k, reason: collision with root package name */
    public long f5910k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5911l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f5912m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5901a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final N1.e f5904d = new N1.e();

    /* renamed from: e, reason: collision with root package name */
    public final N1.e f5905e = new N1.e();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f5906f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f5907g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f5902b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f5907g;
        if (!arrayDeque.isEmpty()) {
            this.f5909i = (MediaFormat) arrayDeque.getLast();
        }
        N1.e eVar = this.f5904d;
        eVar.f4646a = 0;
        eVar.f4647b = -1;
        eVar.f4648c = 0;
        N1.e eVar2 = this.f5905e;
        eVar2.f4646a = 0;
        eVar2.f4647b = -1;
        eVar2.f4648c = 0;
        this.f5906f.clear();
        arrayDeque.clear();
        this.j = null;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f5901a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f5901a) {
            this.f5904d.d(i7);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f5901a) {
            try {
                MediaFormat mediaFormat = this.f5909i;
                if (mediaFormat != null) {
                    this.f5905e.d(-2);
                    this.f5907g.add(mediaFormat);
                    this.f5909i = null;
                }
                this.f5905e.d(i7);
                this.f5906f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f5901a) {
            this.f5905e.d(-2);
            this.f5907g.add(mediaFormat);
            this.f5909i = null;
        }
    }
}
