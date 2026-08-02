package androidx.collection;

import java.util.Arrays;
import k0.C7445a;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5153w<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f38748a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f38749b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f38750c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f38751d;

    public C5153w() {
        this((Object) null);
    }

    public final void a() {
        int i11 = this.f38751d;
        Object[] objArr = this.f38750c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f38751d = 0;
        this.f38748a = false;
    }

    public final E b(long j11) {
        Object obj;
        int b11 = C7445a.b(this.f38751d, j11, this.f38749b);
        if (b11 < 0) {
            return null;
        }
        Object obj2 = this.f38750c[b11];
        obj = C5154x.f38752a;
        if (obj2 == obj) {
            return null;
        }
        return (E) this.f38750c[b11];
    }

    public final int c(long j11) {
        Object obj;
        if (this.f38748a) {
            int i11 = this.f38751d;
            long[] jArr = this.f38749b;
            Object[] objArr = this.f38750c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj2 = objArr[i13];
                obj = C5154x.f38752a;
                if (obj2 != obj) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj2;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f38748a = false;
            this.f38751d = i12;
        }
        return C7445a.b(this.f38751d, j11, this.f38749b);
    }

    public final Object clone() {
        Object clone = super.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C5153w c5153w = (C5153w) clone;
        c5153w.f38749b = (long[]) this.f38749b.clone();
        c5153w.f38750c = (Object[]) this.f38750c.clone();
        return c5153w;
    }

    public final boolean d() {
        return h() == 0;
    }

    public final long e(int i11) {
        Object obj;
        if (!(i11 >= 0 && i11 < this.f38751d)) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i11);
            throw null;
        }
        if (this.f38748a) {
            int i12 = this.f38751d;
            long[] jArr = this.f38749b;
            Object[] objArr = this.f38750c;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj2 = objArr[i14];
                obj = C5154x.f38752a;
                if (obj2 != obj) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj2;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.f38748a = false;
            this.f38751d = i13;
        }
        return this.f38749b[i11];
    }

    public final void f(long j11, E e11) {
        Object obj;
        Object obj2;
        int b11 = C7445a.b(this.f38751d, j11, this.f38749b);
        if (b11 >= 0) {
            this.f38750c[b11] = e11;
            return;
        }
        int i11 = ~b11;
        if (i11 < this.f38751d) {
            Object obj3 = this.f38750c[i11];
            obj2 = C5154x.f38752a;
            if (obj3 == obj2) {
                this.f38749b[i11] = j11;
                this.f38750c[i11] = e11;
                return;
            }
        }
        if (this.f38748a) {
            int i12 = this.f38751d;
            long[] jArr = this.f38749b;
            if (i12 >= jArr.length) {
                Object[] objArr = this.f38750c;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Object obj4 = objArr[i14];
                    obj = C5154x.f38752a;
                    if (obj4 != obj) {
                        if (i14 != i13) {
                            jArr[i13] = jArr[i14];
                            objArr[i13] = obj4;
                            objArr[i14] = null;
                        }
                        i13++;
                    }
                }
                this.f38748a = false;
                this.f38751d = i13;
                i11 = ~C7445a.b(i13, j11, this.f38749b);
            }
        }
        int i15 = this.f38751d;
        if (i15 >= this.f38749b.length) {
            int i16 = (i15 + 1) * 8;
            int i17 = 4;
            while (true) {
                if (i17 >= 32) {
                    break;
                }
                int i18 = (1 << i17) - 12;
                if (i16 <= i18) {
                    i16 = i18;
                    break;
                }
                i17++;
            }
            int i19 = i16 / 8;
            long[] copyOf = Arrays.copyOf(this.f38749b, i19);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f38749b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f38750c, i19);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f38750c = copyOf2;
        }
        int i21 = this.f38751d - i11;
        if (i21 != 0) {
            long[] destination = this.f38749b;
            int i22 = i11 + 1;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i11, destination, i22, i21);
            Object[] objArr2 = this.f38750c;
            C7705l.r(objArr2, i22, objArr2, i11, this.f38751d);
        }
        this.f38749b[i11] = j11;
        this.f38750c[i11] = e11;
        this.f38751d++;
    }

    public final void g(long j11) {
        Object obj;
        Object obj2;
        int b11 = C7445a.b(this.f38751d, j11, this.f38749b);
        if (b11 >= 0) {
            Object obj3 = this.f38750c[b11];
            obj = C5154x.f38752a;
            if (obj3 != obj) {
                Object[] objArr = this.f38750c;
                obj2 = C5154x.f38752a;
                objArr[b11] = obj2;
                this.f38748a = true;
            }
        }
    }

    public final int h() {
        Object obj;
        if (this.f38748a) {
            int i11 = this.f38751d;
            long[] jArr = this.f38749b;
            Object[] objArr = this.f38750c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj2 = objArr[i13];
                obj = C5154x.f38752a;
                if (obj2 != obj) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj2;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f38748a = false;
            this.f38751d = i12;
        }
        return this.f38751d;
    }

    public final E i(int i11) {
        Object obj;
        if (!(i11 >= 0 && i11 < this.f38751d)) {
            k0.d.a("Expected index to be within 0..size()-1, but was " + i11);
            throw null;
        }
        if (this.f38748a) {
            int i12 = this.f38751d;
            long[] jArr = this.f38749b;
            Object[] objArr = this.f38750c;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj2 = objArr[i14];
                obj = C5154x.f38752a;
                if (obj2 != obj) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj2;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.f38748a = false;
            this.f38751d = i13;
        }
        return (E) this.f38750c[i11];
    }

    @NotNull
    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f38751d * 28);
        sb2.append('{');
        int i11 = this.f38751d;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i12));
            sb2.append('=');
            E i13 = i(i12);
            if (i13 != sb2) {
                sb2.append(i13);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public C5153w(int i11) {
        if (i11 == 0) {
            this.f38749b = C7445a.f70245b;
            this.f38750c = C7445a.f70246c;
            return;
        }
        int i12 = i11 * 8;
        int i13 = 4;
        while (true) {
            if (i13 >= 32) {
                break;
            }
            int i14 = (1 << i13) - 12;
            if (i12 <= i14) {
                i12 = i14;
                break;
            }
            i13++;
        }
        int i15 = i12 / 8;
        this.f38749b = new long[i15];
        this.f38750c = new Object[i15];
    }

    public /* synthetic */ C5153w(Object obj) {
        this(10);
    }
}
