package w1;

import java.util.Timer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: w1.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1683c1 extends T1 {

    /* renamed from: x, reason: collision with root package name */
    public ThreadPoolExecutor f17657x;

    static {
        new Timer("ExecutorQueue Global Timer", true);
    }

    @Override // w1.AbstractC1736p2
    public final synchronized boolean c(C1704h2 c1704h2) {
        try {
            synchronized (c1704h2) {
                if (c1704h2.f17731b == 0) {
                    c1704h2.run();
                } else {
                    this.f17657x.execute(c1704h2);
                }
            }
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }
}
