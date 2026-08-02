package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xx0 extends InputStream implements zg0 {

    /* JADX INFO: renamed from: j */
    public C0525nz f9101j;

    /* JADX INFO: renamed from: k */
    public final lv0 f9102k;

    /* JADX INFO: renamed from: l */
    public ByteArrayInputStream f9103l;

    public xx0(C0525nz c0525nz, lv0 lv0Var) {
        this.f9101j = c0525nz;
        this.f9102k = lv0Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        C0525nz c0525nz = this.f9101j;
        if (c0525nz != null) {
            return c0525nz.mo2754a(null);
        }
        ByteArrayInputStream byteArrayInputStream = this.f9103l;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C0525nz c0525nz = this.f9101j;
        if (c0525nz != null) {
            int iMo2754a = c0525nz.mo2754a(null);
            if (iMo2754a == 0) {
                this.f9101j = null;
                this.f9103l = null;
                return -1;
            }
            if (i2 >= iMo2754a) {
                Logger logger = AbstractC0397ki.f4383b;
                C0250gi c0250gi = new C0250gi(bArr, i, iMo2754a);
                this.f9101j.mo2756c(c0250gi);
                if (c0250gi.m2057B() != 0) {
                    C0270h1.m2191g("Did not write as much data as expected.");
                    return 0;
                }
                this.f9101j = null;
                this.f9103l = null;
                return iMo2754a;
            }
            this.f9103l = new ByteArrayInputStream(this.f9101j.m2755b());
            this.f9101j = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f9103l;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f9101j != null) {
            this.f9103l = new ByteArrayInputStream(this.f9101j.m2755b());
            this.f9101j = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f9103l;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
