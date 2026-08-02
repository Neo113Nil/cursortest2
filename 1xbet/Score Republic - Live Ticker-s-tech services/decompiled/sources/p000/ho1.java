package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ho1 extends io1 {

    /* JADX INFO: renamed from: l */
    public final byte[] f3276l;

    /* JADX INFO: renamed from: m */
    public final int f3277m;

    /* JADX INFO: renamed from: n */
    public final int f3278n;

    public ho1(byte[] bArr, int i, int i2) {
        ko1.m3065q(i, i + i2, bArr.length);
        this.f3276l = bArr;
        this.f3277m = i;
        this.f3278n = i2;
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: b */
    public final byte mo2329b(int i) {
        return this.f3276l[this.f3277m + i];
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: c */
    public final int mo2330c() {
        return this.f3278n;
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: d */
    public final io1 mo2331d(int i, int i2) {
        int iM3065q = ko1.m3065q(i, i2, this.f3278n);
        if (iM3065q == 0) {
            return ko1.f4486k;
        }
        return new ho1(this.f3276l, this.f3277m + i, iM3065q);
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: e */
    public final void mo2332e(int i, byte[] bArr) {
        System.arraycopy(this.f3276l, this.f3277m, bArr, 0, i);
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: f */
    public final void mo2333f(ro1 ro1Var) {
        ro1Var.mo3555c(this.f3276l, this.f3277m, this.f3278n);
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: g */
    public final boolean mo2334g(ko1 ko1Var) {
        boolean z = ko1Var instanceof jo1;
        if (!z && !(ko1Var instanceof ho1)) {
            return ko1Var.mo2334g(this);
        }
        int iMo2330c = ko1Var.mo2330c();
        int i = this.f3278n;
        if (i > iMo2330c) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > ko1Var.mo2330c()) {
            int iMo2330c2 = ko1Var.mo2330c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(iMo2330c2).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(iMo2330c2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f3276l;
        int i2 = this.f3277m;
        if (z) {
            return ko1.m3066r(i2, 0, i, bArr, ((jo1) ko1Var).f4058l);
        }
        if (!(ko1Var instanceof ho1)) {
            return ko1Var.mo2331d(0, i).equals(mo2331d(i2, i + i2));
        }
        ho1 ho1Var = (ho1) ko1Var;
        return ko1.m3066r(i2, ho1Var.f3277m, i, bArr, ho1Var.f3276l);
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: h */
    public final int mo2335h(int i, int i2) {
        return ip1.m2669a(i, this.f3276l, this.f3277m, i2);
    }
}
