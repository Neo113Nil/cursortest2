package k6;

import D6.A;
import D6.C0130m;
import i6.C1288e;
import i6.InterfaceC1287d;
import i6.InterfaceC1289f;
import i6.InterfaceC1290g;
import i6.InterfaceC1292i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1356c extends AbstractC1354a {
    private final InterfaceC1292i _context;
    private transient InterfaceC1287d intercepted;

    public AbstractC1356c(InterfaceC1287d interfaceC1287d, InterfaceC1292i interfaceC1292i) {
        super(interfaceC1287d);
        this._context = interfaceC1292i;
    }

    @Override // i6.InterfaceC1287d
    public InterfaceC1292i getContext() {
        InterfaceC1292i interfaceC1292i = this._context;
        t6.h.b(interfaceC1292i);
        return interfaceC1292i;
    }

    public final InterfaceC1287d intercepted() {
        InterfaceC1287d interfaceC1287d = this.intercepted;
        if (interfaceC1287d == null) {
            InterfaceC1289f interfaceC1289f = (InterfaceC1289f) getContext().get(C1288e.f14067a);
            interfaceC1287d = interfaceC1289f != null ? new I6.h((A) interfaceC1289f, this) : this;
            this.intercepted = interfaceC1287d;
        }
        return interfaceC1287d;
    }

    @Override // k6.AbstractC1354a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1287d interfaceC1287d = this.intercepted;
        if (interfaceC1287d != null && interfaceC1287d != this) {
            InterfaceC1290g interfaceC1290g = getContext().get(C1288e.f14067a);
            t6.h.b(interfaceC1290g);
            I6.h hVar = (I6.h) interfaceC1287d;
            do {
                atomicReferenceFieldUpdater = I6.h.f3729y;
            } while (atomicReferenceFieldUpdater.get(hVar) == I6.a.f3719d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0130m c0130m = obj instanceof C0130m ? (C0130m) obj : null;
            if (c0130m != null) {
                c0130m.o();
            }
        }
        this.intercepted = C1355b.f14792a;
    }

    public AbstractC1356c(InterfaceC1287d interfaceC1287d) {
        this(interfaceC1287d, interfaceC1287d != null ? interfaceC1287d.getContext() : null);
    }
}
