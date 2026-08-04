package p077k6;

import p065i6.d;
import p065i6.i;
import p065i6.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends a {
    public g(d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f14074a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p065i6.d
    public final i getContext() {
        return j.f14074a;
    }
}
