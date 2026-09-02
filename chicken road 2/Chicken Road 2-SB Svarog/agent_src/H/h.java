package H;

import androidx.lifecycle.m;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f241c;

    public /* synthetic */ h(int i2, Object obj) {
        this.f240b = i2;
        this.f241c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f240b) {
            case 0:
                i iVar = (i) this.f241c;
                ExecutorService executorService = iVar.f242a;
                ConcurrentLinkedQueue concurrentLinkedQueue = iVar.f243b;
                AtomicBoolean atomicBoolean = iVar.f244c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
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
                            executorService.execute(new h(0, iVar));
                        }
                    }
                }
                return;
            case 1:
                ((K.b) this.f241c).f272b.f280f.prefetchDefaultFontManager();
                return;
            case 2:
                m mVar = (m) this.f241c;
                androidx.lifecycle.j jVar = mVar.f463f;
                if (mVar.f459b == 0) {
                    mVar.f460c = true;
                    jVar.a(androidx.lifecycle.d.ON_PAUSE);
                }
                if (mVar.f458a == 0 && mVar.f460c) {
                    jVar.a(androidx.lifecycle.d.ON_STOP);
                    mVar.f461d = true;
                    return;
                }
                return;
            default:
                ((io.flutter.plugin.platform.k) this.f241c).d(false);
                return;
        }
    }
}
