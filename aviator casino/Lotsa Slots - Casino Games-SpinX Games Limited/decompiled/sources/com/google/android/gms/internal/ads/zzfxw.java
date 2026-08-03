package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfxw {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzfxg zzc;
    private final com.google.android.gms.internal.ads.zzfxv zzd;
    private com.google.android.gms.tasks.Task zze;

    zzfxw(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfxg zzfxgVar, com.google.android.gms.internal.ads.zzfxi zzfxiVar, com.google.android.gms.internal.ads.zzfxs zzfxsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfxgVar;
        this.zzd = zzfxsVar;
    }

    public static com.google.android.gms.internal.ads.zzfxw zza(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfxg zzfxgVar, com.google.android.gms.internal.ads.zzfxi zzfxiVar) {
        final com.google.android.gms.internal.ads.zzfxw zzfxwVar = new com.google.android.gms.internal.ads.zzfxw(context, executor, zzfxgVar, zzfxiVar, new com.google.android.gms.internal.ads.zzfxs());
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfxu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfxw.this.zzc();
            }
        };
        java.util.concurrent.Executor executor2 = zzfxwVar.zzb;
        zzfxwVar.zze = com.google.android.gms.tasks.Tasks.call(executor2, callable).addOnFailureListener(executor2, new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfxt
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(java.lang.Exception exc) {
                com.google.android.gms.internal.ads.zzfxw.this.zzd(exc);
            }
        });
        return zzfxwVar;
    }

    public final com.google.android.gms.internal.ads.zzaym zzb() {
        com.google.android.gms.internal.ads.zzfxv zzfxvVar = this.zzd;
        com.google.android.gms.tasks.Task task = this.zze;
        return !task.isSuccessful() ? zzfxvVar.zza() : (com.google.android.gms.internal.ads.zzaym) task.getResult();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzaym zzc() {
        android.content.Context context = this.zza;
        return com.google.android.gms.internal.ads.zzfxn.zza(context, context.getPackageName(), java.lang.Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzd(java.lang.Exception exc) {
        if (exc instanceof java.lang.InterruptedException) {
            java.lang.Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
