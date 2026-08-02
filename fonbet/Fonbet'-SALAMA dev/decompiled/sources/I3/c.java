package I3;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f3659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f3661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f3662d;

    public c(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f3659a = threadFactory;
        this.f3660b = str;
        this.f3661c = atomicLong;
        this.f3662d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3659a.newThread(runnable);
        Objects.requireNonNull(newThread);
        String str = this.f3660b;
        if (str != null) {
            AtomicLong atomicLong = this.f3661c;
            Objects.requireNonNull(atomicLong);
            newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f3662d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
