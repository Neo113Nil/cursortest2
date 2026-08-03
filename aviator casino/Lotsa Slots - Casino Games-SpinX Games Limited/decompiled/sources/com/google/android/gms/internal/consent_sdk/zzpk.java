package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
class zzpk extends com.google.android.gms.internal.consent_sdk.zzpj {
    protected final byte[] zza;

    zzpk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    protected final int zze(int i, int i2, int i3) {
        return com.google.android.gms.internal.consent_sdk.zzqs.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final com.google.android.gms.internal.consent_sdk.zzpm zzf(int i, int i2) {
        zzi(0, 47, zzd());
        return new com.google.android.gms.internal.consent_sdk.zzph(this.zza, 0, 47);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    final void zzg(com.google.android.gms.internal.consent_sdk.zzpe zzpeVar) throws java.io.IOException {
        zzpeVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    protected final boolean zzh(com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) {
        if (!(zzpmVar instanceof com.google.android.gms.internal.consent_sdk.zzpk)) {
            return zzpmVar.zzh(this);
        }
        int zzd = zzd();
        if (zzd > zzpmVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzpmVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzpmVar.zzd());
        }
        com.google.android.gms.internal.consent_sdk.zzpk zzpkVar = (com.google.android.gms.internal.consent_sdk.zzpk) zzpmVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzpkVar.zza;
        zzpkVar.zzc();
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
}
