package E9;

/* loaded from: classes9.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f7653a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f7654b;

    c(b bVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f7653a = bVar;
        int length = iArr.length;
        int i11 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f7654b = iArr;
            return;
        }
        while (i11 < length && iArr[i11] == 0) {
            i11++;
        }
        if (i11 == length) {
            this.f7654b = new int[]{0};
            return;
        }
        int i12 = length - i11;
        int[] iArr2 = new int[i12];
        this.f7654b = iArr2;
        System.arraycopy(iArr, i11, iArr2, 0, i12);
    }

    final c a(c cVar) {
        b bVar = cVar.f7653a;
        b bVar2 = this.f7653a;
        if (!bVar2.equals(bVar)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e()) {
            return cVar;
        }
        if (cVar.e()) {
            return this;
        }
        int[] iArr = this.f7654b;
        int length = iArr.length;
        int[] iArr2 = cVar.f7654b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i11 = length2; i11 < iArr.length; i11++) {
            iArr3[i11] = bVar2.a(iArr2[i11 - length2], iArr[i11]);
        }
        return new c(bVar2, iArr3);
    }

    final int b(int i11) {
        if (i11 == 0) {
            return c(0);
        }
        b bVar = this.f7653a;
        int[] iArr = this.f7654b;
        if (i11 == 1) {
            int i12 = 0;
            for (int i13 : iArr) {
                i12 = bVar.a(i12, i13);
            }
            return i12;
        }
        int i14 = iArr[0];
        int length = iArr.length;
        for (int i15 = 1; i15 < length; i15++) {
            i14 = bVar.a(bVar.h(i11, i14), iArr[i15]);
        }
        return i14;
    }

    final int c(int i11) {
        return this.f7654b[(r0.length - 1) - i11];
    }

    final int d() {
        return this.f7654b.length - 1;
    }

    final boolean e() {
        return this.f7654b[0] == 0;
    }

    final c f(int i11) {
        b bVar = this.f7653a;
        if (i11 == 0) {
            return bVar.e();
        }
        if (i11 == 1) {
            return this;
        }
        int[] iArr = this.f7654b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr2[i12] = bVar.h(iArr[i12], i11);
        }
        return new c(bVar, iArr2);
    }

    final c g(c cVar) {
        b bVar = cVar.f7653a;
        b bVar2 = this.f7653a;
        if (!bVar2.equals(bVar)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e() || cVar.e()) {
            return bVar2.e();
        }
        int[] iArr = this.f7654b;
        int length = iArr.length;
        int[] iArr2 = cVar.f7654b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            for (int i13 = 0; i13 < length2; i13++) {
                int i14 = i11 + i13;
                iArr3[i14] = bVar2.a(iArr3[i14], bVar2.h(i12, iArr2[i13]));
            }
        }
        return new c(bVar2, iArr3);
    }

    final c h(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        b bVar = this.f7653a;
        if (i12 == 0) {
            return bVar.e();
        }
        int[] iArr = this.f7654b;
        int length = iArr.length;
        int[] iArr2 = new int[i11 + length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr2[i13] = bVar.h(iArr[i13], i12);
        }
        return new c(bVar, iArr2);
    }

    final c i() {
        int[] iArr = this.f7654b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i11 = 0;
        while (true) {
            b bVar = this.f7653a;
            if (i11 >= length) {
                return new c(bVar, iArr2);
            }
            iArr2[i11] = bVar.i(0, iArr[i11]);
            i11++;
        }
    }

    final c j(c cVar) {
        if (this.f7653a.equals(cVar.f7653a)) {
            return cVar.e() ? this : a(cVar.i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int d11 = d(); d11 >= 0; d11--) {
            int c11 = c(d11);
            if (c11 != 0) {
                if (c11 < 0) {
                    sb2.append(" - ");
                    c11 = -c11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d11 == 0 || c11 != 1) {
                    sb2.append(c11);
                }
                if (d11 != 0) {
                    if (d11 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(d11);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
