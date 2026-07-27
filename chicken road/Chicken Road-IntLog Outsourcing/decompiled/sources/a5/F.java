package a5;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public int f3913a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3914b = new int[10];

    public final int a() {
        if ((this.f3913a & 16) != 0) {
            return this.f3914b[4];
        }
        return 65535;
    }

    public final void b(F other) {
        kotlin.jvm.internal.i.e(other, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (((1 << i2) & other.f3913a) != 0) {
                c(i2, other.f3914b[i2]);
            }
        }
    }

    public final void c(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f3914b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f3913a = (1 << i2) | this.f3913a;
            iArr[i2] = i3;
        }
    }
}
