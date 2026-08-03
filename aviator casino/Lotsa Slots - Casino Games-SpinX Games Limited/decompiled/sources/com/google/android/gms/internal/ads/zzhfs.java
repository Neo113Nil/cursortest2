package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhfs implements com.google.android.gms.internal.ads.zzhln {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzhfs zza = new com.google.android.gms.internal.ads.zzhfs();

    private /* synthetic */ zzhfs() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ com.google.android.gms.internal.ads.zzhdq zza(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzhfx zzhfxVar = (com.google.android.gms.internal.ads.zzhfx) zzhehVar;
        int i = com.google.android.gms.internal.ads.zzhfu.zza;
        if (zzhfxVar.zzc() == 24) {
            throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        com.google.android.gms.internal.ads.zzhfp zzhfpVar = new com.google.android.gms.internal.ads.zzhfp(null);
        zzhfpVar.zza(zzhfxVar);
        zzhfpVar.zzc(num);
        zzhfpVar.zzb(com.google.android.gms.internal.ads.zzibb.zzb(zzhfxVar.zzc()));
        return zzhfpVar.zzd();
    }
}
