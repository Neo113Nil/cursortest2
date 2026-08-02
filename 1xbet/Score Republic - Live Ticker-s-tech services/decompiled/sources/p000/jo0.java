package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jo0 extends FilterInputStream {

    /* JADX INFO: renamed from: j */
    public final int f4053j;

    /* JADX INFO: renamed from: k */
    public final ha1 f4054k;

    /* JADX INFO: renamed from: l */
    public long f4055l;

    /* JADX INFO: renamed from: m */
    public long f4056m;

    /* JADX INFO: renamed from: n */
    public long f4057n;

    public jo0(InputStream inputStream, int i, ha1 ha1Var) {
        super(inputStream);
        this.f4057n = -1L;
        this.f4053j = i;
        this.f4054k = ha1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m2947a() {
        long j = this.f4056m;
        long j2 = this.f4055l;
        if (j > j2) {
            long j3 = j - j2;
            for (o80 o80Var : this.f4054k.f3140a) {
                o80Var.mo1315q(j3);
            }
            this.f4055l = this.f4056m;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2948e() {
        long j = this.f4056m;
        int i = this.f4053j;
        if (j <= i) {
            return;
        }
        throw ja1.f3880j.m2840h("Decompressed gRPC message exceeds maximum size " + i).m2836a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f4057n = this.f4056m;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f4056m++;
        }
        m2948e();
        m2947a();
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f4057n == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f4056m = this.f4057n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j);
        this.f4056m += jSkip;
        m2948e();
        m2947a();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            this.f4056m += (long) i3;
        }
        m2948e();
        m2947a();
        return i3;
    }
}
