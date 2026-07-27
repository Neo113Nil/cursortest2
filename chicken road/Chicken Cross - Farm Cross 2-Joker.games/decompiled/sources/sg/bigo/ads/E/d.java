package sg.bigo.ads.E;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.C.l;
import sg.bigo.ads.P.j;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.e.m;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.C5182k1;
import sg.bigo.ads.n1.n;

/* loaded from: classes3.dex */
public final class d extends l {
    public final b A0;
    public l k0;
    public sg.bigo.ads.Q.c l0;
    public sg.bigo.ads.Q.c m0;
    public final Object n0;
    public final LinkedHashMap o0;
    public final AtomicInteger p0;
    public final AtomicInteger q0;
    public a r0;
    public boolean s0;
    public boolean t0;
    public final int u0;
    public final AtomicInteger v0;
    public final AtomicInteger w0;
    public final AtomicInteger x0;
    public final int y0;
    public boolean z0;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(j jVar, int i) {
        super(jVar);
        m fVar;
        c cVar;
        ArrayList arrayList;
        sg.bigo.ads.P.c cVar2;
        int i2;
        m fVar2;
        c cVar3;
        this.n0 = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.o0 = linkedHashMap;
        this.p0 = new AtomicInteger(0);
        this.q0 = new AtomicInteger(0);
        this.s0 = false;
        this.t0 = false;
        this.v0 = new AtomicInteger(0);
        this.w0 = new AtomicInteger(0);
        this.x0 = new AtomicInteger(0);
        this.A0 = new b(this);
        this.y0 = i;
        sg.bigo.ads.P.c cVar4 = jVar.f12482a;
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar4;
        int i3 = bVar.k;
        if (i == 3) {
            HashMap hashMap = new HashMap();
            hashMap.put("video_play_page", "ad1_video_page");
            hashMap.put("endpage", "ad1_end_page");
            bVar.I = bVar.I.a(hashMap);
        }
        if (cVar4 instanceof InterfaceC5087a) {
            ((k) ((InterfaceC5087a) cVar4)).a1 = 1;
        }
        j jVar2 = new j(cVar4, jVar.b, jVar.c, jVar.e, jVar.f);
        jVar2.d = jVar.d;
        if (i3 != 1) {
            if (i3 == 2) {
                fVar = new f(jVar2, this);
                cVar = new c();
            }
            arrayList = bVar.b;
            if (arrayList != null && !arrayList.isEmpty()) {
                cVar2 = (sg.bigo.ads.P.c) arrayList.get(0);
                if (bVar.I != null && i == 3) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("video_play_page", "ad2_video_page");
                    hashMap2.put("endpage", "ad2_end_page");
                    ((sg.bigo.ads.U0.b) cVar2).I = bVar.I.a(hashMap2);
                }
                i2 = ((sg.bigo.ads.U0.b) cVar2).k;
                if (cVar2 instanceof InterfaceC5087a) {
                    ((k) ((InterfaceC5087a) cVar2)).a1 = 2;
                }
                j jVar3 = new j(cVar2, jVar.b, jVar.c, jVar.e, jVar.f);
                jVar3.d = jVar.d;
                if (i2 != 1) {
                    fVar2 = new e(jVar3, this);
                    cVar3 = new c();
                } else if (i2 == 2) {
                    fVar2 = new f(jVar3, this);
                    cVar3 = new c();
                }
                linkedHashMap.put(fVar2, cVar3);
            }
            this.u0 = linkedHashMap.size();
        }
        fVar = new e(jVar2, this);
        cVar = new c();
        linkedHashMap.put(fVar, cVar);
        arrayList = bVar.b;
        if (arrayList != null) {
            cVar2 = (sg.bigo.ads.P.c) arrayList.get(0);
            if (bVar.I != null) {
                HashMap hashMap22 = new HashMap();
                hashMap22.put("video_play_page", "ad2_video_page");
                hashMap22.put("endpage", "ad2_end_page");
                ((sg.bigo.ads.U0.b) cVar2).I = bVar.I.a(hashMap22);
            }
            i2 = ((sg.bigo.ads.U0.b) cVar2).k;
            if (cVar2 instanceof InterfaceC5087a) {
            }
            j jVar32 = new j(cVar2, jVar.b, jVar.c, jVar.e, jVar.f);
            jVar32.d = jVar.d;
            if (i2 != 1) {
            }
            linkedHashMap.put(fVar2, cVar3);
        }
        this.u0 = linkedHashMap.size();
    }

    @Override // sg.bigo.ads.C.l
    public final void C() {
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getKey()).C();
        }
    }

    public final l D() {
        l lVar;
        synchronized (this.n0) {
            Iterator it = this.o0.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    lVar = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (!((l) entry.getKey()).t() && ((c) entry.getValue()).f12263a) {
                    lVar = (l) entry.getKey();
                    ((c) entry.getValue()).f = true;
                    break;
                }
            }
        }
        return lVar;
    }

    @Override // sg.bigo.ads.e.h
    public final Object a(Object obj, String str) {
        l lVar = this.k0;
        if (lVar != null) {
            return lVar.a(obj, str);
        }
        Object obj2 = this.N.get(str);
        return obj2 != null ? obj2 : obj;
    }

    public final int b(sg.bigo.ads.Q.b bVar) {
        c cVar;
        c(bVar);
        if (!(bVar instanceof l) || (cVar = (c) this.o0.get(bVar)) == null) {
            return 0;
        }
        if (cVar.b <= 0) {
            cVar.b = this.v0.incrementAndGet();
        }
        return cVar.b;
    }

    public final int c(sg.bigo.ads.Q.b bVar) {
        c cVar;
        if (!(bVar instanceof l) || (cVar = (c) this.o0.get(bVar)) == null) {
            return 0;
        }
        if (cVar.c <= 0) {
            cVar.c = this.w0.incrementAndGet();
        }
        return cVar.c;
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        l lVar = this.k0;
        if (lVar != null && !lVar.u) {
            lVar.destroy();
        }
        for (l lVar2 : this.o0.keySet()) {
            n nVar = n.n;
            String h = ((k) ((InterfaceC5087a) lVar2.e())).h();
            if (nVar.g != null && !TextUtils.isEmpty(h)) {
                nVar.g.remove(h);
            }
        }
        this.o0.clear();
        this.k0 = null;
        this.m0 = null;
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.Q.b
    public final sg.bigo.ads.P.c e() {
        l lVar = this.k0;
        return lVar != null ? (InterfaceC5087a) lVar.e() : (InterfaceC5087a) this.k.f12482a;
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final AdBid getBid() {
        l c = c(0);
        if (c != null) {
            return c.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        l c = c(0);
        if (c != null) {
            return c.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.j = adInteractionListener;
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getKey()).setAdInteractionListener(adInteractionListener);
        }
    }

    @Override // sg.bigo.ads.e.h
    public final boolean t() {
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            if (((l) ((Map.Entry) it.next()).getKey()).t()) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.e.h
    public final void v() {
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getKey()).v();
        }
    }

    @Override // sg.bigo.ads.C.l
    public final void a(sg.bigo.ads.Q.c cVar, int i) {
        this.l0 = cVar;
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getKey()).a(this.A0, i);
        }
    }

    @Override // sg.bigo.ads.Q.b
    public final void b(int i) {
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getKey()).b(i);
        }
    }

    public final l c(int i) {
        if (i > this.o0.size() - 1) {
            return null;
        }
        int i2 = 0;
        for (l lVar : this.o0.keySet()) {
            if (i2 == i) {
                return lVar;
            }
            i2++;
        }
        return null;
    }

    public final void a(boolean z, l lVar) {
        sg.bigo.ads.Q.c cVar;
        a aVar;
        synchronized (this.n0) {
            if (z) {
                if (this.l0 != null) {
                    c cVar2 = (c) this.o0.get(lVar);
                    boolean z2 = cVar2 != null && cVar2.f12263a;
                    int addAndGet = this.q0.addAndGet(1);
                    if (cVar2 != null) {
                        cVar2.f12263a = true;
                        ((k) ((InterfaceC5087a) lVar.e())).W0 = true;
                        cVar2.d = addAndGet;
                    }
                    if (!this.z0) {
                        this.z0 = true;
                        this.l0.a(lVar);
                    }
                    if (!z2 && (aVar = this.r0) != null) {
                        ((C5182k1) aVar).a(this.y0, lVar, this.k.b);
                    }
                    if (!z2 && (cVar = this.m0) != null) {
                        cVar.a(lVar);
                    }
                }
            }
            if (this.l0 != null && this.o0.size() == this.p0.get()) {
                this.l0.a(lVar, 1023, 10205, "Double video empty ads.");
            }
        }
    }

    @Override // sg.bigo.ads.C.l
    public final void a(Activity activity) {
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getKey()).a(activity);
        }
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(int i) {
        l lVar = this.k0;
        if (lVar != null) {
            lVar.a(i);
        }
    }

    @Override // sg.bigo.ads.C.w
    public final void a(boolean z) {
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getKey()).a(z);
        }
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(boolean z, boolean z2) {
        Iterator it = this.o0.entrySet().iterator();
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getKey()).a(z, z2);
        }
    }
}
