package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdtn {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzcuq zzb;
    private final com.google.android.gms.internal.ads.zzdks zzc;
    private final com.google.android.gms.internal.ads.zzctj zzd;
    private final com.google.android.gms.internal.ads.zzdbn zze;

    zzdtn(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcuq zzcuqVar, com.google.android.gms.internal.ads.zzdks zzdksVar, com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzdbn zzdbnVar) {
        this.zza = executor;
        this.zzc = zzdksVar;
        this.zzb = zzcuqVar;
        this.zzd = zzctjVar;
        this.zze = zzdbnVar;
    }

    public final void zza(final com.google.android.gms.internal.ads.zzcku zzckuVar) {
        if (zzckuVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzdks zzdksVar = this.zzc;
        zzdksVar.zza(zzckuVar.zzE());
        com.google.android.gms.internal.ads.zzbeq zzbeqVar = new com.google.android.gms.internal.ads.zzbeq() { // from class: com.google.android.gms.internal.ads.zzdtm
            @Override // com.google.android.gms.internal.ads.zzbeq
            public final /* synthetic */ void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
                android.graphics.Rect rect = zzbepVar.zzd;
                com.google.android.gms.internal.ads.zzcku.this.zzP().zza(rect.left, rect.top, false);
            }
        };
        java.util.concurrent.Executor executor = this.zza;
        zzdksVar.zzq(zzbeqVar, executor);
        zzdksVar.zzq(new com.google.android.gms.internal.ads.zzbeq() { // from class: com.google.android.gms.internal.ads.zzdtj
            @Override // com.google.android.gms.internal.ads.zzbeq
            public final /* synthetic */ void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.ironsource.C3023e8.k, true != zzbepVar.zzj ? "0" : "1");
                com.google.android.gms.internal.ads.zzcku.this.zze("onAdVisibilityChanged", hashMap);
            }
        }, executor);
        com.google.android.gms.internal.ads.zzcuq zzcuqVar = this.zzb;
        zzdksVar.zzq(zzcuqVar, executor);
        zzcuqVar.zza(zzckuVar);
        com.google.android.gms.internal.ads.zzcms zzP = zzckuVar.zzP();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlB)).booleanValue() && zzP != null) {
            com.google.android.gms.internal.ads.zzctj zzctjVar = this.zzd;
            zzP.zzc(zzctjVar);
            zzP.zze(zzctjVar, null, null);
        }
        zzckuVar.zzab("/trackActiveViewUnit", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdtk
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdtn.this.zzb((com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        zzckuVar.zzab("/untrackActiveViewUnit", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdtl
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdtn.this.zzc((com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        zzckuVar.zzP().zzJ(this.zze);
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        this.zzb.zzd();
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        this.zzb.zzb();
    }
}
