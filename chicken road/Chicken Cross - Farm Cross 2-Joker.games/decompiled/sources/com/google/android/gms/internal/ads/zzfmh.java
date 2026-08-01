package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfmh {
    public static zzbqh zza(final zzele zzeleVar, final zzfte zzfteVar, final zzcub zzcubVar, final zzdlw zzdlwVar) {
        return new zzbqh() { // from class: com.google.android.gms.internal.ads.zzfmg
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzclm zzclmVar = (zzclm) obj;
                zzbqg.zzc(map, zzdlw.this);
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzele zzeleVar2 = zzeleVar;
                    zzfte zzfteVar2 = zzfteVar;
                    zzhcy.zzr(zzbqg.zza(zzclmVar, str), new zzfme(zzclmVar, zzcubVar, zzfteVar2, zzeleVar2), zzcgj.zza);
                }
            }
        };
    }

    public static zzbqh zzb(final zzele zzeleVar, final zzfte zzfteVar) {
        return new zzbqh() { // from class: com.google.android.gms.internal.ads.zzfmf
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcld zzcldVar = (zzcld) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfld zzC = zzcldVar.zzC();
                if (zzC != null && !zzC.zzai) {
                    zzfte.this.zzb(str, zzC.zzax, null, null);
                    return;
                }
                zzflg zzaC = ((zzcmt) zzcldVar).zzaC();
                if (zzaC != null) {
                    zzeleVar.zze(new zzelg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
