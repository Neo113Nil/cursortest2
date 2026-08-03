package P1;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f1441a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1442b = new int[10];

    public final int a() {
        if ((this.f1441a & 128) != 0) {
            return this.f1442b[7];
        }
        return 65535;
    }

    public final void b(P1.E other) {
        kotlin.jvm.internal.i.e(other, "other");
        int i2 = 0;
        while (i2 < 10) {
            int i3 = i2 + 1;
            if (((1 << i2) & other.f1441a) != 0) {
                c(i2, other.f1442b[i2]);
            }
            i2 = i3;
        }
    }

    public final void c(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f1442b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f1441a = (1 << i2) | this.f1441a;
            iArr[i2] = i3;
        }
    }
}
