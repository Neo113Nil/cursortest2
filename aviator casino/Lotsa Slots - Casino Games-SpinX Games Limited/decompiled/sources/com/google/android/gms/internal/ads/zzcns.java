package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcns implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcnl zza;

    private zzcns(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
    }

    public static com.google.android.gms.internal.ads.zzcns zzc(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        return new com.google.android.gms.internal.ads.zzcns(zzcnlVar);
    }

    public static android.content.Context zzd(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        android.content.Context zza = zzcnlVar.zza();
        com.google.android.gms.internal.ads.zzinc.zzb(zza);
        return zza;
    }

    public final android.content.Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}
