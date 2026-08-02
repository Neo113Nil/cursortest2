package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class zzfqd {
    public static I3.b zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfqc zzfqcVar = new zzfqc(task, null);
        task.addOnCompleteListener(zzgbu.zzc(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfqb
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfqc zzfqcVar2 = zzfqc.this;
                if (task2.isCanceled()) {
                    zzfqcVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfqcVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfqcVar2.zzd(exception);
            }
        });
        return zzfqcVar;
    }
}
