package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzfmc {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfmc(Context context, Executor executor, Task task, boolean z4) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z4;
    }

    public static zzfmc zza(final Context context, Executor executor, boolean z4) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z4) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfma
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfoc.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmb
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfoc.zzc());
                }
            });
        }
        return new zzfmc(context, executor, taskCompletionSource.getTask(), z4);
    }

    public static void zzg(int i7) {
        zzf = i7;
    }

    private final Task zzh(final int i7, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfly
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzb;
        final zzaqx zzaqxVarZza = zzarb.zza();
        zzaqxVarZza.zza(context.getPackageName());
        zzaqxVarZza.zze(j);
        zzaqxVarZza.zzg(zzf);
        if (exc != null) {
            int i8 = zzfue.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzaqxVarZza.zzf(stringWriter.toString());
            zzaqxVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzaqxVarZza.zzb(str2);
        }
        if (str != null) {
            zzaqxVarZza.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzflz
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i9 = i7;
                zzfoa zzfoaVarZza = ((zzfoc) task.getResult()).zza(((zzarb) zzaqxVarZza.zzbn()).zzaV());
                zzfoaVarZza.zza(i9);
                zzfoaVarZza.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final Task zzb(int i7, String str) {
        return zzh(i7, 0L, null, null, null, str);
    }

    public final Task zzc(int i7, long j, Exception exc) {
        return zzh(i7, j, exc, null, null, null);
    }

    public final Task zzd(int i7, long j) {
        return zzh(i7, j, null, null, null, null);
    }

    public final Task zze(int i7, long j, String str) {
        return zzh(i7, j, null, null, null, str);
    }

    public final Task zzf(int i7, long j, String str, Map map) {
        return zzh(i7, j, null, str, null, null);
    }
}
