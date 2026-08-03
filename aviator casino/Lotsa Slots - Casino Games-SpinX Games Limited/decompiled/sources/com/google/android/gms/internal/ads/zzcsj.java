package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcsj implements com.google.android.gms.internal.ads.zzcrt {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzcsj(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(java.util.Map map) {
        java.lang.String str;
        if (map.isEmpty() || (str = (java.lang.String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        zzgVar.zzw(parseBoolean);
        if (parseBoolean) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
        }
    }
}
