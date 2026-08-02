package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i61 extends C0836wd {

    /* JADX INFO: renamed from: n */
    public final transient byte[][] f3449n;

    /* JADX INFO: renamed from: o */
    public final transient int[] f3450o;

    public i61(byte[][] bArr, int[] iArr) {
        super(C0836wd.f8510m.f8511j);
        this.f3449n = bArr;
        this.f3450o = iArr;
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: a */
    public final String mo2555a() {
        throw null;
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: b */
    public final int mo2556b() {
        return this.f3450o[this.f3449n.length - 1];
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: c */
    public final String mo2557c() {
        return new C0836wd(mo2563j()).mo2557c();
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: d */
    public final byte[] mo2558d() {
        return mo2563j();
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: e */
    public final byte mo2559e(int i) {
        byte[][] bArr = this.f3449n;
        int length = bArr.length - 1;
        int[] iArr = this.f3450o;
        a90.m128l(iArr[length], i, 1L);
        int iM3869n = p80.m3869n(this, i);
        return bArr[iM3869n][(i - (iM3869n == 0 ? 0 : iArr[iM3869n - 1])) + iArr[bArr.length + iM3869n]];
    }

    @Override // p000.C0836wd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0836wd)) {
            return false;
        }
        C0836wd c0836wd = (C0836wd) obj;
        return c0836wd.mo2556b() == mo2556b() && mo2561h(c0836wd, mo2556b());
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: g */
    public final boolean mo2560g(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= mo2556b() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM3869n = p80.m3869n(this, i);
            while (i < i4) {
                int[] iArr = this.f3450o;
                int i5 = iM3869n == 0 ? 0 : iArr[iM3869n - 1];
                int i6 = iArr[iM3869n] - i5;
                byte[][] bArr2 = this.f3449n;
                int i7 = iArr[bArr2.length + iM3869n];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iM3869n];
                bArr3.getClass();
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iM3869n++;
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: h */
    public final boolean mo2561h(C0836wd c0836wd, int i) {
        c0836wd.getClass();
        if (mo2556b() - i >= 0) {
            int iM3869n = p80.m3869n(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f3450o;
                int i4 = iM3869n == 0 ? 0 : iArr[iM3869n - 1];
                int i5 = iArr[iM3869n] - i4;
                byte[][] bArr = this.f3449n;
                int i6 = iArr[bArr.length + iM3869n];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (c0836wd.mo2560g(i3, bArr[iM3869n], (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iM3869n++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0836wd
    public final int hashCode() {
        int i = this.f8512k;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f3449n;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f3450o;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f8512k = i3;
        return i3;
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: i */
    public final C0836wd mo2562i() {
        return new C0836wd(mo2563j()).mo2562i();
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: j */
    public final byte[] mo2563j() {
        byte[] bArr = new byte[mo2556b()];
        byte[][] bArr2 = this.f3449n;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f3450o;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC0202f8.m1742s(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p000.C0836wd
    /* JADX INFO: renamed from: l */
    public final void mo2564l(C0539oc c0539oc, int i) {
        int iM3869n = p80.m3869n(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f3450o;
            int i3 = iM3869n == 0 ? 0 : iArr[iM3869n - 1];
            int i4 = iArr[iM3869n] - i3;
            byte[][] bArr = this.f3449n;
            int i5 = iArr[bArr.length + iM3869n];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            f61 f61Var = new f61(bArr[iM3869n], i6, i6 + iMin, true);
            f61 f61Var2 = c0539oc.f5697j;
            if (f61Var2 == null) {
                f61Var.f2325g = f61Var;
                f61Var.f2324f = f61Var;
                c0539oc.f5697j = f61Var;
            } else {
                f61 f61Var3 = f61Var2.f2325g;
                f61Var3.getClass();
                f61Var3.m1643b(f61Var);
            }
            i2 += iMin;
            iM3869n++;
        }
        c0539oc.f5698k += (long) i;
    }

    @Override // p000.C0836wd
    public final String toString() {
        return new C0836wd(mo2563j()).toString();
    }
}
