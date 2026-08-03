package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzepf {
    private final com.google.android.gms.internal.ads.zzflr zza;
    private final com.google.android.gms.internal.ads.zzdwz zzb;
    private final com.google.android.gms.internal.ads.zzdzl zzc;

    public zzepf(com.google.android.gms.internal.ads.zzflr zzflrVar, com.google.android.gms.internal.ads.zzdwz zzdwzVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzflrVar;
        this.zzb = zzdwzVar;
        this.zzc = zzdzlVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, int i, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzelw zzelwVar, long j) {
        com.google.android.gms.internal.ads.zzdwy zzdwyVar;
        com.google.android.gms.internal.ads.zzdzk zza = this.zzc.zza();
        zza.zza(zzfkiVar);
        zza.zzb(zzfkfVar);
        zza.zzc("action", "adapter_status");
        zza.zzc("adapter_l", java.lang.String.valueOf(j));
        zza.zzc("sc", java.lang.Integer.toString(i));
        if (zzelwVar != null) {
            zza.zzc("arec", java.lang.Integer.toString(zzelwVar.zzb().zza));
            java.lang.String zza2 = this.zza.zza(zzelwVar.getMessage());
            if (zza2 != null) {
                zza.zzc("areec", zza2);
            }
        }
        com.google.android.gms.internal.ads.zzdwz zzdwzVar = this.zzb;
        java.util.Iterator it = zzfkfVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdwyVar = null;
                break;
            } else {
                zzdwyVar = zzdwzVar.zzc((java.lang.String) it.next());
                if (zzdwyVar != null) {
                    break;
                }
            }
        }
        if (zzdwyVar != null) {
            zza.zzc("ancn", zzdwyVar.zza);
            com.google.android.gms.internal.ads.zzbxq zzbxqVar = zzdwyVar.zzb;
            if (zzbxqVar != null) {
                zza.zzc("adapter_v", zzbxqVar.toString());
            }
            com.google.android.gms.internal.ads.zzbxq zzbxqVar2 = zzdwyVar.zzc;
            if (zzbxqVar2 != null) {
                zza.zzc("adapter_sv", zzbxqVar2.toString());
            }
        }
        zza.zzd();
    }
}
