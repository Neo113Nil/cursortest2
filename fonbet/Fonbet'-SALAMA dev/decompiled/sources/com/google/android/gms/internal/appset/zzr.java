package com.google.android.gms.internal.appset;

import U2.a;
import U2.b;
import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
public final class zzr implements a {
    private final a zza;
    private final a zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, d.f11217b);
        this.zzb = zzl.zzc(context);
    }

    public static /* synthetic */ Task zza(zzr zzrVar, Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof j)) {
            return task;
        }
        int statusCode = ((j) exception).getStatusCode();
        return (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) ? zzrVar.zzb.getAppSetIdInfo() : statusCode == 43000 ? Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : statusCode != 15 ? task : Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // U2.a
    public final Task<b> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzr.zza(zzr.this, task);
            }
        });
    }
}
