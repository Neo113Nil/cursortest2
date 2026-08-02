package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public abstract class g0 extends S {
    public final TaskCompletionSource b;

    public g0(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void a(@NonNull Status status) {
        this.b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void b(@NonNull Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void c(K k) throws DeadObjectException {
        try {
            h(k);
        } catch (DeadObjectException e) {
            a(m0.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(m0.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    public abstract void h(K k) throws RemoteException;
}
