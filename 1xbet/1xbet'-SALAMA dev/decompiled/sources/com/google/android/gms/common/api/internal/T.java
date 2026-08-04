package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public final class T extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0801w f11145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f11146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0798t f11147d;

    public T(int i7, AbstractC0801w abstractC0801w, TaskCompletionSource taskCompletionSource, InterfaceC0798t interfaceC0798t) {
        super(i7);
        this.f11146c = taskCompletionSource;
        this.f11145b = abstractC0801w;
        this.f11147d = interfaceC0798t;
        if (i7 == 2 && abstractC0801w.f11199b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void a(Status status) {
        ((C1009l0) this.f11147d).getClass();
        this.f11146c.trySetException(com.google.android.gms.common.internal.D.n(status));
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void b(RuntimeException runtimeException) {
        this.f11146c.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void c(D d7) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f11146c;
        try {
            AbstractC0801w abstractC0801w = this.f11145b;
            ((InterfaceC0797s) ((N) abstractC0801w).f11139d.f11196c).accept(d7.f11105b, taskCompletionSource);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            a(V.e(e8));
        } catch (RuntimeException e9) {
            taskCompletionSource.trySetException(e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void d(A a2, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) a2.f11091b;
        TaskCompletionSource taskCompletionSource = this.f11146c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new C0804z(a2, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.I
    public final boolean f(D d7) {
        return this.f11145b.f11199b;
    }

    @Override // com.google.android.gms.common.api.internal.I
    public final Feature[] g(D d7) {
        return this.f11145b.f11198a;
    }
}
