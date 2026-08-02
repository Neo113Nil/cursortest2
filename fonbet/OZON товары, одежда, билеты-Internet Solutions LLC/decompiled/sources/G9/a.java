package G9;

import java.lang.reflect.Array;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b[] f9770a;

    /* renamed from: b, reason: collision with root package name */
    private int f9771b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9772c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9773d;

    a(int i11, int i12) {
        this.f9770a = new b[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            this.f9770a[i13] = new b(((i12 + 4) * 17) + 1);
        }
        this.f9773d = i12 * 17;
        this.f9772c = i11;
        this.f9771b = -1;
    }

    final b a() {
        return this.f9770a[this.f9771b];
    }

    public final byte[][] b(int i11, int i12) {
        int i13 = this.f9772c * i12;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i13, this.f9773d * i11);
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[(i13 - i14) - 1] = this.f9770a[i14 / i12].b(i11);
        }
        return bArr;
    }

    final void c() {
        this.f9771b++;
    }
}
