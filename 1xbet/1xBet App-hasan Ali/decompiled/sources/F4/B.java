package F4;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public int f1565a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1566b = new int[10];

    public final int a() {
        if ((this.f1565a & 128) != 0) {
            return this.f1566b[7];
        }
        return 65535;
    }

    public final void b(B b3) {
        kotlin.jvm.internal.l.f("other", b3);
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & b3.f1565a) != 0) {
                c(i, b3.f1566b[i]);
            }
        }
    }

    public final void c(int i, int i5) {
        if (i >= 0) {
            int[] iArr = this.f1566b;
            if (i >= iArr.length) {
                return;
            }
            this.f1565a = (1 << i) | this.f1565a;
            iArr[i] = i5;
        }
    }
}
