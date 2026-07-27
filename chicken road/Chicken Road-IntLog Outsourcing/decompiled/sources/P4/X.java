package P4;

import f4.C0439p;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X extends K {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2351a;

    /* renamed from: b, reason: collision with root package name */
    public int f2352b;

    @Override // P4.K
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f2351a, this.f2352b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return new C0439p(copyOf);
    }

    @Override // P4.K
    public final void b(int i2) {
        int[] iArr = this.f2351a;
        if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2351a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2352b;
    }
}
