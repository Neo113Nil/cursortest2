package H3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public o f2334k;

    /* renamed from: l, reason: collision with root package name */
    public o f2335l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2336m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f2337n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2338o;

    public m(p pVar, int i) {
        this.f2338o = i;
        this.f2337n = pVar;
        this.f2334k = pVar.f2356p.f2344n;
        this.f2336m = pVar.f2355o;
    }

    public final Object a() {
        return b();
    }

    public final o b() {
        o oVar = this.f2334k;
        p pVar = this.f2337n;
        if (oVar == pVar.f2356p) {
            throw new NoSuchElementException();
        }
        if (pVar.f2355o != this.f2336m) {
            throw new ConcurrentModificationException();
        }
        this.f2334k = oVar.f2344n;
        this.f2335l = oVar;
        return oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2334k != this.f2337n.f2356p;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f2338o) {
            case 1:
                return b().f2346p;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        o oVar = this.f2335l;
        if (oVar == null) {
            throw new IllegalStateException();
        }
        p pVar = this.f2337n;
        pVar.c(oVar, true);
        this.f2335l = null;
        this.f2336m = pVar.f2355o;
    }
}
