package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdrg {
    private final com.google.android.gms.internal.ads.zzdwi zza;
    private final com.google.android.gms.internal.ads.zzdux zzb;
    private final com.google.android.gms.internal.ads.zzcuq zzc;
    private final com.google.android.gms.internal.ads.zzdqb zzd;

    public zzdrg(com.google.android.gms.internal.ads.zzdwi zzdwiVar, com.google.android.gms.internal.ads.zzdux zzduxVar, com.google.android.gms.internal.ads.zzcuq zzcuqVar, com.google.android.gms.internal.ads.zzdqb zzdqbVar) {
        this.zza = zzdwiVar;
        this.zzb = zzduxVar;
        this.zzc = zzcuqVar;
        this.zzd = zzdqbVar;
    }

    public final android.view.View zza() throws com.google.android.gms.internal.ads.zzclj {
        com.google.android.gms.internal.ads.zzcku zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zza.zzE().setVisibility(8);
        zza.zzab("/sendMessageToSdk", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdrg.this.zzb((com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        zza.zzab("/adMuted", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdra
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdrg.this.zzc((com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(zza);
        com.google.android.gms.internal.ads.zzbpq zzbpqVar = new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdrb
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, final java.util.Map map) {
                com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
                com.google.android.gms.internal.ads.zzcms zzP = zzckuVar.zzP();
                final com.google.android.gms.internal.ads.zzdrg zzdrgVar = com.google.android.gms.internal.ads.zzdrg.this;
                zzP.zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.internal.ads.zzdre
                    @Override // com.google.android.gms.internal.ads.zzcmq
                    public final /* synthetic */ void zza(boolean z, int i, java.lang.String str, java.lang.String str2) {
                        com.google.android.gms.internal.ads.zzdrg.this.zzf(map, z, i, str, str2);
                    }
                });
                java.lang.String str = (java.lang.String) map.get("overlayHtml");
                java.lang.String str2 = (java.lang.String) map.get("baseUrl");
                if (android.text.TextUtils.isEmpty(str2)) {
                    zzckuVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzckuVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        com.google.android.gms.internal.ads.zzdux zzduxVar = this.zzb;
        zzduxVar.zzh(weakReference, "/loadHtml", zzbpqVar);
        zzduxVar.zzh(new java.lang.ref.WeakReference(zza), "/showOverlay", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdrc
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdrg.this.zzd((com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        zzduxVar.zzh(new java.lang.ref.WeakReference(zza), "/hideOverlay", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdrd
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdrg.this.zze((com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        return zza.zzE();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        this.zzd.zzt();
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzckuVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzckuVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    final /* synthetic */ void zzf(java.util.Map map, boolean z, int i, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (java.lang.String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
