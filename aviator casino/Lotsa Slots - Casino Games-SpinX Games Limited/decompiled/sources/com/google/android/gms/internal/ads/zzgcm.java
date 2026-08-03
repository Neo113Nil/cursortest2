package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgcm {
    private static com.google.android.gms.internal.ads.zzgcm zzb;
    final com.google.android.gms.internal.ads.zzgci zza;

    private zzgcm(android.content.Context context) {
        this.zza = com.google.android.gms.internal.ads.zzgci.zza(context);
        com.google.android.gms.internal.ads.zzgch.zza(context);
    }

    public static final com.google.android.gms.internal.ads.zzgcm zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzgcm zzgcmVar;
        synchronized (com.google.android.gms.internal.ads.zzgcm.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.ads.zzgcm(context);
            }
            zzgcmVar = zzb;
        }
        return zzgcmVar;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzgcg zzgcgVar) throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzgcm.class) {
            com.google.android.gms.internal.ads.zzgci zzgciVar = this.zza;
            zzgciVar.zzf("vendor_scoped_gpid_v2_id");
            zzgciVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
