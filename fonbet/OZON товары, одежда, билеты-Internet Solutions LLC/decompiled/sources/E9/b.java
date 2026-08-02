package E9;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f7648e = new b();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f7649a = new int[929];

    /* renamed from: b, reason: collision with root package name */
    private final int[] f7650b = new int[929];

    /* renamed from: c, reason: collision with root package name */
    private final c f7651c;

    /* renamed from: d, reason: collision with root package name */
    private final c f7652d;

    private b() {
        int i11 = 1;
        for (int i12 = 0; i12 < 929; i12++) {
            this.f7649a[i12] = i11;
            i11 = (i11 * 3) % 929;
        }
        for (int i13 = 0; i13 < 928; i13++) {
            this.f7650b[this.f7649a[i13]] = i13;
        }
        this.f7651c = new c(this, new int[]{0});
        this.f7652d = new c(this, new int[]{1});
    }

    final int a(int i11, int i12) {
        return (i11 + i12) % 929;
    }

    final c b(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.f7651c;
        }
        int[] iArr = new int[i11 + 1];
        iArr[0] = i12;
        return new c(this, iArr);
    }

    final int c(int i11) {
        return this.f7649a[i11];
    }

    final c d() {
        return this.f7652d;
    }

    final c e() {
        return this.f7651c;
    }

    final int f(int i11) {
        if (i11 == 0) {
            throw new ArithmeticException();
        }
        return this.f7649a[928 - this.f7650b[i11]];
    }

    final int g(int i11) {
        if (i11 != 0) {
            return this.f7650b[i11];
        }
        throw new IllegalArgumentException();
    }

    final int h(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f7650b;
        return this.f7649a[(iArr[i11] + iArr[i12]) % 928];
    }

    final int i(int i11, int i12) {
        return ((i11 + 929) - i12) % 929;
    }
}
