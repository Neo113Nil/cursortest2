package V;

import i4.InterfaceC2015a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import n4.f;
import n4.h;
import r.C2319E;
import r.C2320F;
import r.I;
import r.J;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class c implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5921k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5922l;

    /* renamed from: m, reason: collision with root package name */
    public int f5923m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f5924n;

    public c(Object obj, Map map) {
        this.f5921k = 0;
        this.f5922l = obj;
        this.f5924n = map;
    }

    public void a() {
        Object c5;
        int i = this.f5923m;
        f fVar = (f) this.f5924n;
        if (i == -2) {
            c5 = ((InterfaceC2015a) fVar.f18483b).invoke();
        } else {
            i4.c cVar = (i4.c) fVar.f18484c;
            Object obj = this.f5922l;
            l.c(obj);
            c5 = cVar.c(obj);
        }
        this.f5922l = c5;
        this.f5923m = c5 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5921k) {
            case 0:
                if (this.f5923m < ((Map) this.f5924n).size()) {
                }
                break;
            case 1:
                if (this.f5923m < 0) {
                    a();
                }
                if (this.f5923m == 1) {
                }
                break;
        }
        return ((h) this.f5922l).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5921k) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f5922l;
                this.f5923m++;
                Object obj2 = ((Map) this.f5924n).get(obj);
                if (obj2 != null) {
                    this.f5922l = ((a) obj2).f5916b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                if (this.f5923m < 0) {
                    a();
                }
                if (this.f5923m == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f5922l;
                l.d("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj3);
                this.f5923m = -1;
                return obj3;
            case 2:
                return ((h) this.f5922l).next();
            default:
                return ((h) this.f5922l).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5921k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i = this.f5923m;
                if (i != -1) {
                    ((C2320F) this.f5924n).f18927l.h(i);
                    this.f5923m = -1;
                    return;
                }
                return;
            default:
                int i5 = this.f5923m;
                if (i5 != -1) {
                    ((J) this.f5924n).f18951l.l(i5);
                    this.f5923m = -1;
                    return;
                }
                return;
        }
    }

    public c(f fVar) {
        this.f5921k = 1;
        this.f5924n = fVar;
        this.f5923m = -2;
    }

    public c(J j5) {
        this.f5921k = 3;
        this.f5924n = j5;
        this.f5923m = -1;
        this.f5922l = AbstractC2346c.z(new I(j5, this, null));
    }

    public c(C2320F c2320f) {
        this.f5921k = 2;
        this.f5924n = c2320f;
        this.f5923m = -1;
        this.f5922l = AbstractC2346c.z(new C2319E(c2320f, this, null));
    }
}
