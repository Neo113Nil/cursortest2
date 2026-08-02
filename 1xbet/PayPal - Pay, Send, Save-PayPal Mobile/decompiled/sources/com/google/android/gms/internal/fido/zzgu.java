package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
class zzgu extends com.google.android.gms.internal.fido.zzgt {
    protected final byte[] zza;

    zzgu(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.fido.zzgx) || zzd() != ((com.google.android.gms.internal.fido.zzgx) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.fido.zzgu)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.fido.zzgu zzguVar = (com.google.android.gms.internal.fido.zzgu) obj;
        int zzk = zzk();
        int zzk2 = zzguVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzguVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzguVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzguVar.zzd());
        }
        if (!(zzguVar instanceof com.google.android.gms.internal.fido.zzgu)) {
            return zzguVar.zzg(0, zzd).equals(zzg(0, zzd));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzguVar.zza;
        int zzc = zzc();
        int zzc2 = zzc();
        int zzc3 = zzguVar.zzc();
        while (zzc2 < zzc + zzd) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    protected final int zzf(int i, int i2, int i3) {
        int zzc = zzc();
        byte[] bArr = com.google.android.gms.internal.fido.zzhc.zzd;
        for (int i4 = zzc; i4 < zzc + i3; i4++) {
            i = (i * 31) + this.zza[i4];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final com.google.android.gms.internal.fido.zzgx zzg(int i, int i2) {
        int zzj = zzj(i, i2, zzd());
        return zzj == 0 ? com.google.android.gms.internal.fido.zzgx.zzb : new com.google.android.gms.internal.fido.zzgr(this.zza, zzc() + i, zzj);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final java.io.InputStream zzh() {
        return new java.io.ByteArrayInputStream(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final java.nio.ByteBuffer zzi() {
        return java.nio.ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public int zzd() {
        return this.zza.length;
    }
}
