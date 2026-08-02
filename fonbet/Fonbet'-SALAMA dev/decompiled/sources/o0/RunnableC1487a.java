package o0;

import E2.l;
import android.os.Looper;
import e3.C1018c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import n.ThreadFactoryC1443c;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1487a implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public static volatile ThreadPoolExecutor f15530A;

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadPoolExecutor f15531y;

    /* renamed from: z, reason: collision with root package name */
    public static HandlerC1490d f15532z;

    /* renamed from: a, reason: collision with root package name */
    public final l f15533a;

    /* renamed from: b, reason: collision with root package name */
    public final C1488b f15534b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f15535c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15536d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15537e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f15538f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1018c f15539x;

    static {
        ThreadFactoryC1443c threadFactoryC1443c = new ThreadFactoryC1443c(1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactoryC1443c);
        f15531y = threadPoolExecutor;
        f15530A = threadPoolExecutor;
    }

    public RunnableC1487a(C1018c c1018c) {
        this.f15539x = c1018c;
        l lVar = new l(this, 5);
        this.f15533a = lVar;
        this.f15534b = new C1488b(this, lVar);
        this.f15538f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        HandlerC1490d handlerC1490d;
        synchronized (RunnableC1487a.class) {
            try {
                if (f15532z == null) {
                    f15532z = new HandlerC1490d(Looper.getMainLooper());
                }
                handlerC1490d = f15532z;
            } catch (Throwable th) {
                throw th;
            }
        }
        handlerC1490d.obtainMessage(1, new C1489c(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15539x.b();
    }
}
