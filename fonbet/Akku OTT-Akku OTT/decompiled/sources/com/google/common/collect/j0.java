package com.google.common.collect;

import com.google.common.collect.I;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* loaded from: classes4.dex */
public final class j0<K, V> extends I<K, V> {
    public static final j0 i = new j0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public static class a<K, V> extends M<Map.Entry<K, V>> {
        public final transient I<K, V> d;
        public final transient Object[] e;
        public final transient int f;
        public final transient int i;

        /* renamed from: com.google.common.collect.j0$a$a, reason: collision with other inner class name */
        public class C0135a extends G<Map.Entry<K, V>> {
            public C0135a() {
            }

            @Override // com.google.common.collect.E
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                a aVar = a.this;
                com.google.common.base.k.e(i, aVar.i);
                Object[] objArr = aVar.e;
                int i2 = i * 2;
                int i3 = aVar.f;
                Object obj = objArr[i2 + i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i2 + (i3 ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.i;
            }

            @Override // com.google.common.collect.G, com.google.common.collect.E
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public a(I<K, V> i, Object[] objArr, int i2, int i3) {
            this.d = i;
            this.e = objArr;
            this.f = i2;
            this.i = i3;
        }

        @Override // com.google.common.collect.E
        public final int b(int i, Object[] objArr) {
            return a().b(i, objArr);
        }

        @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.E
        public final boolean f() {
            return true;
        }

        @Override // com.google.common.collect.M, com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: g */
        public final y0<Map.Entry<K, V>> iterator() {
            return a().listIterator(0);
        }

        @Override // com.google.common.collect.M
        public final G<Map.Entry<K, V>> l() {
            return new C0135a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.i;
        }

        @Override // com.google.common.collect.M, com.google.common.collect.E
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class b<K> extends M<K> {
        public final transient I<K, ?> d;
        public final transient c e;

        public b(I i, c cVar) {
            this.d = i;
            this.e = cVar;
        }

        @Override // com.google.common.collect.M, com.google.common.collect.E
        public final G<K> a() {
            return this.e;
        }

        @Override // com.google.common.collect.E
        public final int b(int i, Object[] objArr) {
            return this.e.b(i, objArr);
        }

        @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.d.get(obj) != null;
        }

        @Override // com.google.common.collect.E
        public final boolean f() {
            return true;
        }

        @Override // com.google.common.collect.M, com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: g */
        public final y0<K> iterator() {
            return this.e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.d.size();
        }

        @Override // com.google.common.collect.M, com.google.common.collect.E
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class c extends G<Object> {
        public final transient Object[] c;
        public final transient int d;
        public final transient int e;

        public c(Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.e = i2;
        }

        @Override // com.google.common.collect.E
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            com.google.common.base.k.e(i, this.e);
            Object obj = this.c[(i * 2) + this.d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.e;
        }

        @Override // com.google.common.collect.G, com.google.common.collect.E
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public j0(Object obj, Object[] objArr, int i2) {
        this.d = obj;
        this.e = objArr;
        this.f = i2;
    }

    public static <K, V> j0<K, V> i(int i2, Object[] objArr, I.a<K, V> aVar) {
        if (i2 == 0) {
            return i;
        }
        if (i2 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new j0<>(null, objArr, 1);
        }
        com.google.common.base.k.g(i2, objArr.length >> 1);
        Object j = j(objArr, i2, M.h(i2), 0);
        if (j instanceof Object[]) {
            Object[] objArr2 = (Object[]) j;
            I.a.C0131a c0131a = (I.a.C0131a) objArr2[2];
            if (aVar == null) {
                throw c0131a.a();
            }
            aVar.c = c0131a;
            Object obj = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            j = obj;
            i2 = intValue;
        }
        return new j0<>(j, objArr, i2);
    }

    public static Object j(Object[] objArr, int i2, int i3, int i4) {
        I.a.C0131a c0131a = null;
        if (i2 == 1) {
            Objects.requireNonNull(objArr[i4]);
            Objects.requireNonNull(objArr[i4 ^ 1]);
            return null;
        }
        int i5 = i3 - 1;
        int i6 = 0;
        if (i3 <= 128) {
            byte[] bArr = new byte[i3];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            while (i6 < i2) {
                int i8 = (i6 * 2) + i4;
                int i9 = (i7 * 2) + i4;
                Object obj = objArr[i8];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj2);
                int a2 = C.a(obj.hashCode());
                while (true) {
                    int i10 = a2 & i5;
                    int i11 = bArr[i10] & UByte.MAX_VALUE;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i7 < i6) {
                            objArr[i9] = obj;
                            objArr[i9 ^ 1] = obj2;
                        }
                        i7++;
                    } else {
                        if (obj.equals(objArr[i11])) {
                            int i12 = i11 ^ 1;
                            Object obj3 = objArr[i12];
                            Objects.requireNonNull(obj3);
                            c0131a = new I.a.C0131a(obj, obj2, obj3);
                            objArr[i12] = obj2;
                            break;
                        }
                        a2 = i10 + 1;
                    }
                }
                i6++;
            }
            return i7 == i2 ? bArr : new Object[]{bArr, Integer.valueOf(i7), c0131a};
        }
        if (i3 <= 32768) {
            short[] sArr = new short[i3];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            while (i6 < i2) {
                int i14 = (i6 * 2) + i4;
                int i15 = (i13 * 2) + i4;
                Object obj4 = objArr[i14];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i14 ^ 1];
                Objects.requireNonNull(obj5);
                int a3 = C.a(obj4.hashCode());
                while (true) {
                    int i16 = a3 & i5;
                    int i17 = sArr[i16] & UShort.MAX_VALUE;
                    if (i17 == 65535) {
                        sArr[i16] = (short) i15;
                        if (i13 < i6) {
                            objArr[i15] = obj4;
                            objArr[i15 ^ 1] = obj5;
                        }
                        i13++;
                    } else {
                        if (obj4.equals(objArr[i17])) {
                            int i18 = i17 ^ 1;
                            Object obj6 = objArr[i18];
                            Objects.requireNonNull(obj6);
                            c0131a = new I.a.C0131a(obj4, obj5, obj6);
                            objArr[i18] = obj5;
                            break;
                        }
                        a3 = i16 + 1;
                    }
                }
                i6++;
            }
            return i13 == i2 ? sArr : new Object[]{sArr, Integer.valueOf(i13), c0131a};
        }
        int[] iArr = new int[i3];
        Arrays.fill(iArr, -1);
        int i19 = 0;
        while (i6 < i2) {
            int i20 = (i6 * 2) + i4;
            int i21 = (i19 * 2) + i4;
            Object obj7 = objArr[i20];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i20 ^ 1];
            Objects.requireNonNull(obj8);
            int a4 = C.a(obj7.hashCode());
            while (true) {
                int i22 = a4 & i5;
                int i23 = iArr[i22];
                if (i23 == -1) {
                    iArr[i22] = i21;
                    if (i19 < i6) {
                        objArr[i21] = obj7;
                        objArr[i21 ^ 1] = obj8;
                    }
                    i19++;
                } else {
                    if (obj7.equals(objArr[i23])) {
                        int i24 = i23 ^ 1;
                        Object obj9 = objArr[i24];
                        Objects.requireNonNull(obj9);
                        c0131a = new I.a.C0131a(obj7, obj8, obj9);
                        objArr[i24] = obj8;
                        break;
                    }
                    a4 = i22 + 1;
                }
            }
            i6++;
        }
        return i19 == i2 ? iArr : new Object[]{iArr, Integer.valueOf(i19), c0131a};
    }

    public static Object k(Object[] objArr, int i2, int i3, Object obj, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i2 == 1) {
            Object obj3 = objArr[i3];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int a2 = C.a(obj2.hashCode());
            while (true) {
                int i4 = a2 & length;
                int i5 = bArr[i4] & UByte.MAX_VALUE;
                if (i5 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i5])) {
                    return objArr[i5 ^ 1];
                }
                a2 = i4 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int a3 = C.a(obj2.hashCode());
            while (true) {
                int i6 = a3 & length2;
                int i7 = sArr[i6] & UShort.MAX_VALUE;
                if (i7 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                a3 = i6 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int a4 = C.a(obj2.hashCode());
            while (true) {
                int i8 = a4 & length3;
                int i9 = iArr[i8];
                if (i9 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i9])) {
                    return objArr[i9 ^ 1];
                }
                a4 = i8 + 1;
            }
        }
    }

    @Override // com.google.common.collect.I
    public final a c() {
        return new a(this, this.e, 0, this.f);
    }

    @Override // com.google.common.collect.I
    public final b d() {
        return new b(this, new c(this.e, 0, this.f));
    }

    @Override // com.google.common.collect.I
    public final E<V> e() {
        return new c(this.e, 1, this.f);
    }

    @Override // com.google.common.collect.I, java.util.Map
    public final V get(Object obj) {
        V v = (V) k(this.e, this.f, 0, this.d, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    @Override // com.google.common.collect.I
    public Object writeReplace() {
        return super.writeReplace();
    }
}
