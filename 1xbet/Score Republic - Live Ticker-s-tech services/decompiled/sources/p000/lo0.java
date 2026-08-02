package p000;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lo0 extends OutputStream {

    /* JADX INFO: renamed from: j */
    public final ArrayList f4864j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public vt0 f4865k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ no0 f4866l;

    public lo0(no0 no0Var) {
        this.f4866l = no0Var;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        aa0 aa0Var = this.f4866l.f5470g;
        vt0 vt0Var = this.f4865k;
        ArrayList arrayList = this.f4864j;
        if (vt0Var == null) {
            aa0Var.getClass();
            vt0 vt0VarM149i = aa0.m149i(i2);
            this.f4865k = vt0VarM149i;
            arrayList.add(vt0VarM149i);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.f4865k.f8263b);
            vt0 vt0Var2 = this.f4865k;
            if (iMin == 0) {
                int iMax = Math.max(i2, vt0Var2.f8264c * 2);
                aa0Var.getClass();
                vt0 vt0VarM149i2 = aa0.m149i(iMax);
                this.f4865k = vt0VarM149i2;
                arrayList.add(vt0VarM149i2);
            } else {
                vt0Var2.m5189a(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        vt0 vt0Var = this.f4865k;
        if (vt0Var != null && vt0Var.f8263b > 0) {
            vt0Var.f8262a.m3678s((byte) i);
            vt0Var.f8263b--;
            vt0Var.f8264c++;
            return;
        }
        write(new byte[]{(byte) i}, 0, 1);
    }
}
