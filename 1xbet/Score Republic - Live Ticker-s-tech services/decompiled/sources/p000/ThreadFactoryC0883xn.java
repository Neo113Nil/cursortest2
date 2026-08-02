package p000;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: xn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0883xn implements ThreadFactory {

    /* JADX INFO: renamed from: n */
    public static final ThreadFactory f8995n = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: j */
    public final AtomicLong f8996j = new AtomicLong();

    /* JADX INFO: renamed from: k */
    public final String f8997k;

    /* JADX INFO: renamed from: l */
    public final int f8998l;

    /* JADX INFO: renamed from: m */
    public final StrictMode.ThreadPolicy f8999m;

    public ThreadFactoryC0883xn(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f8997k = str;
        this.f8998l = i;
        this.f8999m = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f8995n.newThread(new RunnableC0195f1(7, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f8997k + " Thread #" + this.f8996j.getAndIncrement());
        return threadNewThread;
    }
}
