package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcoi implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcnl zza;

    private zzcoi(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
    }

    public static com.google.android.gms.internal.ads.zzcoi zzc(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        return new com.google.android.gms.internal.ads.zzcoi(zzcnlVar);
    }

    public static com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd = zzcnlVar.zzd();
        com.google.android.gms.internal.ads.zzinc.zzb(zzd);
        return zzd;
    }

    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}
