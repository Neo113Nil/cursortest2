package Dc;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class k extends AbstractC2850a implements Callable<Void> {
    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        FutureTask<Void> futureTask = AbstractC2850a.f6318c;
        this.f6321b = Thread.currentThread();
        try {
            this.f6320a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f6321b = null;
        }
    }
}
