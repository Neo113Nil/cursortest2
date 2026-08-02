package n4;

import W3.o;
import c4.AbstractC0547h;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator, a4.c, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public int f18485k;

    /* renamed from: l, reason: collision with root package name */
    public Object f18486l;

    /* renamed from: m, reason: collision with root package name */
    public a4.c f18487m;

    public final RuntimeException b() {
        int i = this.f18485k;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f18485k);
    }

    public final void c(Object obj, AbstractC0547h abstractC0547h) {
        this.f18486l = obj;
        this.f18485k = 3;
        this.f18487m = abstractC0547h;
    }

    @Override // a4.c
    public final a4.h getContext() {
        return a4.i.f6649k;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f18485k;
            if (i != 0) {
                break;
            }
            this.f18485k = 5;
            a4.c cVar = this.f18487m;
            kotlin.jvm.internal.l.c(cVar);
            this.f18487m = null;
            cVar.resumeWith(o.f6046a);
        }
        if (i == 1) {
            kotlin.jvm.internal.l.c(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f18485k;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f18485k = 1;
            kotlin.jvm.internal.l.c(null);
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.f18485k = 0;
        Object obj = this.f18486l;
        this.f18486l = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // a4.c
    public final void resumeWith(Object obj) {
        G4.l.N(obj);
        this.f18485k = 4;
    }
}
