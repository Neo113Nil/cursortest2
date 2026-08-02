package P5;

import a.AbstractC0603a;
import android.content.Context;
import android.util.Log;
import f6.C1116i;
import g6.AbstractC1159h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k6.AbstractC1356c;
import k6.AbstractC1362i;
import w5.C1782b;
import w5.InterfaceC1783c;

/* loaded from: classes2.dex */
public final class L implements InterfaceC1783c, InterfaceC0395g {

    /* renamed from: a, reason: collision with root package name */
    public Context f5627a;

    /* renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.t f5628b;

    /* renamed from: c, reason: collision with root package name */
    public final M4.e f5629c = new M4.e();

    public static final Object a(L l7, String str, String str2, AbstractC1362i abstractC1362i) {
        l7.getClass();
        e0.e eVar = new e0.e(str);
        Context context = l7.f5627a;
        if (context != null) {
            Object a2 = M.a(context).a(new e0.i(new C0399k(eVar, str2, null), null), abstractC1362i);
            return a2 == j6.a.f14642a ? a2 : C1116i.f13008a;
        }
        t6.h.h("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ca -> B:11:0x00cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(L l7, List list, AbstractC1356c abstractC1356c) {
        w wVar;
        int i7;
        Set e12;
        L l8;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        L l9;
        Map map2;
        Object c3;
        l7.getClass();
        if (abstractC1356c instanceof w) {
            wVar = (w) abstractC1356c;
            int i8 = wVar.f5708y;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                wVar.f5708y = i8 - Integer.MIN_VALUE;
                Object obj = wVar.f5706f;
                j6.a aVar = j6.a.f14642a;
                i7 = wVar.f5708y;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    e12 = list != null ? AbstractC1159h.e1(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    wVar.f5701a = l7;
                    wVar.f5702b = e12;
                    wVar.f5703c = linkedHashMap;
                    wVar.f5708y = 1;
                    Context context = l7.f5627a;
                    if (context == null) {
                        t6.h.h("context");
                        throw null;
                    }
                    Object c4 = G6.x.c(new R4.c(M.a(context).getData(), 9), wVar);
                    if (c4 == aVar) {
                        return aVar;
                    }
                    l8 = l7;
                    map = linkedHashMap;
                    obj = c4;
                } else if (i7 == 1) {
                    map = wVar.f5703c;
                    e12 = wVar.f5702b;
                    l8 = wVar.f5701a;
                    AbstractC0603a.p0(obj);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e0.e eVar = wVar.f5705e;
                    it = wVar.f5704d;
                    map2 = wVar.f5703c;
                    set2 = wVar.f5702b;
                    l9 = wVar.f5701a;
                    AbstractC0603a.p0(obj);
                    if (M.b(eVar.f12502a, obj, set2) && (c3 = M.c(obj, l9.f5629c)) != null) {
                        map2.put(eVar.f12502a, c3);
                    }
                    if (it.hasNext()) {
                        eVar = (e0.e) it.next();
                        wVar.f5701a = l9;
                        wVar.f5702b = set2;
                        wVar.f5703c = map2;
                        wVar.f5704d = it;
                        wVar.f5705e = eVar;
                        wVar.f5708y = 2;
                        Context context2 = l9.f5627a;
                        if (context2 == null) {
                            t6.h.h("context");
                            throw null;
                        }
                        obj = G6.x.c(new t(M.a(context2).getData(), eVar, 1), wVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (M.b(eVar.f12502a, obj, set2)) {
                            map2.put(eVar.f12502a, c3);
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
                set2 = e12;
                it = set.iterator();
                l9 = l8;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        wVar = new w(l7, abstractC1356c);
        Object obj2 = wVar.f5706f;
        j6.a aVar2 = j6.a.f14642a;
        i7 = wVar.f5708y;
        if (i7 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // P5.InterfaceC0395g
    public final void A(String str, double d7, C0396h c0396h) {
        D6.E.t(new G(str, this, d7, null));
    }

    @Override // P5.InterfaceC0395g
    public final void B(String str, String str2, C0396h c0396h) {
        D6.E.t(new H(this, str, str2, null));
    }

    @Override // P5.InterfaceC0395g
    public final Long D(String str, C0396h c0396h) {
        t6.p pVar = new t6.p();
        D6.E.t(new u(str, this, pVar, null));
        return (Long) pVar.f16472a;
    }

    @Override // P5.InterfaceC0395g
    public final ArrayList H(String str, C0396h c0396h) {
        List list;
        String K7 = K(str, c0396h);
        ArrayList arrayList = null;
        if (K7 != null && !C6.o.B0(K7, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && C6.o.B0(K7, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) M.c(K7, this.f5629c)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // P5.InterfaceC0395g
    public final String K(String str, C0396h c0396h) {
        t6.p pVar = new t6.p();
        D6.E.t(new y(str, this, pVar, null));
        return (String) pVar.f16472a;
    }

    @Override // P5.InterfaceC0395g
    public final P L(String str, C0396h c0396h) {
        String K7 = K(str, c0396h);
        if (K7 == null) {
            return null;
        }
        if (C6.o.B0(K7, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new P(K7, N.f5634d);
        }
        return C6.o.B0(K7, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new P(null, N.f5633c) : new P(null, N.f5635e);
    }

    @Override // P5.InterfaceC0395g
    public final Map M(List list, C0396h c0396h) {
        return (Map) D6.E.t(new C0400l(this, list, null));
    }

    @Override // P5.InterfaceC0395g
    public final void O(String str, List list, C0396h c0396h) {
        D6.E.t(new E(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f5629c.q(list)), null));
    }

    @Override // P5.InterfaceC0395g
    public final void f(String str, long j, C0396h c0396h) {
        D6.E.t(new J(str, this, j, null));
    }

    @Override // P5.InterfaceC0395g
    public final void h(List list, C0396h c0396h) {
        D6.E.t(new C0398j(this, list, null));
    }

    @Override // P5.InterfaceC0395g
    public final void j(String str, String str2, C0396h c0396h) {
        D6.E.t(new K(this, str, str2, null));
    }

    @Override // P5.InterfaceC0395g
    public final Boolean m(String str, C0396h c0396h) {
        t6.p pVar = new t6.p();
        D6.E.t(new C0404p(str, this, pVar, null));
        return (Boolean) pVar.f16472a;
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        t6.h.e(c1782b, "binding");
        A5.f fVar = c1782b.f18077c;
        t6.h.d(fVar, "getBinaryMessenger(...)");
        Context context = c1782b.f18075a;
        t6.h.d(context, "getApplicationContext(...)");
        this.f5627a = context;
        try {
            InterfaceC0395g.f5651i.getClass();
            C0394f.b(fVar, this, "data_store");
            this.f5628b = new android.support.v4.media.session.t(fVar, context, this.f5629c);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
        new C0389a().onAttachedToEngine(c1782b);
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        t6.h.e(c1782b, "binding");
        A5.f fVar = c1782b.f18077c;
        t6.h.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0395g.f5651i.getClass();
        C0394f.b(fVar, null, "data_store");
        android.support.v4.media.session.t tVar = this.f5628b;
        if (tVar != null) {
            C0394f.b((A5.f) tVar.f8076b, null, "shared_preferences");
        }
        this.f5628b = null;
    }

    @Override // P5.InterfaceC0395g
    public final void t(String str, boolean z4, C0396h c0396h) {
        D6.E.t(new D(str, this, z4, null));
    }

    @Override // P5.InterfaceC0395g
    public final Double v(String str, C0396h c0396h) {
        t6.p pVar = new t6.p();
        D6.E.t(new r(str, this, pVar, null));
        return (Double) pVar.f16472a;
    }

    @Override // P5.InterfaceC0395g
    public final List y(List list, C0396h c0396h) {
        return AbstractC1159h.a1(((Map) D6.E.t(new v(this, list, null))).keySet());
    }
}
