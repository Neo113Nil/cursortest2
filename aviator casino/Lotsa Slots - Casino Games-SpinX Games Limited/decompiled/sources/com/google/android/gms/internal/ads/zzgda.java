package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgda {
    private static final java.lang.Object zza = new java.lang.Object();
    private static com.google.android.gms.internal.ads.zzgda zzb;
    private final com.google.android.gms.internal.ads.zzgcy zzc;

    private zzgda(android.content.Context context, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgdf zzgdfVar) {
        com.google.android.gms.internal.ads.zzgdm zzgdmVar = new com.google.android.gms.internal.ads.zzgdm(null);
        zzgdmVar.zzc(context);
        zzgdmVar.zzb(executorService);
        zzgdmVar.zzd(zzgdfVar);
        this.zzc = (com.google.android.gms.internal.ads.zzgcy) ((com.google.android.gms.internal.ads.zzgdl) zzgdmVar.zza()).zzI.zzb();
    }

    public static com.google.android.gms.internal.ads.zzgda zza(android.content.Context context, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgdf zzgdfVar) {
        com.google.android.gms.internal.ads.zzgda zzgdaVar;
        synchronized (zza) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.ads.zzgda(context, executorService, zzgdfVar);
            }
            zzgdaVar = zzb;
        }
        return zzgdaVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zzc.zza();
    }

    public final java.lang.String zzc(android.content.Context context) {
        return this.zzc.zzb(context);
    }

    public final java.lang.String zzd(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return this.zzc.zzc(context, null, view, activity);
    }

    public final java.lang.String zze(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return this.zzc.zzd(context, str, view, null);
    }

    public final void zzf(java.util.List list) {
        this.zzc.zze(list);
    }

    public final void zzg(android.view.InputEvent inputEvent) {
        this.zzc.zzf(inputEvent);
    }

    public final int zzh() {
        return this.zzc.zzj();
    }
}
