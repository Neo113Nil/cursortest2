package p102o0;

import E2.l;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p033e3.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static volatile ThreadPoolExecutor f15536A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ThreadPoolExecutor f15537y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static d f15538z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f15539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f15541c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15542d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15543e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f15544f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f15545x;

    static {
        p094n.c cVar = new p094n.c(1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), cVar);
        f15537y = threadPoolExecutor;
        f15536A = threadPoolExecutor;
    }

    public a(c cVar) {
        this.f15545x = cVar;
        l lVar = new l(this, 5);
        this.f15539a = lVar;
        this.f15540b = new b(this, lVar);
        this.f15544f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        d dVar;
        synchronized (a.class) {
            try {
                if (f15538z == null) {
                    f15538z = new d(Looper.getMainLooper());
                }
                dVar = f15538z;
            } catch (Throwable th) {
                throw th;
            }
        }
        dVar.obtainMessage(1, new c(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15545x.b();
    }
}
