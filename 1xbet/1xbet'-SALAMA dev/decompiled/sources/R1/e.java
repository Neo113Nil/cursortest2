package R1;

import F1.y;
import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f5893g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f5894h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f5895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f5896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f5897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f5898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f5899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5900f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        y yVar = new y();
        this.f5895a = mediaCodec;
        this.f5896b = handlerThread;
        this.f5899e = yVar;
        this.f5898d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f5893g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f5900f) {
            try {
                c cVar = this.f5897c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                y yVar = this.f5899e;
                synchronized (yVar) {
                    yVar.f2588a = false;
                }
                c cVar2 = this.f5897c;
                cVar2.getClass();
                cVar2.obtainMessage(2).sendToTarget();
                synchronized (yVar) {
                    while (!yVar.f2588a) {
                        yVar.wait();
                    }
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }
}
