package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdci implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdcb zza;

    private zzdci(com.google.android.gms.internal.ads.zzdcb zzdcbVar) {
        this.zza = zzdcbVar;
    }

    public static com.google.android.gms.internal.ads.zzdci zzc(com.google.android.gms.internal.ads.zzdcb zzdcbVar) {
        return new com.google.android.gms.internal.ads.zzdci(zzdcbVar);
    }

    public static com.google.android.gms.internal.ads.zzfky zzd(com.google.android.gms.internal.ads.zzdcb zzdcbVar) {
        com.google.android.gms.internal.ads.zzfky zzb = zzdcbVar.zzb();
        com.google.android.gms.internal.ads.zzinc.zzb(zzb);
        return zzb;
    }

    public final com.google.android.gms.internal.ads.zzfky zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}
