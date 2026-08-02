package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j0 extends m0 {
    public final AbstractC0830d b;

    public j0(int i, AbstractC0830d abstractC0830d) {
        super(i);
        this.b = abstractC0830d;
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void a(@NonNull Status status) {
        try {
            this.b.setFailedResult(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void b(@NonNull Exception exc) {
        try {
            this.b.setFailedResult(new Status(10, android.support.v4.media.session.f.b(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void c(K k) throws DeadObjectException {
        try {
            this.b.run(k.b);
        } catch (RuntimeException e) {
            b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void d(@NonNull A a, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = a.a;
        AbstractC0830d abstractC0830d = this.b;
        map.put(abstractC0830d, valueOf);
        abstractC0830d.addStatusListener(new C0850y(a, abstractC0830d));
    }
}
