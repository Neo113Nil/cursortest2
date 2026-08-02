package c4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;
import p4.AbstractC2277q;
import p4.C2268h;

/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0542c extends AbstractC0540a {
    private final a4.h _context;
    private transient a4.c<Object> intercepted;

    public AbstractC0542c(a4.c cVar, a4.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // a4.c
    public a4.h getContext() {
        a4.h hVar = this._context;
        l.c(hVar);
        return hVar;
    }

    public final a4.c<Object> intercepted() {
        a4.c<Object> cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        a4.e eVar = (a4.e) getContext().l(a4.d.f6648k);
        a4.c<Object> fVar = eVar != null ? new u4.f((AbstractC2277q) eVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // c4.AbstractC0540a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a4.c<Object> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            a4.f l5 = getContext().l(a4.d.f6648k);
            l.c(l5);
            u4.f fVar = (u4.f) cVar;
            do {
                atomicReferenceFieldUpdater = u4.f.f20086r;
            } while (atomicReferenceFieldUpdater.get(fVar) == u4.a.f20077c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C2268h c2268h = obj instanceof C2268h ? (C2268h) obj : null;
            if (c2268h != null) {
                c2268h.n();
            }
        }
        this.intercepted = C0541b.f7406k;
    }

    public AbstractC0542c(a4.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
