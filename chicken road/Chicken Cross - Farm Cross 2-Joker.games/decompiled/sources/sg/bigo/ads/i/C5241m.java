package sg.bigo.ads.i;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import sg.bigo.ads.K0.C;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.B2;
import sg.bigo.ads.h.C5202r0;
import sg.bigo.ads.j.C5248b;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.k.C5256a;
import sg.bigo.ads.k.InterfaceC5258c;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.i.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5241m implements sg.bigo.ads.k.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12988a;
    public Context c;
    public volatile File d;
    public Runnable e;
    public B2 f;
    public C5234f g;
    public final sg.bigo.ads.P.c i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public volatile int o;
    public final C5252f p;
    public final C5240l q;
    public boolean s;
    public volatile boolean t;
    public volatile boolean u;
    public volatile boolean v;
    public volatile boolean b = false;
    public final C5256a h = new C5256a();
    public volatile int r = 3;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.q0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0092, code lost:
    
        if (r10.b() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        if (r3 == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5241m(Ad ad, sg.bigo.ads.T0.p pVar, sg.bigo.ads.P.c cVar, sg.bigo.ads.n1.o oVar, sg.bigo.ads.z1.p pVar2) {
        sg.bigo.ads.z1.b bVar;
        boolean z = false;
        this.i = cVar;
        sg.bigo.ads.z1.a aVar = null;
        if (pVar2 != null) {
            Iterator it = pVar2.y.iterator();
            while (it.hasNext() && ((bVar = (sg.bigo.ads.z1.b) it.next()) == null || (aVar = sg.bigo.ads.z1.b.a(bVar.f13438a)) == null || !aVar.a())) {
            }
        }
        sg.bigo.ads.z1.a aVar2 = aVar;
        boolean z2 = pVar.s == 1;
        sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) cVar;
        boolean z3 = bVar2.D == 1;
        boolean z4 = aVar2 != null && aVar2.a();
        int i = bVar2.p0;
        int i2 = bVar2.l;
        boolean z5 = i2 == 3 || i2 == 4 || i2 == 12 || i2 == 20;
        if (1 == i) {
            if (!z4) {
            }
            z = true;
        } else {
            boolean z6 = z4 || !TextUtils.isEmpty(bVar2.q0);
            if (!z2) {
            }
            if (z3) {
                if (z6) {
                }
            }
        }
        this.f12988a = z;
        if (!z) {
            this.p = new C5252f(ad, bVar2, null, null, null, null);
            return;
        }
        C5240l c5240l = new C5240l(this);
        this.q = c5240l;
        this.p = new C5252f(ad, bVar2, oVar, pVar2, aVar2, c5240l);
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a(int i) {
        if (i == 1) {
            this.b = true;
            if (this.f12988a) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                HashMap g = g();
                long j = this.l;
                long j2 = j > 0 ? elapsedRealtime - j : 0L;
                C5256a c5256a = this.h;
                sg.bigo.ads.P.c cVar = this.i;
                if (g.isEmpty()) {
                    g = null;
                }
                c5256a.a(cVar, 10, j2, g);
            }
        } else if (i == 2 && this.f12988a && this.b) {
            i();
            this.b = false;
        }
        this.p.a(i);
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void b() {
        this.p.b();
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final boolean c() {
        if (!this.f12988a) {
            return false;
        }
        if (this.p.c()) {
            return true;
        }
        if (this.s) {
            return this.r == 1;
        }
        sg.bigo.ads.T0.q qVar = ((sg.bigo.ads.U0.b) this.i).J;
        if (qVar == null) {
            return false;
        }
        Integer a2 = z.a(qVar.a("playable_attr.playable_loaded_progress"));
        int intValue = a2 != null ? a2.intValue() : 0;
        return intValue > 0 && this.p.j >= intValue;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void d() {
        this.p.d();
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final View e() {
        return this.p.o;
    }

    public final void f() {
        if (!this.s || this.c == null || this.d == null || this.p == null || this.t) {
            return;
        }
        this.t = true;
        C5252f c5252f = this.p;
        Context context = this.c;
        File file = this.d;
        if (c5252f.m != null || c5252f.b(context)) {
            c5252f.i = SystemClock.elapsedRealtime();
            InterfaceC5258c interfaceC5258c = c5252f.t;
            if (interfaceC5258c != null) {
                interfaceC5258c.b(c5252f.g);
            }
            if (c5252f.m.a(file, new C5248b())) {
                c5252f.f();
            } else {
                AbstractC5496a.b("HtmlVastCompanion", "loadLocalZipRes: fillLocalFolder returned false");
            }
        }
    }

    public final HashMap g() {
        HashMap hashMap = new HashMap();
        if (this.o > 0) {
            hashMap.put("preload_type", String.valueOf(this.o));
        }
        return hashMap;
    }

    public final boolean h() {
        return this.f12988a && this.s && this.r != 1;
    }

    public final void i() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap g = g();
        long j = this.n;
        if (j > 0) {
            g.put("game_start_2_close", String.valueOf(elapsedRealtime - j));
        }
        long j2 = this.n;
        long j3 = j2 > 0 ? elapsedRealtime - j2 : 0L;
        C5256a c5256a = this.h;
        sg.bigo.ads.P.c cVar = this.i;
        if (g.isEmpty()) {
            g = null;
        }
        c5256a.a(cVar, 14, j3, g);
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void pause() {
        this.p.pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final boolean a(Context context) {
        if (!this.f12988a || context == null) {
            return false;
        }
        if (this.v) {
            return true;
        }
        this.v = true;
        String str = ((sg.bigo.ads.U0.b) this.i).q0;
        if (TextUtils.isEmpty(str)) {
            if (AbstractC5446j.e()) {
                return this.p.a(context);
            }
            AbstractC5446j.b(new RunnableC5237i(this, context.getApplicationContext()));
            return true;
        }
        this.s = true;
        if (!(this.i instanceof InterfaceC5087a)) {
            AbstractC5496a.b("PlayableAdCompanion", "preloadZipResource: adData is not NativeAdData, skip zip preload. url=" + str);
            this.r = -1;
        } else if (this.r != 2) {
            this.r = 2;
            Context applicationContext = context.getApplicationContext();
            this.c = applicationContext;
            sg.bigo.ads.q1.e eVar = sg.bigo.ads.q1.e.g;
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.i;
            C5239k c5239k = new C5239k(this, str, context);
            eVar.getClass();
            String str2 = ((sg.bigo.ads.U0.b) interfaceC5087a).q0;
            sg.bigo.ads.s1.b.a(interfaceC5087a, 0, str2, 0L, 0L, null, -1);
            if (TextUtils.isEmpty(str2)) {
                sg.bigo.ads.s1.b.a(interfaceC5087a, 2, "", 0L, 0L, "empty url", -1);
                c5239k.a("", 2, "empty zip url");
            } else {
                String trim = str2.trim();
                int indexOf = trim.indexOf(35);
                if (indexOf >= 0) {
                    trim = trim.substring(0, indexOf).trim();
                }
                String a2 = C.a(trim);
                String str3 = ((a2 == null || a2.length() == 0) && ((a2 = C.a(String.valueOf(trim.hashCode()))) == null || a2.length() == 0)) ? "" : a2;
                if (TextUtils.isEmpty(str3)) {
                    sg.bigo.ads.s1.b.a(interfaceC5087a, 2, str2, 0L, 0L, "cacheKey 为空(MD5 异常)", -1);
                    c5239k.a("", 6, "cacheKey is null");
                } else {
                    sg.bigo.ads.q1.a aVar = new sg.bigo.ads.q1.a(eVar, applicationContext, str3, interfaceC5087a, str2, c5239k);
                    if (AbstractC5446j.c == Thread.currentThread()) {
                        aVar.run();
                    } else {
                        AbstractC5446j.a(1, null, aVar, 0L);
                    }
                }
            }
        }
        return true;
    }

    public C5241m(Ad ad, sg.bigo.ads.T0.p pVar, sg.bigo.ads.z1.a aVar, sg.bigo.ads.P.c cVar, sg.bigo.ads.n1.o oVar, sg.bigo.ads.z1.p pVar2, C5202r0 c5202r0) {
        this.i = cVar;
        int i = ((sg.bigo.ads.U0.b) cVar).l;
        boolean z = i == 3 || i == 4 || i == 12 || i == 20;
        this.f12988a = z;
        if (z) {
            C5240l c5240l = new C5240l(this);
            c5240l.f12987a = c5202r0;
            this.p = new C5252f(ad, cVar, oVar, pVar2, aVar, c5240l);
        } else {
            this.p = new C5252f(ad, cVar, null, null, null, null);
        }
        String str = pVar.l;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a() {
        if (this.f12988a) {
            i();
        }
        this.p.a();
        this.f = null;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a(int i, int i2) {
        this.p.a(i, i2);
    }
}
