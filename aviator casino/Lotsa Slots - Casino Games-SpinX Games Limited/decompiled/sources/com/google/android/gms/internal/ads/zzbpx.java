package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbpx implements com.google.android.gms.internal.ads.zzbpq {
    static final java.util.Map zza = com.google.android.gms.common.util.CollectionUtils.mapOfKeyValueArrays(new java.lang.String[]{com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new java.lang.Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final com.google.android.gms.internal.ads.zzbya zzc;
    private final com.google.android.gms.internal.ads.zzbyh zzd;

    public zzbpx(com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzbya zzbyaVar, com.google.android.gms.internal.ads.zzbyh zzbyhVar) {
        this.zzb = zzbVar;
        this.zzc = zzbyaVar;
        this.zzd = zzbyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        int intValue = ((java.lang.Integer) zza.get((java.lang.String) map.get("a"))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (intValue == 3) {
                    new com.google.android.gms.internal.ads.zzbyd(zzckuVar, map).zza();
                    return;
                }
                if (intValue == 4) {
                    new com.google.android.gms.internal.ads.zzbxx(zzckuVar, map).zza();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (intValue != 7) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        java.lang.String str = (java.lang.String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? java.lang.Boolean.parseBoolean((java.lang.String) map.get("allowOrientationChange")) : true;
        if (zzckuVar == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : 14;
        }
        zzckuVar.zzam(i);
    }
}
