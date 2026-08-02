package O1;

import P1.C3805l;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f19838a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Object[] f19839b;

    /* renamed from: c, reason: collision with root package name */
    private int f19840c;

    public c() {
        this(0);
    }

    public final V a(K k11) {
        int c11 = k11 == null ? c() : b(k11.hashCode(), k11);
        if (c11 >= 0) {
            return (V) this.f19839b[(c11 << 1) + 1];
        }
        return null;
    }

    protected final int b(int i11, @NotNull Object obj) {
        int i12 = this.f19840c;
        if (i12 == 0) {
            return -1;
        }
        int a11 = a.a(i12, i11, this.f19838a);
        if (a11 < 0 || Intrinsics.d(obj, this.f19839b[a11 << 1])) {
            return a11;
        }
        int i13 = a11 + 1;
        while (i13 < i12 && this.f19838a[i13] == i11) {
            if (Intrinsics.d(obj, this.f19839b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = a11 - 1; i14 >= 0 && this.f19838a[i14] == i11; i14--) {
            if (Intrinsics.d(obj, this.f19839b[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    protected final int c() {
        int i11 = this.f19840c;
        if (i11 == 0) {
            return -1;
        }
        int a11 = a.a(i11, 0, this.f19838a);
        if (a11 < 0 || this.f19839b[a11 << 1] == null) {
            return a11;
        }
        int i12 = a11 + 1;
        while (i12 < i11 && this.f19838a[i12] == 0) {
            if (this.f19839b[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a11 - 1; i13 >= 0 && this.f19838a[i13] == 0; i13--) {
            if (this.f19839b[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public final Object d(C3805l.b bVar, C3805l.a aVar) {
        int hashCode;
        int b11;
        int i11 = this.f19840c;
        if (bVar == null) {
            b11 = c();
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
            b11 = b(hashCode, bVar);
        }
        if (b11 >= 0) {
            int i12 = (b11 << 1) + 1;
            Object[] objArr = this.f19839b;
            Object obj = objArr[i12];
            objArr[i12] = aVar;
            return obj;
        }
        int i13 = ~b11;
        int[] iArr = this.f19838a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i14);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f19838a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f19839b, i14 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f19839b = copyOf2;
            if (i11 != this.f19840c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.f19838a;
            int i15 = i13 + 1;
            C7705l.p(i15, i13, iArr2, iArr2, i11);
            Object[] objArr2 = this.f19839b;
            C7705l.r(objArr2, i15 << 1, objArr2, i13 << 1, this.f19840c << 1);
        }
        int i16 = this.f19840c;
        if (i11 == i16) {
            int[] iArr3 = this.f19838a;
            if (i13 < iArr3.length) {
                iArr3[i13] = hashCode;
                Object[] objArr3 = this.f19839b;
                int i17 = i13 << 1;
                objArr3[i17] = bVar;
                objArr3[i17 + 1] = aVar;
                this.f19840c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i11 = this.f19840c;
                if (i11 == cVar.f19840c) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        Object[] objArr = this.f19839b;
                        int i13 = i12 << 1;
                        Object obj2 = objArr[i13];
                        Object obj3 = objArr[i13 + 1];
                        Object a11 = cVar.a(obj2);
                        if (obj3 == null) {
                            if (a11 == null) {
                                if ((obj2 == null ? cVar.c() : cVar.b(obj2.hashCode(), obj2)) >= 0) {
                                }
                            }
                        } else if (!obj3.equals(a11)) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Map) && this.f19840c == ((Map) obj).size()) {
                int i14 = this.f19840c;
                for (int i15 = 0; i15 < i14; i15++) {
                    Object[] objArr2 = this.f19839b;
                    int i16 = i15 << 1;
                    Object obj4 = objArr2[i16];
                    Object obj5 = objArr2[i16 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        if (obj6 == null && ((Map) obj).containsKey(obj4)) {
                        }
                    } else if (!obj5.equals(obj6)) {
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f19838a;
        Object[] objArr = this.f19839b;
        int i11 = this.f19840c;
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

    @NotNull
    public final String toString() {
        int i11 = this.f19840c;
        if (i11 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i11 * 28);
        sb2.append('{');
        int i12 = this.f19840c;
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            int i14 = i13 << 1;
            Object obj = this.f19839b[i14];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object obj2 = this.f19839b[i14 + 1];
            if (obj2 != this) {
                sb2.append(obj2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public c(int i11) {
        this.f19838a = a.f19829a;
        this.f19839b = a.f19830b;
        this.f19840c = 0;
    }
}
