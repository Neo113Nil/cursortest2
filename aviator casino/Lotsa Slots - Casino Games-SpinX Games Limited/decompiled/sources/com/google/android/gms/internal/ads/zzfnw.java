package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfnw implements com.google.android.gms.internal.ads.zzimu {
    public static com.google.android.gms.internal.ads.zzfnw zza() {
        return com.google.android.gms.internal.ads.zzfnv.zza;
    }

    public static com.google.android.gms.internal.ads.zzhcg zzc() {
        com.google.android.gms.internal.ads.zzhcg zzhcgVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgK)).booleanValue()) {
            zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzc;
        } else {
            zzhcgVar = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgJ)).booleanValue() ? com.google.android.gms.internal.ads.zzcfr.zza : com.google.android.gms.internal.ads.zzcfr.zzf;
        }
        com.google.android.gms.internal.ads.zzinc.zzb(zzhcgVar);
        return zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzc();
    }
}
