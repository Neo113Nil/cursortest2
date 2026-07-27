package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class W implements Map, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final W f2692g = new W(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient T f2693a;

    /* renamed from: b, reason: collision with root package name */
    public transient U f2694b;

    /* renamed from: c, reason: collision with root package name */
    public transient V f2695c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f2696d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f2697e;
    public final transient int f;

    public W(Object obj, Object[] objArr, int i3) {
        this.f2696d = obj;
        this.f2697e = objArr;
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019c  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static W a(int i3, Object[] objArr, X1.a aVar) {
        int i4;
        boolean z3;
        char c3;
        Object obj;
        char c4;
        short[] sArr;
        int i5;
        boolean z4;
        ?? r17;
        boolean z5;
        boolean z6;
        int i6 = i3;
        Object[] objArr2 = objArr;
        if (i6 == 0) {
            return f2692g;
        }
        int i7 = 1;
        Object obj2 = null;
        boolean z7 = false;
        if (i6 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new W(null, objArr2, 1);
        }
        AbstractC0181d1.q(i6, objArr2.length >> 1);
        int h3 = H.h(i6);
        char c5 = 2;
        if (i6 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i6 = 1;
            i4 = 1;
            z6 = false;
        } else {
            int i8 = h3 - 1;
            if (h3 <= 128) {
                byte[] bArr = new byte[h3];
                Arrays.fill(bArr, (byte) -1);
                int i9 = 0;
                int i10 = 0;
                while (i9 < i6) {
                    int i11 = i10 + i10;
                    int i12 = i9 + i9;
                    Object obj3 = objArr2[i12];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i12 ^ i7];
                    Objects.requireNonNull(obj4);
                    int b3 = AbstractC0181d1.b(obj3.hashCode());
                    while (true) {
                        int i13 = b3 & i8;
                        i5 = i7;
                        z4 = z7;
                        int i14 = bArr[i13] & 255;
                        if (i14 == 255) {
                            bArr[i13] = (byte) i11;
                            if (i10 < i9) {
                                objArr2[i11] = obj3;
                                objArr2[i11 ^ 1] = obj4;
                            }
                            i10++;
                        } else {
                            if (obj3.equals(objArr2[i14])) {
                                int i15 = i14 ^ 1;
                                Object obj5 = objArr2[i15];
                                Objects.requireNonNull(obj5);
                                obj2 = new D(obj3, obj4, obj5);
                                objArr2[i15] = obj4;
                                break;
                            }
                            b3 = i13 + 1;
                            i7 = i5;
                            z7 = z4;
                        }
                    }
                    i9++;
                    i7 = i5;
                    z7 = z4;
                }
                i4 = i7;
                z3 = z7;
                if (i10 == i6) {
                    obj2 = bArr;
                    z6 = z3;
                } else {
                    sArr = new Object[3];
                    sArr[z3 ? 1 : 0] = bArr;
                    sArr[i4] = Integer.valueOf(i10);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z6 = z3;
                }
            } else {
                i4 = 1;
                z3 = false;
                if (h3 > 32768) {
                    int[] iArr = new int[h3];
                    Arrays.fill(iArr, -1);
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < i6) {
                        int i18 = i17 + i17;
                        int i19 = i16 + i16;
                        Object obj6 = objArr2[i19];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i19 ^ 1];
                        Objects.requireNonNull(obj7);
                        int b4 = AbstractC0181d1.b(obj6.hashCode());
                        while (true) {
                            int i20 = b4 & i8;
                            int i21 = iArr[i20];
                            if (i21 == -1) {
                                iArr[i20] = i18;
                                if (i17 < i16) {
                                    objArr2[i18] = obj6;
                                    objArr2[i18 ^ 1] = obj7;
                                }
                                i17++;
                                c4 = c5;
                            } else {
                                c4 = c5;
                                if (obj6.equals(objArr2[i21])) {
                                    int i22 = i21 ^ 1;
                                    Object obj8 = objArr2[i22];
                                    Objects.requireNonNull(obj8);
                                    D d3 = new D(obj6, obj7, obj8);
                                    objArr2[i22] = obj7;
                                    obj2 = d3;
                                    break;
                                }
                                b4 = i20 + 1;
                                c5 = c4;
                            }
                        }
                        i16++;
                        c5 = c4;
                    }
                    c3 = c5;
                    if (i17 == i6) {
                        obj = iArr;
                        r17 = z3;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i17);
                        objArr3[c3] = obj2;
                        obj = objArr3;
                        r17 = z3;
                    }
                    z5 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z5) {
                        Object[] objArr4 = (Object[]) obj;
                        D d4 = (D) objArr4[c3];
                        if (aVar == null) {
                            throw d4.a();
                        }
                        aVar.f1634c = d4;
                        Object obj10 = objArr4[r17];
                        int intValue = ((Integer) objArr4[i4]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i6 = intValue;
                    }
                    return new W(obj9, objArr2, i6);
                }
                sArr = new short[h3];
                Arrays.fill(sArr, (short) -1);
                int i23 = 0;
                for (int i24 = 0; i24 < i6; i24++) {
                    int i25 = i23 + i23;
                    int i26 = i24 + i24;
                    Object obj11 = objArr2[i26];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i26 ^ 1];
                    Objects.requireNonNull(obj12);
                    int b5 = AbstractC0181d1.b(obj11.hashCode());
                    while (true) {
                        int i27 = b5 & i8;
                        char c6 = (char) sArr[i27];
                        if (c6 == 65535) {
                            sArr[i27] = (short) i25;
                            if (i23 < i24) {
                                objArr2[i25] = obj11;
                                objArr2[i25 ^ 1] = obj12;
                            }
                            i23++;
                        } else {
                            if (obj11.equals(objArr2[c6])) {
                                int i28 = c6 ^ 1;
                                Object obj13 = objArr2[i28];
                                Objects.requireNonNull(obj13);
                                D d5 = new D(obj11, obj12, obj13);
                                objArr2[i28] = obj12;
                                obj2 = d5;
                                break;
                            }
                            b5 = i27 + 1;
                        }
                    }
                }
                if (i23 != i6) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i23), obj2};
                    z6 = z3;
                }
                obj2 = sArr;
                z6 = z3;
            }
        }
        c3 = 2;
        obj = obj2;
        r17 = z6;
        z5 = obj instanceof Object[];
        Object obj92 = obj;
        if (z5) {
        }
        return new W(obj92, objArr2, i6);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        V v3 = this.f2695c;
        if (v3 == null) {
            v3 = new V(this.f2697e, 1, this.f);
            this.f2695c = v3;
        }
        return v3.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        T t3 = this.f2693a;
        if (t3 != null) {
            return t3;
        }
        T t4 = new T(this, this.f2697e, this.f);
        this.f2693a = t4;
        return t4;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i3 = this.f;
            Object[] objArr = this.f2697e;
            if (i3 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f2696d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int b3 = AbstractC0181d1.b(obj.hashCode());
                        while (true) {
                            int i4 = b3 & length;
                            int i5 = bArr[i4] & 255;
                            if (i5 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i5])) {
                                obj2 = objArr[i5 ^ 1];
                                break;
                            }
                            b3 = i4 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int b4 = AbstractC0181d1.b(obj.hashCode());
                        while (true) {
                            int i6 = b4 & length2;
                            char c3 = (char) sArr[i6];
                            if (c3 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c3])) {
                                obj2 = objArr[c3 ^ 1];
                                break;
                            }
                            b4 = i6 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int b5 = AbstractC0181d1.b(obj.hashCode());
                        while (true) {
                            int i7 = b5 & length3;
                            int i8 = iArr[i7];
                            if (i8 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i8])) {
                                obj2 = objArr[i8 ^ 1];
                                break;
                            }
                            b5 = i7 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        T t3 = this.f2693a;
        if (t3 == null) {
            t3 = new T(this, this.f2697e, this.f);
            this.f2693a = t3;
        }
        Iterator it = t3.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 += next != null ? next.hashCode() : 0;
        }
        return i3;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        U u3 = this.f2694b;
        if (u3 != null) {
            return u3;
        }
        U u4 = new U(this, new V(this.f2697e, 0, this.f));
        this.f2694b = u4;
        return u4;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    public final String toString() {
        int i3 = this.f;
        AbstractC0181d1.h(i3, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i3 * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((T) entrySet()).iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z3) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z3 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        V v3 = this.f2695c;
        if (v3 != null) {
            return v3;
        }
        V v4 = new V(this.f2697e, 1, this.f);
        this.f2695c = v4;
        return v4;
    }
}
