package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 extends AbstractC0527o0 {

    /* JADX INFO: renamed from: j */
    public int f1056j;

    /* JADX INFO: renamed from: k */
    public final int f1057k;

    /* JADX INFO: renamed from: l */
    public final byte[] f1058l;

    /* JADX INFO: renamed from: m */
    public int f1059m = -1;

    public c01(byte[] bArr, int i, int i2) {
        a90.m122f("offset must be >= 0", i >= 0);
        a90.m122f("length must be >= 0", i2 >= 0);
        int i3 = i2 + i;
        a90.m122f("offset + length exceeds array boundary", i3 <= bArr.length);
        this.f1058l = bArr;
        this.f1056j = i;
        this.f1057k = i3;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: e */
    public final void mo824e() {
        this.f1059m = this.f1056j;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: j */
    public final AbstractC0527o0 mo825j(int i) {
        m3608a(i);
        int i2 = this.f1056j;
        this.f1056j = i2 + i;
        return new c01(this.f1058l, i2, i);
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: l */
    public final void mo826l(OutputStream outputStream, int i) throws IOException {
        m3608a(i);
        outputStream.write(this.f1058l, this.f1056j, i);
        this.f1056j += i;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: m */
    public final void mo827m(ByteBuffer byteBuffer) {
        a90.m127k(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        m3608a(iRemaining);
        byteBuffer.put(this.f1058l, this.f1056j, iRemaining);
        this.f1056j += iRemaining;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: o */
    public final void mo828o(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f1058l, this.f1056j, bArr, i, i2);
        this.f1056j += i2;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: p */
    public final int mo829p() {
        m3608a(1);
        int i = this.f1056j;
        this.f1056j = i + 1;
        return this.f1058l[i] & 255;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: q */
    public final int mo830q() {
        return this.f1057k - this.f1056j;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: r */
    public final void mo831r() {
        int i = this.f1059m;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.f1056j = i;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: s */
    public final void mo832s(int i) {
        m3608a(i);
        this.f1056j += i;
    }
}
