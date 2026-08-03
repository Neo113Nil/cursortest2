package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcnt implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcnl zza;

    private zzcnt(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
    }

    public static com.google.android.gms.internal.ads.zzcnt zzc(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        return new com.google.android.gms.internal.ads.zzcnt(zzcnlVar);
    }

    public static java.lang.ref.WeakReference zzd(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        java.lang.ref.WeakReference zzc = zzcnlVar.zzc();
        com.google.android.gms.internal.ads.zzinc.zzb(zzc);
        return zzc;
    }

    public final java.lang.ref.WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}
