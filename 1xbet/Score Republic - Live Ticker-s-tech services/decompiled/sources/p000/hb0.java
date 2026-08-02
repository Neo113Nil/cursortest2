package p000;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 {

    /* JADX INFO: renamed from: b */
    public final g01 f3152b;

    /* JADX INFO: renamed from: a */
    public final ArrayList f3151a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public qa0[] f3155e = new qa0[8];

    /* JADX INFO: renamed from: f */
    public int f3156f = 7;

    /* JADX INFO: renamed from: g */
    public int f3157g = 0;

    /* JADX INFO: renamed from: h */
    public int f3158h = 0;

    /* JADX INFO: renamed from: c */
    public int f3153c = 4096;

    /* JADX INFO: renamed from: d */
    public int f3154d = 4096;

    public hb0(kb0 kb0Var) {
        this.f3152b = new g01(kb0Var);
    }

    /* JADX INFO: renamed from: a */
    public final int m2249a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f3155e.length;
            while (true) {
                length--;
                i2 = this.f3156f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f3155e[length].f6442c;
                i -= i4;
                this.f3158h -= i4;
                this.f3157g--;
                i3++;
            }
            qa0[] qa0VarArr = this.f3155e;
            System.arraycopy(qa0VarArr, i2 + 1, qa0VarArr, i2 + 1 + i3, this.f3157g);
            this.f3156f += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final C0836wd m2250b(int i) throws IOException {
        if (i >= 0) {
            qa0[] qa0VarArr = jb0.f3891b;
            if (i <= qa0VarArr.length - 1) {
                return qa0VarArr[i].f6440a;
            }
        }
        int length = this.f3156f + 1 + (i - jb0.f3891b.length);
        if (length >= 0) {
            qa0[] qa0VarArr2 = this.f3155e;
            if (length < qa0VarArr2.length) {
                return qa0VarArr2[length].f6440a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m2251c(qa0 qa0Var) {
        this.f3151a.add(qa0Var);
        int i = qa0Var.f6442c;
        int i2 = this.f3154d;
        if (i > i2) {
            Arrays.fill(this.f3155e, (Object) null);
            this.f3156f = this.f3155e.length - 1;
            this.f3157g = 0;
            this.f3158h = 0;
            return;
        }
        m2249a((this.f3158h + i) - i2);
        int i3 = this.f3157g + 1;
        qa0[] qa0VarArr = this.f3155e;
        if (i3 > qa0VarArr.length) {
            qa0[] qa0VarArr2 = new qa0[qa0VarArr.length * 2];
            System.arraycopy(qa0VarArr, 0, qa0VarArr2, qa0VarArr.length, qa0VarArr.length);
            this.f3156f = this.f3155e.length - 1;
            this.f3155e = qa0VarArr2;
        }
        int i4 = this.f3156f;
        this.f3156f = i4 - 1;
        this.f3155e[i4] = qa0Var;
        this.f3157g++;
        this.f3158h += i;
    }

    /* JADX INFO: renamed from: d */
    public final C0836wd m2252d() throws EOFException {
        g01 g01Var = this.f3152b;
        byte bM1917a = g01Var.m1917a();
        int i = bM1917a & 255;
        boolean z = (bM1917a & 128) == 128;
        int iM2253e = m2253e(i, 127);
        if (!z) {
            return g01Var.m1918e(iM2253e);
        }
        vb0 vb0Var = vb0.f8159d;
        long j = iM2253e;
        g01Var.m1920j(j);
        byte[] bArrM3671j = g01Var.f2570k.m3671j(j);
        vb0Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0392kd c0392kd = vb0Var.f8160a;
        C0392kd c0392kd2 = c0392kd;
        int i2 = 0;
        int i3 = 0;
        for (byte b : bArrM3671j) {
            i2 = (i2 << 8) | (b & 255);
            i3 += 8;
            while (i3 >= 8) {
                c0392kd2 = ((C0392kd[]) c0392kd2.f4348c)[(i2 >>> (i3 - 8)) & 255];
                if (((C0392kd[]) c0392kd2.f4348c) == null) {
                    byteArrayOutputStream.write(c0392kd2.f4346a);
                    i3 -= c0392kd2.f4347b;
                    c0392kd2 = c0392kd;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            C0392kd c0392kd3 = ((C0392kd[]) c0392kd2.f4348c)[(i2 << (8 - i3)) & 255];
            C0392kd[] c0392kdArr = (C0392kd[]) c0392kd3.f4348c;
            int i4 = c0392kd3.f4347b;
            if (c0392kdArr != null || i4 > i3) {
                break;
            }
            byteArrayOutputStream.write(c0392kd3.f4346a);
            i3 -= i4;
            c0392kd2 = c0392kd;
        }
        return C0836wd.m5316f(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: e */
    public final int m2253e(int i, int i2) throws EOFException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bM1917a = this.f3152b.m1917a();
            int i5 = bM1917a & 255;
            if ((bM1917a & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (bM1917a & 127) << i4;
            i4 += 7;
        }
    }
}
