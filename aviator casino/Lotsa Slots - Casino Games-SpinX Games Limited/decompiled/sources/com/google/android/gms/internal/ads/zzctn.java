package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzctn implements com.google.android.gms.internal.ads.zzdcu {
    private final com.google.android.gms.internal.ads.zzfki zza;
    private final com.google.android.gms.internal.ads.zzfkq zzb;
    private final com.google.android.gms.internal.ads.zzfry zzc;
    private final com.google.android.gms.internal.ads.zzfsc zzd;

    public zzctn(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzfry zzfryVar) {
        this.zzb = zzfkqVar;
        this.zzd = zzfscVar;
        this.zzc = zzfryVar;
        this.zza = zzfkqVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        java.util.List list = this.zza.zza;
        this.zzd.zza(this.zzc.zza(this.zzb, null, list), null);
    }
}
