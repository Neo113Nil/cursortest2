package sg.bigo.ads.q;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.e.AbstractC5081e;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.g.C5122e;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.r.C5448a;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final C5185l1 f13248a;
    public final C5448a b;
    public final sg.bigo.ads.r.d c;
    public final sg.bigo.ads.y.i d;
    public IconAds e;
    public int f;
    public C5434e h;
    public C5435f i;
    public C5430a j;
    public C5430a k;
    public C5436g l;
    public C5436g m;
    public final h g = new h();
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ConcurrentHashMap s = new ConcurrentHashMap();
    public final ConcurrentHashMap t = new ConcurrentHashMap();
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final C5432c w = new C5432c(this);

    public o(C5185l1 c5185l1, sg.bigo.ads.T0.q qVar, sg.bigo.ads.y.i iVar) {
        this.f13248a = c5185l1;
        this.b = new C5448a(qVar);
        this.c = new sg.bigo.ads.r.d(qVar, iVar == null || iVar.i());
        this.d = iVar;
    }

    public static List a(IconAds iconAds) {
        if (!(iconAds instanceof C5122e)) {
            if (iconAds != null) {
                return Arrays.asList(iconAds.getNativeAds());
            }
            return null;
        }
        C5122e c5122e = (C5122e) iconAds;
        c5122e.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sg.bigo.ads.D.h hVar : c5122e.l) {
            if (!((sg.bigo.ads.U0.b) hVar.k.f12482a).a() && !hVar.u) {
                if (hVar.k0) {
                    arrayList.add(hVar);
                } else if (!hVar.l0) {
                    arrayList2.add(hVar);
                }
            }
        }
        arrayList.addAll(arrayList2);
        sg.bigo.ads.D.h[] hVarArr = new sg.bigo.ads.D.h[arrayList.size()];
        if (!A.a(arrayList)) {
            arrayList.toArray(hVarArr);
        }
        return Arrays.asList(hVarArr);
    }

    public static void b(C5430a c5430a, n nVar) {
        if (c5430a == null) {
            if (nVar != null) {
                nVar.b();
            }
        } else {
            int i = c5430a.c;
            if (i > 0) {
                c5430a.b.setFlipInterval(i);
                c5430a.b.a();
            }
        }
    }

    public final void c() {
        C5435f c5435f = this.i;
        if (c5435f != null) {
            c5435f.d = true;
            c5435f.e = false;
            c5435f.f13247a.removeCallbacks(c5435f);
        }
        this.i = null;
    }

    public final void b() {
        C5434e c5434e = this.h;
        if (c5434e != null) {
            c5434e.d = true;
            c5434e.e = false;
            c5434e.f13247a.removeCallbacks(c5434e);
        }
        this.h = null;
    }

    public static C5436g a(o oVar, sg.bigo.ads.r.c cVar, ArrayList arrayList) {
        oVar.getClass();
        if (cVar != null && cVar.d()) {
            int i = cVar.i;
            if (i < 0) {
                i = -1;
            }
            if (i >= 0) {
                return new C5436g(i * 1000, arrayList, cVar);
            }
        }
        return null;
    }

    public static void a(o oVar, sg.bigo.ads.r.c cVar, int i, List list) {
        oVar.getClass();
        if (cVar == null || list == null) {
            return;
        }
        sg.bigo.ads.P.c cVar2 = (InterfaceC5087a) oVar.f13248a.W.e();
        int max = Math.max(1, cVar.e);
        String str = oVar.o;
        int size = list.size();
        int b = cVar.b();
        boolean d = cVar.d();
        HashMap hashMap = new HashMap();
        if (cVar2 != null) {
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar2;
            hashMap.put("host_slot", bVar.c.l);
            hashMap.put("host_placement", bVar.c.n);
            hashMap.put("host_sid", String.valueOf(bVar.m));
            hashMap.put("host_ad_id", bVar.f);
        }
        AbstractC5081e.a(hashMap, "icon_show_rslt", "1", i, "scene_page");
        hashMap.put("icon_fill_num", String.valueOf(max));
        hashMap.put("icon_show_num", String.valueOf(size));
        hashMap.put("icon_slot", String.valueOf(str));
        hashMap.put("icon_style", String.valueOf(b));
        hashMap.put("word_icon_style", String.valueOf(d));
        sg.bigo.ads.s1.d.e.a("06002069", hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r1 != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r3 = r3 * r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004f, code lost:
    
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0053, code lost:
    
        if (r0 != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[LOOP:0: B:24:0x005c->B:26:0x0062, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(o oVar, sg.bigo.ads.r.c cVar, ArrayList arrayList, ArrayList arrayList2, ConcurrentHashMap concurrentHashMap, int i) {
        int i2;
        oVar.getClass();
        if (cVar == null || A.a(arrayList2) || i < 0) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(concurrentHashMap.get(Integer.valueOf(i)))) {
            return;
        }
        concurrentHashMap.put(Integer.valueOf(i), bool);
        boolean z = i == 0;
        int i3 = cVar.k;
        if (i3 < 0 || i3 > 4) {
            i3 = 0;
        }
        if (i3 != 0) {
            int a2 = sg.bigo.ads.r.c.a(cVar);
            int max = Math.max(1, cVar.l);
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                    }
                    i2 = a2 + max;
                }
            }
            if (i2 > 0) {
                return;
            }
            while (arrayList.size() <= i) {
                arrayList.add(0);
            }
            arrayList.set(i, i > 0 ? Integer.valueOf(((Integer) arrayList.get(i - 1)).intValue() + i2) : Integer.valueOf(i2));
            int intValue = i > 0 ? ((Integer) arrayList.get(i - 1)).intValue() : 0;
            int min = Math.min(i2 + intValue, arrayList2.size());
            while (intValue < min) {
                NativeAd nativeAd = (NativeAd) arrayList2.get(intValue);
                if (nativeAd instanceof sg.bigo.ads.D.h) {
                    sg.bigo.ads.D.h hVar = (sg.bigo.ads.D.h) nativeAd;
                    sg.bigo.ads.x1.f fVar = hVar.m;
                    if (!(fVar instanceof sg.bigo.ads.x1.a ? ((sg.bigo.ads.x1.a) fVar).m.get() : false)) {
                        sg.bigo.ads.x1.f fVar2 = hVar.m;
                        if (fVar2 instanceof sg.bigo.ads.x1.a) {
                            sg.bigo.ads.x1.a aVar = (sg.bigo.ads.x1.a) fVar2;
                            if (!aVar.m.get()) {
                                Context context = hVar.k.e;
                                if (aVar.m.compareAndSet(false, true)) {
                                    AbstractC5446j.a(1, null, new sg.bigo.ads.x1.c(aVar, context, 0), 0L);
                                }
                            }
                        }
                    }
                }
                intValue++;
            }
            return;
        }
        i2 = 0;
        if (i2 > 0) {
        }
    }

    public final boolean a() {
        C5185l1 c5185l1 = this.f13248a;
        return c5185l1.u || c5185l1.D().u;
    }

    public static void a(C5430a c5430a, n nVar) {
        if (c5430a != null) {
            ViewFlow viewFlow = c5430a.b;
            viewFlow.b = false;
            viewFlow.a(false);
        } else if (nVar != null) {
            nVar.e = false;
            nVar.f = true;
            nVar.f13247a.removeCallbacks(nVar);
        }
    }

    public final void a(ViewGroup viewGroup, int i) {
        sg.bigo.ads.s1.b.a((InterfaceC5087a) this.f13248a.W.e(), i);
        this.p = true;
        if (viewGroup == null) {
            a(this.b, "endPageView is null", i);
            return;
        }
        C5448a c5448a = this.b;
        if (c5448a != null) {
            int i2 = c5448a.f13264a;
            if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
                i2 = 0;
            }
            if (i2 != 0) {
                if (!((this.f & i) == i)) {
                    a(c5448a, "icon request hasScene return false", i);
                    return;
                }
                b();
                C5430a c5430a = this.j;
                if (c5430a != null) {
                    ViewFlow viewFlow = c5430a.b;
                    viewFlow.b = false;
                    viewFlow.a(false);
                    X.c(this.j.f13238a);
                }
                this.j = null;
                C5434e c5434e = new C5434e(this, viewGroup, this.b, i);
                this.h = c5434e;
                c5434e.b();
                return;
            }
        }
        a(c5448a, "config is invalid", i);
    }

    public final void a(sg.bigo.ads.r.c cVar, String str, int i) {
        if (cVar != null) {
            sg.bigo.ads.P.c cVar2 = (InterfaceC5087a) this.f13248a.W.e();
            int max = Math.max(1, cVar.e);
            String str2 = this.o;
            int b = cVar.b();
            HashMap hashMap = new HashMap();
            if (cVar2 != null) {
                sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar2;
                hashMap.put("host_slot", bVar.c.l);
                hashMap.put("host_placement", bVar.c.n);
                hashMap.put("host_sid", String.valueOf(bVar.m));
                hashMap.put("host_ad_id", bVar.f);
            }
            hashMap.put("icon_show_rslt", "0");
            AbstractC5081e.a(hashMap, "icon_show_error", str, i, "scene_page");
            hashMap.put("icon_fill_num", String.valueOf(max));
            hashMap.put("icon_slot", String.valueOf(str2));
            hashMap.put("icon_style", String.valueOf(b));
            sg.bigo.ads.s1.d.e.a("06002069", hashMap);
        }
    }
}
