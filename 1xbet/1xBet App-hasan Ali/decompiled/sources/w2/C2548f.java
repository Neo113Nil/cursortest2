package w2;

import G4.l;
import L4.B;
import L4.C;
import L4.C0220c;
import L4.K;
import L4.v;
import L4.x;
import L4.z;
import P.W;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import o4.C2226d;
import p4.AbstractC2282w;
import t3.AbstractC2425d;

/* renamed from: w2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2548f implements Closeable, Flushable, AutoCloseable {

    /* renamed from: A, reason: collision with root package name */
    public static final C2226d f20507A = new C2226d("[a-z0-9_-]{1,120}");

    /* renamed from: k, reason: collision with root package name */
    public final z f20508k;

    /* renamed from: l, reason: collision with root package name */
    public final long f20509l;

    /* renamed from: m, reason: collision with root package name */
    public final z f20510m;

    /* renamed from: n, reason: collision with root package name */
    public final z f20511n;

    /* renamed from: o, reason: collision with root package name */
    public final z f20512o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f20513p;

    /* renamed from: q, reason: collision with root package name */
    public final u4.c f20514q;

    /* renamed from: r, reason: collision with root package name */
    public long f20515r;

    /* renamed from: s, reason: collision with root package name */
    public int f20516s;

    /* renamed from: t, reason: collision with root package name */
    public B f20517t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20518u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20519v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20520w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20521x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20522y;

    /* renamed from: z, reason: collision with root package name */
    public final C2546d f20523z;

    public C2548f(long j5, v vVar, z zVar, w4.d dVar) {
        this.f20508k = zVar;
        this.f20509l = j5;
        if (j5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f20510m = zVar.d("journal");
        this.f20511n = zVar.d("journal.tmp");
        this.f20512o = zVar.d("journal.bkp");
        this.f20513p = new LinkedHashMap(0, 0.75f, true);
        this.f20514q = AbstractC2282w.a(l.H(AbstractC2282w.b(), dVar.G(1)));
        this.f20523z = new C2546d(vVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
    
        if ((r9.f20516s >= 2000) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:16:0x0030, B:26:0x003e, B:28:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:36:0x005c, B:38:0x006c, B:40:0x00aa, B:42:0x00b1, B:45:0x00b6, B:47:0x00c7, B:50:0x00cc, B:51:0x0107, B:53:0x0112, B:59:0x011b, B:60:0x00e4, B:62:0x00f9, B:64:0x0104, B:67:0x009a, B:69:0x0120, B:70:0x0127), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C2548f c2548f, W w5, boolean z3) {
        synchronized (c2548f) {
            C2544b c2544b = (C2544b) w5.f4412l;
            if (!kotlin.jvm.internal.l.a(c2544b.f20500g, w5)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z3 || c2544b.f) {
                for (int i = 0; i < 2; i++) {
                    c2548f.f20523z.b((z) c2544b.f20498d.get(i));
                }
            } else {
                for (int i5 = 0; i5 < 2; i5++) {
                    if (((boolean[]) w5.f4413m)[i5] && !c2548f.f20523z.c((z) c2544b.f20498d.get(i5))) {
                        w5.c(false);
                        return;
                    }
                }
                for (int i6 = 0; i6 < 2; i6++) {
                    z zVar = (z) c2544b.f20498d.get(i6);
                    z zVar2 = (z) c2544b.f20497c.get(i6);
                    if (c2548f.f20523z.c(zVar)) {
                        c2548f.f20523z.j(zVar, zVar2);
                    } else {
                        C2546d c2546d = c2548f.f20523z;
                        z zVar3 = (z) c2544b.f20497c.get(i6);
                        if (!c2546d.c(zVar3)) {
                            H2.e.a(c2546d.h(zVar3));
                        }
                    }
                    long j5 = c2544b.f20496b[i6];
                    Long l5 = (Long) c2548f.f20523z.e(zVar2).f3103e;
                    long longValue = l5 != null ? l5.longValue() : 0L;
                    c2544b.f20496b[i6] = longValue;
                    c2548f.f20515r = (c2548f.f20515r - j5) + longValue;
                }
            }
            c2544b.f20500g = null;
            if (c2544b.f) {
                c2548f.p(c2544b);
                return;
            }
            c2548f.f20516s++;
            B b3 = c2548f.f20517t;
            kotlin.jvm.internal.l.c(b3);
            if (!z3 && !c2544b.f20499e) {
                c2548f.f20513p.remove(c2544b.f20495a);
                b3.x("REMOVE");
                b3.o(32);
                b3.x(c2544b.f20495a);
                b3.o(10);
                b3.flush();
                if (c2548f.f20515r <= c2548f.f20509l) {
                }
                c2548f.i();
            }
            c2544b.f20499e = true;
            b3.x("CLEAN");
            b3.o(32);
            b3.x(c2544b.f20495a);
            for (long j6 : c2544b.f20496b) {
                b3.o(32);
                b3.y(j6);
            }
            b3.o(10);
            b3.flush();
            if (c2548f.f20515r <= c2548f.f20509l) {
            }
            c2548f.i();
        }
    }

    public static void s(String str) {
        C2226d c2226d = f20507A;
        c2226d.getClass();
        kotlin.jvm.internal.l.f("input", str);
        if (c2226d.f18666k.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f20519v && !this.f20520w) {
                for (C2544b c2544b : (C2544b[]) this.f20513p.values().toArray(new C2544b[0])) {
                    W w5 = c2544b.f20500g;
                    if (w5 != null) {
                        C2544b c2544b2 = (C2544b) w5.f4412l;
                        if (kotlin.jvm.internal.l.a(c2544b2.f20500g, w5)) {
                            c2544b2.f = true;
                        }
                    }
                }
                r();
                AbstractC2282w.d(this.f20514q, null);
                B b3 = this.f20517t;
                kotlin.jvm.internal.l.c(b3);
                b3.close();
                this.f20517t = null;
                this.f20520w = true;
                return;
            }
            this.f20520w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized W d(String str) {
        try {
            if (this.f20520w) {
                throw new IllegalStateException("cache is closed");
            }
            s(str);
            h();
            C2544b c2544b = (C2544b) this.f20513p.get(str);
            if ((c2544b != null ? c2544b.f20500g : null) != null) {
                return null;
            }
            if (c2544b != null && c2544b.f20501h != 0) {
                return null;
            }
            if (!this.f20521x && !this.f20522y) {
                B b3 = this.f20517t;
                kotlin.jvm.internal.l.c(b3);
                b3.x("DIRTY");
                b3.o(32);
                b3.x(str);
                b3.o(10);
                b3.flush();
                if (this.f20518u) {
                    return null;
                }
                if (c2544b == null) {
                    c2544b = new C2544b(this, str);
                    this.f20513p.put(str, c2544b);
                }
                W w5 = new W(this, c2544b);
                c2544b.f20500g = w5;
                return w5;
            }
            i();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C2545c f(String str) {
        C2545c a5;
        if (this.f20520w) {
            throw new IllegalStateException("cache is closed");
        }
        s(str);
        h();
        C2544b c2544b = (C2544b) this.f20513p.get(str);
        if (c2544b != null && (a5 = c2544b.a()) != null) {
            boolean z3 = true;
            this.f20516s++;
            B b3 = this.f20517t;
            kotlin.jvm.internal.l.c(b3);
            b3.x("READ");
            b3.o(32);
            b3.x(str);
            b3.o(10);
            if (this.f20516s < 2000) {
                z3 = false;
            }
            if (z3) {
                i();
            }
            return a5;
        }
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f20519v) {
            if (this.f20520w) {
                throw new IllegalStateException("cache is closed");
            }
            r();
            B b3 = this.f20517t;
            kotlin.jvm.internal.l.c(b3);
            b3.flush();
        }
    }

    public final synchronized void h() {
        try {
            if (this.f20519v) {
                return;
            }
            this.f20523z.b(this.f20511n);
            if (this.f20523z.c(this.f20512o)) {
                if (this.f20523z.c(this.f20510m)) {
                    this.f20523z.b(this.f20512o);
                } else {
                    this.f20523z.j(this.f20512o, this.f20510m);
                }
            }
            if (this.f20523z.c(this.f20510m)) {
                try {
                    m();
                    l();
                    this.f20519v = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        l.u(this.f20523z, this.f20508k);
                        this.f20520w = false;
                    } catch (Throwable th) {
                        this.f20520w = false;
                        throw th;
                    }
                }
            }
            t();
            this.f20519v = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i() {
        AbstractC2282w.p(this.f20514q, null, new C2547e(this, null), 3);
    }

    public final B k() {
        C2546d c2546d = this.f20523z;
        c2546d.getClass();
        z zVar = this.f20510m;
        kotlin.jvm.internal.l.f("file", zVar);
        c2546d.getClass();
        kotlin.jvm.internal.l.f("file", zVar);
        c2546d.f20505b.getClass();
        File e3 = zVar.e();
        Logger logger = x.f3123a;
        return N4.b.j(new C2549g(new C0220c(1, new FileOutputStream(e3, true), new K()), new O0.e(14, this)));
    }

    public final void l() {
        Iterator it = this.f20513p.values().iterator();
        long j5 = 0;
        while (it.hasNext()) {
            C2544b c2544b = (C2544b) it.next();
            int i = 0;
            if (c2544b.f20500g == null) {
                while (i < 2) {
                    j5 += c2544b.f20496b[i];
                    i++;
                }
            } else {
                c2544b.f20500g = null;
                while (i < 2) {
                    z zVar = (z) c2544b.f20497c.get(i);
                    C2546d c2546d = this.f20523z;
                    c2546d.b(zVar);
                    c2546d.b((z) c2544b.f20498d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f20515r = j5;
    }

    public final void m() {
        C k5 = N4.b.k(this.f20523z.i(this.f20510m));
        try {
            String r5 = k5.r(Long.MAX_VALUE);
            String r6 = k5.r(Long.MAX_VALUE);
            String r7 = k5.r(Long.MAX_VALUE);
            String r8 = k5.r(Long.MAX_VALUE);
            String r9 = k5.r(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(r5) || !"1".equals(r6) || !kotlin.jvm.internal.l.a(String.valueOf(1), r7) || !kotlin.jvm.internal.l.a(String.valueOf(2), r8) || r9.length() > 0) {
                throw new IOException("unexpected journal header: [" + r5 + ", " + r6 + ", " + r7 + ", " + r8 + ", " + r9 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    n(k5.r(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f20516s = i - this.f20513p.size();
                    if (k5.b()) {
                        this.f20517t = k();
                    } else {
                        t();
                    }
                    try {
                        k5.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                k5.close();
            } catch (Throwable th3) {
                AbstractC2425d.j(th, th3);
            }
        }
    }

    public final void n(String str) {
        String substring;
        int F02 = AbstractC2227e.F0(str, ' ', 0, 6);
        if (F02 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = F02 + 1;
        int F03 = AbstractC2227e.F0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f20513p;
        if (F03 == -1) {
            substring = str.substring(i);
            kotlin.jvm.internal.l.e("substring(...)", substring);
            if (F02 == 6 && AbstractC2234l.x0(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, F03);
            kotlin.jvm.internal.l.e("substring(...)", substring);
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new C2544b(this, substring);
            linkedHashMap.put(substring, obj);
        }
        C2544b c2544b = (C2544b) obj;
        if (F03 == -1 || F02 != 5 || !AbstractC2234l.x0(str, "CLEAN", false)) {
            if (F03 == -1 && F02 == 5 && AbstractC2234l.x0(str, "DIRTY", false)) {
                c2544b.f20500g = new W(this, c2544b);
                return;
            } else {
                if (F03 != -1 || F02 != 4 || !AbstractC2234l.x0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String substring2 = str.substring(F03 + 1);
        kotlin.jvm.internal.l.e("substring(...)", substring2);
        List L02 = AbstractC2227e.L0(substring2, new char[]{' '});
        c2544b.f20499e = true;
        c2544b.f20500g = null;
        int size = L02.size();
        c2544b.i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + L02);
        }
        try {
            int size2 = L02.size();
            for (int i5 = 0; i5 < size2; i5++) {
                c2544b.f20496b[i5] = Long.parseLong((String) L02.get(i5));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + L02);
        }
    }

    public final void p(C2544b c2544b) {
        B b3;
        int i = c2544b.f20501h;
        String str = c2544b.f20495a;
        if (i > 0 && (b3 = this.f20517t) != null) {
            b3.x("DIRTY");
            b3.o(32);
            b3.x(str);
            b3.o(10);
            b3.flush();
        }
        if (c2544b.f20501h > 0 || c2544b.f20500g != null) {
            c2544b.f = true;
            return;
        }
        for (int i5 = 0; i5 < 2; i5++) {
            this.f20523z.b((z) c2544b.f20497c.get(i5));
            long j5 = this.f20515r;
            long[] jArr = c2544b.f20496b;
            this.f20515r = j5 - jArr[i5];
            jArr[i5] = 0;
        }
        this.f20516s++;
        B b5 = this.f20517t;
        if (b5 != null) {
            b5.x("REMOVE");
            b5.o(32);
            b5.x(str);
            b5.o(10);
        }
        this.f20513p.remove(str);
        if (this.f20516s >= 2000) {
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        p(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        while (this.f20515r > this.f20509l) {
            for (C2544b c2544b : this.f20513p.values()) {
                if (!c2544b.f) {
                    break;
                }
            }
            return;
        }
        this.f20521x = false;
    }

    public final synchronized void t() {
        Throwable th;
        try {
            B b3 = this.f20517t;
            if (b3 != null) {
                b3.close();
            }
            B j5 = N4.b.j(this.f20523z.h(this.f20511n));
            try {
                j5.x("libcore.io.DiskLruCache");
                j5.o(10);
                j5.x("1");
                j5.o(10);
                j5.y(1);
                j5.o(10);
                j5.y(2);
                j5.o(10);
                j5.o(10);
                for (C2544b c2544b : this.f20513p.values()) {
                    if (c2544b.f20500g != null) {
                        j5.x("DIRTY");
                        j5.o(32);
                        j5.x(c2544b.f20495a);
                        j5.o(10);
                    } else {
                        j5.x("CLEAN");
                        j5.o(32);
                        j5.x(c2544b.f20495a);
                        for (long j6 : c2544b.f20496b) {
                            j5.o(32);
                            j5.y(j6);
                        }
                        j5.o(10);
                    }
                }
                try {
                    j5.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    j5.close();
                } catch (Throwable th4) {
                    AbstractC2425d.j(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.f20523z.c(this.f20510m)) {
                this.f20523z.j(this.f20510m, this.f20512o);
                this.f20523z.j(this.f20511n, this.f20510m);
                this.f20523z.b(this.f20512o);
            } else {
                this.f20523z.j(this.f20511n, this.f20510m);
            }
            this.f20517t = k();
            this.f20516s = 0;
            this.f20518u = false;
            this.f20522y = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }
}
