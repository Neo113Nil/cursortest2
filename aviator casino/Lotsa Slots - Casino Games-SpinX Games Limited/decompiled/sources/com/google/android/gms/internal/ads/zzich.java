package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzich extends java.io.FilterInputStream {
    private int zza;

    zzich(java.io.InputStream inputStream, int i) {
        super(inputStream);
        this.zza = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        return java.lang.Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        int skip = (int) super.skip(java.lang.Math.min(j, this.zza));
        if (skip >= 0) {
            this.zza -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.zza;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, java.lang.Math.min(i2, i3));
        if (read >= 0) {
            this.zza -= read;
        }
        return read;
    }
}
