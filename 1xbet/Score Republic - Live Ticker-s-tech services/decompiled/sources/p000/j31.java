package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j31 {

    /* JADX INFO: renamed from: a */
    public final int f3807a;

    /* JADX INFO: renamed from: b */
    public final int f3808b;

    /* JADX INFO: renamed from: c */
    public final int f3809c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f3810d;

    public j31(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f3810d = atomicInteger;
        this.f3809c = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.f3807a = i;
        this.f3808b = i / 2;
        atomicInteger.set(i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2820a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f3810d;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.f3808b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j31)) {
            return false;
        }
        j31 j31Var = (j31) obj;
        return this.f3807a == j31Var.f3807a && this.f3809c == j31Var.f3809c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3807a), Integer.valueOf(this.f3809c)});
    }
}
