package P4;

import java.util.Arrays;

/* renamed from: P4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125d extends K {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f2362a;

    /* renamed from: b, reason: collision with root package name */
    public int f2363b;

    @Override // P4.K
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f2362a, this.f2363b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // P4.K
    public final void b(int i2) {
        boolean[] zArr = this.f2362a;
        if (zArr.length < i2) {
            int length = zArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2362a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2363b;
    }
}
