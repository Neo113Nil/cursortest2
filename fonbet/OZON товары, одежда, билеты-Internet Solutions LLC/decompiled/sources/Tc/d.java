package Tc;

import E0.C2942q;
import gd.InterfaceC6712a;
import gd.InterfaceC6715d;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC7696c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\f\r\u000e\u000f\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"LTc/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "n", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<K, V> implements Map<K, V>, Serializable, InterfaceC6715d {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final d f27011o;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private K[] f27012a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f27013b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private int[] f27014c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private int[] f27015d;

    /* renamed from: e, reason: collision with root package name */
    private int f27016e;

    /* renamed from: f, reason: collision with root package name */
    private int f27017f;

    /* renamed from: g, reason: collision with root package name */
    private int f27018g;

    /* renamed from: h, reason: collision with root package name */
    private int f27019h;

    /* renamed from: i, reason: collision with root package name */
    private int f27020i;

    /* renamed from: j, reason: collision with root package name */
    private Tc.f<K> f27021j;

    /* renamed from: k, reason: collision with root package name */
    private g<V> f27022k;

    /* renamed from: l, reason: collision with root package name */
    private Tc.e<K, V> f27023l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27024m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"LTc/d$a;", "", "", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tc.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b<K, V> extends C0541d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC6712a {
        @Override // java.util.Iterator
        public final Object next() {
            b();
            if (c() >= ((d) h()).f27017f) {
                throw new NoSuchElementException();
            }
            int c11 = c();
            k(c11 + 1);
            l(c11);
            c cVar = new c(h(), e());
            i();
            return cVar;
        }
    }

    public static final class c<K, V> implements Map.Entry<K, V>, InterfaceC6715d.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d<K, V> f27025a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27026b;

        public c(@NotNull d<K, V> map, int i11) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f27025a = map;
            this.f27026b = i11;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.d(entry.getKey(), getKey()) && Intrinsics.d(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return (K) ((d) this.f27025a).f27012a[this.f27026b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            Object[] objArr = ((d) this.f27025a).f27013b;
            Intrinsics.f(objArr);
            return (V) objArr[this.f27026b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            d<K, V> dVar = this.f27025a;
            dVar.v();
            Object[] b11 = d.b(dVar);
            int i11 = this.f27026b;
            V v12 = (V) b11[i11];
            b11[i11] = v11;
            return v12;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: Tc.d$d, reason: collision with other inner class name */
    public static class C0541d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d<K, V> f27027a;

        /* renamed from: b, reason: collision with root package name */
        private int f27028b;

        /* renamed from: c, reason: collision with root package name */
        private int f27029c;

        /* renamed from: d, reason: collision with root package name */
        private int f27030d;

        public C0541d(@NotNull d<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f27027a = map;
            this.f27029c = -1;
            this.f27030d = ((d) map).f27019h;
            i();
        }

        public final void b() {
            if (((d) this.f27027a).f27019h != this.f27030d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f27028b;
        }

        public final int e() {
            return this.f27029c;
        }

        @NotNull
        public final d<K, V> h() {
            return this.f27027a;
        }

        public final boolean hasNext() {
            return this.f27028b < ((d) this.f27027a).f27017f;
        }

        public final void i() {
            while (true) {
                int i11 = this.f27028b;
                d<K, V> dVar = this.f27027a;
                if (i11 >= ((d) dVar).f27017f) {
                    return;
                }
                int[] iArr = ((d) dVar).f27014c;
                int i12 = this.f27028b;
                if (iArr[i12] >= 0) {
                    return;
                } else {
                    this.f27028b = i12 + 1;
                }
            }
        }

        public final void k(int i11) {
            this.f27028b = i11;
        }

        public final void l(int i11) {
            this.f27029c = i11;
        }

        public final void remove() {
            b();
            if (this.f27029c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            d<K, V> dVar = this.f27027a;
            dVar.v();
            dVar.J(this.f27029c);
            this.f27029c = -1;
            this.f27030d = ((d) dVar).f27019h;
        }
    }

    public static final class e<K, V> extends C0541d<K, V> implements Iterator<K>, InterfaceC6712a {
        @Override // java.util.Iterator
        public final K next() {
            b();
            if (c() >= ((d) h()).f27017f) {
                throw new NoSuchElementException();
            }
            int c11 = c();
            k(c11 + 1);
            l(c11);
            K k11 = (K) ((d) h()).f27012a[e()];
            i();
            return k11;
        }
    }

    /* loaded from: classes10.dex */
    public static final class f<K, V> extends C0541d<K, V> implements Iterator<V>, InterfaceC6712a {
        @Override // java.util.Iterator
        public final V next() {
            b();
            if (c() >= ((d) h()).f27017f) {
                throw new NoSuchElementException();
            }
            int c11 = c();
            k(c11 + 1);
            l(c11);
            Object[] objArr = ((d) h()).f27013b;
            Intrinsics.f(objArr);
            V v11 = (V) objArr[e()];
            i();
            return v11;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f27024m = true;
        f27011o = dVar;
    }

    public d() {
        this(8);
    }

    private final void C(int i11) {
        V[] vArr;
        K[] kArr = this.f27012a;
        int length = kArr.length;
        int i12 = this.f27017f;
        int i13 = length - i12;
        int i14 = i12 - this.f27020i;
        if (i13 < i11 && i13 + i14 >= i11 && i14 >= kArr.length / 4) {
            y(true);
            return;
        }
        int i15 = i12 + i11;
        if (i15 < 0) {
            throw new OutOfMemoryError();
        }
        if (i15 > kArr.length) {
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int length2 = kArr.length;
            companion.getClass();
            int d11 = AbstractC7696c.Companion.d(length2, i15);
            K[] kArr2 = this.f27012a;
            Intrinsics.checkNotNullParameter(kArr2, "<this>");
            K[] kArr3 = (K[]) Arrays.copyOf(kArr2, d11);
            Intrinsics.checkNotNullExpressionValue(kArr3, "copyOf(...)");
            this.f27012a = kArr3;
            V[] vArr2 = this.f27013b;
            if (vArr2 != null) {
                Intrinsics.checkNotNullParameter(vArr2, "<this>");
                vArr = (V[]) Arrays.copyOf(vArr2, d11);
                Intrinsics.checkNotNullExpressionValue(vArr, "copyOf(...)");
            } else {
                vArr = null;
            }
            this.f27013b = vArr;
            int[] copyOf = Arrays.copyOf(this.f27014c, d11);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f27014c = copyOf;
            INSTANCE.getClass();
            int highestOneBit = Integer.highestOneBit((d11 >= 1 ? d11 : 1) * 3);
            if (highestOneBit > this.f27015d.length) {
                H(highestOneBit);
            }
        }
    }

    private final int D(K k11) {
        int F11 = F(k11);
        int i11 = this.f27016e;
        while (true) {
            int i12 = this.f27015d[F11];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (Intrinsics.d(this.f27012a[i13], k11)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            F11 = F11 == 0 ? this.f27015d.length - 1 : F11 - 1;
        }
    }

    private final int E(V v11) {
        int i11 = this.f27017f;
        while (true) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
            if (this.f27014c[i11] >= 0) {
                V[] vArr = this.f27013b;
                Intrinsics.f(vArr);
                if (Intrinsics.d(vArr[i11], v11)) {
                    return i11;
                }
            }
        }
    }

    private final int F(K k11) {
        return ((k11 != null ? k11.hashCode() : 0) * (-1640531527)) >>> this.f27018g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f27014c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void H(int i11) {
        this.f27019h++;
        int i12 = 0;
        if (this.f27017f > this.f27020i) {
            y(false);
        }
        this.f27015d = new int[i11];
        INSTANCE.getClass();
        this.f27018g = Integer.numberOfLeadingZeros(i11) + 1;
        while (i12 < this.f27017f) {
            int i13 = i12 + 1;
            int F11 = F(this.f27012a[i12]);
            int i14 = this.f27016e;
            while (true) {
                int[] iArr = this.f27015d;
                if (iArr[F11] == 0) {
                    break;
                }
                i14--;
                if (i14 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                F11 = F11 == 0 ? iArr.length - 1 : F11 - 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0027->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i11) {
        K[] kArr = this.f27012a;
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        kArr[i11] = null;
        V[] vArr = this.f27013b;
        if (vArr != null) {
            Intrinsics.checkNotNullParameter(vArr, "<this>");
            vArr[i11] = null;
        }
        int i12 = this.f27014c[i11];
        int i13 = this.f27016e * 2;
        int length = this.f27015d.length / 2;
        if (i13 > length) {
            i13 = length;
        }
        int i14 = i13;
        int i15 = 0;
        int i16 = i12;
        while (true) {
            i12 = i12 == 0 ? this.f27015d.length - 1 : i12 - 1;
            i15++;
            if (i15 > this.f27016e) {
                this.f27015d[i16] = 0;
                break;
            }
            int[] iArr = this.f27015d;
            int i17 = iArr[i12];
            if (i17 == 0) {
                iArr[i16] = 0;
                break;
            }
            if (i17 < 0) {
                iArr[i16] = -1;
            } else {
                int i18 = i17 - 1;
                int F11 = F(this.f27012a[i18]) - i12;
                int[] iArr2 = this.f27015d;
                if ((F11 & (iArr2.length - 1)) >= i15) {
                    iArr2[i16] = i17;
                    this.f27014c[i18] = i16;
                }
                i14--;
                if (i14 >= 0) {
                    this.f27015d[i16] = -1;
                    break;
                }
            }
            i16 = i12;
            i15 = 0;
            i14--;
            if (i14 >= 0) {
            }
        }
        this.f27014c[i11] = -1;
        this.f27020i--;
        this.f27019h++;
    }

    public static final Object[] b(d dVar) {
        V[] vArr = dVar.f27013b;
        if (vArr != null) {
            return vArr;
        }
        int length = dVar.f27012a.length;
        if (length < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        V[] vArr2 = (V[]) new Object[length];
        dVar.f27013b = vArr2;
        return vArr2;
    }

    private final Object writeReplace() {
        if (this.f27024m) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void y(boolean z11) {
        int i11;
        V[] vArr = this.f27013b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = this.f27017f;
            if (i12 >= i11) {
                break;
            }
            int[] iArr = this.f27014c;
            int i14 = iArr[i12];
            if (i14 >= 0) {
                K[] kArr = this.f27012a;
                kArr[i13] = kArr[i12];
                if (vArr != null) {
                    vArr[i13] = vArr[i12];
                }
                if (z11) {
                    iArr[i13] = i14;
                    this.f27015d[i14] = i13 + 1;
                }
                i13++;
            }
            i12++;
        }
        Tc.c.c(i13, i11, this.f27012a);
        if (vArr != null) {
            Tc.c.c(i13, this.f27017f, vArr);
        }
        this.f27017f = i13;
    }

    public final boolean A(@NotNull Collection<?> m11) {
        Intrinsics.checkNotNullParameter(m11, "m");
        for (Object obj : m11) {
            if (obj != null) {
                try {
                    if (!B((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean B(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int D11 = D(entry.getKey());
        if (D11 < 0) {
            return false;
        }
        V[] vArr = this.f27013b;
        Intrinsics.f(vArr);
        return Intrinsics.d(vArr[D11], entry.getValue());
    }

    /* renamed from: G, reason: from getter */
    public final boolean getF27024m() {
        return this.f27024m;
    }

    public final boolean I(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        v();
        int D11 = D(entry.getKey());
        if (D11 < 0) {
            return false;
        }
        V[] vArr = this.f27013b;
        Intrinsics.f(vArr);
        if (!Intrinsics.d(vArr[D11], entry.getValue())) {
            return false;
        }
        J(D11);
        return true;
    }

    public final boolean K(K k11) {
        v();
        int D11 = D(k11);
        if (D11 < 0) {
            return false;
        }
        J(D11);
        return true;
    }

    public final boolean L(V v11) {
        v();
        int E11 = E(v11);
        if (E11 < 0) {
            return false;
        }
        J(E11);
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        v();
        int i11 = this.f27017f - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                int[] iArr = this.f27014c;
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    this.f27015d[i13] = 0;
                    iArr[i12] = -1;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        Tc.c.c(0, this.f27017f, this.f27012a);
        V[] vArr = this.f27013b;
        if (vArr != null) {
            Tc.c.c(0, this.f27017f, vArr);
        }
        this.f27020i = 0;
        this.f27017f = 0;
        this.f27019h++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return D(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return E(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Tc.e<K, V> eVar = this.f27023l;
        if (eVar != null) {
            return eVar;
        }
        Tc.e<K, V> eVar2 = new Tc.e<>(this);
        this.f27023l = eVar2;
        return eVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f27020i == map.size() && A(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int D11 = D(obj);
        if (D11 < 0) {
            return null;
        }
        V[] vArr = this.f27013b;
        Intrinsics.f(vArr);
        return vArr[D11];
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        b bVar = new b(this);
        int i11 = 0;
        while (bVar.hasNext()) {
            if (bVar.c() >= bVar.h().f27017f) {
                throw new NoSuchElementException();
            }
            int c11 = bVar.c();
            bVar.k(c11 + 1);
            bVar.l(c11);
            K k11 = bVar.h().f27012a[bVar.e()];
            int hashCode = k11 != null ? k11.hashCode() : 0;
            V[] vArr = bVar.h().f27013b;
            Intrinsics.f(vArr);
            V v11 = vArr[bVar.e()];
            int hashCode2 = v11 != null ? v11.hashCode() : 0;
            bVar.i();
            i11 += hashCode ^ hashCode2;
        }
        return i11;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f27020i == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        Tc.f<K> fVar = this.f27021j;
        if (fVar != null) {
            return fVar;
        }
        Tc.f<K> fVar2 = new Tc.f<>(this);
        this.f27021j = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final V put(K k11, V v11) {
        v();
        int s11 = s(k11);
        V[] vArr = this.f27013b;
        if (vArr == null) {
            int length = this.f27012a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            vArr = (V[]) new Object[length];
            this.f27013b = vArr;
        }
        if (s11 >= 0) {
            vArr[s11] = v11;
            return null;
        }
        int i11 = (-s11) - 1;
        V v12 = vArr[i11];
        vArr[i11] = v11;
        return v12;
    }

    @Override // java.util.Map
    public final void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        v();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        C(entrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
            int s11 = s(entry.getKey());
            V[] vArr = this.f27013b;
            if (vArr == null) {
                int length = this.f27012a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                this.f27013b = vArr;
            }
            if (s11 >= 0) {
                vArr[s11] = entry.getValue();
            } else {
                int i11 = (-s11) - 1;
                if (!Intrinsics.d(entry.getValue(), vArr[i11])) {
                    vArr[i11] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        v();
        int D11 = D(obj);
        if (D11 < 0) {
            return null;
        }
        V[] vArr = this.f27013b;
        Intrinsics.f(vArr);
        V v11 = vArr[D11];
        J(D11);
        return v11;
    }

    public final int s(K k11) {
        v();
        while (true) {
            int F11 = F(k11);
            int i11 = this.f27016e * 2;
            int length = this.f27015d.length / 2;
            if (i11 > length) {
                i11 = length;
            }
            int i12 = 0;
            while (true) {
                int[] iArr = this.f27015d;
                int i13 = iArr[F11];
                if (i13 <= 0) {
                    int i14 = this.f27017f;
                    K[] kArr = this.f27012a;
                    if (i14 < kArr.length) {
                        int i15 = i14 + 1;
                        this.f27017f = i15;
                        kArr[i14] = k11;
                        this.f27014c[i14] = F11;
                        iArr[F11] = i15;
                        this.f27020i++;
                        this.f27019h++;
                        if (i12 > this.f27016e) {
                            this.f27016e = i12;
                        }
                        return i14;
                    }
                    C(1);
                } else {
                    if (Intrinsics.d(this.f27012a[i13 - 1], k11)) {
                        return -i13;
                    }
                    i12++;
                    if (i12 > i11) {
                        H(this.f27015d.length * 2);
                        break;
                    }
                    F11 = F11 == 0 ? this.f27015d.length - 1 : F11 - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f27020i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f27020i * 3) + 2);
        sb2.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        b bVar = new b(this);
        int i11 = 0;
        while (bVar.hasNext()) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (bVar.c() >= bVar.h().f27017f) {
                throw new NoSuchElementException();
            }
            int c11 = bVar.c();
            bVar.k(c11 + 1);
            bVar.l(c11);
            K k11 = bVar.h().f27012a[bVar.e()];
            if (k11 == bVar.h()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(k11);
            }
            sb2.append('=');
            V[] vArr = bVar.h().f27013b;
            Intrinsics.f(vArr);
            V v11 = vArr[bVar.e()];
            if (v11 == bVar.h()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(v11);
            }
            bVar.i();
            i11++;
        }
        return C2942q.c(sb2, "}", "toString(...)");
    }

    @NotNull
    public final d u() {
        v();
        this.f27024m = true;
        if (this.f27020i > 0) {
            return this;
        }
        d dVar = f27011o;
        Intrinsics.g(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void v() {
        if (this.f27024m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        g<V> gVar = this.f27022k;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.f27022k = gVar2;
        return gVar2;
    }

    public d(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i11];
        int[] iArr = new int[i11];
        INSTANCE.getClass();
        int highestOneBit = Integer.highestOneBit((i11 < 1 ? 1 : i11) * 3);
        this.f27012a = kArr;
        this.f27013b = null;
        this.f27014c = iArr;
        this.f27015d = new int[highestOneBit];
        this.f27016e = 2;
        this.f27017f = 0;
        this.f27018g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
