package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
class zzec extends com.google.android.gms.internal.auth.zzeb {
    protected final byte[] zza;

    zzec(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.auth.zzef) || zzd() != ((com.google.android.gms.internal.auth.zzef) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.auth.zzec)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.auth.zzec zzecVar = (com.google.android.gms.internal.auth.zzec) obj;
        int zzj = zzj();
        int zzj2 = zzecVar.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzecVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzecVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzecVar.zzd());
        }
        if (!(zzecVar instanceof com.google.android.gms.internal.auth.zzec)) {
            return zzecVar.zzf(0, zzd).equals(zzf(0, zzd));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzecVar.zza;
        zzecVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < zzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    protected final int zze(int i, int i2, int i3) {
        return com.google.android.gms.internal.auth.zzfa.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final com.google.android.gms.internal.auth.zzef zzf(int i, int i2) {
        int zzi = zzi(0, i2, zzd());
        return zzi == 0 ? com.google.android.gms.internal.auth.zzef.zzb : new com.google.android.gms.internal.auth.zzdz(this.zza, 0, zzi);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    protected final java.lang.String zzg(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean zzh() {
        return com.google.android.gms.internal.auth.zzhn.zzc(this.zza, 0, zzd());
    }
}
