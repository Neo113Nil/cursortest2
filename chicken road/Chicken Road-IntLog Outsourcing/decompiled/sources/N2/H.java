package N2;

import D4.AbstractC0024y;
import M.InterfaceC0080i;
import android.content.Context;
import android.util.Log;
import g4.AbstractC0465j;
import h2.C0482c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.C1224j;
import l4.EnumC1260a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class H implements D2.b, InterfaceC0115f {

    /* renamed from: a, reason: collision with root package name */
    public Context f2062a;

    /* renamed from: b, reason: collision with root package name */
    public B4.i f2063b;

    /* renamed from: c, reason: collision with root package name */
    public final W1.e f2064c = new W1.e();

    public static final Object a(H h3, String str, String str2, m4.h hVar) {
        h3.getClass();
        P.d dVar = new P.d(str);
        Context context = h3.f2062a;
        if (context != null) {
            Object c2 = I.a(context).c(new P.h(new C0119j(dVar, str2, null), null), hVar);
            return c2 == EnumC1260a.f11058a ? c2 : f4.v.f5689a;
        }
        kotlin.jvm.internal.i.l("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00cc -> B:11:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(H h3, List list, AbstractC1295c abstractC1295c) {
        t tVar;
        int i2;
        Set X02;
        H h6;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        H h7;
        Map map2;
        Object c2;
        h3.getClass();
        if (abstractC1295c instanceof t) {
            tVar = (t) abstractC1295c;
            int i3 = tVar.f2136h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tVar.f2136h = i3 - Integer.MIN_VALUE;
                Object obj = tVar.f2134f;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = tVar.f2136h;
                if (i2 != 0) {
                    e5.g.y(obj);
                    X02 = list != null ? AbstractC0465j.X0(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    tVar.f2129a = h3;
                    tVar.f2130b = X02;
                    tVar.f2131c = linkedHashMap;
                    tVar.f2136h = 1;
                    Context context = h3.f2062a;
                    if (context == null) {
                        kotlin.jvm.internal.i.l("context");
                        throw null;
                    }
                    Object d6 = G4.x.d(new C0482c(25, ((InterfaceC0080i) I.a(context).f215b).getData()), tVar);
                    if (d6 == enumC1260a) {
                        return enumC1260a;
                    }
                    h6 = h3;
                    map = linkedHashMap;
                    obj = d6;
                } else if (i2 == 1) {
                    map = tVar.f2131c;
                    X02 = tVar.f2130b;
                    h6 = tVar.f2129a;
                    e5.g.y(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P.d dVar = tVar.f2133e;
                    it = tVar.f2132d;
                    map2 = tVar.f2131c;
                    set2 = tVar.f2130b;
                    h7 = tVar.f2129a;
                    e5.g.y(obj);
                    if (I.b(dVar.f2273a, obj, set2) && (c2 = I.c(obj, h7.f2064c)) != null) {
                        map2.put(dVar.f2273a, c2);
                    }
                    if (it.hasNext()) {
                        dVar = (P.d) it.next();
                        tVar.f2129a = h7;
                        tVar.f2130b = set2;
                        tVar.f2131c = map2;
                        tVar.f2132d = it;
                        tVar.f2133e = dVar;
                        tVar.f2136h = 2;
                        Context context2 = h7.f2062a;
                        if (context2 == null) {
                            kotlin.jvm.internal.i.l("context");
                            throw null;
                        }
                        obj = G4.x.d(new B0.t(((InterfaceC0080i) I.a(context2).f215b).getData(), dVar), tVar);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        if (I.b(dVar.f2273a, obj, set2)) {
                            map2.put(dVar.f2273a, c2);
                        }
                        if (it.hasNext()) {
                            return map2;
                        }
                    }
                }
                set = (Set) obj;
                if (set != null) {
                    return map;
                }
                set2 = X02;
                it = set.iterator();
                h7 = h6;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        tVar = new t(h3, abstractC1295c);
        Object obj2 = tVar.f2134f;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = tVar.f2136h;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // N2.InterfaceC0115f
    public final void b(String str, List list, C0116g c0116g) {
        AbstractC0024y.q(C1224j.f10720a, new A(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f2064c.o(list)), null));
    }

    @Override // N2.InterfaceC0115f
    public final Long c(String str, C0116g c0116g) {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        AbstractC0024y.q(C1224j.f10720a, new r(str, this, sVar, null));
        return (Long) sVar.f10741a;
    }

    @Override // N2.InterfaceC0115f
    public final void d(String str, String str2, C0116g c0116g) {
        AbstractC0024y.q(C1224j.f10720a, new G(this, str, str2, null));
    }

    @Override // N2.InterfaceC0115f
    public final Map e(List list, C0116g c0116g) {
        return (Map) AbstractC0024y.q(C1224j.f10720a, new C0120k(this, list, null));
    }

    @Override // N2.InterfaceC0115f
    public final Boolean f(String str, C0116g c0116g) {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        AbstractC0024y.q(C1224j.f10720a, new n(str, this, sVar, null));
        return (Boolean) sVar.f10741a;
    }

    @Override // N2.InterfaceC0115f
    public final void g(String str, String str2, C0116g c0116g) {
        AbstractC0024y.q(C1224j.f10720a, new D(this, str, str2, null));
    }

    @Override // N2.InterfaceC0115f
    public final List h(List list, C0116g c0116g) {
        return AbstractC0465j.S0(((Map) AbstractC0024y.q(C1224j.f10720a, new s(this, list, null))).keySet());
    }

    @Override // N2.InterfaceC0115f
    public final void j(String str, double d6, C0116g c0116g) {
        AbstractC0024y.q(C1224j.f10720a, new C(str, this, d6, null));
    }

    @Override // N2.InterfaceC0115f
    public final void k(List list, C0116g c0116g) {
        AbstractC0024y.q(C1224j.f10720a, new C0118i(this, list, null));
    }

    @Override // N2.InterfaceC0115f
    public final void m(String str, long j2, C0116g c0116g) {
        AbstractC0024y.q(C1224j.f10720a, new F(str, this, j2, null));
    }

    @Override // N2.InterfaceC0115f
    public final Double n(String str, C0116g c0116g) {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        AbstractC0024y.q(C1224j.f10720a, new p(str, this, sVar, null));
        return (Double) sVar.f10741a;
    }

    @Override // D2.b
    public final void onAttachedToEngine(D2.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        H2.f fVar = binding.f435c;
        kotlin.jvm.internal.i.d(fVar, "getBinaryMessenger(...)");
        Context context = binding.f433a;
        kotlin.jvm.internal.i.d(context, "getApplicationContext(...)");
        this.f2062a = context;
        try {
            InterfaceC0115f.f2085P.getClass();
            C0114e.b(fVar, this, "data_store");
            this.f2063b = new B4.i(fVar, context, this.f2064c);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
        new C0110a().onAttachedToEngine(binding);
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        H2.f fVar = binding.f435c;
        kotlin.jvm.internal.i.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0115f.f2085P.getClass();
        C0114e.b(fVar, null, "data_store");
        B4.i iVar = this.f2063b;
        if (iVar != null) {
            C0114e.b((H2.f) iVar.f311b, null, "shared_preferences");
        }
        this.f2063b = null;
    }

    @Override // N2.InterfaceC0115f
    public final void p(String str, boolean z, C0116g c0116g) {
        AbstractC0024y.q(C1224j.f10720a, new z(str, this, z, null));
    }

    @Override // N2.InterfaceC0115f
    public final String r(String str, C0116g c0116g) {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        AbstractC0024y.q(C1224j.f10720a, new v(str, this, sVar, null));
        return (String) sVar.f10741a;
    }

    @Override // N2.InterfaceC0115f
    public final L t(String str, C0116g c0116g) {
        String r5 = r(str, c0116g);
        if (r5 == null) {
            return null;
        }
        if (B4.r.O(r5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return new L(r5, J.f2069d);
        }
        return B4.r.O(r5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new L(null, J.f2068c) : new L(null, J.f2070e);
    }

    @Override // N2.InterfaceC0115f
    public final ArrayList u(String str, C0116g c0116g) {
        List list;
        String r5 = r(str, c0116g);
        ArrayList arrayList = null;
        if (r5 != null && !B4.r.O(r5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) && B4.r.O(r5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) && (list = (List) I.c(r5, this.f2064c)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
