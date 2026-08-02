package com.google.android.recaptcha.internal;

import D6.C0136t;
import D6.E;
import D6.H;
import D6.InterfaceC0118e0;
import D6.InterfaceC0135s;
import D6.s0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class zzas {
    public static final H zza(Task task) {
        final C0136t a2 = E.a();
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                a2.O(exception);
            } else if (task.isCanceled()) {
                a2.cancel(null);
            } else {
                a2.C(task.getResult());
            }
        } else {
            task.addOnCompleteListener(zzo.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzaq
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    InterfaceC0118e0 interfaceC0118e0 = InterfaceC0135s.this;
                    Exception exception2 = task2.getException();
                    if (exception2 != null) {
                        ((C0136t) interfaceC0118e0).O(exception2);
                    } else if (task2.isCanceled()) {
                        ((s0) interfaceC0118e0).cancel(null);
                    } else {
                        ((C0136t) interfaceC0118e0).C(task2.getResult());
                    }
                }
            });
        }
        return new zzar(a2);
    }
}
