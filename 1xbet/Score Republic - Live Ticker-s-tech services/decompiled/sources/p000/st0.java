package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class st0 extends AbstractC0527o0 {

    /* JADX INFO: renamed from: j */
    public final C0539oc f7210j;

    public st0(C0539oc c0539oc) {
        this.f7210j = c0539oc;
    }

    @Override // p000.AbstractC0527o0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0539oc c0539oc = this.f7210j;
        c0539oc.m3674o(c0539oc.f5698k);
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: j */
    public final AbstractC0527o0 mo825j(int i) {
        C0539oc c0539oc = new C0539oc();
        c0539oc.mo1553f(this.f7210j, i);
        return new st0(c0539oc);
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: l */
    public final void mo826l(OutputStream outputStream, int i) throws IOException {
        long j = i;
        outputStream.getClass();
        C0539oc c0539oc = this.f7210j;
        a90.m128l(c0539oc.f5698k, 0L, j);
        f61 f61Var = c0539oc.f5697j;
        while (j > 0) {
            f61Var.getClass();
            int iMin = (int) Math.min(j, f61Var.f2321c - f61Var.f2320b);
            outputStream.write(f61Var.f2319a, f61Var.f2320b, iMin);
            int i2 = f61Var.f2320b + iMin;
            f61Var.f2320b = i2;
            long j2 = iMin;
            c0539oc.f5698k -= j2;
            j -= j2;
            if (i2 == f61Var.f2321c) {
                f61 f61VarM1642a = f61Var.m1642a();
                c0539oc.f5697j = f61VarM1642a;
                h61.m2219a(f61Var);
                f61Var = f61VarM1642a;
            }
        }
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: m */
    public final void mo827m(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: o */
    public final void mo828o(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int i3 = this.f7210j.read(bArr, i, i2);
            if (i3 == -1) {
                C0270h1.m2193i(AbstractC0024an.m282e(i2, "EOF trying to read ", " bytes"));
                return;
            } else {
                i2 -= i3;
                i += i3;
            }
        }
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: p */
    public final int mo829p() {
        try {
            return this.f7210j.m3670i() & 255;
        } catch (EOFException e) {
            C0270h1.m2193i(e.getMessage());
            return 0;
        }
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: q */
    public final int mo830q() {
        return (int) this.f7210j.f5698k;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: s */
    public final void mo832s(int i) {
        try {
            this.f7210j.m3674o(i);
        } catch (EOFException e) {
            C0270h1.m2193i(e.getMessage());
        }
    }
}
