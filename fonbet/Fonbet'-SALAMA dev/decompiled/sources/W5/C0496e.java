package W5;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* renamed from: W5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0496e {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f7184c = Logger.getLogger(C0496e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f7185a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f7186b;

    public C0496e(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.f7186b = atomicLong;
        p3.f.d("value must be positive", j > 0);
        this.f7185a = "keepalive time nanos";
        atomicLong.set(j);
    }
}
