package B3;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import m3.C8067i;
import s3.C9589c;

/* renamed from: B3.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2562f implements r {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f2322g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f2323h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f2324a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f2325b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f2326c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f2327d;

    /* renamed from: e, reason: collision with root package name */
    private final C8067i f2328e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2329f;

    /* renamed from: B3.f$a */
    final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C2562f.e(C2562f.this, message);
        }
    }

    /* renamed from: B3.f$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2331a;

        /* renamed from: b, reason: collision with root package name */
        public int f2332b;

        /* renamed from: c, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f2333c = new MediaCodec.CryptoInfo();

        /* renamed from: d, reason: collision with root package name */
        public long f2334d;

        /* renamed from: e, reason: collision with root package name */
        public int f2335e;

        b() {
        }
    }

    public C2562f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C8067i c8067i = new C8067i();
        this.f2324a = mediaCodec;
        this.f2325b = handlerThread;
        this.f2328e = c8067i;
        this.f2327d = new AtomicReference<>();
    }

    static void e(C2562f c2562f, Message message) {
        c2562f.getClass();
        int i11 = message.what;
        b bVar = null;
        if (i11 == 1) {
            b bVar2 = (b) message.obj;
            try {
                c2562f.f2324a.queueInputBuffer(bVar2.f2331a, 0, bVar2.f2332b, bVar2.f2334d, bVar2.f2335e);
            } catch (RuntimeException e11) {
                AtomicReference<RuntimeException> atomicReference = c2562f.f2327d;
                while (!atomicReference.compareAndSet(null, e11) && atomicReference.get() == null) {
                }
            }
            bVar = bVar2;
        } else if (i11 == 2) {
            b bVar3 = (b) message.obj;
            int i12 = bVar3.f2331a;
            MediaCodec.CryptoInfo cryptoInfo = bVar3.f2333c;
            long j11 = bVar3.f2334d;
            int i13 = bVar3.f2335e;
            try {
                synchronized (f2323h) {
                    c2562f.f2324a.queueSecureInputBuffer(i12, 0, cryptoInfo, j11, i13);
                }
            } catch (RuntimeException e12) {
                AtomicReference<RuntimeException> atomicReference2 = c2562f.f2327d;
                while (!atomicReference2.compareAndSet(null, e12) && atomicReference2.get() == null) {
                }
            }
            bVar = bVar3;
        } else if (i11 == 3) {
            c2562f.f2328e.g();
        } else if (i11 != 4) {
            AtomicReference<RuntimeException> atomicReference3 = c2562f.f2327d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                c2562f.f2324a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e13) {
                AtomicReference<RuntimeException> atomicReference4 = c2562f.f2327d;
                while (!atomicReference4.compareAndSet(null, e13) && atomicReference4.get() == null) {
                }
            }
        }
        if (bVar != null) {
            ArrayDeque<b> arrayDeque = f2322g;
            synchronized (arrayDeque) {
                arrayDeque.add(bVar);
            }
        }
    }

    private static b f() {
        ArrayDeque<b> arrayDeque = f2322g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // B3.r
    public final void a(Bundle bundle) {
        d();
        Handler handler = this.f2326c;
        int i11 = m3.N.f74289a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // B3.r
    public final void b(int i11, C9589c c9589c, long j11, int i12) {
        d();
        b f7 = f();
        f7.f2331a = i11;
        f7.f2332b = 0;
        f7.f2334d = j11;
        f7.f2335e = i12;
        int i13 = c9589c.f98175f;
        MediaCodec.CryptoInfo cryptoInfo = f7.f2333c;
        cryptoInfo.numSubSamples = i13;
        int[] iArr = c9589c.f98173d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = c9589c.f98174e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = c9589c.f98171b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = c9589c.f98170a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = c9589c.f98172c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c9589c.f98176g, c9589c.f98177h));
        Handler handler = this.f2326c;
        int i14 = m3.N.f74289a;
        handler.obtainMessage(2, f7).sendToTarget();
    }

    @Override // B3.r
    public final void c(int i11, int i12, int i13, long j11) {
        d();
        b f7 = f();
        f7.f2331a = i11;
        f7.f2332b = i12;
        f7.f2334d = j11;
        f7.f2335e = i13;
        Handler handler = this.f2326c;
        int i14 = m3.N.f74289a;
        handler.obtainMessage(1, f7).sendToTarget();
    }

    @Override // B3.r
    public final void d() {
        RuntimeException andSet = this.f2327d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // B3.r
    public final void flush() {
        if (this.f2329f) {
            try {
                Handler handler = this.f2326c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                C8067i c8067i = this.f2328e;
                c8067i.e();
                Handler handler2 = this.f2326c;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                c8067i.a();
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e11);
            }
        }
    }

    @Override // B3.r
    public final void shutdown() {
        if (this.f2329f) {
            flush();
            this.f2325b.quit();
        }
        this.f2329f = false;
    }

    @Override // B3.r
    public final void start() {
        if (this.f2329f) {
            return;
        }
        HandlerThread handlerThread = this.f2325b;
        handlerThread.start();
        this.f2326c = new a(handlerThread.getLooper());
        this.f2329f = true;
    }
}
