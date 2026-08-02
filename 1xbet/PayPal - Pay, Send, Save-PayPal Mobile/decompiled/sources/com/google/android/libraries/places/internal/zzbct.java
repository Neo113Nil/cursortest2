package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbct extends com.google.android.libraries.places.internal.zzbcq {
    private final java.io.OutputStream zzg;

    zzbct(java.io.OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzF(int i) throws java.io.IOException {
        if (this.zzb - this.zzc < i) {
            zzG();
        }
    }

    private final void zzG() throws java.io.IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzH(int i, int i2) throws java.io.IOException {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzI(int i, int i2) throws java.io.IOException {
        zzF(20);
        zze(i << 3);
        if (i2 >= 0) {
            zze(i2);
        } else {
            zzf(i2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzJ(int i, int i2) throws java.io.IOException {
        zzF(20);
        zze(i << 3);
        zze(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzK(int i, int i2) throws java.io.IOException {
        zzF(14);
        zze((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzL(int i, long j) throws java.io.IOException {
        zzF(20);
        zze(i << 3);
        zzf(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu, com.google.android.libraries.places.internal.zzbce
    public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzv(bArr, i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzi(int i, long j) throws java.io.IOException {
        zzF(18);
        zze((i << 3) | 1);
        zzh(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzj(int i, boolean z) throws java.io.IOException {
        zzF(11);
        zze(i << 3);
        zzd(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzk(int i, java.lang.String str) throws java.io.IOException {
        zzq((i << 3) | 2);
        zzu(str);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzl(int i, com.google.android.libraries.places.internal.zzbcl zzbclVar) throws java.io.IOException {
        zzq((i << 3) | 2);
        zzq(zzbclVar.zzc());
        zzbclVar.zze(this);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzm(int i, com.google.android.libraries.places.internal.zzbex zzbexVar) throws java.io.IOException {
        zzq(11);
        zzJ(2, i);
        zzq(26);
        zzq(zzbexVar.zzbx());
        zzbexVar.zzbL(this);
        zzq(12);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzn(int i, com.google.android.libraries.places.internal.zzbcl zzbclVar) throws java.io.IOException {
        zzq(11);
        zzJ(2, i);
        zzl(3, zzbclVar);
        zzq(12);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzo(byte b) throws java.io.IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzd(b);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzp(int i) throws java.io.IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzq(int i) throws java.io.IOException {
        zzF(5);
        zze(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzr(int i) throws java.io.IOException {
        zzF(4);
        zzg(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzs(long j) throws java.io.IOException {
        zzF(10);
        zzf(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzt(long j) throws java.io.IOException {
        zzF(8);
        zzh(j);
    }

    public final void zzu(java.lang.String str) throws java.io.IOException {
        int zza;
        try {
            int length = str.length() * 3;
            int zzy = zzy(length);
            int i = zzy + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int zzb = com.google.android.libraries.places.internal.zzbgi.zzb(str, bArr, 0, length);
                zzq(zzb);
                zzv(bArr, 0, zzb);
                return;
            }
            if (i > i2 - this.zzc) {
                zzG();
            }
            int zzy2 = zzy(str.length());
            int i3 = this.zzc;
            try {
                if (zzy2 == zzy) {
                    int i4 = i3 + zzy2;
                    this.zzc = i4;
                    int zzb2 = com.google.android.libraries.places.internal.zzbgi.zzb(str, this.zza, i4, i2 - i4);
                    this.zzc = i3;
                    zza = (zzb2 - i3) - zzy2;
                    zze(zza);
                    this.zzc = zzb2;
                } else {
                    zza = com.google.android.libraries.places.internal.zzbgi.zza(str);
                    zze(zza);
                    this.zzc = com.google.android.libraries.places.internal.zzbgi.zzb(str, this.zza, this.zzc, zza);
                }
                this.zzd += zza;
            } catch (com.google.android.libraries.places.internal.zzbgh e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                throw new com.google.android.libraries.places.internal.zzbcs(e2);
            }
        } catch (com.google.android.libraries.places.internal.zzbgh e3) {
            zzD(str, e3);
        }
    }

    public final void zzv(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            java.lang.System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        byte[] bArr2 = this.zza;
        java.lang.System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.zzc = i3;
        this.zzd += i5;
        zzG();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            java.lang.System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.zzc = i7;
        } else {
            this.zzg.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzw() throws java.io.IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }
}
