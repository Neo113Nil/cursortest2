package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaug extends java.io.ByteArrayOutputStream {
    private final com.google.android.gms.internal.ads.zzatv zza;

    public zzaug(com.google.android.gms.internal.ads.zzatv zzatvVar, int i) {
        this.zza = zzatvVar;
        this.buf = zzatvVar.zza(java.lang.Math.max(i, 256));
    }

    private final void zza(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        com.google.android.gms.internal.ads.zzatv zzatvVar = this.zza;
        int i2 = this.count + i;
        byte[] zza = zzatvVar.zza(i2 + i2);
        java.lang.System.arraycopy(this.buf, 0, zza, 0, this.count);
        zzatvVar.zzb(this.buf);
        this.buf = zza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.zza.zzb(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}
