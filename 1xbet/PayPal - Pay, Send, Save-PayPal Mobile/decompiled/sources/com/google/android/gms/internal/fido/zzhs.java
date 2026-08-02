package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhs implements java.io.Closeable {
    private final java.io.InputStream zza;
    private com.google.android.gms.internal.fido.zzhr zzb;
    private final byte[] zzc = new byte[8];
    private final com.google.android.gms.internal.fido.zzht zzd = com.google.android.gms.internal.fido.zzht.zza();

    public zzhs(java.io.InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() throws java.io.IOException {
        if (this.zzb.zza() < 24) {
            long zza = this.zzb.zza();
            this.zzb = null;
            return zza;
        }
        if (this.zzb.zza() == 24) {
            int read = this.zza.read();
            if (read == -1) {
                throw new java.io.EOFException();
            }
            this.zzb = null;
            return read & 255;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return ((bArr[0] & 255) << 8) | (255 & bArr[1]);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            long j = bArr2[0];
            return (bArr2[3] & 255) | ((bArr2[2] & 255) << 8) | ((bArr2[1] & 255) << 16) | ((j & 255) << 24);
        }
        if (this.zzb.zza() != 27) {
            throw new java.io.IOException(java.lang.String.format("invalid additional information %s for major type %s", java.lang.Byte.valueOf(this.zzb.zza()), java.lang.Integer.valueOf(this.zzb.zzc())));
        }
        zzk(this.zzc, 8);
        byte[] bArr3 = this.zzc;
        long j2 = bArr3[0];
        long j3 = bArr3[1];
        return (bArr3[7] & 255) | ((bArr3[6] & 255) << 8) | ((bArr3[2] & 255) << 40) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16);
    }

    private final void zzi() throws java.io.IOException {
        zzd();
        if (this.zzb.zza() == 31) {
            throw new java.lang.IllegalStateException(java.lang.String.format("expected definite length but found %s", java.lang.Byte.valueOf(this.zzb.zza())));
        }
    }

    private final void zzj(byte b) throws java.io.IOException {
        zzd();
        if (this.zzb.zzb() == b) {
            return;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("expected major type %s but found %s", java.lang.Integer.valueOf((b >> 5) & 7), java.lang.Integer.valueOf(this.zzb.zzc())));
    }

    private final void zzk(byte[] bArr, int i) throws java.io.IOException {
        int i2 = 0;
        while (i2 != i) {
            int read = this.zza.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            i2 += read;
        }
        this.zzb = null;
    }

    private final byte[] zzl() throws java.io.IOException {
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.lang.UnsupportedOperationException(java.lang.String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
        }
        if (this.zza.available() < zzh) {
            throw new java.io.EOFException();
        }
        int i = (int) zzh;
        byte[] bArr = new byte[i];
        zzk(bArr, i);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws java.io.IOException {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        if (zzh < 0) {
            throw new java.lang.UnsupportedOperationException(java.lang.String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh);
        }
        return zzh;
    }

    public final long zzb() throws java.io.IOException {
        boolean z;
        zzd();
        if (this.zzb.zzb() == 0) {
            z = true;
        } else {
            if (this.zzb.zzb() != 32) {
                throw new java.lang.IllegalStateException(java.lang.String.format("expected major type 0 or 1 but found %s", java.lang.Integer.valueOf(this.zzb.zzc())));
            }
            z = false;
        }
        long zzh = zzh();
        if (zzh >= 0) {
            return z ? zzh : ~zzh;
        }
        throw new java.lang.UnsupportedOperationException(java.lang.String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }

    public final long zzc() throws java.io.IOException {
        zzj(com.visa.cbp.getEncExpo.IResultReceiver2StubProxy);
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 4611686018427387903L) {
            throw new java.lang.UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh + zzh);
        }
        return zzh;
    }

    public final com.google.android.gms.internal.fido.zzhr zzd() throws java.io.IOException {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            com.google.android.gms.internal.fido.zzhr zzhrVar = new com.google.android.gms.internal.fido.zzhr(read);
            this.zzb = zzhrVar;
            byte zzb = zzhrVar.zzb();
            if (zzb != Byte.MIN_VALUE && zzb != -96 && zzb != -64) {
                if (zzb != -32) {
                    if (zzb != 0 && zzb != 32) {
                        if (zzb == 64) {
                            this.zzd.zze(-1L);
                        } else {
                            if (zzb != 96) {
                                throw new java.lang.IllegalStateException(java.lang.String.format("invalid major type: %s", java.lang.Integer.valueOf(this.zzb.zzc())));
                            }
                            this.zzd.zze(-2L);
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final java.lang.String zze() throws java.io.IOException {
        zzj(com.visa.cbp.getEncExpo.IResultReceiver2);
        return new java.lang.String(zzl(), java.nio.charset.StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws java.io.IOException {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            throw new java.lang.IllegalStateException("expected simple value");
        }
        int zzh = (int) zzh();
        if (zzh == 20) {
            return false;
        }
        if (zzh == 21) {
            return true;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("expected FALSE or TRUE", new java.lang.Object[0]));
    }

    public final byte[] zzg() throws java.io.IOException {
        zzj((byte) 64);
        return zzl();
    }
}
