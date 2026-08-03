package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdcg implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzdcg(com.google.android.gms.internal.ads.zzdcb zzdcbVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdcg zzc(com.google.android.gms.internal.ads.zzdcb zzdcbVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzdcg(zzdcbVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zzb() {
        java.lang.String zzp = ((com.google.android.gms.internal.ads.zzczj) this.zza.zzb()).zzp();
        com.google.android.gms.internal.ads.zzinc.zzb(zzp);
        return zzp;
    }
}
