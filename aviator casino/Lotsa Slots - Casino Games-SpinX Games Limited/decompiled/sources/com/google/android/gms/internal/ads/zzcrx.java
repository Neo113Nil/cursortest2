package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcrx implements com.google.android.gms.internal.ads.zzcrt {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcrx(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(java.util.Map map) {
        this.zza.zzd(java.lang.Boolean.parseBoolean((java.lang.String) map.get("content_vertical_opted_out")));
    }
}
