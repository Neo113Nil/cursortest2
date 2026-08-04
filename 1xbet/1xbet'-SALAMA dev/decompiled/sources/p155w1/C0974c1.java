package p155w1;

import java.util.Timer;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: w1.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0974c1 extends T1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ThreadPoolExecutor f17663x;

    static {
        new Timer("ExecutorQueue Global Timer", true);
    }

    @Override // p155w1.AbstractC1027p2
    public final synchronized boolean c(C0995h2 c0995h2) {
        try {
            synchronized (c0995h2) {
                if (c0995h2.f17737b == 0) {
                    c0995h2.run();
                } else {
                    this.f17663x.execute(c0995h2);
                }
            }
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }
}
