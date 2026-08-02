package S0;

import Sc.InterfaceC4008j;
import gd.InterfaceC6712a;
import gd.InterfaceC6714c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3997z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f25601a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25602b;

    /* renamed from: c, reason: collision with root package name */
    private int f25603c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f25604d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.collection.C<T> f25605e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25606f;

    public C3997z0(int i11, @NotNull ArrayList arrayList) {
        this.f25601a = arrayList;
        this.f25602b = i11;
        if (!(i11 >= 0)) {
            B0.a("Invalid start index");
            throw null;
        }
        this.f25604d = new ArrayList();
        androidx.collection.C<T> c11 = new androidx.collection.C<>();
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            C3940a0 c3940a0 = (C3940a0) this.f25601a.get(i13);
            c11.j(c3940a0.b(), new T(i13, i12, c3940a0.c()));
            i12 += c3940a0.c();
        }
        this.f25605e = c11;
        this.f25606f = Sc.k.b(new C3995y0(this));
    }

    public final int a() {
        return this.f25603c;
    }

    @NotNull
    public final List<C3940a0> b() {
        return this.f25601a;
    }

    public final C3940a0 c(int i11, Object obj) {
        Object z11 = obj != null ? new Z(Integer.valueOf(i11), obj) : Integer.valueOf(i11);
        androidx.collection.L b11 = ((C3976o0) this.f25606f.getValue()).b();
        Object b12 = b11.b(z11);
        if (b12 != null) {
            if (!(b12 instanceof List) || ((b12 instanceof InterfaceC6712a) && !(b12 instanceof InterfaceC6714c))) {
                b11.g(z11);
            } else {
                List c11 = kotlin.jvm.internal.U.c(b12);
                Object remove = c11.remove(0);
                if (c11.isEmpty()) {
                    b11.g(z11);
                }
                b12 = remove;
            }
            Intrinsics.g(b12, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        } else {
            b12 = null;
        }
        return (C3940a0) b12;
    }

    public final int d() {
        return this.f25602b;
    }

    @NotNull
    public final ArrayList e() {
        return this.f25604d;
    }

    public final int f(@NotNull C3940a0 c3940a0) {
        T c11 = this.f25605e.c(c3940a0.b());
        if (c11 != null) {
            return c11.b();
        }
        return -1;
    }

    public final void g(@NotNull C3940a0 c3940a0) {
        this.f25604d.add(c3940a0);
    }

    public final void h(@NotNull C3940a0 c3940a0, int i11) {
        this.f25605e.j(c3940a0.b(), new T(-1, i11, 0));
    }

    public final void i(int i11, int i12, int i13) {
        char c11;
        long j11;
        char c12;
        long j12;
        char c13 = 7;
        androidx.collection.C<T> c14 = this.f25605e;
        long j13 = -9187201950435737472L;
        if (i11 > i12) {
            Object[] objArr = c14.f38719c;
            long[] jArr = c14.f38717a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j14 = jArr[i14];
                if ((((~j14) << c13) & j14 & j13) != j13) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j14 & 255) < 128) {
                            c12 = c13;
                            T t2 = (T) objArr[(i14 << 3) + i16];
                            j12 = j13;
                            int b11 = t2.b();
                            if (i11 <= b11 && b11 < i11 + i13) {
                                t2.e((b11 - i11) + i12);
                            } else if (i12 <= b11 && b11 < i11) {
                                t2.e(b11 + i13);
                            }
                        } else {
                            c12 = c13;
                            j12 = j13;
                        }
                        j14 >>= 8;
                        i16++;
                        c13 = c12;
                        j13 = j12;
                    }
                    c11 = c13;
                    j11 = j13;
                    if (i15 != 8) {
                        return;
                    }
                } else {
                    c11 = c13;
                    j11 = j13;
                }
                if (i14 == length) {
                    return;
                }
                i14++;
                c13 = c11;
                j13 = j11;
            }
        } else {
            if (i12 <= i11) {
                return;
            }
            Object[] objArr2 = c14.f38719c;
            long[] jArr2 = c14.f38717a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i17 = 0;
            while (true) {
                long j15 = jArr2[i17];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j15 & 255) < 128) {
                            T t11 = (T) objArr2[(i17 << 3) + i19];
                            int b12 = t11.b();
                            if (i11 <= b12 && b12 < i11 + i13) {
                                t11.e((b12 - i11) + i12);
                            } else if (i11 + 1 <= b12 && b12 < i12) {
                                t11.e(b12 - i13);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i18 != 8) {
                        return;
                    }
                }
                if (i17 == length2) {
                    return;
                } else {
                    i17++;
                }
            }
        }
    }

    public final void j(int i11, int i12) {
        char c11;
        long j11;
        char c12;
        long j12;
        char c13 = 7;
        androidx.collection.C<T> c14 = this.f25605e;
        long j13 = -9187201950435737472L;
        if (i11 > i12) {
            Object[] objArr = c14.f38719c;
            long[] jArr = c14.f38717a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j14 = jArr[i13];
                if ((((~j14) << c13) & j14 & j13) != j13) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j14 & 255) < 128) {
                            c12 = c13;
                            T t2 = (T) objArr[(i13 << 3) + i15];
                            j12 = j13;
                            int c15 = t2.c();
                            if (c15 == i11) {
                                t2.f(i12);
                            } else if (i12 <= c15 && c15 < i11) {
                                t2.f(c15 + 1);
                            }
                        } else {
                            c12 = c13;
                            j12 = j13;
                        }
                        j14 >>= 8;
                        i15++;
                        c13 = c12;
                        j13 = j12;
                    }
                    c11 = c13;
                    j11 = j13;
                    if (i14 != 8) {
                        return;
                    }
                } else {
                    c11 = c13;
                    j11 = j13;
                }
                if (i13 == length) {
                    return;
                }
                i13++;
                c13 = c11;
                j13 = j11;
            }
        } else {
            if (i12 <= i11) {
                return;
            }
            Object[] objArr2 = c14.f38719c;
            long[] jArr2 = c14.f38717a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j15 = jArr2[i16];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j15 & 255) < 128) {
                            T t11 = (T) objArr2[(i16 << 3) + i18];
                            int c16 = t11.c();
                            if (c16 == i11) {
                                t11.f(i12);
                            } else if (i11 + 1 <= c16 && c16 < i12) {
                                t11.f(c16 - 1);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length2) {
                    return;
                } else {
                    i16++;
                }
            }
        }
    }

    public final void k(int i11) {
        this.f25603c = i11;
    }

    public final int l(@NotNull C3940a0 c3940a0) {
        T c11 = this.f25605e.c(c3940a0.b());
        if (c11 != null) {
            return c11.c();
        }
        return -1;
    }

    public final boolean m(int i11, int i12) {
        int b11;
        androidx.collection.C<T> c11 = this.f25605e;
        T c12 = c11.c(i11);
        if (c12 == null) {
            return false;
        }
        int b12 = c12.b();
        int a11 = i12 - c12.a();
        c12.d(i12);
        if (a11 == 0) {
            return true;
        }
        Object[] objArr = c11.f38719c;
        long[] jArr = c11.f38717a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j11 = jArr[i13];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j11) < 128) {
                        T t2 = (T) objArr[(i13 << 3) + i15];
                        if (t2.b() >= b12 && !t2.equals(c12) && (b11 = t2.b() + a11) >= 0) {
                            t2.e(b11);
                        }
                    }
                    j11 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }

    public final int n(@NotNull C3940a0 c3940a0) {
        T c11 = this.f25605e.c(c3940a0.b());
        return c11 != null ? c11.a() : c3940a0.c();
    }
}
