package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class S extends V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0783d f11144b;

    public S(int i7, AbstractC0783d abstractC0783d) {
        super(i7);
        com.google.android.gms.common.internal.D.j(abstractC0783d, "Null methods are not runnable.");
        this.f11144b = abstractC0783d;
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
            this.f11144b.setFailedResult(new Status(10, p031e1.k.f(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void c(D d7) throws DeadObjectException {
        try {
            this.f11144b.run(d7.f11105b);
        } catch (RuntimeException e7) {
            b(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void d(A a2, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) a2.f11090a;
        AbstractC0783d abstractC0783d = this.f11144b;
        map.put(abstractC0783d, boolValueOf);
        abstractC0783d.addStatusListener(new C0803y(a2, abstractC0783d));
    }
}
