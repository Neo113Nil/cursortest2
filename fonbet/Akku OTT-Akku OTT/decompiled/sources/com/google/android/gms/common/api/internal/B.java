package com.google.android.gms.common.api.internal;

import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import com.google.android.gms.common.C0855e;

/* loaded from: classes4.dex */
public final class B extends r0 {
    public final ArraySet e;
    public final C0833g f;

    @VisibleForTesting
    public B(InterfaceC0837k interfaceC0837k, C0833g c0833g, C0855e c0855e) {
        super(interfaceC0837k, c0855e);
        this.e = new ArraySet();
        this.f = c0833g;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.C0836j
    public final void onResume() {
        super.onResume();
        if (this.e.isEmpty()) {
            return;
        }
        this.f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.r0, com.google.android.gms.common.api.internal.C0836j
    public final void onStart() {
        super.onStart();
        if (this.e.isEmpty()) {
            return;
        }
        this.f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.r0, com.google.android.gms.common.api.internal.C0836j
    public final void onStop() {
        super.onStop();
        C0833g c0833g = this.f;
        c0833g.getClass();
        synchronized (C0833g.t) {
            try {
                if (c0833g.m == this) {
                    c0833g.m = null;
                    c0833g.n.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
