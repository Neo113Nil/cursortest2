package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcnq implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcnl zza;

    private zzcnq(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
    }

    public static com.google.android.gms.internal.ads.zzcnq zzc(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        return new com.google.android.gms.internal.ads.zzcnq(zzcnlVar);
    }

    public static android.content.Context zzd(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        android.content.Context zzb = zzcnlVar.zzb();
        com.google.android.gms.internal.ads.zzinc.zzb(zzb);
        return zzb;
    }

    public final android.content.Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}
