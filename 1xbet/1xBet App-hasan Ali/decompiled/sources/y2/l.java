package y2;

import G4.n;
import L4.C;
import L4.C0229l;
import L4.InterfaceC0228k;
import L4.o;
import P.W;
import Q2.C0375o;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.C1234l6;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import n.C2138i;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import p4.C2268h;
import r0.AbstractC2346c;
import t3.AbstractC2425d;
import v.w0;
import w2.C2545c;
import w2.C2548f;
import w2.C2550h;
import w2.C2551i;
import y4.B;
import y4.C2675c;
import y4.InterfaceC2676d;
import y4.q;
import y4.u;
import y4.y;
import y4.z;

/* loaded from: classes.dex */
public final class l implements g {
    public static final C2675c f = new C2675c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g, reason: collision with root package name */
    public static final C2675c f21211g = new C2675c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final String f21212a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.m f21213b;

    /* renamed from: c, reason: collision with root package name */
    public final W3.m f21214c;

    /* renamed from: d, reason: collision with root package name */
    public final W3.m f21215d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21216e;

    public l(String str, E2.m mVar, W3.m mVar2, W3.m mVar3, boolean z3) {
        this.f21212a = str;
        this.f21213b = mVar;
        this.f21214c = mVar2;
        this.f21215d = mVar3;
        this.f21216e = z3;
    }

    public static String d(String str, q qVar) {
        String b3;
        String str2 = qVar != null ? qVar.f21372a : null;
        if ((str2 == null || AbstractC2234l.x0(str2, "text/plain", false)) && (b3 = H2.e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b3;
        }
        if (str2 == null) {
            return null;
        }
        int F02 = AbstractC2227e.F0(str2, ';', 0, 6);
        if (F02 == -1) {
            return str2;
        }
        String substring = str2.substring(0, F02);
        kotlin.jvm.internal.l.e("substring(...)", substring);
        return substring;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0131 A[Catch: Exception -> 0x00d5, TryCatch #3 {Exception -> 0x00d5, blocks: (B:30:0x020c, B:31:0x020f, B:39:0x0157, B:41:0x0210, B:42:0x0215, B:83:0x009d, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:94:0x00f6, B:96:0x013e, B:100:0x010c, B:102:0x0118, B:103:0x0121, B:105:0x00bd, B:107:0x00c7, B:109:0x0129, B:110:0x0130, B:111:0x0131), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01dd A[Catch: Exception -> 0x0203, TryCatch #4 {Exception -> 0x0203, blocks: (B:17:0x01d7, B:19:0x01dd, B:22:0x01ff, B:26:0x0206, B:27:0x020b), top: B:16:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0206 A[Catch: Exception -> 0x0203, TryCatch #4 {Exception -> 0x0203, blocks: (B:17:0x01d7, B:19:0x01dd, B:22:0x01ff, B:26:0x0206, B:27:0x020b), top: B:16:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0210 A[Catch: Exception -> 0x00d5, TryCatch #3 {Exception -> 0x00d5, blocks: (B:30:0x020c, B:31:0x020f, B:39:0x0157, B:41:0x0210, B:42:0x0215, B:83:0x009d, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:94:0x00f6, B:96:0x013e, B:100:0x010c, B:102:0x0118, B:103:0x0121, B:105:0x00bd, B:107:0x00c7, B:109:0x0129, B:110:0x0130, B:111:0x0131), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009d A[Catch: Exception -> 0x00d5, TRY_ENTER, TryCatch #3 {Exception -> 0x00d5, blocks: (B:30:0x020c, B:31:0x020f, B:39:0x0157, B:41:0x0210, B:42:0x0215, B:83:0x009d, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:94:0x00f6, B:96:0x013e, B:100:0x010c, B:102:0x0118, B:103:0x0121, B:105:0x00bd, B:107:0x00c7, B:109:0x0129, B:110:0x0130, B:111:0x0131), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r3v16, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a4.c cVar) {
        k kVar;
        ?? r42;
        C2550h c2550h;
        C2550h c2550h2;
        D2.d a5;
        Object b3;
        D2.d dVar;
        l lVar;
        D2.b bVar;
        C2551i c2551i;
        B b5;
        z zVar;
        l lVar2;
        z zVar2;
        B b6;
        try {
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i = kVar.f21210p;
                if ((i & Integer.MIN_VALUE) != 0) {
                    kVar.f21210p = i - Integer.MIN_VALUE;
                    Object obj = kVar.f21208n;
                    EnumC0510a enumC0510a = EnumC0510a.f7289k;
                    r42 = kVar.f21210p;
                    v2.e eVar = v2.e.f20405n;
                    v2.e eVar2 = v2.e.f20404m;
                    if (r42 != 0) {
                        G4.l.N(obj);
                        E2.m mVar = this.f21213b;
                        boolean z3 = mVar.f1473n.f1403k;
                        String str = this.f21212a;
                        if (z3 && (c2551i = (C2551i) this.f21215d.getValue()) != null) {
                            String str2 = mVar.i;
                            if (str2 == null) {
                                str2 = str;
                            }
                            C0229l c0229l = C0229l.f3092n;
                            C2545c f5 = c2551i.f20528b.f(j3.i.q(str2).b("SHA-256").d());
                            if (f5 != null) {
                                c2550h2 = new C2550h(f5);
                                if (c2550h2 == null) {
                                    o c5 = c();
                                    C2545c c2545c = c2550h2.f20526k;
                                    if (c2545c.f20503l) {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                    Long l5 = (Long) c5.e((L4.z) c2545c.f20502k.f20497c.get(0)).f3103e;
                                    if (l5 != null && l5.longValue() == 0) {
                                        return new m(g(c2550h2), d(str, null), eVar2);
                                    }
                                    if (!this.f21216e) {
                                        v2.l g5 = g(c2550h2);
                                        D2.b f6 = f(c2550h2);
                                        return new m(g5, d(str, f6 != null ? (q) f6.f928b.getValue() : null), eVar2);
                                    }
                                    a5 = new D2.c(e(), f(c2550h2)).a();
                                    if (a5.f941a == null && (bVar = a5.f942b) != null) {
                                        return new m(g(c2550h2), d(str, (q) bVar.f928b.getValue()), eVar2);
                                    }
                                } else {
                                    a5 = new D2.c(e(), null).a();
                                }
                                C0.c cVar2 = a5.f941a;
                                kotlin.jvm.internal.l.c(cVar2);
                                kVar.f21205k = this;
                                kVar.f21206l = c2550h2;
                                kVar.f21207m = a5;
                                kVar.f21210p = 1;
                                b3 = b(cVar2, kVar);
                                if (b3 != enumC0510a) {
                                    return enumC0510a;
                                }
                                dVar = a5;
                                obj = b3;
                                lVar = this;
                            }
                        }
                        c2550h2 = null;
                        if (c2550h2 == null) {
                        }
                        C0.c cVar22 = a5.f941a;
                        kotlin.jvm.internal.l.c(cVar22);
                        kVar.f21205k = this;
                        kVar.f21206l = c2550h2;
                        kVar.f21207m = a5;
                        kVar.f21210p = 1;
                        b3 = b(cVar22, kVar);
                        if (b3 != enumC0510a) {
                        }
                    } else {
                        if (r42 != 1) {
                            if (r42 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zVar = (z) kVar.f21207m;
                            C2550h c2550h3 = kVar.f21206l;
                            lVar2 = kVar.f21205k;
                            try {
                                G4.l.N(obj);
                                zVar2 = (z) obj;
                            } catch (Exception e3) {
                                e = e3;
                                H2.e.a(zVar);
                                throw e;
                            }
                            try {
                                Bitmap.Config config = H2.e.f2284a;
                                b6 = zVar2.f21454q;
                                if (b6 != null) {
                                    throw new IllegalStateException("response body == null");
                                }
                                lVar2.getClass();
                                InterfaceC0228k f7 = b6.f();
                                Context context = lVar2.f21213b.f1462a;
                                v2.o oVar = new v2.o(f7, null);
                                String d5 = d(lVar2.f21212a, b6.d());
                                if (zVar2.f21455r == null) {
                                    eVar = eVar2;
                                }
                                return new m(oVar, d5, eVar);
                            } catch (Exception e5) {
                                e = e5;
                                zVar = zVar2;
                                H2.e.a(zVar);
                                throw e;
                            }
                        }
                        D2.d dVar2 = (D2.d) kVar.f21207m;
                        c2550h = kVar.f21206l;
                        lVar = kVar.f21205k;
                        try {
                            G4.l.N(obj);
                            dVar = dVar2;
                            c2550h2 = c2550h;
                        } catch (Exception e6) {
                            e = e6;
                            if (c2550h != null) {
                                H2.e.a(c2550h);
                            }
                            throw e;
                        }
                    }
                    z zVar3 = (z) obj;
                    Bitmap.Config config2 = H2.e.f2284a;
                    b5 = zVar3.f21454q;
                    if (b5 != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    try {
                        C2550h h3 = lVar.h(c2550h2, dVar.f941a, zVar3, dVar.f942b);
                        String str3 = lVar.f21212a;
                        if (h3 != null) {
                            v2.l g6 = lVar.g(h3);
                            D2.b f8 = lVar.f(h3);
                            return new m(g6, d(str3, f8 != null ? (q) f8.f928b.getValue() : null), eVar);
                        }
                        if (b5.f().j(1L)) {
                            InterfaceC0228k f9 = b5.f();
                            Context context2 = lVar.f21213b.f1462a;
                            v2.o oVar2 = new v2.o(f9, null);
                            String d6 = d(str3, b5.d());
                            if (zVar3.f21455r == null) {
                                eVar = eVar2;
                            }
                            return new m(oVar2, d6, eVar);
                        }
                        H2.e.a(zVar3);
                        C0.c e7 = lVar.e();
                        kVar.f21205k = lVar;
                        kVar.f21206l = h3;
                        kVar.f21207m = zVar3;
                        kVar.f21210p = 2;
                        obj = lVar.b(e7, kVar);
                        if (obj != enumC0510a) {
                            lVar2 = lVar;
                            zVar = zVar3;
                            zVar2 = (z) obj;
                            Bitmap.Config config3 = H2.e.f2284a;
                            b6 = zVar2.f21454q;
                            if (b6 != null) {
                            }
                        }
                        return enumC0510a;
                    } catch (Exception e8) {
                        e = e8;
                        zVar = zVar3;
                        H2.e.a(zVar);
                        throw e;
                    }
                }
            }
            if (r42 != 0) {
            }
            z zVar32 = (z) obj;
            Bitmap.Config config22 = H2.e.f2284a;
            b5 = zVar32.f21454q;
            if (b5 != null) {
            }
        } catch (Exception e9) {
            e = e9;
            c2550h = r42;
        }
        kVar = new k(this, (AbstractC0542c) cVar);
        Object obj2 = kVar.f21208n;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        r42 = kVar.f21210p;
        v2.e eVar3 = v2.e.f20405n;
        v2.e eVar22 = v2.e.f20404m;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C0.c cVar, AbstractC0542c abstractC0542c) {
        j jVar;
        int i;
        z i5;
        int i6 = 0;
        if (abstractC0542c instanceof j) {
            jVar = (j) abstractC0542c;
            int i7 = jVar.f21204m;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                jVar.f21204m = i7 - Integer.MIN_VALUE;
                Object obj = jVar.f21202k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = jVar.f21204m;
                if (i != 0) {
                    G4.l.N(obj);
                    Bitmap.Config config = H2.e.f2284a;
                    if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                        if (this.f21213b.f1474o.f1403k) {
                            throw new NetworkOnMainThreadException();
                        }
                        u uVar = (u) ((InterfaceC2676d) this.f21214c.getValue());
                        uVar.getClass();
                        kotlin.jvm.internal.l.f("request", cVar);
                        C4.i iVar = new C4.i(uVar, cVar);
                        if (!iVar.f880o.compareAndSet(false, true)) {
                            throw new IllegalStateException("Already Executed");
                        }
                        iVar.f879n.h();
                        n nVar = n.f2016a;
                        iVar.f881p = n.f2016a.g();
                        try {
                            C1071hd c1071hd = uVar.f21411k;
                            synchronized (c1071hd) {
                                ((ArrayDeque) c1071hd.f13764o).add(iVar);
                            }
                            i5 = iVar.i();
                            C1071hd c1071hd2 = uVar.f21411k;
                            c1071hd2.c((ArrayDeque) c1071hd2.f13764o, iVar);
                            if (!i5.d() || i5.f21451n == 304) {
                                return i5;
                            }
                            B b3 = i5.f21454q;
                            if (b3 != null) {
                                H2.e.a(b3);
                            }
                            throw new D2.e("HTTP " + i5.f21451n + ": " + i5.f21450m);
                        } catch (Throwable th) {
                            C1071hd c1071hd3 = iVar.f876k.f21411k;
                            c1071hd3.c((ArrayDeque) c1071hd3.f13764o, iVar);
                            throw th;
                        }
                    }
                    u uVar2 = (u) ((InterfaceC2676d) this.f21214c.getValue());
                    uVar2.getClass();
                    kotlin.jvm.internal.l.f("request", cVar);
                    C4.i iVar2 = new C4.i(uVar2, cVar);
                    jVar.f21204m = 1;
                    C2268h c2268h = new C2268h(1, AbstractC2346c.v(jVar));
                    c2268h.r();
                    H2.f fVar = new H2.f(i6, iVar2, c2268h);
                    iVar2.e(fVar);
                    c2268h.t(fVar);
                    obj = c2268h.q();
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                }
                i5 = (z) obj;
                if (i5.d()) {
                }
                return i5;
            }
        }
        jVar = new j(this, abstractC0542c);
        Object obj2 = jVar.f21202k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = jVar.f21204m;
        if (i != 0) {
        }
        i5 = (z) obj2;
        if (i5.d()) {
        }
        return i5;
    }

    public final o c() {
        Object value = this.f21215d.getValue();
        kotlin.jvm.internal.l.c(value);
        return ((C2551i) value).f20527a;
    }

    public final C0.c e() {
        C0375o c0375o = new C0375o();
        String str = this.f21212a;
        kotlin.jvm.internal.l.f("url", str);
        if (AbstractC2234l.x0(str, "ws:", true)) {
            String substring = str.substring(3);
            kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", substring);
            str = "http:".concat(substring);
        } else if (AbstractC2234l.x0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", substring2);
            str = "https:".concat(substring2);
        }
        kotlin.jvm.internal.l.f("<this>", str);
        C1234l6 c1234l6 = new C1234l6();
        c1234l6.c(null, str);
        c0375o.f5042l = c1234l6.a();
        E2.m mVar = this.f21213b;
        y4.m mVar2 = mVar.f1469j;
        kotlin.jvm.internal.l.f("headers", mVar2);
        c0375o.f5044n = mVar2.f();
        for (Map.Entry entry : mVar.f1470k.f1484a.entrySet()) {
            Object key = entry.getKey();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.Class<kotlin.Any>", key);
            c0375o.D((Class) key, entry.getValue());
        }
        E2.b bVar = mVar.f1473n;
        boolean z3 = bVar.f1403k;
        boolean z5 = mVar.f1474o.f1403k;
        if (!z5 && z3) {
            c0375o.n(C2675c.f21304o);
        } else if (!z5 || z3) {
            if (!z5 && !z3) {
                c0375o.n(f21211g);
            }
        } else if (bVar.f1404l) {
            c0375o.n(C2675c.f21303n);
        } else {
            c0375o.n(f);
        }
        return c0375o.m();
    }

    public final D2.b f(C2550h c2550h) {
        Throwable th;
        D2.b bVar;
        try {
            o c5 = c();
            C2545c c2545c = c2550h.f20526k;
            if (c2545c.f20503l) {
                throw new IllegalStateException("snapshot is closed");
            }
            C k5 = N4.b.k(c5.i((L4.z) c2545c.f20502k.f20497c.get(0)));
            try {
                bVar = new D2.b(k5);
                try {
                    k5.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    k5.close();
                } catch (Throwable th4) {
                    AbstractC2425d.j(th3, th4);
                }
                th = th3;
                bVar = null;
            }
            if (th == null) {
                return bVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final v2.l g(C2550h c2550h) {
        C2545c c2545c = c2550h.f20526k;
        if (c2545c.f20503l) {
            throw new IllegalStateException("snapshot is closed");
        }
        L4.z zVar = (L4.z) c2545c.f20502k.f20497c.get(1);
        o c5 = c();
        String str = this.f21213b.i;
        if (str == null) {
            str = this.f21212a;
        }
        return new v2.l(zVar, c5, str, c2550h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (kotlin.jvm.internal.l.a(r6.f21453p.c("Vary"), "*") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2550h h(C2550h c2550h, C0.c cVar, z zVar, D2.b bVar) {
        C2138i c2138i;
        Throwable th;
        W d5;
        Throwable th2 = null;
        if (this.f21213b.f1473n.f1404l) {
            if (this.f21216e) {
                if (!cVar.d().f21306b) {
                    C2675c c2675c = zVar.f21461x;
                    if (c2675c == null) {
                        C2675c c2675c2 = C2675c.f21303n;
                        c2675c = w0.d(zVar.f21453p);
                        zVar.f21461x = c2675c;
                    }
                    if (!c2675c.f21306b) {
                    }
                }
            }
            if (c2550h == null) {
                C2551i c2551i = (C2551i) this.f21215d.getValue();
                if (c2551i != null) {
                    String str = this.f21213b.i;
                    if (str == null) {
                        str = this.f21212a;
                    }
                    C2548f c2548f = c2551i.f20528b;
                    C0229l c0229l = C0229l.f3092n;
                    W d6 = c2548f.d(j3.i.q(str).b("SHA-256").d());
                    if (d6 != null) {
                        c2138i = new C2138i(12, d6);
                        if (c2138i != null) {
                        }
                        return null;
                    }
                }
                c2138i = null;
                if (c2138i != null) {
                }
                return null;
            }
            C2545c c2545c = c2550h.f20526k;
            C2548f c2548f2 = c2545c.f20504m;
            synchronized (c2548f2) {
                c2545c.close();
                d5 = c2548f2.d(c2545c.f20502k.f20495a);
            }
            if (d5 != null) {
                c2138i = new C2138i(12, d5);
                if (c2138i != null) {
                    try {
                        try {
                            if (zVar.f21451n != 304 || bVar == null) {
                                L4.B j5 = N4.b.j(c().h(((W) c2138i.f18249l).d(0)));
                                try {
                                    new D2.b(zVar).a(j5);
                                    try {
                                        j5.close();
                                        th = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        j5.close();
                                    } catch (Throwable th5) {
                                        AbstractC2425d.j(th4, th5);
                                    }
                                    th = th4;
                                }
                                if (th != null) {
                                    throw th;
                                }
                                L4.B j6 = N4.b.j(c().h(((W) c2138i.f18249l).d(1)));
                                try {
                                    B b3 = zVar.f21454q;
                                    kotlin.jvm.internal.l.c(b3);
                                    b3.f().u(j6);
                                    try {
                                        j6.close();
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                    }
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    try {
                                        j6.close();
                                    } catch (Throwable th8) {
                                        AbstractC2425d.j(th2, th8);
                                    }
                                }
                                if (th2 != null) {
                                    throw th2;
                                }
                            } else {
                                y f5 = zVar.f();
                                f5.f = AbstractC2346c.h(bVar.f, zVar.f21453p).f();
                                z a5 = f5.a();
                                L4.B j7 = N4.b.j(c().h(((W) c2138i.f18249l).d(0)));
                                try {
                                    new D2.b(a5).a(j7);
                                    try {
                                        j7.close();
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                    }
                                } catch (Throwable th10) {
                                    th2 = th10;
                                    try {
                                        j7.close();
                                    } catch (Throwable th11) {
                                        AbstractC2425d.j(th2, th11);
                                    }
                                }
                                if (th2 != null) {
                                    throw th2;
                                }
                            }
                            C2550h c5 = c2138i.c();
                            H2.e.a(zVar);
                            return c5;
                        } catch (Exception e3) {
                            Bitmap.Config config = H2.e.f2284a;
                            try {
                                ((W) c2138i.f18249l).c(false);
                            } catch (Exception unused) {
                            }
                            throw e3;
                        }
                    } catch (Throwable th12) {
                        H2.e.a(zVar);
                        throw th12;
                    }
                }
                return null;
            }
            c2138i = null;
            if (c2138i != null) {
            }
            return null;
        }
        if (c2550h != null) {
            H2.e.a(c2550h);
        }
        return null;
    }
}
