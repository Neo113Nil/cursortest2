package B6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p065i6.i;
import p065i6.j;
import p077k6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Iterator, p065i6.d, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p065i6.d f1205c;

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

    public final void c(Object obj, h hVar) {
        this.f1204b = obj;
        this.f1203a = 3;
        this.f1205c = hVar;
        j6.a aVar = j6.a.f14648a;
    }

    @Override // p065i6.d
    public final i getContext() {
        return j.f14074a;
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
            p065i6.d dVar = this.f1205c;
            t6.h.b(dVar);
            this.f1205c = null;
            dVar.resumeWith(p044f6.i.f13014a);
        }
        if (i7 == 1) {
            t6.h.b(null);
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
            t6.h.b(null);
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

    @Override // p065i6.d
    public final void resumeWith(Object obj) {
        p003a.a.p0(obj);
        this.f1203a = 4;
    }
}
