package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfmt {
    private final Context zza;
    private final Executor zzb;
    private final zzfmc zzc;
    private final zzfms zzd;
    private Task zze;

    public zzfmt(Context context, Executor executor, zzfmc zzfmcVar, zzfme zzfmeVar, zzfmr zzfmrVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfmcVar;
        this.zzd = zzfmrVar;
    }

    public static /* synthetic */ zzasm zza(zzfmt zzfmtVar) {
        Context context = zzfmtVar.zza;
        return zzfmk.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public static zzfmt zzc(Context context, Executor executor, zzfmc zzfmcVar, zzfme zzfmeVar) {
        final zzfmt zzfmtVar = new zzfmt(context, executor, zzfmcVar, zzfmeVar, new zzfmr());
        zzfmtVar.zze = Tasks.call(zzfmtVar.zzb, new Callable() { // from class: com.google.android.gms.internal.ads.zzfmp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfmt.zza(zzfmt.this);
            }
        }).addOnFailureListener(zzfmtVar.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfmq
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfmt.zzd(zzfmt.this, exc);
            }
        });
        return zzfmtVar;
    }

    public static /* synthetic */ void zzd(zzfmt zzfmtVar, Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        zzfmtVar.zzc.zzc(2025, -1L, exc);
    }

    public final zzasm zzb() {
        zzfms zzfmsVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfmsVar.zza() : (zzasm) task.getResult();
    }
}
