package W5;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f6890d;

    public N1(float f7, float f8) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f6890d = atomicInteger;
        this.f6889c = (int) (f8 * 1000.0f);
        int i7 = (int) (f7 * 1000.0f);
        this.f6887a = i7;
        this.f6888b = i7 / 2;
        atomicInteger.set(i7);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i7;
        int i8;
        do {
            atomicInteger = this.f6890d;
            i7 = atomicInteger.get();
            if (i7 == 0) {
                return false;
            }
            i8 = i7 - 1000;
        } while (!atomicInteger.compareAndSet(i7, Math.max(i8, 0)));
        return i8 > this.f6888b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N1)) {
            return false;
        }
        N1 n2 = (N1) obj;
        return this.f6887a == n2.f6887a && this.f6889c == n2.f6889c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6887a), Integer.valueOf(this.f6889c)});
    }
}
