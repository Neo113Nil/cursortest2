package Pd;

import Nd.b;
import Nd.i;
import Nd.j;
import Nd.w;
import Td.i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public static final a f22214A;

    /* renamed from: B, reason: collision with root package name */
    public static final a f22215B;

    /* renamed from: C, reason: collision with root package name */
    public static final a f22216C;

    /* renamed from: D, reason: collision with root package name */
    public static final a f22217D;

    /* renamed from: E, reason: collision with root package name */
    public static final a f22218E;

    /* renamed from: F, reason: collision with root package name */
    public static final a f22219F;

    /* renamed from: G, reason: collision with root package name */
    public static final a f22220G;

    /* renamed from: H, reason: collision with root package name */
    public static final a f22221H;

    /* renamed from: I, reason: collision with root package name */
    public static final a f22222I;

    /* renamed from: J, reason: collision with root package name */
    public static final a f22223J;

    /* renamed from: K, reason: collision with root package name */
    public static final a f22224K;

    /* renamed from: L, reason: collision with root package name */
    public static final a f22225L;

    /* renamed from: M, reason: collision with root package name */
    public static final a f22226M;

    /* renamed from: N, reason: collision with root package name */
    public static final a f22227N;

    /* renamed from: a, reason: collision with root package name */
    public static final a f22228a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f22229b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f22230c;

    /* renamed from: d, reason: collision with root package name */
    public static final c<w> f22231d;

    /* renamed from: e, reason: collision with root package name */
    public static final c<j> f22232e;

    /* renamed from: f, reason: collision with root package name */
    public static final c<b.c> f22233f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f22234g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f22235h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f22236i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f22237j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f22238k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f22239l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f22240m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f22241n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f22242o;

    /* renamed from: p, reason: collision with root package name */
    public static final c<i> f22243p;

    /* renamed from: q, reason: collision with root package name */
    public static final a f22244q;

    /* renamed from: r, reason: collision with root package name */
    public static final a f22245r;

    /* renamed from: s, reason: collision with root package name */
    public static final a f22246s;

    /* renamed from: t, reason: collision with root package name */
    public static final a f22247t;

    /* renamed from: u, reason: collision with root package name */
    public static final a f22248u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f22249v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f22250w;

    /* renamed from: x, reason: collision with root package name */
    public static final a f22251x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f22252y;

    /* renamed from: z, reason: collision with root package name */
    public static final a f22253z;

    public static class a extends c<Boolean> {
        @Override // Pd.b.c
        @NotNull
        public final /* bridge */ /* synthetic */ Boolean c(int i11) {
            throw null;
        }

        @NotNull
        public final Boolean d(int i11) {
            return Boolean.valueOf((i11 & (1 << this.f22255a)) != 0);
        }
    }

    /* renamed from: Pd.b$b, reason: collision with other inner class name */
    private static class C0441b<E extends i.a> extends c<E> {

        /* renamed from: c, reason: collision with root package name */
        private final E[] f22254c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0441b(int i11, E[] eArr) {
            super(i11, r1);
            if (eArr == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            }
            int i12 = 1;
            int length = eArr.length - 1;
            if (length != 0) {
                for (int i13 = 31; i13 >= 0; i13--) {
                    if (((1 << i13) & length) != 0) {
                        i12 = 1 + i13;
                    }
                }
                throw new IllegalStateException("Empty enum: " + eArr.getClass());
            }
            this.f22254c = eArr;
        }

        @Override // Pd.b.c
        public final Object c(int i11) {
            int i12 = (1 << this.f22256b) - 1;
            int i13 = this.f22255a;
            int i14 = (i11 & (i12 << i13)) >> i13;
            for (E e11 : this.f22254c) {
                if (e11.getNumber() == i14) {
                    return e11;
                }
            }
            return null;
        }
    }

    public static abstract class c<E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f22255a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22256b;

        c(int i11, int i12) {
            this.f22255a = i11;
            this.f22256b = i12;
        }

        public static a a(c<?> cVar) {
            return new a(cVar.f22255a + cVar.f22256b, 1);
        }

        public static a b() {
            return new a(0, 1);
        }

        public abstract E c(int i11);
    }

    static {
        a b11 = c.b();
        f22228a = b11;
        f22229b = c.a(b11);
        a b12 = c.b();
        f22230c = b12;
        w[] values = w.values();
        int i11 = b12.f22255a + b12.f22256b;
        C0441b c0441b = new C0441b(i11, values);
        f22231d = c0441b;
        j[] values2 = j.values();
        int i12 = i11 + c0441b.f22256b;
        C0441b c0441b2 = new C0441b(i12, values2);
        f22232e = c0441b2;
        b.c[] values3 = b.c.values();
        int i13 = c0441b2.f22256b;
        C0441b c0441b3 = new C0441b(i12 + i13, values3);
        f22233f = c0441b3;
        a a11 = c.a(c0441b3);
        f22234g = a11;
        a a12 = c.a(a11);
        f22235h = a12;
        a a13 = c.a(a12);
        f22236i = a13;
        a a14 = c.a(a13);
        f22237j = a14;
        a a15 = c.a(a14);
        f22238k = a15;
        a a16 = c.a(a15);
        f22239l = a16;
        f22240m = c.a(a16);
        a a17 = c.a(c0441b);
        f22241n = a17;
        f22242o = c.a(a17);
        C0441b c0441b4 = new C0441b(i12 + i13, Nd.i.values());
        f22243p = c0441b4;
        a a18 = c.a(c0441b4);
        f22244q = a18;
        a a19 = c.a(a18);
        f22245r = a19;
        a a21 = c.a(a19);
        f22246s = a21;
        a a22 = c.a(a21);
        f22247t = a22;
        a a23 = c.a(a22);
        f22248u = a23;
        a a24 = c.a(a23);
        f22249v = a24;
        a a25 = c.a(a24);
        f22250w = a25;
        f22251x = c.a(a25);
        a a26 = c.a(c0441b4);
        f22252y = a26;
        a a27 = c.a(a26);
        f22253z = a27;
        a a28 = c.a(a27);
        f22214A = a28;
        a a29 = c.a(a28);
        f22215B = a29;
        a a31 = c.a(a29);
        f22216C = a31;
        a a32 = c.a(a31);
        f22217D = a32;
        a a33 = c.a(a32);
        f22218E = a33;
        a a34 = c.a(a33);
        f22219F = a34;
        f22220G = c.a(a34);
        a a35 = c.a(b12);
        f22221H = a35;
        a a36 = c.a(a35);
        f22222I = a36;
        f22223J = c.a(a36);
        a a37 = c.a(c0441b2);
        f22224K = a37;
        a a38 = c.a(a37);
        f22225L = a38;
        f22226M = c.a(a38);
        f22227N = c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        if (i11 != 1) {
            if (i11 == 2) {
                objArr[0] = "kind";
            } else if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 8) {
                        if (i11 != 9) {
                            if (i11 != 11) {
                                objArr[0] = "visibility";
                            }
                        }
                    }
                }
                objArr[0] = "memberKind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i11) {
                case 3:
                    objArr[2] = "getConstructorFlags";
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case 7:
                case 8:
                case 9:
                    objArr[2] = "getPropertyFlags";
                    break;
                case 10:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i11) {
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int b(boolean z11, @NotNull w wVar, @NotNull j jVar) {
        if (wVar == null) {
            a(10);
            throw null;
        }
        if (jVar == null) {
            a(11);
            throw null;
        }
        a aVar = f22230c;
        aVar.getClass();
        int i11 = z11 ? 1 << aVar.f22255a : 0;
        C0441b c0441b = (C0441b) f22232e;
        c0441b.getClass();
        int number = i11 | (jVar.getNumber() << c0441b.f22255a);
        C0441b c0441b2 = (C0441b) f22231d;
        c0441b2.getClass();
        int number2 = number | (wVar.getNumber() << c0441b2.f22255a);
        f22224K.getClass();
        f22225L.getClass();
        f22226M.getClass();
        return number2;
    }
}
