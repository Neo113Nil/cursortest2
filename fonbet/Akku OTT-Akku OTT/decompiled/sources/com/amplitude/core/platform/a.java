package com.amplitude.core.platform;

import com.amplitude.core.platform.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a implements h {
    public com.amplitude.core.b c;
    public final k.a a = k.a.c;
    public final m b = new m();
    public final boolean d = true;

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.c = bVar;
    }

    @Override // com.amplitude.core.platform.k
    public void c(com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
        m mVar = this.b;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(amplitude, "<set-?>");
        mVar.b = amplitude;
    }

    @Override // com.amplitude.core.platform.k
    public final com.amplitude.core.events.a f(com.amplitude.core.events.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.a;
    }

    public final com.amplitude.core.b h() {
        com.amplitude.core.b bVar = this.c;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    public final void i(com.amplitude.core.events.a aVar) {
        if (this.d) {
            k.a aVar2 = k.a.a;
            m mVar = this.b;
            com.amplitude.core.events.a b = mVar.b(k.a.b, mVar.b(aVar2, aVar));
            if (b != null) {
                if (b instanceof com.amplitude.core.events.c) {
                    a((com.amplitude.core.events.c) b);
                    return;
                }
                if (b instanceof com.amplitude.core.events.b) {
                    g((com.amplitude.core.events.b) b);
                } else if (b instanceof com.amplitude.core.events.g) {
                    d((com.amplitude.core.events.g) b);
                } else {
                    e(b);
                }
            }
        }
    }
}
