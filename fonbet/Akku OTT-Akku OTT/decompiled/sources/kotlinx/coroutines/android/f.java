package kotlinx.coroutines.android;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.U;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.internal.q;

/* loaded from: classes5.dex */
public abstract class f extends I implements U {
    public abstract f W();

    public InterfaceC1053e0 d(long j, W0 w0, CoroutineContext coroutineContext) {
        return Q.a.d(j, w0, coroutineContext);
    }

    @Override // kotlinx.coroutines.I
    public I limitedParallelism(int i, String str) {
        j.a(i);
        return str != null ? new q(this, str) : this;
    }

    @Override // kotlinx.coroutines.I
    public String toString() {
        f fVar;
        String str;
        kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
        f fVar2 = p.a;
        if (this == fVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                fVar = fVar2.W();
            } catch (UnsupportedOperationException unused) {
                fVar = null;
            }
            str = this == fVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + O.a(this);
    }
}
