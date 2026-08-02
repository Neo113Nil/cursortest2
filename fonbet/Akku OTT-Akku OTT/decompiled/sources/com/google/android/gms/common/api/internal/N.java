package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.common.internal.InterfaceC0869k;
import java.util.Set;

/* loaded from: classes4.dex */
public final class N implements AbstractC0861c.InterfaceC0112c {
    public final a.f a;
    public final C0828b b;

    @Nullable
    public InterfaceC0869k c = null;

    @Nullable
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ C0833g f;

    public N(C0833g c0833g, a.f fVar, C0828b c0828b) {
        this.f = c0833g;
        this.a = fVar;
        this.b = c0828b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c.InterfaceC0112c
    public final void a(@NonNull C0852b c0852b) {
        this.f.p.post(new M(this, c0852b));
    }

    @WorkerThread
    public final void b(C0852b c0852b) {
        K k = (K) this.f.l.get(this.b);
        if (k != null) {
            k.n(c0852b);
        }
    }
}
