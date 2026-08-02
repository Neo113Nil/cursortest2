package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k0 extends S {
    public final AbstractC0847v b;
    public final TaskCompletionSource c;
    public final InterfaceC0845t d;

    public k0(int i, AbstractC0847v abstractC0847v, TaskCompletionSource taskCompletionSource, InterfaceC0845t interfaceC0845t) {
        super(i);
        this.c = taskCompletionSource;
        this.b = abstractC0847v;
        this.d = interfaceC0845t;
        if (i == 2 && abstractC0847v.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void a(@NonNull Status status) {
        this.c.trySetException(this.d.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void b(@NonNull Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void c(K k) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            AbstractC0847v abstractC0847v = this.b;
            ((d0) abstractC0847v).d.a.accept(k.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(m0.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void d(@NonNull A a, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = a.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new C0851z(a, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.S
    public final boolean f(K k) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.S
    @Nullable
    public final C0854d[] g(K k) {
        return this.b.a;
    }
}
