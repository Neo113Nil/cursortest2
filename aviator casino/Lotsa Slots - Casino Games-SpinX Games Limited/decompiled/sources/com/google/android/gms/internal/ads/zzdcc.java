package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdcc implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdcb zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzdcc(com.google.android.gms.internal.ads.zzdcb zzdcbVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzdcbVar;
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdcc zza(com.google.android.gms.internal.ads.zzdcb zzdcbVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzdcc(zzdcbVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return this.zza.zzg((java.lang.String) this.zzb.zzb());
    }
}
