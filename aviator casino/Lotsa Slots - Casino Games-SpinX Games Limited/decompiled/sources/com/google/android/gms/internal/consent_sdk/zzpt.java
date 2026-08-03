package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzpt extends com.google.android.gms.internal.consent_sdk.zzpq {
    private final java.io.OutputStream zzg;

    zzpt(java.io.OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzG() throws java.io.IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i) throws java.io.IOException {
        if (this.zzb - this.zzc < i) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() throws java.io.IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b) throws java.io.IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i, boolean z) throws java.io.IOException {
        zzH(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzw(i2);
        zzz(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzz(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzh(int i, com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException {
        zzw((i << 3) | 2);
        zzi(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzi(com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException {
        zzw(zzpmVar.zzd());
        zzpmVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzj(int i, int i2) throws java.io.IOException {
        zzH(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i) throws java.io.IOException {
        zzH(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i, long j) throws java.io.IOException {
        zzH(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j) throws java.io.IOException {
        zzH(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i, int i2) throws java.io.IOException {
        zzH(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzo(int i) throws java.io.IOException {
        if (i >= 0) {
            zzw(i);
        } else {
            zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzp(com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) throws java.io.IOException {
        zzw(zzrqVar.zzn());
        zzrqVar.zzB(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzq(int i, com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) throws java.io.IOException {
        zzw(11);
        zzv(2, i);
        zzw(26);
        zzp(zzrqVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzr(int i, com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException {
        zzw(11);
        zzv(2, i);
        zzh(3, zzpmVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzs(int i, java.lang.String str) throws java.io.IOException {
        zzw((i << 3) | 2);
        zzt(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzt(java.lang.String str) throws java.io.IOException {
        int zzb;
        try {
            int length = str.length() * 3;
            int zzC = zzC(length);
            int i = zzC + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int zza = com.google.android.gms.internal.consent_sdk.zzsy.zza(str, bArr, 0, length);
                zzw(zza);
                zzz(bArr, 0, zza);
                return;
            }
            if (i > i2 - this.zzc) {
                zzG();
            }
            int zzC2 = zzC(str.length());
            int i3 = this.zzc;
            try {
                if (zzC2 == zzC) {
                    int i4 = i3 + zzC2;
                    this.zzc = i4;
                    int zza2 = com.google.android.gms.internal.consent_sdk.zzsy.zza(str, this.zza, i4, i2 - i4);
                    this.zzc = i3;
                    zzb = (zza2 - i3) - zzC2;
                    zzf(zzb);
                    this.zzc = zza2;
                } else {
                    zzb = com.google.android.gms.internal.consent_sdk.zzsy.zzb(str);
                    zzf(zzb);
                    this.zzc = com.google.android.gms.internal.consent_sdk.zzsy.zza(str, this.zza, this.zzc, zzb);
                }
                this.zzd += zzb;
            } catch (com.google.android.gms.internal.consent_sdk.zzsx e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                throw new com.google.android.gms.internal.consent_sdk.zzps(e2);
            }
        } catch (com.google.android.gms.internal.consent_sdk.zzsx e3) {
            zzE(str, e3);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i, int i2) throws java.io.IOException {
        zzw((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i, int i2) throws java.io.IOException {
        zzH(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i) throws java.io.IOException {
        zzH(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i, long j) throws java.io.IOException {
        zzH(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j) throws java.io.IOException {
        zzH(10);
        zzg(j);
    }

    public final void zzz(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            java.lang.System.arraycopy(bArr, 0, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        byte[] bArr2 = this.zza;
        java.lang.System.arraycopy(bArr, 0, bArr2, i4, i5);
        this.zzc = i3;
        this.zzd += i5;
        zzG();
        int i6 = i2 - i5;
        if (i6 <= i3) {
            java.lang.System.arraycopy(bArr, i5, bArr2, 0, i6);
            this.zzc = i6;
        } else {
            this.zzg.write(bArr, i5, i6);
        }
        this.zzd += i6;
    }
}
