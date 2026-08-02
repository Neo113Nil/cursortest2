package R;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import r.C2316B;
import r.C2321G;
import r.L;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C2321G f5099a;

    public static final Object a(C2321G c2321g) {
        Object g5 = c2321g.g(null);
        if (g5 == null) {
            return null;
        }
        if (!(g5 instanceof C2316B)) {
            c2321g.k(null);
            return g5;
        }
        C2316B c2316b = (C2316B) g5;
        if (c2316b.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = c2316b.f18905b - 1;
        Object e3 = c2316b.e(i);
        c2316b.j(i);
        l.d("null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap", e3);
        if (c2316b.g()) {
            c2321g.k(null);
        }
        if (c2316b.f18905b == 1) {
            c2321g.m(null, c2316b.d());
        }
        return e3;
    }

    public static final C2316B b(C2321G c2321g) {
        if (c2321g.i()) {
            C2316B c2316b = L.f18954b;
            l.d("null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>", c2316b);
            return c2316b;
        }
        C2316B c2316b2 = new C2316B();
        Object[] objArr = c2321g.f18930c;
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
                            Object obj = objArr[(i << 3) + i6];
                            if (obj instanceof C2316B) {
                                l.d("null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>", obj);
                                C2316B c2316b3 = (C2316B) obj;
                                l.f("elements", c2316b3);
                                if (!c2316b3.g()) {
                                    int i7 = c2316b2.f18905b + c2316b3.f18905b;
                                    Object[] objArr2 = c2316b2.f18904a;
                                    if (objArr2.length < i7) {
                                        c2316b2.l(i7, objArr2);
                                    }
                                    X3.l.t0(c2316b2.f18905b, 0, c2316b3.f18905b, c2316b3.f18904a, c2316b2.f18904a);
                                    c2316b2.f18905b += c2316b3.f18905b;
                                }
                            } else {
                                l.d("null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap", obj);
                                c2316b2.a(obj);
                            }
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
        return c2316b2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.a(this.f5099a, ((a) obj).f5099a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5099a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f5099a + ')';
    }
}
