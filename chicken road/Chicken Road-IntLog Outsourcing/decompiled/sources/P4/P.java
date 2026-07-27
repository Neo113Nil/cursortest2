package P4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class P extends K {

    /* renamed from: a, reason: collision with root package name */
    public short[] f2339a;

    /* renamed from: b, reason: collision with root package name */
    public int f2340b;

    @Override // P4.K
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f2339a, this.f2340b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // P4.K
    public final void b(int i2) {
        short[] sArr = this.f2339a;
        if (sArr.length < i2) {
            int length = sArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2339a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2340b;
    }
}
