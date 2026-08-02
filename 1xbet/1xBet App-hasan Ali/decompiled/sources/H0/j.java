package H0;

import A0.Z;
import java.util.Iterator;
import r.C2321G;
import r.C2330h;
import r.C2340s;
import r.O;

/* loaded from: classes.dex */
public final class j implements Iterable, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final C2321G f2103k;

    /* renamed from: l, reason: collision with root package name */
    public C2340s f2104l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2105m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2106n;

    public j() {
        long[] jArr = O.f18957a;
        this.f2103k = new C2321G();
    }

    public final j c() {
        j jVar = new j();
        jVar.f2105m = this.f2105m;
        jVar.f2106n = this.f2106n;
        C2321G c2321g = jVar.f2103k;
        c2321g.getClass();
        C2321G c2321g2 = this.f2103k;
        kotlin.jvm.internal.l.f("from", c2321g2);
        Object[] objArr = c2321g2.f18929b;
        Object[] objArr2 = c2321g2.f18930c;
        long[] jArr = c2321g2.f18928a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128) {
                            int i7 = (i << 3) + i6;
                            c2321g.m(objArr[i7], objArr2[i7]);
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jVar;
    }

    public final Object d(v vVar) {
        Object g5 = this.f2103k.g(vVar);
        if (g5 != null) {
            return g5;
        }
        throw new IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    public final void e(j jVar) {
        C2321G c2321g = jVar.f2103k;
        Object[] objArr = c2321g.f18929b;
        Object[] objArr2 = c2321g.f18930c;
        long[] jArr = c2321g.f18928a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j5) < 128) {
                        int i7 = (i << 3) + i6;
                        Object obj = objArr[i7];
                        Object obj2 = objArr2[i7];
                        v vVar = (v) obj;
                        C2321G c2321g2 = this.f2103k;
                        Object g5 = c2321g2.g(vVar);
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>", vVar);
                        Object invoke = vVar.f2185b.invoke(g5, obj2);
                        if (invoke != null) {
                            c2321g2.m(vVar, invoke);
                        }
                    }
                    j5 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.l.a(this.f2103k, jVar.f2103k) && this.f2105m == jVar.f2105m && this.f2106n == jVar.f2106n;
    }

    public final void f(v vVar, Object obj) {
        boolean z3 = obj instanceof a;
        C2321G c2321g = this.f2103k;
        if (z3 && c2321g.c(vVar)) {
            Object g5 = c2321g.g(vVar);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", g5);
            a aVar = (a) g5;
            a aVar2 = (a) obj;
            String str = aVar2.f2062a;
            if (str == null) {
                str = aVar.f2062a;
            }
            W3.c cVar = aVar2.f2063b;
            if (cVar == null) {
                cVar = aVar.f2063b;
            }
            c2321g.m(vVar, new a(str, cVar));
        } else {
            c2321g.m(vVar, obj);
        }
        vVar.getClass();
    }

    public final int hashCode() {
        return (((this.f2103k.hashCode() * 31) + (this.f2105m ? 1231 : 1237)) * 31) + (this.f2106n ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2340s c2340s = this.f2104l;
        if (c2340s == null) {
            C2321G c2321g = this.f2103k;
            c2321g.getClass();
            C2340s c2340s2 = new C2340s(c2321g);
            this.f2104l = c2340s2;
            c2340s = c2340s2;
        }
        return ((C2330h) c2340s.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f2105m) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f2106n) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        C2321G c2321g = this.f2103k;
        Object[] objArr = c2321g.f18929b;
        Object[] objArr2 = c2321g.f18930c;
        long[] jArr = c2321g.f18928a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128) {
                            int i7 = (i << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            sb.append(str);
                            sb.append(((v) obj).f2184a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Z.D(this) + "{ " + ((Object) sb) + " }";
    }
}
