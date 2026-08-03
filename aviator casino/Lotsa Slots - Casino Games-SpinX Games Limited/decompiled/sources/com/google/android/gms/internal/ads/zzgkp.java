package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgkp extends com.google.android.gms.internal.ads.zzfxg {
    private final com.google.android.gms.internal.ads.zzgfh zzb;

    zzgkp(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzgfh zzgfhVar) {
        super(context, executor, new com.google.android.gms.tasks.TaskCompletionSource().getTask(), false);
        this.zzb = zzgfhVar;
    }

    private static com.google.android.gms.tasks.Task zzh() {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        taskCompletionSource.setResult(true);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final com.google.android.gms.tasks.Task zzb(int i, long j) {
        this.zzb.zzb(i, j, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final com.google.android.gms.tasks.Task zzc(int i, long j, java.lang.Exception exc) {
        this.zzb.zzb(i, j, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final com.google.android.gms.tasks.Task zze(int i, java.lang.String str) {
        this.zzb.zzb(i, -1L, null, str);
        return zzh();
    }
}
