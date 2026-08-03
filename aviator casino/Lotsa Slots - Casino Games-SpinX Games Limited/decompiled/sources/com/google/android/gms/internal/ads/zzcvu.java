package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcvu implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcvs zza;

    private zzcvu(com.google.android.gms.internal.ads.zzcvs zzcvsVar) {
        this.zza = zzcvsVar;
    }

    public static com.google.android.gms.internal.ads.zzcvu zzc(com.google.android.gms.internal.ads.zzcvs zzcvsVar) {
        return new com.google.android.gms.internal.ads.zzcvu(zzcvsVar);
    }

    public static android.view.View zzd(com.google.android.gms.internal.ads.zzcvs zzcvsVar) {
        android.view.View zzb = zzcvsVar.zzb();
        com.google.android.gms.internal.ads.zzinc.zzb(zzb);
        return zzb;
    }

    public final android.view.View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}
