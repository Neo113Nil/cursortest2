package I9;

import I9.j;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f12006a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12007b;

    private b(int i11, byte[] bArr) {
        this.f12006a = i11;
        this.f12007b = bArr;
    }

    static b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length != jVar.g()) {
            throw new IllegalArgumentException();
        }
        j.b f7 = jVar.f(fVar);
        j.a[] a11 = f7.a();
        int i11 = 0;
        for (j.a aVar : a11) {
            i11 += aVar.a();
        }
        b[] bVarArr = new b[i11];
        int i12 = 0;
        for (j.a aVar2 : a11) {
            int i13 = 0;
            while (i13 < aVar2.a()) {
                int b11 = aVar2.b();
                bVarArr[i12] = new b(b11, new byte[f7.b() + b11]);
                i13++;
                i12++;
            }
        }
        int length = bVarArr[0].f12007b.length;
        int i14 = i11 - 1;
        while (i14 >= 0 && bVarArr[i14].f12007b.length != length) {
            i14--;
        }
        int i15 = i14 + 1;
        int b12 = length - f7.b();
        int i16 = 0;
        for (int i17 = 0; i17 < b12; i17++) {
            int i18 = 0;
            while (i18 < i12) {
                bVarArr[i18].f12007b[i17] = bArr[i16];
                i18++;
                i16++;
            }
        }
        int i19 = i15;
        while (i19 < i12) {
            bVarArr[i19].f12007b[b12] = bArr[i16];
            i19++;
            i16++;
        }
        int length2 = bVarArr[0].f12007b.length;
        while (b12 < length2) {
            int i21 = 0;
            while (i21 < i12) {
                bVarArr[i21].f12007b[i21 < i15 ? b12 : b12 + 1] = bArr[i16];
                i21++;
                i16++;
            }
            b12++;
        }
        return bVarArr;
    }

    final byte[] a() {
        return this.f12007b;
    }

    final int c() {
        return this.f12006a;
    }
}
