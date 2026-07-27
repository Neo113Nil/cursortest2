package X3;

import Z3.i;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f3520c = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f3521a = f3520c.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    public final i f3522b;

    public a(i iVar) {
        this.f3522b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f3521a == ((a) obj).f3521a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3521a;
    }

    public final String toString() {
        return "RegisteredReader{" + this.f3521a + "}";
    }
}
