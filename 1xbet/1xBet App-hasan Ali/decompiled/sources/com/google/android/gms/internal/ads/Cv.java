package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class Cv implements Map, Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final Cv f8103q = new Cv(0, null, new Object[0]);

    /* renamed from: k, reason: collision with root package name */
    public transient C1896zv f8104k;

    /* renamed from: l, reason: collision with root package name */
    public transient Av f8105l;

    /* renamed from: m, reason: collision with root package name */
    public transient Bv f8106m;

    /* renamed from: n, reason: collision with root package name */
    public final transient Object f8107n;

    /* renamed from: o, reason: collision with root package name */
    public final transient Object[] f8108o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int f8109p;

    public Cv(int i, Object obj, Object[] objArr) {
        this.f8107n = obj;
        this.f8108o = objArr;
        this.f8109p = i;
    }

    public static Cv a(HashMap hashMap) {
        int size;
        Object[] objArr;
        int length;
        int size2;
        Set<Map.Entry> entrySet = hashMap.entrySet();
        boolean z3 = entrySet instanceof Collection;
        G3 g32 = new G3(z3 ? entrySet.size() : 4);
        if (z3 && (size2 = (size = entrySet.size()) + size) > (length = (objArr = (Object[]) g32.f9166m).length)) {
            g32.f9166m = Arrays.copyOf(objArr, AbstractC0776av.d(length, size2));
        }
        for (Map.Entry entry : entrySet) {
            g32.f(entry.getKey(), entry.getValue());
        }
        return g32.n();
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
    public static Cv c(int i, Object[] objArr, G3 g32) {
        int i5;
        boolean z3;
        char c5;
        Object obj;
        char c6;
        short[] sArr;
        int i6;
        boolean z5;
        ?? r17;
        boolean z6;
        boolean z7;
        int i7 = i;
        Object[] objArr2 = objArr;
        if (i7 == 0) {
            return f8103q;
        }
        int i8 = 1;
        Object obj2 = null;
        boolean z8 = false;
        if (i7 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new Cv(1, null, objArr2);
        }
        AbstractC1400ot.B(i7, objArr2.length >> 1);
        int j5 = AbstractC1177jv.j(i7);
        char c7 = 2;
        if (i7 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i7 = 1;
            i5 = 1;
            z7 = false;
        } else {
            int i9 = j5 - 1;
            if (j5 <= 128) {
                byte[] bArr = new byte[j5];
                Arrays.fill(bArr, (byte) -1);
                int i10 = 0;
                int i11 = 0;
                while (i10 < i7) {
                    int i12 = i11 + i11;
                    int i13 = i10 + i10;
                    Object obj3 = objArr2[i13];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i13 ^ i8];
                    Objects.requireNonNull(obj4);
                    int a5 = AbstractC1400ot.a(obj3.hashCode());
                    while (true) {
                        int i14 = a5 & i9;
                        i6 = i8;
                        z5 = z8;
                        int i15 = bArr[i14] & 255;
                        if (i15 == 255) {
                            bArr[i14] = (byte) i12;
                            if (i11 < i10) {
                                objArr2[i12] = obj3;
                                objArr2[i12 ^ 1] = obj4;
                            }
                            i11++;
                        } else {
                            if (obj3.equals(objArr2[i15])) {
                                int i16 = i15 ^ 1;
                                Object obj5 = objArr2[i16];
                                Objects.requireNonNull(obj5);
                                obj2 = new C1089hv(obj3, obj4, obj5);
                                objArr2[i16] = obj4;
                                break;
                            }
                            a5 = i14 + 1;
                            i8 = i6;
                            z8 = z5;
                        }
                    }
                    i10++;
                    i8 = i6;
                    z8 = z5;
                }
                i5 = i8;
                z3 = z8;
                if (i11 == i7) {
                    obj2 = bArr;
                    z7 = z3;
                } else {
                    sArr = new Object[3];
                    sArr[z3 ? 1 : 0] = bArr;
                    sArr[i5] = Integer.valueOf(i11);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z7 = z3;
                }
            } else {
                i5 = 1;
                z3 = false;
                if (j5 > 32768) {
                    int[] iArr = new int[j5];
                    Arrays.fill(iArr, -1);
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < i7) {
                        int i19 = i18 + i18;
                        int i20 = i17 + i17;
                        Object obj6 = objArr2[i20];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i20 ^ 1];
                        Objects.requireNonNull(obj7);
                        int a6 = AbstractC1400ot.a(obj6.hashCode());
                        while (true) {
                            int i21 = a6 & i9;
                            int i22 = iArr[i21];
                            if (i22 == -1) {
                                iArr[i21] = i19;
                                if (i18 < i17) {
                                    objArr2[i19] = obj6;
                                    objArr2[i19 ^ 1] = obj7;
                                }
                                i18++;
                                c6 = c7;
                            } else {
                                c6 = c7;
                                if (obj6.equals(objArr2[i22])) {
                                    int i23 = i22 ^ 1;
                                    Object obj8 = objArr2[i23];
                                    Objects.requireNonNull(obj8);
                                    C1089hv c1089hv = new C1089hv(obj6, obj7, obj8);
                                    objArr2[i23] = obj7;
                                    obj2 = c1089hv;
                                    break;
                                }
                                a6 = i21 + 1;
                                c7 = c6;
                            }
                        }
                        i17++;
                        c7 = c6;
                    }
                    c5 = c7;
                    if (i18 == i7) {
                        obj = iArr;
                        r17 = z3;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i18);
                        objArr3[c5] = obj2;
                        obj = objArr3;
                        r17 = z3;
                    }
                    z6 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z6) {
                        Object[] objArr4 = (Object[]) obj;
                        C1089hv c1089hv2 = (C1089hv) objArr4[c5];
                        if (g32 == null) {
                            throw c1089hv2.a();
                        }
                        g32.f9167n = c1089hv2;
                        Object obj10 = objArr4[r17];
                        int intValue = ((Integer) objArr4[i5]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i7 = intValue;
                    }
                    return new Cv(i7, obj9, objArr2);
                }
                sArr = new short[j5];
                Arrays.fill(sArr, (short) -1);
                int i24 = 0;
                for (int i25 = 0; i25 < i7; i25++) {
                    int i26 = i24 + i24;
                    int i27 = i25 + i25;
                    Object obj11 = objArr2[i27];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i27 ^ 1];
                    Objects.requireNonNull(obj12);
                    int a7 = AbstractC1400ot.a(obj11.hashCode());
                    while (true) {
                        int i28 = a7 & i9;
                        char c8 = (char) sArr[i28];
                        if (c8 == 65535) {
                            sArr[i28] = (short) i26;
                            if (i24 < i25) {
                                objArr2[i26] = obj11;
                                objArr2[i26 ^ 1] = obj12;
                            }
                            i24++;
                        } else {
                            if (obj11.equals(objArr2[c8])) {
                                int i29 = c8 ^ 1;
                                Object obj13 = objArr2[i29];
                                Objects.requireNonNull(obj13);
                                C1089hv c1089hv3 = new C1089hv(obj11, obj12, obj13);
                                objArr2[i29] = obj12;
                                obj2 = c1089hv3;
                                break;
                            }
                            a7 = i28 + 1;
                        }
                    }
                }
                if (i24 != i7) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i24), obj2};
                    z7 = z3;
                }
                obj2 = sArr;
                z7 = z3;
            }
        }
        c5 = 2;
        obj = obj2;
        r17 = z7;
        z6 = obj instanceof Object[];
        Object obj92 = obj;
        if (z6) {
        }
        return new Cv(i7, obj92, objArr2);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1177jv entrySet() {
        C1896zv c1896zv = this.f8104k;
        if (c1896zv != null) {
            return c1896zv;
        }
        C1896zv c1896zv2 = new C1896zv(this, this.f8108o, this.f8109p);
        this.f8104k = c1896zv2;
        return c1896zv2;
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
        Bv bv = this.f8106m;
        if (bv == null) {
            bv = new Bv(this.f8108o, 1, this.f8109p);
            this.f8106m = bv;
        }
        return bv.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC0952et.K(obj, this);
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
            int i = this.f8109p;
            Object[] objArr = this.f8108o;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f8107n;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int a5 = AbstractC1400ot.a(obj.hashCode());
                        while (true) {
                            int i5 = a5 & length;
                            int i6 = bArr[i5] & 255;
                            if (i6 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            a5 = i5 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a6 = AbstractC1400ot.a(obj.hashCode());
                        while (true) {
                            int i7 = a6 & length2;
                            char c5 = (char) sArr[i7];
                            if (c5 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c5])) {
                                obj2 = objArr[c5 ^ 1];
                                break;
                            }
                            a6 = i7 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a7 = AbstractC1400ot.a(obj.hashCode());
                        while (true) {
                            int i8 = a7 & length3;
                            int i9 = iArr[i8];
                            if (i9 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            a7 = i8 + 1;
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
        return AbstractC0952et.d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        Av av = this.f8105l;
        if (av != null) {
            return av;
        }
        Av av2 = new Av(this, new Bv(this.f8108o, 0, this.f8109p));
        this.f8105l = av2;
        return av2;
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
        return this.f8109p;
    }

    public final String toString() {
        int i = this.f8109p;
        AbstractC0952et.q("size", i);
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C1896zv) entrySet()).iterator();
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
        Bv bv = this.f8106m;
        if (bv != null) {
            return bv;
        }
        Bv bv2 = new Bv(this.f8108o, 1, this.f8109p);
        this.f8106m = bv2;
        return bv2;
    }
}
