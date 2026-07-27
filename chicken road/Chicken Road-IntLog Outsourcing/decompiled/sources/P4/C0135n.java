package P4;

import java.util.Arrays;

/* renamed from: P4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135n extends K {

    /* renamed from: a, reason: collision with root package name */
    public double[] f2385a;

    /* renamed from: b, reason: collision with root package name */
    public int f2386b;

    @Override // P4.K
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f2385a, this.f2386b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // P4.K
    public final void b(int i2) {
        double[] dArr = this.f2385a;
        if (dArr.length < i2) {
            int length = dArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2385a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2386b;
    }
}
