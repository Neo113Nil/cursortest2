package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.fG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0976fG extends ZF {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f13466h = new HashMap();
    public Handler i;

    /* renamed from: j, reason: collision with root package name */
    public C1514rH f13467j;

    @Override // com.google.android.gms.internal.ads.ZF
    public final void f() {
        for (C0931eG c0931eG : this.f13466h.values()) {
            c0931eG.f13245a.e(c0931eG.f13246b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void h() {
        for (C0931eG c0931eG : this.f13466h.values()) {
            c0931eG.f13245a.g(c0931eG.f13246b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public void m() {
        HashMap hashMap = this.f13466h;
        for (C0931eG c0931eG : hashMap.values()) {
            c0931eG.f13245a.l(c0931eG.f13246b);
            C0887dG c0887dG = c0931eG.f13247c;
            ZF zf = c0931eG.f13245a;
            zf.o(c0887dG);
            zf.n(c0887dG);
        }
        hashMap.clear();
    }

    public abstract void s(Integer num, ZF zf, AbstractC0715Xa abstractC0715Xa);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.cG, com.google.android.gms.internal.ads.uG] */
    public final void t(final Integer num, ZF zf) {
        HashMap hashMap = this.f13466h;
        AbstractC1668us.S(!hashMap.containsKey(num));
        ?? r1 = new InterfaceC1648uG() { // from class: com.google.android.gms.internal.ads.cG
            @Override // com.google.android.gms.internal.ads.InterfaceC1648uG
            public final void a(ZF zf2, AbstractC0715Xa abstractC0715Xa) {
                AbstractC0976fG.this.s(num, zf2, abstractC0715Xa);
            }
        };
        C0887dG c0887dG = new C0887dG(this, num);
        hashMap.put(num, new C0931eG(zf, r1, c0887dG));
        Handler handler = this.i;
        handler.getClass();
        C1872zF c1872zF = zf.f12475c;
        c1872zF.getClass();
        c1872zF.f16579b.add(new C1738wG(handler, c0887dG));
        this.i.getClass();
        C1872zF c1872zF2 = zf.f12476d;
        c1872zF2.getClass();
        c1872zF2.f16579b.add(new C1827yF(c0887dG));
        C1514rH c1514rH = this.f13467j;
        ZE ze = this.f12478g;
        AbstractC1668us.F(ze);
        zf.i(r1, c1514rH, ze);
        if (this.f12474b.isEmpty()) {
            zf.e(r1);
        }
    }

    public abstract C1603tG w(Integer num, C1603tG c1603tG);

    public void u(Integer num) {
    }

    public void v(Integer num, long j5) {
    }
}
