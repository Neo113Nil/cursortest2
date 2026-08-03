package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdcd implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdcb zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzdcd(com.google.android.gms.internal.ads.zzdcb zzdcbVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzdcbVar;
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdcd zza(com.google.android.gms.internal.ads.zzdcb zzdcbVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzdcd(zzdcbVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        android.content.Context zzf = this.zza.zzf(((com.google.android.gms.internal.ads.zzcns) this.zzb).zza());
        com.google.android.gms.internal.ads.zzinc.zzb(zzf);
        return zzf;
    }
}
