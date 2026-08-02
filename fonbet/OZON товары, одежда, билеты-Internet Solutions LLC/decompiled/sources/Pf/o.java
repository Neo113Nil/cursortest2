package Pf;

import Pf.n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class o<T extends n> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private n f22487a;

    /* renamed from: b, reason: collision with root package name */
    private T f22488b;

    /* renamed from: c, reason: collision with root package name */
    private n f22489c;

    /* renamed from: d, reason: collision with root package name */
    private n f22490d;

    /* renamed from: e, reason: collision with root package name */
    private n f22491e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<T> f22492f;

    /* JADX WARN: Multi-variable type inference failed */
    public o(n nVar, Class<T> cls) {
        this.f22492f = cls;
        if (this.f22492f.isInstance(nVar)) {
            this.f22488b = nVar;
        }
        this.f22489c = nVar;
        this.f22490d = nVar;
        this.f22487a = nVar;
        this.f22491e = nVar.B();
    }

    private void a() {
        T t2;
        if (this.f22488b != null) {
            return;
        }
        if (this.f22491e != null && !this.f22489c.s()) {
            this.f22489c = this.f22490d;
        }
        n nVar = this.f22489c;
        loop0: while (true) {
            t2 = null;
            if (nVar.h() > 0) {
                nVar = nVar.g(0);
            } else {
                n nVar2 = this.f22487a;
                nVar2.getClass();
                if (nVar2 == nVar) {
                    nVar = null;
                } else if (nVar.v() != null) {
                    nVar = nVar.v();
                } else {
                    do {
                        nVar = nVar.B();
                        if (nVar == null) {
                            break loop0;
                        }
                        n nVar3 = this.f22487a;
                        nVar3.getClass();
                        if (nVar3 == nVar) {
                            break loop0;
                        }
                    } while (nVar.v() == null);
                    nVar = nVar.v();
                }
            }
            if (nVar == null) {
                break;
            } else if (this.f22492f.isInstance(nVar)) {
                t2 = (T) nVar;
                break;
            }
        }
        this.f22488b = t2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f22488b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        T t2 = this.f22488b;
        if (t2 == null) {
            throw new NoSuchElementException();
        }
        this.f22490d = this.f22489c;
        this.f22489c = t2;
        this.f22491e = t2.B();
        this.f22488b = null;
        return t2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22489c.F();
    }
}
