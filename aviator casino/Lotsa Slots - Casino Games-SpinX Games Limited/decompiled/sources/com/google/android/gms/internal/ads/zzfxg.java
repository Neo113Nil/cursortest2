package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzfxg {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.tasks.Task zzd;
    private final boolean zze;

    public zzfxg(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.tasks.Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static com.google.android.gms.internal.ads.zzfxg zza(final android.content.Context context, java.util.concurrent.Executor executor, boolean z) {
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        if (z) {
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfxc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = com.google.android.gms.internal.ads.zzfxg.zza;
                    taskCompletionSource.setResult(com.google.android.gms.internal.ads.zzfzc.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfxe
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = com.google.android.gms.internal.ads.zzfxg.zza;
                    com.google.android.gms.tasks.TaskCompletionSource.this.setResult(com.google.android.gms.internal.ads.zzfzc.zzc());
                }
            });
        }
        return new com.google.android.gms.internal.ads.zzfxg(context, executor, taskCompletionSource.getTask(), z);
    }

    static void zzg(int i) {
        zzf = i;
    }

    private final com.google.android.gms.tasks.Task zzh(final int i, long j, java.lang.Exception exc, java.lang.String str, java.util.Map map, java.lang.String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, com.google.android.gms.internal.ads.zzfxf.zza);
        }
        android.content.Context context = this.zzb;
        final com.google.android.gms.internal.ads.zzaws zza2 = com.google.android.gms.internal.ads.zzaww.zza();
        zza2.zza(context.getPackageName());
        zza2.zzb(j);
        zza2.zzg(zzf);
        if (exc != null) {
            int i2 = com.google.android.gms.internal.ads.zzgug.zza;
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            exc.printStackTrace(new java.io.PrintWriter(stringWriter));
            zza2.zzc(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zze(str2);
        }
        if (str != null) {
            zza2.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.internal.ads.zzfxd
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                int i3 = com.google.android.gms.internal.ads.zzfxg.zza;
                if (!task.isSuccessful()) {
                    return false;
                }
                int i4 = i;
                com.google.android.gms.internal.ads.zzfzb zza3 = ((com.google.android.gms.internal.ads.zzfzc) task.getResult()).zza(((com.google.android.gms.internal.ads.zzaww) com.google.android.gms.internal.ads.zzaws.this.zzbu()).zzaN());
                zza3.zzc(i4);
                zza3.zza();
                return true;
            }
        });
    }

    public com.google.android.gms.tasks.Task zzb(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public com.google.android.gms.tasks.Task zzc(int i, long j, java.lang.Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final com.google.android.gms.tasks.Task zzd(int i, long j, java.lang.String str, java.util.Map map) {
        return zzh(i, j, null, str, null, null);
    }

    public com.google.android.gms.tasks.Task zze(int i, java.lang.String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final com.google.android.gms.tasks.Task zzf(int i, long j, java.lang.String str) {
        return zzh(i, j, null, null, null, str);
    }
}
