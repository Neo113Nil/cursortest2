package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzanf {
    public static void zza(com.google.android.gms.internal.ads.zzang zzangVar, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        for (int i = 0; i < zzangVar.zza(); i++) {
            long zzb = zzangVar.zzb(i);
            java.util.List zzc = zzangVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i == zzangVar.zza() - 1) {
                    throw new java.lang.IllegalStateException();
                }
                long zzb2 = zzangVar.zzb(i + 1) - zzangVar.zzb(i);
                if (zzb2 > 0) {
                    zzdtVar.zza(new com.google.android.gms.internal.ads.zzand(zzc, zzb, zzb2));
                }
            }
        }
    }
}
