package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class l0 extends g0 {
    public final C0838l.a c;

    public l0(C0838l.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final /* bridge */ /* synthetic */ void d(@NonNull A a, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.S
    public final boolean f(K k) {
        if (((X) k.f.get(this.c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.S
    @Nullable
    public final C0854d[] g(K k) {
        if (((X) k.f.get(this.c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void h(K k) throws RemoteException {
        if (((X) k.f.remove(this.c)) != null) {
            throw null;
        }
        this.b.trySetResult(Boolean.FALSE);
    }
}
