package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jo1 extends io1 {

    /* JADX INFO: renamed from: l */
    public final byte[] f4058l;

    public jo1(byte[] bArr) {
        bArr.getClass();
        this.f4058l = bArr;
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: b */
    public final byte mo2329b(int i) {
        return this.f4058l[i];
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: c */
    public final int mo2330c() {
        return this.f4058l.length;
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: d */
    public final io1 mo2331d(int i, int i2) {
        byte[] bArr = this.f4058l;
        int iM3065q = ko1.m3065q(0, i2, bArr.length);
        return iM3065q == 0 ? ko1.f4486k : new ho1(bArr, 0, iM3065q);
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: e */
    public final void mo2332e(int i, byte[] bArr) {
        System.arraycopy(this.f4058l, 0, bArr, 0, i);
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: f */
    public final void mo2333f(ro1 ro1Var) {
        byte[] bArr = this.f4058l;
        ro1Var.mo3555c(bArr, 0, bArr.length);
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: g */
    public final boolean mo2334g(ko1 ko1Var) {
        boolean z = ko1Var instanceof jo1;
        byte[] bArr = this.f4058l;
        if (z) {
            return Arrays.equals(bArr, ((jo1) ko1Var).f4058l);
        }
        boolean z2 = ko1Var instanceof ho1;
        if (!z2) {
            return ko1Var.mo2334g(this);
        }
        ho1 ho1Var = (ho1) ko1Var;
        int i = ho1Var.f3278n;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= i) {
            if (z) {
                return ko1.m3066r(0, 0, length, bArr, ((jo1) ko1Var).f4058l);
            }
            if (!z2) {
                return ko1Var.mo2331d(0, length).equals(mo2331d(0, length));
            }
            return ko1.m3066r(0, ho1Var.f3277m, length, bArr, ho1Var.f3276l);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // p000.ko1
    /* JADX INFO: renamed from: h */
    public final int mo2335h(int i, int i2) {
        return ip1.m2669a(i, this.f4058l, 0, i2);
    }
}
