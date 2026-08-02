package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 extends rm1 {

    /* JADX INFO: renamed from: b */
    public final d71 f9265b;

    /* JADX INFO: renamed from: c */
    public final d71 f9266c;

    /* JADX INFO: renamed from: d */
    public final int[] f9267d;

    /* JADX INFO: renamed from: e */
    public final int f9268e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public yb2(d71 d71Var, d71 d71Var2) {
        this.f9265b = d71Var;
        this.f9266c = d71Var2;
        int iMo1126s = d71Var2.mo1126s();
        if (!(iMo1126s <= 28)) {
            C0270h1.m2190f("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iMo1126s];
        this.f9267d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iMo1126s) {
            db2 db2VarM5753d = m5753d(i);
            long j2 = db2VarM5753d.f1617e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (db2VarM5753d.equals(m5753d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = db2VarM5753d.f1615c ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.f9268e = i2;
    }

    @Override // p000.rm1
    /* JADX INFO: renamed from: a */
    public final void mo4381a(vb2 vb2Var, qb2 qb2Var) {
        for (int i = 0; i < this.f9268e; i++) {
            int i2 = this.f9267d[i];
            db2 db2VarM5753d = m5753d(i2 & 31);
            if (db2VarM5753d.f1615c) {
                vb2Var.m5146b(db2VarM5753d, new xb2(this, db2VarM5753d, i2), qb2Var);
            } else {
                d71 d71Var = this.f9265b;
                int iMo1126s = d71Var.mo1126s();
                if (i2 >= iMo1126s) {
                    d71Var = this.f9266c;
                    i2 -= iMo1126s;
                }
                vb2Var.m5145a(db2VarM5753d, db2VarM5753d.f1614b.cast(d71Var.mo1128v(i2)), qb2Var);
            }
        }
    }

    @Override // p000.rm1
    /* JADX INFO: renamed from: b */
    public final int mo4382b() {
        return this.f9268e;
    }

    @Override // p000.rm1
    /* JADX INFO: renamed from: c */
    public final Set mo4383c() {
        return new C0867x7(4, this);
    }

    /* JADX INFO: renamed from: d */
    public final db2 m5753d(int i) {
        d71 d71Var = this.f9265b;
        int iMo1126s = d71Var.mo1126s();
        return i >= iMo1126s ? this.f9266c.mo1127u(i - iMo1126s) : d71Var.mo1127u(i);
    }
}
