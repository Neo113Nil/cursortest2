package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzepm {
    private com.google.android.gms.internal.ads.zzepd zza;

    zzepm() {
    }

    private zzepm(com.google.android.gms.internal.ads.zzepd zzepdVar) {
        this.zza = zzepdVar;
    }

    public static com.google.android.gms.internal.ads.zzepm zza(com.google.android.gms.internal.ads.zzepd zzepdVar) {
        return new com.google.android.gms.internal.ads.zzepm(zzepdVar);
    }

    public final com.google.android.gms.internal.ads.zzepd zzb(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzepf zzepfVar, com.google.android.gms.internal.ads.zzelx zzelxVar, com.google.android.gms.internal.ads.zzfsc zzfscVar) {
        com.google.android.gms.internal.ads.zzepd zzepdVar = this.zza;
        return zzepdVar != null ? zzepdVar : new com.google.android.gms.internal.ads.zzepd(clock, zzepfVar, zzelxVar, zzfscVar);
    }
}
