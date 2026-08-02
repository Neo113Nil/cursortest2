package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzaf extends java.io.OutputStream {
    private long zza = 0;

    zzaf() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.zza += i2;
    }

    final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.zza++;
    }
}
