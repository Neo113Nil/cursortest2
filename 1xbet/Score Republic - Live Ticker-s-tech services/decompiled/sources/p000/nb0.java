package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nb0 implements Closeable {

    /* JADX INFO: renamed from: j */
    public final f01 f5355j;

    /* JADX INFO: renamed from: k */
    public final C0539oc f5356k;

    /* JADX INFO: renamed from: l */
    public final ib0 f5357l;

    /* JADX INFO: renamed from: m */
    public int f5358m;

    /* JADX INFO: renamed from: n */
    public boolean f5359n;

    public nb0(f01 f01Var) {
        this.f5355j = f01Var;
        C0539oc c0539oc = new C0539oc();
        this.f5356k = c0539oc;
        this.f5357l = new ib0(c0539oc);
        this.f5358m = 16384;
    }

    /* JADX INFO: renamed from: a */
    public final void m3511a(int i, int i2, byte b, byte b2) {
        Logger logger = ob0.f5688a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(lb0.m3201a(false, i, i2, b, b2));
        }
        int i3 = this.f5358m;
        if (i2 > i3) {
            Locale locale = Locale.US;
            C0270h1.m2190f(AbstractC0024an.m281d(i3, i2, "FRAME_SIZE_ERROR length > ", ": "));
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            Locale locale2 = Locale.US;
            C0270h1.m2190f(j11.m2773h("reserved bit set: ", i));
            return;
        }
        f01 f01Var = this.f5355j;
        f01Var.m1554i((i2 >>> 16) & 255);
        f01Var.m1554i((i2 >>> 8) & 255);
        f01Var.m1554i(i2 & 255);
        f01Var.m1554i(b & 255);
        f01Var.m1554i(b2 & 255);
        f01Var.m1555j(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5359n = true;
        this.f5355j.close();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX INFO: renamed from: e */
    public final void m3512e(boolean z, int i, List list) throws IOException {
        int length;
        int length2;
        if (this.f5359n) {
            C0270h1.m2187c("closed");
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            qa0 qa0Var = (qa0) list.get(i2);
            C0836wd c0836wdMo2562i = qa0Var.f6440a.mo2562i();
            C0836wd c0836wd = qa0Var.f6441b;
            Integer num = (Integer) jb0.f3892c.get(c0836wdMo2562i);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (length2 < 2 || length2 > 7) {
                    length = length2;
                    length2 = -1;
                } else {
                    qa0[] qa0VarArr = jb0.f3891b;
                    if (qa0VarArr[iIntValue].f6441b.equals(c0836wd)) {
                        length = length2;
                    } else if (qa0VarArr[length2].f6441b.equals(c0836wd)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            ib0 ib0Var = this.f5357l;
            if (length2 == -1) {
                int i3 = ib0Var.f3528d + 1;
                while (true) {
                    qa0[] qa0VarArr2 = ib0Var.f3526b;
                    if (i3 >= qa0VarArr2.length) {
                        break;
                    }
                    if (qa0VarArr2[i3].f6440a.equals(c0836wdMo2562i)) {
                        if (ib0Var.f3526b[i3].f6441b.equals(c0836wd)) {
                            length2 = (i3 - ib0Var.f3528d) + jb0.f3891b.length;
                            break;
                        } else if (length == -1) {
                            length = (i3 - ib0Var.f3528d) + jb0.f3891b.length;
                        }
                    }
                    i3++;
                }
            }
            if (length2 != -1) {
                ib0Var.m2588c(length2, 127, 128);
            } else if (length == -1) {
                ib0Var.f3525a.m3678s(64);
                ib0Var.m2587b(c0836wdMo2562i);
                ib0Var.m2587b(c0836wd);
                ib0Var.m2586a(qa0Var);
            } else {
                C0836wd c0836wd2 = jb0.f3890a;
                c0836wdMo2562i.getClass();
                c0836wd2.getClass();
                if (!c0836wdMo2562i.mo2561h(c0836wd2, c0836wd2.f8511j.length) || qa0.f6439h.equals(c0836wdMo2562i)) {
                    ib0Var.m2588c(length, 63, 64);
                    ib0Var.m2587b(c0836wd);
                    ib0Var.m2586a(qa0Var);
                } else {
                    ib0Var.m2588c(length, 15, 0);
                    ib0Var.m2587b(c0836wd);
                }
            }
        }
        C0539oc c0539oc = this.f5356k;
        long j = c0539oc.f5698k;
        int iMin = (int) Math.min(this.f5358m, j);
        long j2 = iMin;
        byte b = j == j2 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m3511a(i, iMin, (byte) 1, b);
        f01 f01Var = this.f5355j;
        f01Var.mo1553f(c0539oc, j2);
        if (j > j2) {
            long j3 = j - j2;
            while (j3 > 0) {
                int iMin2 = (int) Math.min(this.f5358m, j3);
                long j4 = iMin2;
                j3 -= j4;
                m3511a(i, iMin2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                f01Var.mo1553f(c0539oc, j4);
            }
        }
    }
}
