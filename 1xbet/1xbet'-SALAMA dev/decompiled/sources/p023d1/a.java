package p023d1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f12338a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12339b;

    public a(boolean z4) {
        this.f12339b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbC = e.c(this.f12339b ? "WM.task-" : "androidx.work-");
        sbC.append(this.f12338a.incrementAndGet());
        return new Thread(runnable, sbC.toString());
    }
}
