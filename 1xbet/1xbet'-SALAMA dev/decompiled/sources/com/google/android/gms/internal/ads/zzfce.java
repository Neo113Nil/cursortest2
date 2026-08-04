package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class zzfce {
    static Task zza;
    public static U2.a zzb;
    private static final Object zzc = new Object();

    public static Task zza(Context context) {
        Task task;
        zzb(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }

    public static void zzb(Context context, boolean z4) {
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.appset.zzr(context);
                }
                Task task = zza;
                if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z4 && zza.isComplete()))) {
                    U2.a aVar = zzb;
                    D.j(aVar, "the appSetIdClient shouldn't be null");
                    zza = aVar.getAppSetIdInfo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
