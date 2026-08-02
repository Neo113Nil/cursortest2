package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5379z;
import androidx.datastore.preferences.protobuf.J;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5364j {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5363i f42569a;

    /* renamed from: b, reason: collision with root package name */
    private int f42570b;

    /* renamed from: c, reason: collision with root package name */
    private int f42571c;

    /* renamed from: d, reason: collision with root package name */
    private int f42572d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42573a;

        static {
            int[] iArr = new int[r0.values().length];
            f42573a = iArr;
            try {
                iArr[r0.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42573a[r0.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42573a[r0.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42573a[r0.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42573a[r0.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42573a[r0.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42573a[r0.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42573a[r0.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42573a[r0.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42573a[r0.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42573a[r0.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42573a[r0.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42573a[r0.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42573a[r0.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42573a[r0.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42573a[r0.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42573a[r0.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C5364j(AbstractC5363i abstractC5363i) {
        C5378y.a(abstractC5363i, "input");
        this.f42569a = abstractC5363i;
        abstractC5363i.f42535d = this;
    }

    private void S(int i11) throws IOException {
        if (this.f42569a.b() != i11) {
            throw C5379z.i();
        }
    }

    private void T(int i11) throws IOException {
        if ((this.f42570b & 7) != i11) {
            throw C5379z.d();
        }
    }

    private static void V(int i11) throws IOException {
        if ((i11 & 3) != 0) {
            throw new C5379z("Failed to parse the message.");
        }
    }

    private static void W(int i11) throws IOException {
        if ((i11 & 7) != 0) {
            throw new C5379z("Failed to parse the message.");
        }
    }

    public static C5364j a(AbstractC5363i abstractC5363i) {
        C5364j c5364j = abstractC5363i.f42535d;
        return c5364j != null ? c5364j : new C5364j(abstractC5363i);
    }

    private <T> void e(T t2, f0<T> f0Var, C5369o c5369o) throws IOException {
        int i11 = this.f42571c;
        this.f42571c = ((this.f42570b >>> 3) << 3) | 4;
        try {
            f0Var.b(t2, this, c5369o);
            if (this.f42570b == this.f42571c) {
            } else {
                throw new C5379z("Failed to parse the message.");
            }
        } finally {
            this.f42571c = i11;
        }
    }

    private <T> void g(T t2, f0<T> f0Var, C5369o c5369o) throws IOException {
        AbstractC5363i abstractC5363i = this.f42569a;
        int w11 = abstractC5363i.w();
        if (abstractC5363i.f42532a >= abstractC5363i.f42533b) {
            throw new C5379z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int f7 = abstractC5363i.f(w11);
        abstractC5363i.f42532a++;
        f0Var.b(t2, this, c5369o);
        abstractC5363i.a(0);
        abstractC5363i.f42532a--;
        abstractC5363i.e(f7);
    }

    private Object p(r0 r0Var, Class<?> cls, C5369o c5369o) throws IOException {
        switch (a.f42573a[r0Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(h());
            case 2:
                return j();
            case 3:
                return Double.valueOf(l());
            case 4:
                return Integer.valueOf(n());
            case 5:
                return Integer.valueOf(q());
            case 6:
                return Long.valueOf(s());
            case 7:
                return Float.valueOf(u());
            case 8:
                return Integer.valueOf(x());
            case 9:
                return Long.valueOf(z());
            case 10:
                T(2);
                f0 b11 = c0.a().b(cls);
                Object newInstance = b11.newInstance();
                g(newInstance, b11, c5369o);
                b11.makeImmutable(newInstance);
                return newInstance;
            case 11:
                return Integer.valueOf(D());
            case 12:
                return Long.valueOf(F());
            case 13:
                return Integer.valueOf(H());
            case 14:
                return Long.valueOf(J());
            case 15:
                return N();
            case 16:
                return Integer.valueOf(O());
            case 17:
                return Long.valueOf(Q());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void A(List<Long> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof H;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(abstractC5363i.o()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int b11 = abstractC5363i.b() + abstractC5363i.w();
            do {
                list.add(Long.valueOf(abstractC5363i.o()));
            } while (abstractC5363i.b() < b11);
            S(b11);
            return;
        }
        H h11 = (H) list;
        int i12 = this.f42570b & 7;
        if (i12 == 0) {
            do {
                h11.addLong(abstractC5363i.o());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int b12 = abstractC5363i.b() + abstractC5363i.w();
        do {
            h11.addLong(abstractC5363i.o());
        } while (abstractC5363i.b() < b12);
        S(b12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        r1.e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void B(Map<K, V> map, J.a<K, V> aVar, C5369o c5369o) throws IOException {
        T(2);
        AbstractC5363i abstractC5363i = this.f42569a;
        int f7 = abstractC5363i.f(abstractC5363i.w());
        aVar.getClass();
        Object obj = "";
        V2.i iVar = aVar.f42471c;
        Object obj2 = iVar;
        while (true) {
            try {
                int b11 = b();
                if (b11 == Integer.MAX_VALUE || abstractC5363i.c()) {
                    break;
                }
                if (b11 == 1) {
                    obj = p(aVar.f42469a, null, null);
                } else if (b11 != 2) {
                    try {
                        if (!U()) {
                            throw new C5379z("Unable to parse map entry.");
                        }
                    } catch (C5379z.a unused) {
                        if (!U()) {
                            throw new C5379z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = p(aVar.f42470b, iVar.getClass(), c5369o);
                }
            } catch (Throwable th2) {
                abstractC5363i.e(f7);
                throw th2;
            }
        }
    }

    public final <T> void C(List<T> list, f0<T> f0Var, C5369o c5369o) throws IOException {
        int v11;
        int i11 = this.f42570b;
        if ((i11 & 7) != 2) {
            throw C5379z.d();
        }
        do {
            T newInstance = f0Var.newInstance();
            g(newInstance, f0Var, c5369o);
            f0Var.makeImmutable(newInstance);
            list.add(newInstance);
            AbstractC5363i abstractC5363i = this.f42569a;
            if (abstractC5363i.c() || this.f42572d != 0) {
                return;
            } else {
                v11 = abstractC5363i.v();
            }
        } while (v11 == i11);
        this.f42572d = v11;
    }

    public final int D() throws IOException {
        T(5);
        return this.f42569a.p();
    }

    public final void E(List<Integer> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5377x;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 2) {
                int w11 = abstractC5363i.w();
                V(w11);
                int b11 = abstractC5363i.b() + w11;
                do {
                    list.add(Integer.valueOf(abstractC5363i.p()));
                } while (abstractC5363i.b() < b11);
                return;
            }
            if (i11 != 5) {
                throw C5379z.d();
            }
            do {
                list.add(Integer.valueOf(abstractC5363i.p()));
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v11 = abstractC5363i.v();
                }
            } while (v11 == this.f42570b);
            this.f42572d = v11;
            return;
        }
        C5377x c5377x = (C5377x) list;
        int i12 = this.f42570b & 7;
        if (i12 == 2) {
            int w12 = abstractC5363i.w();
            V(w12);
            int b12 = abstractC5363i.b() + w12;
            do {
                c5377x.addInt(abstractC5363i.p());
            } while (abstractC5363i.b() < b12);
            return;
        }
        if (i12 != 5) {
            throw C5379z.d();
        }
        do {
            c5377x.addInt(abstractC5363i.p());
            if (abstractC5363i.c()) {
                return;
            } else {
                v12 = abstractC5363i.v();
            }
        } while (v12 == this.f42570b);
        this.f42572d = v12;
    }

    public final long F() throws IOException {
        T(1);
        return this.f42569a.q();
    }

    public final void G(List<Long> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof H;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(abstractC5363i.q()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int w11 = abstractC5363i.w();
            W(w11);
            int b11 = abstractC5363i.b() + w11;
            do {
                list.add(Long.valueOf(abstractC5363i.q()));
            } while (abstractC5363i.b() < b11);
            return;
        }
        H h11 = (H) list;
        int i12 = this.f42570b & 7;
        if (i12 == 1) {
            do {
                h11.addLong(abstractC5363i.q());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int w12 = abstractC5363i.w();
        W(w12);
        int b12 = abstractC5363i.b() + w12;
        do {
            h11.addLong(abstractC5363i.q());
        } while (abstractC5363i.b() < b12);
    }

    public final int H() throws IOException {
        T(0);
        return this.f42569a.r();
    }

    public final void I(List<Integer> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5377x;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC5363i.r()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int b11 = abstractC5363i.b() + abstractC5363i.w();
            do {
                list.add(Integer.valueOf(abstractC5363i.r()));
            } while (abstractC5363i.b() < b11);
            S(b11);
            return;
        }
        C5377x c5377x = (C5377x) list;
        int i12 = this.f42570b & 7;
        if (i12 == 0) {
            do {
                c5377x.addInt(abstractC5363i.r());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int b12 = abstractC5363i.b() + abstractC5363i.w();
        do {
            c5377x.addInt(abstractC5363i.r());
        } while (abstractC5363i.b() < b12);
        S(b12);
    }

    public final long J() throws IOException {
        T(0);
        return this.f42569a.s();
    }

    public final void K(List<Long> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof H;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(abstractC5363i.s()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int b11 = abstractC5363i.b() + abstractC5363i.w();
            do {
                list.add(Long.valueOf(abstractC5363i.s()));
            } while (abstractC5363i.b() < b11);
            S(b11);
            return;
        }
        H h11 = (H) list;
        int i12 = this.f42570b & 7;
        if (i12 == 0) {
            do {
                h11.addLong(abstractC5363i.s());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int b12 = abstractC5363i.b() + abstractC5363i.w();
        do {
            h11.addLong(abstractC5363i.s());
        } while (abstractC5363i.b() < b12);
        S(b12);
    }

    public final String L() throws IOException {
        T(2);
        return this.f42569a.t();
    }

    public final void M(List<String> list, boolean z11) throws IOException {
        int v11;
        int v12;
        if ((this.f42570b & 7) != 2) {
            throw C5379z.d();
        }
        boolean z12 = list instanceof D;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z12 || z11) {
            do {
                list.add(z11 ? N() : L());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v11 = abstractC5363i.v();
                }
            } while (v11 == this.f42570b);
            this.f42572d = v11;
            return;
        }
        D d11 = (D) list;
        do {
            j();
            d11.p();
            if (abstractC5363i.c()) {
                return;
            } else {
                v12 = abstractC5363i.v();
            }
        } while (v12 == this.f42570b);
        this.f42572d = v12;
    }

    public final String N() throws IOException {
        T(2);
        return this.f42569a.u();
    }

    public final int O() throws IOException {
        T(0);
        return this.f42569a.w();
    }

    public final void P(List<Integer> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5377x;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC5363i.w()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int b11 = abstractC5363i.b() + abstractC5363i.w();
            do {
                list.add(Integer.valueOf(abstractC5363i.w()));
            } while (abstractC5363i.b() < b11);
            S(b11);
            return;
        }
        C5377x c5377x = (C5377x) list;
        int i12 = this.f42570b & 7;
        if (i12 == 0) {
            do {
                c5377x.addInt(abstractC5363i.w());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int b12 = abstractC5363i.b() + abstractC5363i.w();
        do {
            c5377x.addInt(abstractC5363i.w());
        } while (abstractC5363i.b() < b12);
        S(b12);
    }

    public final long Q() throws IOException {
        T(0);
        return this.f42569a.x();
    }

    public final void R(List<Long> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof H;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(abstractC5363i.x()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int b11 = abstractC5363i.b() + abstractC5363i.w();
            do {
                list.add(Long.valueOf(abstractC5363i.x()));
            } while (abstractC5363i.b() < b11);
            S(b11);
            return;
        }
        H h11 = (H) list;
        int i12 = this.f42570b & 7;
        if (i12 == 0) {
            do {
                h11.addLong(abstractC5363i.x());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int b12 = abstractC5363i.b() + abstractC5363i.w();
        do {
            h11.addLong(abstractC5363i.x());
        } while (abstractC5363i.b() < b12);
        S(b12);
    }

    public final boolean U() throws IOException {
        int i11;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (abstractC5363i.c() || (i11 = this.f42570b) == this.f42571c) {
            return false;
        }
        return abstractC5363i.y(i11);
    }

    public final int b() throws IOException {
        int i11 = this.f42572d;
        if (i11 != 0) {
            this.f42570b = i11;
            this.f42572d = 0;
        } else {
            this.f42570b = this.f42569a.v();
        }
        int i12 = this.f42570b;
        if (i12 == 0 || i12 == this.f42571c) {
            return Integer.MAX_VALUE;
        }
        return i12 >>> 3;
    }

    public final int c() {
        return this.f42570b;
    }

    public final void d(Q q11, f0 f0Var, C5369o c5369o) throws IOException {
        T(3);
        e(q11, f0Var, c5369o);
    }

    public final void f(Q q11, f0 f0Var, C5369o c5369o) throws IOException {
        T(2);
        g(q11, f0Var, c5369o);
    }

    public final boolean h() throws IOException {
        T(0);
        return this.f42569a.g();
    }

    public final void i(List<Boolean> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5359e;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC5363i.g()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int b11 = abstractC5363i.b() + abstractC5363i.w();
            do {
                list.add(Boolean.valueOf(abstractC5363i.g()));
            } while (abstractC5363i.b() < b11);
            S(b11);
            return;
        }
        C5359e c5359e = (C5359e) list;
        int i12 = this.f42570b & 7;
        if (i12 == 0) {
            do {
                c5359e.addBoolean(abstractC5363i.g());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int b12 = abstractC5363i.b() + abstractC5363i.w();
        do {
            c5359e.addBoolean(abstractC5363i.g());
        } while (abstractC5363i.b() < b12);
        S(b12);
    }

    public final AbstractC5362h j() throws IOException {
        T(2);
        return this.f42569a.h();
    }

    public final void k(List<AbstractC5362h> list) throws IOException {
        int v11;
        if ((this.f42570b & 7) != 2) {
            throw C5379z.d();
        }
        do {
            list.add(j());
            AbstractC5363i abstractC5363i = this.f42569a;
            if (abstractC5363i.c()) {
                return;
            } else {
                v11 = abstractC5363i.v();
            }
        } while (v11 == this.f42570b);
        this.f42572d = v11;
    }

    public final double l() throws IOException {
        T(1);
        return this.f42569a.i();
    }

    public final void m(List<Double> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5367m;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(abstractC5363i.i()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int w11 = abstractC5363i.w();
            W(w11);
            int b11 = abstractC5363i.b() + w11;
            do {
                list.add(Double.valueOf(abstractC5363i.i()));
            } while (abstractC5363i.b() < b11);
            return;
        }
        C5367m c5367m = (C5367m) list;
        int i12 = this.f42570b & 7;
        if (i12 == 1) {
            do {
                c5367m.addDouble(abstractC5363i.i());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int w12 = abstractC5363i.w();
        W(w12);
        int b12 = abstractC5363i.b() + w12;
        do {
            c5367m.addDouble(abstractC5363i.i());
        } while (abstractC5363i.b() < b12);
    }

    public final int n() throws IOException {
        T(0);
        return this.f42569a.j();
    }

    public final void o(List<Integer> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5377x;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC5363i.j()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int b11 = abstractC5363i.b() + abstractC5363i.w();
            do {
                list.add(Integer.valueOf(abstractC5363i.j()));
            } while (abstractC5363i.b() < b11);
            S(b11);
            return;
        }
        C5377x c5377x = (C5377x) list;
        int i12 = this.f42570b & 7;
        if (i12 == 0) {
            do {
                c5377x.addInt(abstractC5363i.j());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int b12 = abstractC5363i.b() + abstractC5363i.w();
        do {
            c5377x.addInt(abstractC5363i.j());
        } while (abstractC5363i.b() < b12);
        S(b12);
    }

    public final int q() throws IOException {
        T(5);
        return this.f42569a.k();
    }

    public final void r(List<Integer> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5377x;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 2) {
                int w11 = abstractC5363i.w();
                V(w11);
                int b11 = abstractC5363i.b() + w11;
                do {
                    list.add(Integer.valueOf(abstractC5363i.k()));
                } while (abstractC5363i.b() < b11);
                return;
            }
            if (i11 != 5) {
                throw C5379z.d();
            }
            do {
                list.add(Integer.valueOf(abstractC5363i.k()));
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v11 = abstractC5363i.v();
                }
            } while (v11 == this.f42570b);
            this.f42572d = v11;
            return;
        }
        C5377x c5377x = (C5377x) list;
        int i12 = this.f42570b & 7;
        if (i12 == 2) {
            int w12 = abstractC5363i.w();
            V(w12);
            int b12 = abstractC5363i.b() + w12;
            do {
                c5377x.addInt(abstractC5363i.k());
            } while (abstractC5363i.b() < b12);
            return;
        }
        if (i12 != 5) {
            throw C5379z.d();
        }
        do {
            c5377x.addInt(abstractC5363i.k());
            if (abstractC5363i.c()) {
                return;
            } else {
                v12 = abstractC5363i.v();
            }
        } while (v12 == this.f42570b);
        this.f42572d = v12;
    }

    public final long s() throws IOException {
        T(1);
        return this.f42569a.l();
    }

    public final void t(List<Long> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof H;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(abstractC5363i.l()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int w11 = abstractC5363i.w();
            W(w11);
            int b11 = abstractC5363i.b() + w11;
            do {
                list.add(Long.valueOf(abstractC5363i.l()));
            } while (abstractC5363i.b() < b11);
            return;
        }
        H h11 = (H) list;
        int i12 = this.f42570b & 7;
        if (i12 == 1) {
            do {
                h11.addLong(abstractC5363i.l());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int w12 = abstractC5363i.w();
        W(w12);
        int b12 = abstractC5363i.b() + w12;
        do {
            h11.addLong(abstractC5363i.l());
        } while (abstractC5363i.b() < b12);
    }

    public final float u() throws IOException {
        T(5);
        return this.f42569a.m();
    }

    public final void v(List<Float> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5374u;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 2) {
                int w11 = abstractC5363i.w();
                V(w11);
                int b11 = abstractC5363i.b() + w11;
                do {
                    list.add(Float.valueOf(abstractC5363i.m()));
                } while (abstractC5363i.b() < b11);
                return;
            }
            if (i11 != 5) {
                throw C5379z.d();
            }
            do {
                list.add(Float.valueOf(abstractC5363i.m()));
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v11 = abstractC5363i.v();
                }
            } while (v11 == this.f42570b);
            this.f42572d = v11;
            return;
        }
        C5374u c5374u = (C5374u) list;
        int i12 = this.f42570b & 7;
        if (i12 == 2) {
            int w12 = abstractC5363i.w();
            V(w12);
            int b12 = abstractC5363i.b() + w12;
            do {
                c5374u.addFloat(abstractC5363i.m());
            } while (abstractC5363i.b() < b12);
            return;
        }
        if (i12 != 5) {
            throw C5379z.d();
        }
        do {
            c5374u.addFloat(abstractC5363i.m());
            if (abstractC5363i.c()) {
                return;
            } else {
                v12 = abstractC5363i.v();
            }
        } while (v12 == this.f42570b);
        this.f42572d = v12;
    }

    @Deprecated
    public final <T> void w(List<T> list, f0<T> f0Var, C5369o c5369o) throws IOException {
        int v11;
        int i11 = this.f42570b;
        if ((i11 & 7) != 3) {
            throw C5379z.d();
        }
        do {
            T newInstance = f0Var.newInstance();
            e(newInstance, f0Var, c5369o);
            f0Var.makeImmutable(newInstance);
            list.add(newInstance);
            AbstractC5363i abstractC5363i = this.f42569a;
            if (abstractC5363i.c() || this.f42572d != 0) {
                return;
            } else {
                v11 = abstractC5363i.v();
            }
        } while (v11 == i11);
        this.f42572d = v11;
    }

    public final int x() throws IOException {
        T(0);
        return this.f42569a.n();
    }

    public final void y(List<Integer> list) throws IOException {
        int v11;
        int v12;
        boolean z11 = list instanceof C5377x;
        AbstractC5363i abstractC5363i = this.f42569a;
        if (!z11) {
            int i11 = this.f42570b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC5363i.n()));
                    if (abstractC5363i.c()) {
                        return;
                    } else {
                        v11 = abstractC5363i.v();
                    }
                } while (v11 == this.f42570b);
                this.f42572d = v11;
                return;
            }
            if (i11 != 2) {
                throw C5379z.d();
            }
            int b11 = abstractC5363i.b() + abstractC5363i.w();
            do {
                list.add(Integer.valueOf(abstractC5363i.n()));
            } while (abstractC5363i.b() < b11);
            S(b11);
            return;
        }
        C5377x c5377x = (C5377x) list;
        int i12 = this.f42570b & 7;
        if (i12 == 0) {
            do {
                c5377x.addInt(abstractC5363i.n());
                if (abstractC5363i.c()) {
                    return;
                } else {
                    v12 = abstractC5363i.v();
                }
            } while (v12 == this.f42570b);
            this.f42572d = v12;
            return;
        }
        if (i12 != 2) {
            throw C5379z.d();
        }
        int b12 = abstractC5363i.b() + abstractC5363i.w();
        do {
            c5377x.addInt(abstractC5363i.n());
        } while (abstractC5363i.b() < b12);
        S(b12);
    }

    public final long z() throws IOException {
        T(0);
        return this.f42569a.o();
    }
}
