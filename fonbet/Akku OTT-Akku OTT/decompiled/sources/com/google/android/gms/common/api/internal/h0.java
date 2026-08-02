package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C0875q;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class h0<R extends com.google.android.gms.common.api.l> extends com.google.android.gms.common.api.o<R> implements com.google.android.gms.common.api.m<R> {
    public final WeakReference e;
    public final f0 f;

    @Nullable
    public h0 a = null;

    @Nullable
    public com.google.android.gms.common.api.i b = null;
    public final Object c = new Object();

    @Nullable
    public Status d = null;
    public boolean g = false;

    public h0(WeakReference weakReference) {
        C0875q.h(weakReference, "GoogleApiClient reference must not be null");
        this.e = weakReference;
        com.google.android.gms.common.api.h hVar = (com.google.android.gms.common.api.h) weakReference.get();
        this.f = new f0(this, hVar != null ? hVar.c() : Looper.getMainLooper());
    }

    public static final void d(com.google.android.gms.common.api.l lVar) {
        if (lVar instanceof com.google.android.gms.common.api.j) {
            try {
                ((com.google.android.gms.common.api.j) lVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(lVar));
            }
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final void a(com.google.android.gms.common.api.l lVar) {
        synchronized (this.c) {
            if (lVar.getStatus().l()) {
            } else {
                b(lVar.getStatus());
                d(lVar);
            }
        }
    }

    public final void b(Status status) {
        synchronized (this.c) {
            this.d = status;
            synchronized (this.c) {
            }
        }
    }

    public final void c() {
    }
}
