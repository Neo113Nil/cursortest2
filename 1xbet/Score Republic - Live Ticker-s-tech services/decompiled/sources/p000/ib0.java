package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ib0 {

    /* JADX INFO: renamed from: a */
    public final C0539oc f3525a;

    /* JADX INFO: renamed from: c */
    public int f3527c;

    /* JADX INFO: renamed from: e */
    public int f3529e;

    /* JADX INFO: renamed from: b */
    public qa0[] f3526b = new qa0[8];

    /* JADX INFO: renamed from: d */
    public int f3528d = 7;

    public ib0(C0539oc c0539oc) {
        this.f3525a = c0539oc;
    }

    /* JADX INFO: renamed from: a */
    public final void m2586a(qa0 qa0Var) {
        int i;
        int i2 = qa0Var.f6442c;
        if (i2 > 4096) {
            Arrays.fill(this.f3526b, (Object) null);
            this.f3528d = this.f3526b.length - 1;
            this.f3527c = 0;
            this.f3529e = 0;
            return;
        }
        int i3 = (this.f3529e + i2) - 4096;
        if (i3 > 0) {
            int length = this.f3526b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.f3528d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.f3526b[length].f6442c;
                i3 -= i5;
                this.f3529e -= i5;
                this.f3527c--;
                i4++;
                length--;
            }
            qa0[] qa0VarArr = this.f3526b;
            int i6 = i + 1;
            System.arraycopy(qa0VarArr, i6, qa0VarArr, i6 + i4, this.f3527c);
            this.f3528d += i4;
        }
        int i7 = this.f3527c + 1;
        qa0[] qa0VarArr2 = this.f3526b;
        if (i7 > qa0VarArr2.length) {
            qa0[] qa0VarArr3 = new qa0[qa0VarArr2.length * 2];
            System.arraycopy(qa0VarArr2, 0, qa0VarArr3, qa0VarArr2.length, qa0VarArr2.length);
            this.f3528d = this.f3526b.length - 1;
            this.f3526b = qa0VarArr3;
        }
        int i8 = this.f3528d;
        this.f3528d = i8 - 1;
        this.f3526b[i8] = qa0Var;
        this.f3527c++;
        this.f3529e += i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m2587b(C0836wd c0836wd) {
        m2588c(c0836wd.mo2556b(), 127, 0);
        c0836wd.mo2564l(this.f3525a, c0836wd.mo2556b());
    }

    /* JADX INFO: renamed from: c */
    public final void m2588c(int i, int i2, int i3) {
        C0539oc c0539oc = this.f3525a;
        if (i < i2) {
            c0539oc.m3678s(i | i3);
            return;
        }
        c0539oc.m3678s(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c0539oc.m3678s(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c0539oc.m3678s(i4);
    }
}
