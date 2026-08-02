package o4;

import K0.C0196a;
import a.AbstractC0444a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l4.C2062d;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2224b implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public int f18656k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f18657l;

    /* renamed from: m, reason: collision with root package name */
    public int f18658m;

    /* renamed from: n, reason: collision with root package name */
    public C2062d f18659n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n4.f f18660o;

    public C2224b(n4.f fVar) {
        this.f18660o = fVar;
        fVar.getClass();
        int t5 = AbstractC0444a.t(0, 0, ((String) fVar.f18483b).length());
        this.f18657l = t5;
        this.f18658m = t5;
    }

    public final void a() {
        int i = this.f18658m;
        if (i < 0) {
            this.f18656k = 0;
            this.f18659n = null;
            return;
        }
        n4.f fVar = this.f18660o;
        fVar.getClass();
        String str = (String) fVar.f18483b;
        if (i > str.length()) {
            this.f18659n = new C2062d(this.f18657l, AbstractC2227e.D0(str), 1);
            this.f18658m = -1;
        } else {
            W3.h hVar = (W3.h) ((C0196a) fVar.f18484c).invoke(str, Integer.valueOf(this.f18658m));
            if (hVar == null) {
                this.f18659n = new C2062d(this.f18657l, AbstractC2227e.D0(str), 1);
                this.f18658m = -1;
            } else {
                int intValue = ((Number) hVar.f6036k).intValue();
                int intValue2 = ((Number) hVar.f6037l).intValue();
                this.f18659n = AbstractC0444a.f0(this.f18657l, intValue);
                int i5 = intValue + intValue2;
                this.f18657l = i5;
                this.f18658m = i5 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f18656k = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f18656k == -1) {
            a();
        }
        return this.f18656k == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18656k == -1) {
            a();
        }
        if (this.f18656k == 0) {
            throw new NoSuchElementException();
        }
        C2062d c2062d = this.f18659n;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.ranges.IntRange", c2062d);
        this.f18659n = null;
        this.f18656k = -1;
        return c2062d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
