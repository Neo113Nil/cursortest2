package G4;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f3017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f3018d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E4.y f3020b;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f3017c = timeUnit.toMillis(1L);
        f3018d = timeUnit.toMillis(5L);
    }

    public r(M m7, E4.y yVar) {
        this.f3019a = m7;
        this.f3020b = yVar;
    }
}
