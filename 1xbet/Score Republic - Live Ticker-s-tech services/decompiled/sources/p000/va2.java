package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class va2 extends d71 {

    /* JADX INFO: renamed from: e */
    public Object[] f8155e;

    /* JADX INFO: renamed from: f */
    public int f8156f;

    @Override // p000.d71
    /* JADX INFO: renamed from: s */
    public final int mo1126s() {
        return this.f8156f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f8156f; i++) {
            sb.append(" '");
            sb.append(mo1127u(i));
            sb.append("': ");
            sb.append(mo1128v(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: u */
    public final db2 mo1127u(int i) {
        if (i < this.f8156f) {
            return (db2) this.f8155e[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: v */
    public final Object mo1128v(int i) {
        if (i < this.f8156f) {
            return this.f8155e[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: x */
    public final Object mo1129x(db2 db2Var) {
        int iM5142z = m5142z(db2Var);
        if (iM5142z == -1) {
            return null;
        }
        return db2Var.f1614b.cast(this.f8155e[iM5142z + iM5142z + 1]);
    }

    /* JADX INFO: renamed from: y */
    public final void m5141y(db2 db2Var, Object obj) {
        int iM5142z;
        if (!db2Var.f1615c && (iM5142z = m5142z(db2Var)) != -1) {
            p80.m3874s(obj, "metadata value");
            this.f8155e[iM5142z + iM5142z + 1] = obj;
            return;
        }
        int i = this.f8156f + 1;
        Object[] objArr = this.f8155e;
        int length = objArr.length;
        if (i + i > length) {
            this.f8155e = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f8155e;
        int i2 = this.f8156f;
        int i3 = i2 + i2;
        objArr2[i3] = db2Var;
        p80.m3874s(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.f8156f++;
    }

    /* JADX INFO: renamed from: z */
    public final int m5142z(db2 db2Var) {
        for (int i = 0; i < this.f8156f; i++) {
            if (this.f8155e[i + i].equals(db2Var)) {
                return i;
            }
        }
        return -1;
    }
}
