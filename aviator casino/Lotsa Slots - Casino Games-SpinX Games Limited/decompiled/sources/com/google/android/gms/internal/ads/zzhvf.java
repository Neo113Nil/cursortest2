package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhvf extends com.google.android.gms.internal.ads.zzhxj {
    private final com.google.android.gms.internal.ads.zzhvl zza;
    private final com.google.android.gms.internal.ads.zzibb zzb;

    private zzhvf(com.google.android.gms.internal.ads.zzhvl zzhvlVar, com.google.android.gms.internal.ads.zzibb zzibbVar) {
        this.zza = zzhvlVar;
        this.zzb = zzibbVar;
    }

    public static com.google.android.gms.internal.ads.zzhvf zzc(com.google.android.gms.internal.ads.zzhvl zzhvlVar, com.google.android.gms.internal.ads.zzibb zzibbVar) throws java.security.GeneralSecurityException {
        if (zzibbVar.zzd() == 32) {
            if (java.util.Arrays.equals(zzhvlVar.zzd().zzc(), com.google.android.gms.internal.ads.zzhlc.zza(com.google.android.gms.internal.ads.zzhlc.zzb(zzibbVar.zzc(com.google.android.gms.internal.ads.zzhdo.zza()))))) {
                return new com.google.android.gms.internal.ads.zzhvf(zzhvlVar, zzibbVar);
            }
            throw new java.security.GeneralSecurityException("Ed25519 keys mismatch");
        }
        int zzd = zzibbVar.zzd();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzd).length() + 65);
        sb.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
        sb.append(zzd);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhxj, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ com.google.android.gms.internal.ads.zzheh zza() {
        return this.zza.zzf();
    }

    public final com.google.android.gms.internal.ads.zzhve zzd() {
        return this.zza.zzf();
    }

    public final com.google.android.gms.internal.ads.zzhvl zze() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzibb zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxj
    public final /* synthetic */ com.google.android.gms.internal.ads.zzhxk zzg() {
        return this.zza;
    }
}
