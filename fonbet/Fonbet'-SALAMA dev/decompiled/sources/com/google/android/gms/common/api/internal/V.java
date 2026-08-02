package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public final int f11149a;

    public V(int i7) {
        this.f11149a = i7;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(D d7);

    public abstract void d(A a2, boolean z4);
}
