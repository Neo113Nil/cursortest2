package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C1117w;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.InterfaceC1115v;
import kotlinx.coroutines.S;

/* loaded from: classes4.dex */
public final class zzbx {
    public static final S zza(Task task) {
        final C1117w a = C1119x.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC1115v interfaceC1115v = InterfaceC1115v.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    interfaceC1115v.s(exception);
                } else if (task2.isCanceled()) {
                    interfaceC1115v.cancel((CancellationException) null);
                } else {
                    interfaceC1115v.t(task2.getResult());
                }
            }
        });
        return new zzbw(a);
    }
}
