package a2;

import K.InterfaceC0041i;
import Y1.C0077a;
import android.content.Context;
import android.util.Log;
import d2.C0279i;
import e2.AbstractC0292g;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w2.AbstractC1242v;

/* renamed from: a2.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100J implements P1.b, InterfaceC0111g {

    /* renamed from: a, reason: collision with root package name */
    public Context f1818a;

    /* renamed from: b, reason: collision with root package name */
    public A0.j f1819b;

    /* renamed from: c, reason: collision with root package name */
    public final C0077a f1820c = new C0077a(6);

    public static final Object l(C0100J c0100j, String str, String str2, i2.g gVar) {
        c0100j.getClass();
        N.d dVar = new N.d(str);
        Context context = c0100j.f1818a;
        if (context != null) {
            Object b3 = AbstractC0101K.a(context).b(new N.h(new C0115k(dVar, str2, null), null), gVar);
            return b3 == EnumC0326a.f4994a ? b3 : C0279i.f4852a;
        }
        kotlin.jvm.internal.j.g("context");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        if (r13 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00cc -> B:11:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(C0100J c0100j, List list, AbstractC0343b abstractC0343b) {
        v vVar;
        int i3;
        Set h02;
        C0100J c0100j2;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        C0100J c0100j3;
        Map map2;
        Object c3;
        c0100j.getClass();
        if (abstractC0343b instanceof v) {
            vVar = (v) abstractC0343b;
            int i4 = vVar.f1883k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vVar.f1883k = i4 - Integer.MIN_VALUE;
                Object obj = vVar.f1881i;
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                i3 = vVar.f1883k;
                if (i3 != 0) {
                    X0.a.L(obj);
                    h02 = list != null ? AbstractC0292g.h0(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    vVar.f1877d = c0100j;
                    vVar.f1878e = h02;
                    vVar.f = linkedHashMap;
                    vVar.f1883k = 1;
                    Context context = c0100j.f1818a;
                    if (context == null) {
                        kotlin.jvm.internal.j.g("context");
                        throw null;
                    }
                    Object c4 = z2.q.c(new J1.i(27, ((InterfaceC0041i) AbstractC0101K.a(context).f729b).getData()), vVar);
                    if (c4 != enumC0326a) {
                        c0100j2 = c0100j;
                        map = linkedHashMap;
                        obj = c4;
                    }
                    return enumC0326a;
                }
                if (i3 == 1) {
                    map = vVar.f;
                    h02 = vVar.f1878e;
                    c0100j2 = vVar.f1877d;
                    X0.a.L(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.d dVar = vVar.f1880h;
                    it = vVar.f1879g;
                    map2 = vVar.f;
                    set2 = vVar.f1878e;
                    c0100j3 = vVar.f1877d;
                    X0.a.L(obj);
                    if (AbstractC0101K.b(dVar.f983a, obj, set2) && (c3 = AbstractC0101K.c(obj, c0100j3.f1820c)) != null) {
                        map2.put(dVar.f983a, c3);
                    }
                    if (it.hasNext()) {
                        return map2;
                    }
                    dVar = (N.d) it.next();
                    vVar.f1877d = c0100j3;
                    vVar.f1878e = set2;
                    vVar.f = map2;
                    vVar.f1879g = it;
                    vVar.f1880h = dVar;
                    vVar.f1883k = 2;
                    Context context2 = c0100j3.f1818a;
                    if (context2 == null) {
                        kotlin.jvm.internal.j.g("context");
                        throw null;
                    }
                    obj = z2.q.c(new C0119o(((InterfaceC0041i) AbstractC0101K.a(context2).f729b).getData(), dVar, 3), vVar);
                }
                set = (Set) obj;
                if (set != null) {
                    return map;
                }
                set2 = h02;
                it = set.iterator();
                c0100j3 = c0100j2;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        vVar = new v(c0100j, abstractC0343b);
        Object obj2 = vVar.f1881i;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = vVar.f1883k;
        if (i3 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // a2.InterfaceC0111g
    public final void a(String str, long j3, C0112h c0112h) {
        AbstractC1242v.j(new C0098H(str, this, j3, null));
    }

    @Override // a2.InterfaceC0111g
    public final C0104N b(String str, C0112h c0112h) {
        String r3 = r(str, c0112h);
        if (r3 != null) {
            return v2.m.q0(r3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new C0104N(r3, EnumC0102L.JSON_ENCODED) : v2.m.q0(r3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new C0104N(null, EnumC0102L.PLATFORM_ENCODED) : new C0104N(null, EnumC0102L.UNEXPECTED_STRING);
        }
        return null;
    }

    @Override // a2.InterfaceC0111g
    public final void c(List list, C0112h c0112h) {
        AbstractC1242v.j(new C0114j(this, list, null));
    }

    @Override // a2.InterfaceC0111g
    public final Double d(String str, C0112h c0112h) {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        AbstractC1242v.j(new C0122r(str, this, qVar, null));
        return (Double) qVar.f9672a;
    }

    @Override // a2.InterfaceC0111g
    public final void e(String str, String str2, C0112h c0112h) {
        AbstractC1242v.j(new C0096F(this, str, str2, null));
    }

    @Override // a2.InterfaceC0111g
    public final Map f(List list, C0112h c0112h) {
        return (Map) AbstractC1242v.j(new C0116l(this, list, null));
    }

    @Override // a2.InterfaceC0111g
    public final void g(String str, String str2, C0112h c0112h) {
        AbstractC1242v.j(new C0099I(this, str, str2, null));
    }

    @Override // a2.InterfaceC0111g
    public final List h(List list, C0112h c0112h) {
        return AbstractC0292g.f0(((Map) AbstractC1242v.j(new C0125u(this, list, null))).keySet());
    }

    @Override // a2.InterfaceC0111g
    public final Long i(String str, C0112h c0112h) {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        AbstractC1242v.j(new C0124t(str, this, qVar, null));
        return (Long) qVar.f9672a;
    }

    @Override // a2.InterfaceC0111g
    public final void j(String str, double d3, C0112h c0112h) {
        AbstractC1242v.j(new C0095E(str, this, d3, null));
    }

    @Override // a2.InterfaceC0111g
    public final void k(String str, List list, C0112h c0112h) {
        AbstractC1242v.j(new C0093C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f1820c.f(list)), null));
    }

    @Override // a2.InterfaceC0111g
    public final Boolean m(String str, C0112h c0112h) {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        AbstractC1242v.j(new C0120p(str, this, qVar, null));
        return (Boolean) qVar.f9672a;
    }

    @Override // a2.InterfaceC0111g
    public final ArrayList n(String str, C0112h c0112h) {
        List list;
        String r3 = r(str, c0112h);
        if (r3 == null || v2.m.q0(r3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || !v2.m.q0(r3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || (list = (List) AbstractC0101K.c(r3, this.f1820c)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // P1.b
    public final void onAttachedToEngine(P1.a binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        T1.f fVar = binding.f1153b;
        kotlin.jvm.internal.j.d(fVar, "getBinaryMessenger(...)");
        Context context = binding.f1152a;
        kotlin.jvm.internal.j.d(context, "getApplicationContext(...)");
        this.f1818a = context;
        try {
            InterfaceC0111g.f1841u0.getClass();
            C0110f.b(fVar, this, "data_store");
            this.f1819b = new A0.j(fVar, context, this.f1820c);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
        new C0105a().onAttachedToEngine(binding);
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        T1.f fVar = binding.f1153b;
        kotlin.jvm.internal.j.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0111g.f1841u0.getClass();
        C0110f.b(fVar, null, "data_store");
        A0.j jVar = this.f1819b;
        if (jVar != null) {
            C0110f.b((T1.f) jVar.f66b, null, "shared_preferences");
        }
        this.f1819b = null;
    }

    @Override // a2.InterfaceC0111g
    public final void q(String str, boolean z3, C0112h c0112h) {
        AbstractC1242v.j(new C0092B(str, this, z3, null));
    }

    @Override // a2.InterfaceC0111g
    public final String r(String str, C0112h c0112h) {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        AbstractC1242v.j(new x(str, this, qVar, null));
        return (String) qVar.f9672a;
    }
}
