package E3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f1987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1988e;

    public C() {
        this.f1984a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        p113p3.f.r(this.f1984a != 4);
        int iE = p136t.e.e(this.f1984a);
        if (iE == 0) {
            return true;
        }
        if (iE == 2) {
            return false;
        }
        this.f1984a = 4;
        switch (this.f1986c) {
            case 0:
                do {
                    Iterator it = this.f1987d;
                    if (!it.hasNext()) {
                        this.f1984a = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((D3.l) this.f1988e).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f1987d;
                    if (!it2.hasNext()) {
                        this.f1984a = 3;
                        next = null;
                    } else {
                        next = it2.next();
                    }
                    break;
                } while (!((V) this.f1988e).f2029b.contains(next));
                break;
        }
        this.f1985b = next;
        if (this.f1984a == 3) {
            return false;
        }
        this.f1984a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1984a = 2;
        Object obj = this.f1985b;
        this.f1985b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(Iterator it, D3.l lVar) {
        this();
        this.f1986c = 0;
        this.f1987d = it;
        this.f1988e = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(V v6) {
        this();
        this.f1986c = 1;
        this.f1988e = v6;
        this.f1987d = v6.f2028a.iterator();
    }
}
