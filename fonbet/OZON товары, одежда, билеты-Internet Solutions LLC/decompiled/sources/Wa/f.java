package Wa;

import N3.C3660k;
import com.vk.knet.cornet.b;
import java.util.LinkedHashMap;
import java.util.concurrent.Semaphore;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f33420a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Semaphore f33421b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f33422c = new LinkedHashMap();

    public f(int i11, int i12) {
        this.f33420a = i12;
        this.f33421b = new Semaphore(i11);
    }

    private final synchronized Semaphore b(String str) {
        Semaphore semaphore;
        semaphore = (Semaphore) this.f33422c.get(str);
        if (semaphore == null) {
            semaphore = new Semaphore(this.f33420a);
            this.f33422c.put(str, semaphore);
        }
        return semaphore;
    }

    public final void a(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        Semaphore b11 = b(host);
        b11.acquire();
        b.a aVar = b.a.CLIENT_QUEUE;
        int availablePermits = b11.availablePermits();
        int queueLength = b11.getQueueLength();
        StringBuilder c11 = C3660k.c(availablePermits, "[cronet] Host queue - ", host, " | availablePermits - ", " | queueLength ");
        c11.append(queueLength);
        e.a(aVar, c11.toString());
        try {
            Semaphore semaphore = this.f33421b;
            semaphore.acquire();
            e.a(aVar, "[cronet] Common queue | availablePermits - " + semaphore.availablePermits() + " | queueLength " + semaphore.getQueueLength());
        } catch (Throwable unused) {
            b(host).release();
        }
    }

    public final void c(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f33421b.release();
        b.a aVar = b.a.CLIENT_QUEUE;
        e.a(aVar, "[cronet] Release common queue");
        b(host).release();
        e.a(aVar, "[cronet] Release host queue - " + host);
    }
}
