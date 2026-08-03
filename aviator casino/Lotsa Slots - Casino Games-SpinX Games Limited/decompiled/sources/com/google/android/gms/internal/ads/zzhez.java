package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhez implements com.google.android.gms.internal.ads.zzhln {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzhez zza = new com.google.android.gms.internal.ads.zzhez();

    private /* synthetic */ zzhez() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ com.google.android.gms.internal.ads.zzhdq zza(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzhfg zzhfgVar = (com.google.android.gms.internal.ads.zzhfg) zzhehVar;
        int i = com.google.android.gms.internal.ads.zzhfc.zza;
        if (zzhfgVar.zzc() != 16 && zzhfgVar.zzc() != 32) {
            throw new java.security.GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        com.google.android.gms.internal.ads.zzhex zzhexVar = new com.google.android.gms.internal.ads.zzhex(null);
        zzhexVar.zza(zzhfgVar);
        zzhexVar.zzd(num);
        zzhexVar.zzb(com.google.android.gms.internal.ads.zzibb.zzb(zzhfgVar.zzc()));
        zzhexVar.zzc(com.google.android.gms.internal.ads.zzibb.zzb(zzhfgVar.zzd()));
        return zzhexVar.zze();
    }
}
