package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcdq extends java.io.InputStream implements com.google.android.libraries.places.internal.zzbjz, com.google.android.libraries.places.internal.zzbla {

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbex zza;
    private final com.google.android.libraries.places.internal.zzbff zzb;

    @javax.annotation.Nullable
    private java.io.ByteArrayInputStream zzc;

    zzcdq(com.google.android.libraries.places.internal.zzbex zzbexVar, com.google.android.libraries.places.internal.zzbff zzbffVar) {
        this.zza = zzbexVar;
        this.zzb = zzbffVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        com.google.android.libraries.places.internal.zzbex zzbexVar = this.zza;
        if (zzbexVar != null) {
            return zzbexVar.zzbx();
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        com.google.android.libraries.places.internal.zzbex zzbexVar = this.zza;
        if (zzbexVar != null) {
            this.zzc = new java.io.ByteArrayInputStream(zzbexVar.zzbl());
            this.zza = null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbjz
    public final int zza(java.io.OutputStream outputStream) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbex zzbexVar = this.zza;
        if (zzbexVar != null) {
            int zzbx = zzbexVar.zzbx();
            this.zza.zzbm(outputStream);
            this.zza = null;
            return zzbx;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream == null) {
            return 0;
        }
        com.google.common.base.Preconditions.checkNotNull(byteArrayInputStream, "inputStream cannot be null!");
        com.google.common.base.Preconditions.checkNotNull(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i = (int) j;
                this.zzc = null;
                return i;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    final com.google.android.libraries.places.internal.zzbex zzb() {
        com.google.android.libraries.places.internal.zzbex zzbexVar = this.zza;
        if (zzbexVar != null) {
            return zzbexVar;
        }
        throw new java.lang.IllegalStateException("message not available");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbex zzbexVar = this.zza;
        if (zzbexVar != null) {
            int zzbx = zzbexVar.zzbx();
            if (zzbx == 0) {
                this.zza = null;
                this.zzc = null;
                return -1;
            }
            if (i2 >= zzbx) {
                com.google.android.libraries.places.internal.zzbcu zzx = com.google.android.libraries.places.internal.zzbcu.zzx(bArr, i, zzbx);
                this.zza.zzbL(zzx);
                zzx.zzC();
                this.zza = null;
                this.zzc = null;
                return zzbx;
            }
            this.zzc = new java.io.ByteArrayInputStream(this.zza.zzbl());
            this.zza = null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    final com.google.android.libraries.places.internal.zzbff zzc() {
        return this.zzb;
    }
}
