package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdql implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdqe zza;

    private zzdql(com.google.android.gms.internal.ads.zzdqe zzdqeVar) {
        this.zza = zzdqeVar;
    }

    public static com.google.android.gms.internal.ads.zzdql zzc(com.google.android.gms.internal.ads.zzdqe zzdqeVar) {
        return new com.google.android.gms.internal.ads.zzdql(zzdqeVar);
    }

    public static com.google.android.gms.internal.ads.zzdpt zzd(com.google.android.gms.internal.ads.zzdqe zzdqeVar) {
        com.google.android.gms.internal.ads.zzdpt zza = zzdqeVar.zza();
        com.google.android.gms.internal.ads.zzinc.zzb(zza);
        return zza;
    }

    public final com.google.android.gms.internal.ads.zzdpt zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}
