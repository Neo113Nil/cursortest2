package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcl implements java.util.concurrent.Callable {
    private final com.google.android.gms.internal.ads.zzbbs zza;
    private final com.google.android.gms.internal.ads.zzaxm zzb;

    public zzbcl(com.google.android.gms.internal.ads.zzbbs zzbbsVar, com.google.android.gms.internal.ads.zzaxm zzaxmVar) {
        this.zza = zzbbsVar;
        this.zzb = zzaxmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzbbs zzbbsVar = this.zza;
        if (zzbbsVar.zzm() != null) {
            zzbbsVar.zzm().get();
        }
        com.google.android.gms.internal.ads.zzaym zzl = zzbbsVar.zzl();
        if (zzl == null) {
            return null;
        }
        try {
            com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzb;
            synchronized (zzaxmVar) {
                zzaxmVar.zzaY(zzl.zzaN(), com.google.android.gms.internal.ads.zzido.zza());
            }
            return null;
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.NullPointerException unused) {
            return null;
        }
    }
}
