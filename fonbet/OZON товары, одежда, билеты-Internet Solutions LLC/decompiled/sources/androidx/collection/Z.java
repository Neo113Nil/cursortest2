package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k0.C7445a;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class Z<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f38669a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Object[] f38670b;

    /* renamed from: c, reason: collision with root package name */
    private int f38671c;

    public Z() {
        this(0);
    }

    private final int e(int i11, Object obj) {
        int i12 = this.f38671c;
        if (i12 == 0) {
            return -1;
        }
        int a11 = C7445a.a(i12, i11, this.f38669a);
        if (a11 < 0 || Intrinsics.d(obj, this.f38670b[a11 << 1])) {
            return a11;
        }
        int i13 = a11 + 1;
        while (i13 < i12 && this.f38669a[i13] == i11) {
            if (Intrinsics.d(obj, this.f38670b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = a11 - 1; i14 >= 0 && this.f38669a[i14] == i11; i14--) {
            if (Intrinsics.d(obj, this.f38670b[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    private final int i() {
        int i11 = this.f38671c;
        if (i11 == 0) {
            return -1;
        }
        int a11 = C7445a.a(i11, 0, this.f38669a);
        if (a11 < 0 || this.f38670b[a11 << 1] == null) {
            return a11;
        }
        int i12 = a11 + 1;
        while (i12 < i11 && this.f38669a[i12] == 0) {
            if (this.f38670b[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a11 - 1; i13 >= 0 && this.f38669a[i13] == 0; i13--) {
            if (this.f38670b[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int b(V v11) {
        int i11 = this.f38671c * 2;
        Object[] objArr = this.f38670b;
        if (v11 == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (v11.equals(objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public final void c(int i11) {
        int i12 = this.f38671c;
        int[] iArr = this.f38669a;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f38669a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f38670b, i11 * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f38670b = copyOf2;
        }
        if (this.f38671c != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f38671c > 0) {
            this.f38669a = C7445a.f70244a;
            this.f38670b = C7445a.f70246c;
            this.f38671c = 0;
        }
        if (this.f38671c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k11) {
        return h(k11) >= 0;
    }

    public boolean containsValue(V v11) {
        return b(v11) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof Z) {
                int i11 = this.f38671c;
                if (i11 != ((Z) obj).f38671c) {
                    return false;
                }
                Z z11 = (Z) obj;
                for (int i12 = 0; i12 < i11; i12++) {
                    K j11 = j(i12);
                    V n11 = n(i12);
                    Object obj2 = z11.get(j11);
                    if (n11 == null) {
                        if (obj2 != null || !z11.containsKey(j11)) {
                            return false;
                        }
                    } else if (!n11.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f38671c != ((Map) obj).size()) {
                return false;
            }
            int i13 = this.f38671c;
            for (int i14 = 0; i14 < i13; i14++) {
                K j12 = j(i14);
                V n12 = n(i14);
                Object obj3 = ((Map) obj).get(j12);
                if (n12 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(j12)) {
                        return false;
                    }
                } else if (!n12.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k11) {
        int h11 = h(k11);
        if (h11 >= 0) {
            return (V) this.f38670b[(h11 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v11) {
        int h11 = h(obj);
        return h11 >= 0 ? (V) this.f38670b[(h11 << 1) + 1] : v11;
    }

    public final int h(K k11) {
        return k11 == null ? i() : e(k11.hashCode(), k11);
    }

    public int hashCode() {
        int[] iArr = this.f38669a;
        Object[] objArr = this.f38670b;
        int i11 = this.f38671c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            i14 += (obj != null ? obj.hashCode() : 0) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public final boolean isEmpty() {
        return this.f38671c <= 0;
    }

    public final K j(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f38671c) {
            z11 = true;
        }
        if (z11) {
            return (K) this.f38670b[i11 << 1];
        }
        k0.d.a("Expected index to be within 0..size()-1, but was " + i11);
        throw null;
    }

    public void k(@NotNull C5132a map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i11 = map.f38671c;
        c(this.f38671c + i11);
        if (this.f38671c != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                put(map.j(i12), map.n(i12));
            }
        } else if (i11 > 0) {
            C7705l.p(0, 0, map.f38669a, this.f38669a, i11);
            C7705l.r(map.f38670b, 0, this.f38670b, 0, i11 << 1);
            this.f38671c = i11;
        }
    }

    public V l(int i11) {
        if (!(i11 >= 0 && i11 < this.f38671c)) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i11);
            throw null;
        }
        Object[] objArr = this.f38670b;
        int i12 = i11 << 1;
        V v11 = (V) objArr[i12 + 1];
        int i13 = this.f38671c;
        if (i13 <= 1) {
            clear();
            return v11;
        }
        int i14 = i13 - 1;
        int[] iArr = this.f38669a;
        if (iArr.length <= 8 || i13 >= iArr.length / 3) {
            if (i11 < i14) {
                int i15 = i11 + 1;
                C7705l.p(i11, i15, iArr, iArr, i13);
                Object[] objArr2 = this.f38670b;
                C7705l.r(objArr2, i12, objArr2, i15 << 1, i13 << 1);
            }
            Object[] objArr3 = this.f38670b;
            int i16 = i14 << 1;
            objArr3[i16] = null;
            objArr3[i16 + 1] = null;
        } else {
            int i17 = i13 > 8 ? i13 + (i13 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f38669a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f38670b, i17 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f38670b = copyOf2;
            if (i13 != this.f38671c) {
                throw new ConcurrentModificationException();
            }
            if (i11 > 0) {
                C7705l.p(0, 0, iArr, this.f38669a, i11);
                C7705l.r(objArr, 0, this.f38670b, 0, i12);
            }
            if (i11 < i14) {
                int i18 = i11 + 1;
                C7705l.p(i11, i18, iArr, this.f38669a, i13);
                C7705l.r(objArr, i12, this.f38670b, i18 << 1, i13 << 1);
            }
        }
        if (i13 != this.f38671c) {
            throw new ConcurrentModificationException();
        }
        this.f38671c = i14;
        return v11;
    }

    public V m(int i11, V v11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f38671c) {
            z11 = true;
        }
        if (!z11) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i11);
            throw null;
        }
        int i12 = (i11 << 1) + 1;
        Object[] objArr = this.f38670b;
        V v12 = (V) objArr[i12];
        objArr[i12] = v11;
        return v12;
    }

    public final V n(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f38671c) {
            z11 = true;
        }
        if (z11) {
            return (V) this.f38670b[(i11 << 1) + 1];
        }
        k0.d.a("Expected index to be within 0..size()-1, but was " + i11);
        throw null;
    }

    public V put(K k11, V v11) {
        int i11 = this.f38671c;
        int hashCode = k11 != null ? k11.hashCode() : 0;
        int e11 = k11 != null ? e(hashCode, k11) : i();
        if (e11 >= 0) {
            int i12 = (e11 << 1) + 1;
            Object[] objArr = this.f38670b;
            V v12 = (V) objArr[i12];
            objArr[i12] = v11;
            return v12;
        }
        int i13 = ~e11;
        int[] iArr = this.f38669a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i14);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f38669a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f38670b, i14 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f38670b = copyOf2;
            if (i11 != this.f38671c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.f38669a;
            int i15 = i13 + 1;
            C7705l.p(i15, i13, iArr2, iArr2, i11);
            Object[] objArr2 = this.f38670b;
            C7705l.r(objArr2, i15 << 1, objArr2, i13 << 1, this.f38671c << 1);
        }
        int i16 = this.f38671c;
        if (i11 == i16) {
            int[] iArr3 = this.f38669a;
            if (i13 < iArr3.length) {
                iArr3[i13] = hashCode;
                Object[] objArr3 = this.f38670b;
                int i17 = i13 << 1;
                objArr3[i17] = k11;
                objArr3[i17 + 1] = v11;
                this.f38671c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k11, V v11) {
        V v12 = get(k11);
        return v12 == null ? put(k11, v11) : v12;
    }

    public V remove(K k11) {
        int h11 = h(k11);
        if (h11 >= 0) {
            return l(h11);
        }
        return null;
    }

    public final V replace(K k11, V v11) {
        int h11 = h(k11);
        if (h11 >= 0) {
            return m(h11, v11);
        }
        return null;
    }

    public final int size() {
        return this.f38671c;
    }

    @NotNull
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f38671c * 28);
        sb2.append('{');
        int i11 = this.f38671c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            K j11 = j(i12);
            if (j11 != sb2) {
                sb2.append(j11);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V n11 = n(i12);
            if (n11 != sb2) {
                sb2.append(n11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public Z(int i11) {
        this.f38669a = i11 == 0 ? C7445a.f70244a : new int[i11];
        this.f38670b = i11 == 0 ? C7445a.f70246c : new Object[i11 << 1];
    }

    public final boolean remove(K k11, V v11) {
        int h11 = h(k11);
        if (h11 < 0 || !Intrinsics.d(v11, n(h11))) {
            return false;
        }
        l(h11);
        return true;
    }

    public final boolean replace(K k11, V v11, V v12) {
        int h11 = h(k11);
        if (h11 < 0 || !Intrinsics.d(v11, n(h11))) {
            return false;
        }
        m(h11, v12);
        return true;
    }
}
