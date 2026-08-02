package p000;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ad1 implements ThreadFactory {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ThreadFactory f153j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f154k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AtomicLong f155l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean f156m;

    public ad1(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f153j = threadFactory;
        this.f154k = str;
        this.f155l = atomicLong;
        this.f156m = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f153j.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        AtomicLong atomicLong = this.f155l;
        Objects.requireNonNull(atomicLong);
        threadNewThread.setName(String.format(Locale.ROOT, this.f154k, Long.valueOf(atomicLong.getAndIncrement())));
        Boolean bool = this.f156m;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }
}
