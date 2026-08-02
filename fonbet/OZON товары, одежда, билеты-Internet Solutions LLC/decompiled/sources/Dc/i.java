package Dc;

import C.o0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class i extends AtomicLong implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final String f6379a;

    /* renamed from: b, reason: collision with root package name */
    final int f6380b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f6381c;

    static final class a extends Thread {
    }

    public i(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f6379a + '-' + incrementAndGet();
        Thread aVar = this.f6381c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f6380b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return o0.c(new StringBuilder("RxThreadFactory["), this.f6379a, "]");
    }

    public i(String str, int i11, boolean z11) {
        this.f6379a = str;
        this.f6380b = i11;
        this.f6381c = z11;
    }
}
