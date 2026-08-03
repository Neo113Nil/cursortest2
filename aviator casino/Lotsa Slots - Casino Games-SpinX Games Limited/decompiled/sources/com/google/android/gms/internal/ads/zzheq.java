package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzheq implements com.google.android.gms.internal.ads.zzhnk {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzheq zza = new com.google.android.gms.internal.ads.zzheq();

    private /* synthetic */ zzheq() {
    }

    @Override // com.google.android.gms.internal.ads.zzhnk
    public final /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzhdz zzhdzVar) {
        com.google.android.gms.internal.ads.zzhdq zza2 = zzhdzVar.zza();
        if (zza2 instanceof com.google.android.gms.internal.ads.zzhey) {
            return com.google.android.gms.internal.ads.zzhzu.zzb((com.google.android.gms.internal.ads.zzhey) zza2);
        }
        if (zza2 instanceof com.google.android.gms.internal.ads.zzhfq) {
            return com.google.android.gms.internal.ads.zzhzh.zzb((com.google.android.gms.internal.ads.zzhfq) zza2);
        }
        if (zza2 instanceof com.google.android.gms.internal.ads.zzhfz) {
            return com.google.android.gms.internal.ads.zzhkn.zzb((com.google.android.gms.internal.ads.zzhfz) zza2);
        }
        if (zza2 instanceof com.google.android.gms.internal.ads.zzhfi) {
            return com.google.android.gms.internal.ads.zzhzg.zzb((com.google.android.gms.internal.ads.zzhfi) zza2);
        }
        if (zza2 instanceof com.google.android.gms.internal.ads.zzhgh) {
            com.google.android.gms.internal.ads.zzhgh zzhghVar = (com.google.android.gms.internal.ads.zzhgh) zza2;
            return com.google.android.gms.internal.ads.zzhjh.zzd() ? com.google.android.gms.internal.ads.zzhjh.zzb(zzhghVar) : com.google.android.gms.internal.ads.zzhzm.zzb(zzhghVar);
        }
        if (zza2 instanceof com.google.android.gms.internal.ads.zzhic) {
            com.google.android.gms.internal.ads.zzhic zzhicVar = (com.google.android.gms.internal.ads.zzhic) zza2;
            return com.google.android.gms.internal.ads.zzhjh.zzd() ? com.google.android.gms.internal.ads.zzhkf.zzb(zzhicVar) : com.google.android.gms.internal.ads.zziay.zzb(zzhicVar);
        }
        if (zza2 instanceof com.google.android.gms.internal.ads.zzhhw) {
            return com.google.android.gms.internal.ads.zzhjz.zzb((com.google.android.gms.internal.ads.zzhhw) zza2);
        }
        java.lang.String valueOf = java.lang.String.valueOf(zza2.getClass());
        java.lang.String.valueOf(valueOf);
        throw new java.security.GeneralSecurityException("Unknown key class: ".concat(java.lang.String.valueOf(valueOf)));
    }
}
