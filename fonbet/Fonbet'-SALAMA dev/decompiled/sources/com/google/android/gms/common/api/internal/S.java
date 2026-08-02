package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class S extends V {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0827d f11144b;

    public S(int i7, AbstractC0827d abstractC0827d) {
        super(i7);
        com.google.android.gms.common.internal.D.j(abstractC0827d, "Null methods are not runnable.");
        this.f11144b = abstractC0827d;
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void a(Status status) {
        try {
            this.f11144b.setFailedResult(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void b(RuntimeException runtimeException) {
        try {
            this.f11144b.setFailedResult(new Status(10, e1.k.f(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void c(D d7) {
        try {
            this.f11144b.run(d7.f11105b);
        } catch (RuntimeException e7) {
            b(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void d(A a2, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        Map map = (Map) a2.f11090a;
        AbstractC0827d abstractC0827d = this.f11144b;
        map.put(abstractC0827d, valueOf);
        abstractC0827d.addStatusListener(new C0847y(a2, abstractC0827d));
    }
}
