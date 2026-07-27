package P4;

import f4.C0441r;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 extends K {

    /* renamed from: a, reason: collision with root package name */
    public long[] f2356a;

    /* renamed from: b, reason: collision with root package name */
    public int f2357b;

    @Override // P4.K
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f2356a, this.f2357b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return new C0441r(copyOf);
    }

    @Override // P4.K
    public final void b(int i2) {
        long[] jArr = this.f2356a;
        if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2356a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2357b;
    }
}
