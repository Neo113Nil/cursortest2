package sg.bigo.ads.b1;

import android.os.SystemClock;
import android.text.TextUtils;
import sg.bigo.ads.K0.B;
import sg.bigo.ads.K0.F;
import sg.bigo.ads.P.t;
import sg.bigo.ads.c1.C5054a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5508h;
import sg.bigo.ads.x0.InterfaceC5501a;

/* renamed from: sg.bigo.ads.b1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5028a extends AbstractC5503c {
    public long b = -1;
    public boolean c = false;
    public final /* synthetic */ AbstractC5032e d;

    public C5028a(AbstractC5032e abstractC5032e) {
        this.d = abstractC5032e;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar) {
        this.b = SystemClock.elapsedRealtime();
        this.c = sg.bigo.ads.a0.o.e > 0;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, C5508h c5508h) {
        int i;
        String str;
        sg.bigo.ads.B0.b bVar = (sg.bigo.ads.B0.b) cVar;
        if (this.d.l() && this.d.i == null) {
            long elapsedRealtime = this.b > 0 ? SystemClock.elapsedRealtime() - this.b : 0L;
            String a2 = bVar.b.a();
            if (c5508h.f13385a == 900) {
                a2 = "https://invalid.url";
            }
            String str2 = a2;
            InterfaceC5501a interfaceC5501a = bVar.b;
            String b = interfaceC5501a.c() ? interfaceC5501a.b() : "";
            int i2 = c5508h.f13385a;
            String str3 = c5508h.b;
            boolean z = this.c;
            int c = bVar.c();
            AbstractC5032e abstractC5032e = this.d;
            sg.bigo.ads.s1.b.a(str2, b, false, elapsedRealtime, i2, str3, z, c, abstractC5032e.e, abstractC5032e.f, abstractC5032e.g, abstractC5032e.b == null ? null : sg.bigo.ads.F0.a.e(), bVar.l, bVar.m, bVar.n, bVar.o, bVar.g);
        }
        int i3 = c5508h.f13385a;
        if (i3 == 701 || i3 == 702) {
            i = 1025;
            str = "Request timeout.";
        } else {
            str = "(" + c5508h.f13385a + ") " + c5508h.b;
            i = 1026;
        }
        this.d.a(bVar.b.a(), i, c5508h.f13385a, str, null);
        AbstractC5032e abstractC5032e2 = this.d;
        bVar.b.a();
        abstractC5032e2.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
    @Override // sg.bigo.ads.x0.AbstractC5503c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sg.bigo.ads.B0.c cVar, sg.bigo.ads.C0.c cVar2) {
        String b;
        String str;
        String str2;
        int i;
        boolean z;
        boolean z2;
        String a2;
        int i2;
        AbstractC5032e abstractC5032e;
        String str3;
        sg.bigo.ads.R0.g gVar;
        sg.bigo.ads.R0.g gVar2;
        sg.bigo.ads.R0.g gVar3;
        sg.bigo.ads.B0.b bVar = (sg.bigo.ads.B0.b) cVar;
        sg.bigo.ads.C0.d dVar = (sg.bigo.ads.C0.d) cVar2;
        String str4 = dVar.b;
        if (bVar.m) {
            try {
                if (TextUtils.isEmpty(str4) || !str4.trim().startsWith("{")) {
                    if (TextUtils.isEmpty(str4)) {
                        str = "a";
                        str2 = "cip error with empty.";
                    } else if (TextUtils.isEmpty("FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F")) {
                        str = "a";
                        str2 = "string error with empty.";
                    } else {
                        b = F.b(str4, null);
                        if (TextUtils.isEmpty(b)) {
                            str = "a";
                            str2 = "cip error with empty content.";
                        }
                        if (TextUtils.isEmpty(b)) {
                            try {
                                bVar.n = 1;
                                str4 = b;
                                bVar.o = dVar.f12246a.a("logid");
                            } catch (Exception unused) {
                                str4 = b;
                                bVar.n = 2;
                                try {
                                    bVar.o = dVar.f12246a.a("logid");
                                } catch (Exception unused2) {
                                }
                                AbstractC5032e abstractC5032e2 = this.d;
                                t tVar = abstractC5032e2.h;
                                z = bVar.l;
                                z2 = bVar.m;
                                int i3 = bVar.n;
                                String str5 = bVar.o;
                                tVar.f12492a = z;
                                tVar.b = z2;
                                tVar.c = i3;
                                tVar.d = str5;
                                if (z) {
                                    if (z2) {
                                    }
                                }
                                C5054a c5054a = new C5054a(str4);
                                a2 = B.a("asn", c5054a.d);
                                if (this.d.c != null) {
                                    sg.bigo.ads.Q0.n nVar = this.d.c;
                                    nVar.getClass();
                                    if (!TextUtils.isEmpty(a2)) {
                                    }
                                }
                                i2 = c5054a.f12705a;
                                if (i2 != 1) {
                                }
                                abstractC5032e = this.d;
                                String a3 = B.a("host_cfg", c5054a.d);
                                String a4 = bVar.b.a();
                                long j = this.b;
                                if (abstractC5032e.c != null) {
                                }
                                if (this.d.l()) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 0;
                        }
                    }
                    AbstractC5496a.a(str, str2);
                    b = null;
                    if (TextUtils.isEmpty(b)) {
                    }
                } else {
                    i = 3;
                }
                bVar.n = i;
                bVar.o = dVar.f12246a.a("logid");
            } catch (Exception unused3) {
            }
        }
        AbstractC5032e abstractC5032e22 = this.d;
        t tVar2 = abstractC5032e22.h;
        z = bVar.l;
        z2 = bVar.m;
        int i32 = bVar.n;
        String str52 = bVar.o;
        tVar2.f12492a = z;
        tVar2.b = z2;
        tVar2.c = i32;
        tVar2.d = str52;
        if (z && (!z2 || i32 != 1)) {
            if (z2) {
                sg.bigo.ads.F0.b.b("sp_ads", "sp_ads_encryptpost_request", Boolean.FALSE, 4);
            } else {
                abstractC5032e22.k();
            }
        }
        C5054a c5054a2 = new C5054a(str4);
        a2 = B.a("asn", c5054a2.d);
        if (this.d.c != null && !TextUtils.isEmpty(a2)) {
            sg.bigo.ads.Q0.n nVar2 = this.d.c;
            nVar2.getClass();
            if (!TextUtils.isEmpty(a2)) {
                sg.bigo.ads.Q0.b bVar2 = nVar2.f12510a;
                synchronized (bVar2) {
                    str3 = bVar2.f;
                }
                if (!TextUtils.equals(a2, str3)) {
                    nVar2.f12510a.a(a2);
                    sg.bigo.ads.Q0.b bVar3 = nVar2.f12510a;
                    sg.bigo.ads.R0.i iVar = bVar3.j;
                    if (iVar != null && (gVar3 = iVar.i) != null) {
                        iVar.b(gVar3);
                        iVar.h = iVar.i;
                        iVar.i = null;
                    }
                    sg.bigo.ads.R0.h hVar = bVar3.k;
                    if (hVar != null && (gVar2 = hVar.i) != null) {
                        hVar.b(gVar2);
                        hVar.h = hVar.i;
                        hVar.i = null;
                    }
                    sg.bigo.ads.R0.h hVar2 = bVar3.l;
                    if (hVar2 != null && (gVar = hVar2.i) != null) {
                        hVar2.b(gVar);
                        hVar2.h = hVar2.i;
                        hVar2.i = null;
                    }
                }
                if (!TextUtils.equals(a2, (String) sg.bigo.ads.F0.b.a("sp_ads", "sp_asn_local", "", 3))) {
                    sg.bigo.ads.F0.b.b("sp_ads", "sp_asn_local", a2, 3);
                }
            }
        }
        i2 = c5054a2.f12705a;
        if (i2 != 1) {
            this.d.a(bVar.b.a(), c5054a2.c, c5054a2.d);
        } else {
            if (i2 == -14) {
                sg.bigo.ads.F0.b.b("sp_ads", "sp_gzip_server_fail", Long.valueOf(System.currentTimeMillis()), 1);
            }
            this.d.a(bVar.b.a(), 1005, c5054a2.f12705a, c5054a2.b, c5054a2.d);
        }
        abstractC5032e = this.d;
        String a32 = B.a("host_cfg", c5054a2.d);
        String a42 = bVar.b.a();
        long j2 = this.b;
        if (abstractC5032e.c != null) {
            if (TextUtils.isEmpty(a32)) {
                abstractC5032e.m();
            } else {
                AbstractC5446j.a(3, null, new RunnableC5029b(abstractC5032e, a32, a42, j2), 0L);
            }
        }
        if (this.d.l() || this.d.i != null) {
            return;
        }
        long elapsedRealtime = this.b > 0 ? SystemClock.elapsedRealtime() - this.b : 0L;
        InterfaceC5501a interfaceC5501a = bVar.b;
        String b2 = interfaceC5501a.c() ? interfaceC5501a.b() : "";
        String a5 = bVar.b.a();
        int i4 = dVar.f12246a.f12244a;
        boolean z3 = this.c;
        int c = bVar.c();
        AbstractC5032e abstractC5032e3 = this.d;
        sg.bigo.ads.s1.b.a(a5, b2, true, elapsedRealtime, i4, "", z3, c, abstractC5032e3.e, abstractC5032e3.f, abstractC5032e3.g, abstractC5032e3.b != null ? sg.bigo.ads.F0.a.e() : null, bVar.l, bVar.m, bVar.n, bVar.o, bVar.g);
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final sg.bigo.ads.C0.c a(sg.bigo.ads.C0.a aVar) {
        return new sg.bigo.ads.C0.d(aVar);
    }
}
