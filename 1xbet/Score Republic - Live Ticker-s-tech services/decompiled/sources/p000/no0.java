package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class no0 implements d60 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0489n f5464a;

    /* JADX INFO: renamed from: c */
    public vt0 f5466c;

    /* JADX INFO: renamed from: g */
    public final aa0 f5470g;

    /* JADX INFO: renamed from: h */
    public final ha1 f5471h;

    /* JADX INFO: renamed from: i */
    public boolean f5472i;

    /* JADX INFO: renamed from: j */
    public int f5473j;

    /* JADX INFO: renamed from: l */
    public long f5475l;

    /* JADX INFO: renamed from: b */
    public int f5465b = -1;

    /* JADX INFO: renamed from: d */
    public InterfaceC0951zh f5467d = wa0.f8471k;

    /* JADX INFO: renamed from: e */
    public final mo0 f5468e = new mo0(this);

    /* JADX INFO: renamed from: f */
    public final ByteBuffer f5469f = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: k */
    public int f5474k = -1;

    public no0(AbstractC0489n abstractC0489n, aa0 aa0Var, ha1 ha1Var) {
        this.f5464a = abstractC0489n;
        this.f5470g = aa0Var;
        this.f5471h = ha1Var;
    }

    /* JADX INFO: renamed from: g */
    public static int m3550g(xx0 xx0Var, OutputStream outputStream) throws IOException {
        C0525nz c0525nz = xx0Var.f9101j;
        if (c0525nz != null) {
            int iMo2754a = c0525nz.mo2754a(null);
            C0525nz c0525nz2 = xx0Var.f9101j;
            c0525nz2.getClass();
            int iMo2754a2 = c0525nz2.mo2754a(null);
            Logger logger = AbstractC0397ki.f4383b;
            if (iMo2754a2 > 4096) {
                iMo2754a2 = 4096;
            }
            C0323ii c0323ii = new C0323ii(outputStream, iMo2754a2);
            c0525nz2.mo2756c(c0323ii);
            if (c0323ii.f3577f > 0) {
                c0323ii.m2646G();
            }
            xx0Var.f9101j = null;
            return iMo2754a;
        }
        ByteArrayInputStream byteArrayInputStream = xx0Var.f9103l;
        if (byteArrayInputStream == null) {
            return 0;
        }
        C0709sy c0709sy = zx0.f9981a;
        a90.m127k(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                xx0Var.f9103l = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3551a(lo0 lo0Var, boolean z) {
        ArrayList arrayList = lo0Var.f4864j;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i += ((vt0) obj).f8264c;
        }
        int i3 = this.f5465b;
        if (i3 >= 0 && i > i3) {
            ja1 ja1Var = ja1.f3880j;
            Locale locale = Locale.US;
            throw ja1Var.m2840h("message too large " + i + " > " + i3).m2836a();
        }
        ByteBuffer byteBuffer = this.f5469f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(i);
        this.f5470g.getClass();
        vt0 vt0VarM149i = aa0.m149i(5);
        vt0VarM149i.m5189a(byteBuffer.array(), 0, byteBuffer.position());
        if (i == 0) {
            this.f5466c = vt0VarM149i;
            return;
        }
        int i4 = this.f5473j - 1;
        AbstractC0489n abstractC0489n = this.f5464a;
        abstractC0489n.m3455a(vt0VarM149i, false, false, i4);
        this.f5473j = 1;
        for (int i5 = 0; i5 < arrayList.size() - 1; i5++) {
            abstractC0489n.m3455a((vt0) arrayList.get(i5), false, false, 0);
        }
        this.f5466c = (vt0) arrayList.get(arrayList.size() - 1);
        this.f5475l = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m3552b(xx0 xx0Var) throws IOException {
        lo0 lo0Var = new lo0(this);
        OutputStream outputStreamMo3519m = this.f5467d.mo3519m(lo0Var);
        try {
            int iM3550g = m3550g(xx0Var, outputStreamMo3519m);
            outputStreamMo3519m.close();
            int i = this.f5465b;
            if (i < 0 || iM3550g <= i) {
                m3551a(lo0Var, true);
                return iM3550g;
            }
            ja1 ja1Var = ja1.f3880j;
            Locale locale = Locale.US;
            throw ja1Var.m2840h("message too large " + iM3550g + " > " + i).m2836a();
        } catch (Throwable th) {
            outputStreamMo3519m.close();
            throw th;
        }
    }

    @Override // p000.d60
    /* JADX INFO: renamed from: c */
    public final d60 mo1099c(InterfaceC0951zh interfaceC0951zh) {
        this.f5467d = interfaceC0951zh;
        return this;
    }

    @Override // p000.d60
    public final void close() {
        if (this.f5472i) {
            return;
        }
        this.f5472i = true;
        vt0 vt0Var = this.f5466c;
        if (vt0Var != null && vt0Var.f8264c == 0) {
            this.f5466c = null;
        }
        vt0 vt0Var2 = this.f5466c;
        this.f5466c = null;
        this.f5464a.m3455a(vt0Var2, true, true, this.f5473j);
        this.f5473j = 0;
    }

    @Override // p000.d60
    /* JADX INFO: renamed from: d */
    public final void mo1100d(xx0 xx0Var) {
        if (this.f5472i) {
            C0270h1.m2191g("Framer already closed");
            return;
        }
        this.f5473j++;
        int i = this.f5474k + 1;
        this.f5474k = i;
        this.f5475l = 0L;
        ha1 ha1Var = this.f5471h;
        o80[] o80VarArr = ha1Var.f3140a;
        o80[] o80VarArr2 = ha1Var.f3140a;
        int i2 = 0;
        for (o80 o80Var : o80VarArr) {
            o80Var.mo1318w(i);
        }
        boolean z = this.f5467d != wa0.f8471k;
        try {
            int iAvailable = xx0Var.available();
            int iM3554h = (iAvailable == 0 || !z) ? m3554h(xx0Var, iAvailable) : m3552b(xx0Var);
            if (iAvailable != -1 && iM3554h != iAvailable) {
                throw ja1.f3882l.m2840h(AbstractC0024an.m281d(iM3554h, iAvailable, "Message length inaccurate ", " != ")).m2836a();
            }
            long j = iM3554h;
            for (o80 o80Var2 : o80VarArr2) {
                o80Var2.mo1320y(j);
            }
            long j2 = this.f5475l;
            for (o80 o80Var3 : o80VarArr2) {
                o80Var3.mo586z(j2);
            }
            int i3 = this.f5474k;
            long j3 = this.f5475l;
            o80[] o80VarArr3 = ha1Var.f3140a;
            int length = o80VarArr3.length;
            while (i2 < length) {
                long j4 = j3;
                long j5 = j;
                o80VarArr3[i2].mo1319x(i3, j4, j5);
                i2++;
                j = j5;
                j3 = j4;
            }
        } catch (IOException e) {
            throw ja1.f3882l.m2840h("Failed to frame message").m2839g(e).m2836a();
        } catch (la1 e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw ja1.f3882l.m2840h("Failed to frame message").m2839g(e3).m2836a();
        }
    }

    @Override // p000.d60
    /* JADX INFO: renamed from: e */
    public final void mo1101e(int i) {
        a90.m132p("max size already set", this.f5465b == -1);
        this.f5465b = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m3553f(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            vt0 vt0Var = this.f5466c;
            if (vt0Var != null && vt0Var.f8263b == 0) {
                this.f5466c = null;
                this.f5464a.m3455a(vt0Var, false, false, this.f5473j);
                this.f5473j = 0;
            }
            if (this.f5466c == null) {
                this.f5470g.getClass();
                this.f5466c = aa0.m149i(i2);
            }
            int iMin = Math.min(i2, this.f5466c.f8263b);
            this.f5466c.m5189a(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    @Override // p000.d60
    public final void flush() {
        vt0 vt0Var = this.f5466c;
        if (vt0Var == null || vt0Var.f8264c <= 0) {
            return;
        }
        this.f5466c = null;
        this.f5464a.m3455a(vt0Var, false, true, this.f5473j);
        this.f5473j = 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m3554h(xx0 xx0Var, int i) throws IOException {
        if (i == -1) {
            lo0 lo0Var = new lo0(this);
            int iM3550g = m3550g(xx0Var, lo0Var);
            m3551a(lo0Var, false);
            return iM3550g;
        }
        this.f5475l = i;
        int i2 = this.f5465b;
        if (i2 >= 0 && i > i2) {
            ja1 ja1Var = ja1.f3880j;
            Locale locale = Locale.US;
            throw ja1Var.m2840h("message too large " + i + " > " + i2).m2836a();
        }
        ByteBuffer byteBuffer = this.f5469f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i);
        if (this.f5466c == null) {
            int iPosition = byteBuffer.position() + i;
            this.f5470g.getClass();
            this.f5466c = aa0.m149i(iPosition);
        }
        m3553f(byteBuffer.array(), 0, byteBuffer.position());
        return m3550g(xx0Var, this.f5468e);
    }

    @Override // p000.d60
    public final boolean isClosed() {
        return this.f5472i;
    }
}
