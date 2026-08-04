package p077k6;

import D6.A;
import D6.C0130m;
import I6.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p065i6.d;
import p065i6.e;
import p065i6.f;
import p065i6.g;
import p065i6.i;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends a {
    private final i _context;
    private transient d intercepted;

    public c(d dVar, i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // p065i6.d
    public i getContext() {
        i iVar = this._context;
        h.b(iVar);
        return iVar;
    }

    public final d intercepted() {
        d hVar = this.intercepted;
        if (hVar == null) {
            f fVar = (f) getContext().get(e.f14073a);
            hVar = fVar != null ? new I6.h((A) fVar, this) : this;
            this.intercepted = hVar;
        }
        return hVar;
    }

    @Override // p077k6.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g gVar = getContext().get(e.f14073a);
            h.b(gVar);
            I6.h hVar = (I6.h) dVar;
            do {
                atomicReferenceFieldUpdater = I6.h.f3729y;
            } while (atomicReferenceFieldUpdater.get(hVar) == a.f3719d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0130m c0130m = obj instanceof C0130m ? (C0130m) obj : null;
            if (c0130m != null) {
                c0130m.o();
            }
        }
        this.intercepted = b.f14798a;
    }

    public c(d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
