package F0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f543b;

    public /* synthetic */ a(int i2, java.lang.Object obj) {
        this.f542a = i2;
        this.f543b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f542a) {
            case 0:
                com.yandex.varioqub.config.impl.B.a((com.yandex.varioqub.config.impl.g) this.f543b);
                return;
            case 1:
                com.yandex.varioqub.config.impl.B.a((com.yandex.varioqub.config.impl.B) this.f543b);
                return;
            case 2:
                R0.h hVar = (R0.h) this.f543b;
                java.util.concurrent.ExecutorService executorService = hVar.f1674a;
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = hVar.f1675b;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = hVar.f1676c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        java.lang.Runnable runnable = (java.lang.Runnable) concurrentLinkedQueue.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (isEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new F0.a(2, hVar));
                        }
                    }
                }
                return;
            case 3:
                ((U0.a) this.f543b).f1729b.f1737f.prefetchDefaultFontManager();
                return;
            case 4:
                androidx.lifecycle.r this$0 = (androidx.lifecycle.r) this.f543b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                int i2 = this$0.f2404b;
                androidx.lifecycle.l lVar = this$0.f2408f;
                if (i2 == 0) {
                    this$0.f2405c = true;
                    lVar.d(androidx.lifecycle.d.ON_PAUSE);
                }
                if (this$0.f2403a == 0 && this$0.f2405c) {
                    lVar.d(androidx.lifecycle.d.ON_STOP);
                    this$0.f2406d = true;
                    return;
                }
                return;
            case 5:
                io.appmetrica.analytics.impl.C0294d2.a((io.appmetrica.analytics.impl.C0294d2) this.f543b);
                return;
            case 6:
                ((io.appmetrica.analytics.impl.C0316e) this.f543b).a();
                return;
            case 7:
                ((io.appmetrica.analytics.impl.C0706t1) this.f543b).e();
                return;
            case 8:
                io.appmetrica.analytics.impl.C0706t1.a((java.lang.Object[]) this.f543b);
                return;
            case 9:
                ((io.appmetrica.analytics.impl.C0835y0) this.f543b).o();
                return;
            case 10:
                ((io.flutter.plugin.platform.k) this.f543b).f(false);
                return;
            default:
                ((P1.B) this.f543b).getClass();
                return;
        }
    }
}
