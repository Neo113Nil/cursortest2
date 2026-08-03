package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzflj {
    public static com.google.android.gms.internal.ads.zzbpq zza(final com.google.android.gms.internal.ads.zzekg zzekgVar, final com.google.android.gms.internal.ads.zzfsc zzfscVar, final com.google.android.gms.internal.ads.zzctj zzctjVar, final com.google.android.gms.internal.ads.zzdky zzdkyVar) {
        return new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzfli
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
                com.google.android.gms.internal.ads.zzbpp.zzc(map, com.google.android.gms.internal.ads.zzdky.this);
                java.lang.String str = (java.lang.String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    com.google.android.gms.internal.ads.zzekg zzekgVar2 = zzekgVar;
                    com.google.android.gms.internal.ads.zzfsc zzfscVar2 = zzfscVar;
                    com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzbpp.zza(zzckuVar, str), new com.google.android.gms.internal.ads.zzflg(zzckuVar, zzctjVar, zzfscVar2, zzekgVar2), com.google.android.gms.internal.ads.zzcfr.zza);
                }
            }
        };
    }

    public static com.google.android.gms.internal.ads.zzbpq zzb(final com.google.android.gms.internal.ads.zzekg zzekgVar, final com.google.android.gms.internal.ads.zzfsc zzfscVar) {
        return new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzflh
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzckl zzcklVar = (com.google.android.gms.internal.ads.zzckl) obj;
                java.lang.String str = (java.lang.String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                com.google.android.gms.internal.ads.zzfkf zzC = zzcklVar.zzC();
                if (zzC != null && !zzC.zzai) {
                    com.google.android.gms.internal.ads.zzfsc.this.zzb(str, zzC.zzax, null, null);
                    return;
                }
                com.google.android.gms.internal.ads.zzfki zzaC = ((com.google.android.gms.internal.ads.zzcmb) zzcklVar).zzaC();
                if (zzaC != null) {
                    zzekgVar.zze(new com.google.android.gms.internal.ads.zzeki(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new java.lang.IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
