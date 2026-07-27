package P4;

import java.util.Arrays;

/* renamed from: P4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131j extends K {

    /* renamed from: a, reason: collision with root package name */
    public char[] f2379a;

    /* renamed from: b, reason: collision with root package name */
    public int f2380b;

    @Override // P4.K
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f2379a, this.f2380b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // P4.K
    public final void b(int i2) {
        char[] cArr = this.f2379a;
        if (cArr.length < i2) {
            int length = cArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2379a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2380b;
    }
}
