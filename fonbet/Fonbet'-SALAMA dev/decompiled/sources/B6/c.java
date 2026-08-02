package B6;

import a.AbstractC0603a;
import f6.C1116i;
import i6.C1293j;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k6.AbstractC1361h;
import t6.h;

/* loaded from: classes2.dex */
public final class c implements Iterator, InterfaceC1287d, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public int f1203a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1204b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1287d f1205c;

    public final RuntimeException a() {
        int i7 = this.f1203a;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f1203a);
    }

    public final void c(Object obj, AbstractC1361h abstractC1361h) {
        this.f1204b = obj;
        this.f1203a = 3;
        this.f1205c = abstractC1361h;
        j6.a aVar = j6.a.f14642a;
    }

    @Override // i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        return C1293j.f14068a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        while (true) {
            i7 = this.f1203a;
            if (i7 != 0) {
                break;
            }
            this.f1203a = 5;
            InterfaceC1287d interfaceC1287d = this.f1205c;
            h.b(interfaceC1287d);
            this.f1205c = null;
            interfaceC1287d.resumeWith(C1116i.f13008a);
        }
        if (i7 == 1) {
            h.b(null);
            throw null;
        }
        if (i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f1203a;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.f1203a = 1;
            h.b(null);
            throw null;
        }
        if (i7 != 3) {
            throw a();
        }
        this.f1203a = 0;
        Object obj = this.f1204b;
        this.f1204b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // i6.InterfaceC1287d
    public final void resumeWith(Object obj) {
        AbstractC0603a.p0(obj);
        this.f1203a = 4;
    }
}
