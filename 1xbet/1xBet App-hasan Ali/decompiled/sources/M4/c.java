package M4;

import L4.C0226i;
import L4.C0229l;
import L4.z;
import X3.m;
import X3.n;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0229l f3621a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0229l f3622b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0229l f3623c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0229l f3624d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0229l f3625e;

    static {
        C0229l c0229l = C0229l.f3092n;
        f3621a = j3.i.q("/");
        f3622b = j3.i.q("\\");
        f3623c = j3.i.q("/\\");
        f3624d = j3.i.q(".");
        f3625e = j3.i.q("..");
    }

    public static final int a(z zVar) {
        if (zVar.f3127k.c() != 0) {
            C0229l c0229l = zVar.f3127k;
            if (c0229l.h(0) != 47) {
                if (c0229l.h(0) == 92) {
                    if (c0229l.c() > 2 && c0229l.h(1) == 92) {
                        C0229l c0229l2 = f3622b;
                        l.f("other", c0229l2);
                        int e3 = c0229l.e(2, c0229l2.f3093k);
                        return e3 == -1 ? c0229l.c() : e3;
                    }
                } else if (c0229l.c() > 2 && c0229l.h(1) == 58 && c0229l.h(2) == 92) {
                    char h3 = (char) c0229l.h(0);
                    if ('a' <= h3 && h3 < '{') {
                        return 3;
                    }
                    if ('A' <= h3 && h3 < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final z b(z zVar, z zVar2, boolean z3) {
        l.f("<this>", zVar);
        l.f("child", zVar2);
        if (a(zVar2) != -1 || zVar2.g() != null) {
            return zVar2;
        }
        C0229l c5 = c(zVar);
        if (c5 == null && (c5 = c(zVar2)) == null) {
            c5 = f(z.f3126l);
        }
        C0226i c0226i = new C0226i();
        c0226i.M(zVar.f3127k);
        if (c0226i.f3091l > 0) {
            c0226i.M(c5);
        }
        c0226i.M(zVar2.f3127k);
        return d(c0226i, z3);
    }

    public static final C0229l c(z zVar) {
        C0229l c0229l = zVar.f3127k;
        C0229l c0229l2 = f3621a;
        if (C0229l.f(c0229l, c0229l2) != -1) {
            return c0229l2;
        }
        C0229l c0229l3 = f3622b;
        if (C0229l.f(zVar.f3127k, c0229l3) != -1) {
            return c0229l3;
        }
        return null;
    }

    public static final z d(C0226i c0226i, boolean z3) {
        C0229l c0229l;
        C0229l c0229l2;
        char m5;
        C0229l c0229l3;
        C0229l v4;
        C0226i c0226i2 = new C0226i();
        C0229l c0229l4 = null;
        int i = 0;
        while (true) {
            if (!c0226i.p(f3621a)) {
                c0229l = f3622b;
                if (!c0226i.p(c0229l)) {
                    break;
                }
            }
            byte s2 = c0226i.s();
            if (c0229l4 == null) {
                c0229l4 = e(s2);
            }
            i++;
        }
        boolean z5 = i >= 2 && l.a(c0229l4, c0229l);
        C0229l c0229l5 = f3623c;
        long j5 = 0;
        if (z5) {
            l.c(c0229l4);
            c0226i2.M(c0229l4);
            c0226i2.M(c0229l4);
        } else if (i > 0) {
            l.c(c0229l4);
            c0226i2.M(c0229l4);
        } else {
            long n5 = c0226i.n(c0229l5);
            if (c0229l4 == null) {
                c0229l4 = n5 == -1 ? f(z.f3126l) : e(c0226i.m(n5));
            }
            if (l.a(c0229l4, c0229l)) {
                c0229l2 = c0229l4;
                if (c0226i.f3091l >= 2 && c0226i.m(1L) == 58 && (('a' <= (m5 = (char) c0226i.m(0L)) && m5 < '{') || ('A' <= m5 && m5 < '['))) {
                    if (n5 == 2) {
                        c0226i2.D(c0226i, 3L);
                    } else {
                        c0226i2.D(c0226i, 2L);
                    }
                }
            } else {
                c0229l2 = c0229l4;
            }
            c0229l4 = c0229l2;
        }
        boolean z6 = c0226i2.f3091l > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean l5 = c0226i.l();
            c0229l3 = f3624d;
            if (l5) {
                break;
            }
            long j6 = j5;
            long n6 = c0226i.n(c0229l5);
            if (n6 == -1) {
                v4 = c0226i.v(c0226i.f3091l);
            } else {
                v4 = c0226i.v(n6);
                c0226i.s();
            }
            C0229l c0229l6 = f3625e;
            if (l.a(v4, c0229l6)) {
                if (!z6 || !arrayList.isEmpty()) {
                    if (!z3 || (!z6 && (arrayList.isEmpty() || l.a(m.e0(arrayList), c0229l6)))) {
                        arrayList.add(v4);
                    } else if ((!z5 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(n.N(arrayList));
                    }
                }
            } else if (!l.a(v4, c0229l3) && !l.a(v4, C0229l.f3092n)) {
                arrayList.add(v4);
            }
            j5 = j6;
        }
        long j7 = j5;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                c0226i2.M(c0229l4);
            }
            c0226i2.M((C0229l) arrayList.get(i5));
        }
        if (c0226i2.f3091l == j7) {
            c0226i2.M(c0229l3);
        }
        return new z(c0226i2.v(c0226i2.f3091l));
    }

    public static final C0229l e(byte b3) {
        if (b3 == 47) {
            return f3621a;
        }
        if (b3 == 92) {
            return f3622b;
        }
        throw new IllegalArgumentException(AbstractC2107A.q("not a directory separator: ", b3));
    }

    public static final C0229l f(String str) {
        if (l.a(str, "/")) {
            return f3621a;
        }
        if (l.a(str, "\\")) {
            return f3622b;
        }
        throw new IllegalArgumentException(L1.a.m("not a directory separator: ", str));
    }
}
