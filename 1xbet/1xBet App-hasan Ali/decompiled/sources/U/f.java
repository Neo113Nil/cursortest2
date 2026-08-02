package U;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.z;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: n, reason: collision with root package name */
    public final e f5821n;

    /* renamed from: o, reason: collision with root package name */
    public Object f5822o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5823p;

    /* renamed from: q, reason: collision with root package name */
    public int f5824q;

    public f(e eVar, o[] oVarArr) {
        super(eVar.f5817l, oVarArr);
        this.f5821n = eVar;
        this.f5824q = eVar.f5819n;
    }

    public final void c(int i, n nVar, Object obj, int i5) {
        int i6 = i5 * 5;
        o[] oVarArr = this.f5813k;
        if (i6 <= 30) {
            int B5 = 1 << G4.d.B(i, i6);
            if (nVar.h(B5)) {
                oVarArr[i5].a(nVar.f5838d, Integer.bitCount(nVar.f5835a) * 2, nVar.f(B5));
                this.f5814l = i5;
                return;
            } else {
                int t5 = nVar.t(B5);
                n s2 = nVar.s(t5);
                oVarArr[i5].a(nVar.f5838d, Integer.bitCount(nVar.f5835a) * 2, t5);
                c(i, s2, obj, i5 + 1);
                return;
            }
        }
        o oVar = oVarArr[i5];
        Object[] objArr = nVar.f5838d;
        oVar.a(objArr, objArr.length, 0);
        while (true) {
            o oVar2 = oVarArr[i5];
            if (kotlin.jvm.internal.l.a(oVar2.f5839k[oVar2.f5841m], obj)) {
                this.f5814l = i5;
                return;
            } else {
                oVarArr[i5].f5841m += 2;
            }
        }
    }

    @Override // U.d, java.util.Iterator
    public final Object next() {
        if (this.f5821n.f5819n != this.f5824q) {
            throw new ConcurrentModificationException();
        }
        if (!this.f5815m) {
            throw new NoSuchElementException();
        }
        o oVar = this.f5813k[this.f5814l];
        this.f5822o = oVar.f5839k[oVar.f5841m];
        this.f5823p = true;
        return super.next();
    }

    @Override // U.d, java.util.Iterator
    public final void remove() {
        if (!this.f5823p) {
            throw new IllegalStateException();
        }
        boolean z3 = this.f5815m;
        e eVar = this.f5821n;
        if (!z3) {
            z.a(eVar).remove(this.f5822o);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            o oVar = this.f5813k[this.f5814l];
            Object obj = oVar.f5839k[oVar.f5841m];
            z.a(eVar).remove(this.f5822o);
            c(obj != null ? obj.hashCode() : 0, eVar.f5817l, obj, 0);
        }
        this.f5822o = null;
        this.f5823p = false;
        this.f5824q = eVar.f5819n;
    }
}
