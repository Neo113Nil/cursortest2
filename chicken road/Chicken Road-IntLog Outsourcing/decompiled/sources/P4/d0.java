package P4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 extends K {

    /* renamed from: a, reason: collision with root package name */
    public short[] f2364a;

    /* renamed from: b, reason: collision with root package name */
    public int f2365b;

    @Override // P4.K
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f2364a, this.f2365b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return new f4.u(copyOf);
    }

    @Override // P4.K
    public final void b(int i2) {
        short[] sArr = this.f2364a;
        if (sArr.length < i2) {
            int length = sArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2364a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2365b;
    }
}
