package P4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D extends K {

    /* renamed from: a, reason: collision with root package name */
    public long[] f2322a;

    /* renamed from: b, reason: collision with root package name */
    public int f2323b;

    @Override // P4.K
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f2322a, this.f2323b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // P4.K
    public final void b(int i2) {
        long[] jArr = this.f2322a;
        if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2322a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2323b;
    }
}
