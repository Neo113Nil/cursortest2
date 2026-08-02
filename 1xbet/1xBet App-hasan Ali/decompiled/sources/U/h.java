package U;

import java.util.Iterator;
import java.util.Map;
import o0.AbstractC2194A;
import o0.y;

/* loaded from: classes.dex */
public final class h implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5827k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f5828l;

    public h(e eVar) {
        o[] oVarArr = new o[8];
        for (int i = 0; i < 8; i++) {
            oVarArr[i] = new q(this);
        }
        this.f5828l = new f(eVar, oVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5827k) {
            case 0:
                return ((f) this.f5828l).f5815m;
            default:
                return this.f5828l.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5827k) {
            case 0:
                return (Map.Entry) ((f) this.f5828l).next();
            default:
                return (AbstractC2194A) this.f5828l.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5827k) {
            case 0:
                ((f) this.f5828l).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(y yVar) {
        this.f5828l = yVar.f18602l.iterator();
    }
}
