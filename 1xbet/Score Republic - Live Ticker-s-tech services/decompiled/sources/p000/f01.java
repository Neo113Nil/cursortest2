package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 implements InterfaceC0798vc {

    /* JADX INFO: renamed from: j */
    public final o81 f2224j;

    /* JADX INFO: renamed from: k */
    public final C0539oc f2225k = new C0539oc();

    /* JADX INFO: renamed from: l */
    public boolean f2226l;

    public f01(o81 o81Var) {
        this.f2224j = o81Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m1551a() {
        if (this.f2226l) {
            C0270h1.m2191g("closed");
            return;
        }
        C0539oc c0539oc = this.f2225k;
        long jM3668a = c0539oc.m3668a();
        if (jM3668a > 0) {
            this.f2224j.mo1553f(c0539oc, jM3668a);
        }
    }

    @Override // p000.o81, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        o81 o81Var = this.f2224j;
        if (this.f2226l) {
            return;
        }
        C0539oc c0539oc = this.f2225k;
        long j = c0539oc.f5698k;
        if (j > 0) {
            o81Var.mo1553f(c0539oc, j);
        }
        th = null;
        try {
            o81Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f2226l = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0798vc m1552e(byte[] bArr) {
        bArr.getClass();
        if (this.f2226l) {
            C0270h1.m2191g("closed");
            return null;
        }
        this.f2225k.write(bArr, 0, bArr.length);
        m1551a();
        return this;
    }

    @Override // p000.o81
    /* JADX INFO: renamed from: f */
    public final void mo1553f(C0539oc c0539oc, long j) {
        c0539oc.getClass();
        if (this.f2226l) {
            C0270h1.m2191g("closed");
        } else {
            this.f2225k.mo1553f(c0539oc, j);
            m1551a();
        }
    }

    @Override // p000.o81, java.io.Flushable
    public final void flush() {
        if (this.f2226l) {
            C0270h1.m2191g("closed");
            return;
        }
        C0539oc c0539oc = this.f2225k;
        long j = c0539oc.f5698k;
        o81 o81Var = this.f2224j;
        if (j > 0) {
            o81Var.mo1553f(c0539oc, j);
        }
        o81Var.flush();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0798vc m1554i(int i) {
        if (this.f2226l) {
            C0270h1.m2191g("closed");
            return null;
        }
        this.f2225k.m3678s(i);
        m1551a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2226l;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC0798vc m1555j(int i) {
        if (this.f2226l) {
            C0270h1.m2191g("closed");
            return null;
        }
        C0539oc c0539oc = this.f2225k;
        f61 f61VarM3677r = c0539oc.m3677r(4);
        byte[] bArr = f61VarM3677r.f2319a;
        int i2 = f61VarM3677r.f2321c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        f61VarM3677r.f2321c = i2 + 4;
        c0539oc.f5698k += 4;
        m1551a();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC0798vc m1556l(String str) {
        str.getClass();
        if (this.f2226l) {
            C0270h1.m2191g("closed");
            return null;
        }
        this.f2225k.m3679t(str, str.length());
        m1551a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f2224j + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.f2226l) {
            C0270h1.m2191g("closed");
            return 0;
        }
        int iWrite = this.f2225k.write(byteBuffer);
        m1551a();
        return iWrite;
    }
}
