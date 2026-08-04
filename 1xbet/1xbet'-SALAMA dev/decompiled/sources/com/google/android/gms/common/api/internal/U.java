package com.google.android.gms.common.api.internal;

import W5.AbstractC0486a1;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class U extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f11148b;

    public U(int i7, TaskCompletionSource taskCompletionSource) {
        super(i7);
        this.f11148b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void a(Status status) {
        this.f11148b.trySetException(new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void b(RuntimeException runtimeException) {
        this.f11148b.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void c(D d7) throws DeadObjectException {
        try {
            h(d7);
        } catch (DeadObjectException e7) {
            a(V.e(e7));
            throw e7;
        } catch (RemoteException e8) {
            a(V.e(e8));
        } catch (RuntimeException e9) {
            this.f11148b.trySetException(e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final /* bridge */ /* synthetic */ void d(A a2, boolean z4) {
    }

    @Override // com.google.android.gms.common.api.internal.I
    public final boolean f(D d7) {
        AbstractC0486a1.n(d7.f11109f.get(null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.I
    public final Feature[] g(D d7) {
        AbstractC0486a1.n(d7.f11109f.get(null));
        return null;
    }

    public final void h(D d7) {
        AbstractC0486a1.n(d7.f11109f.remove(null));
        this.f11148b.trySetResult(Boolean.FALSE);
    }
}
