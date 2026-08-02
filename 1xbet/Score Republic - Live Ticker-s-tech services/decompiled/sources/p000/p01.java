package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p01 {

    /* JADX INFO: renamed from: a */
    public final f50 f5949a;

    /* JADX INFO: renamed from: b */
    public final C0781uw f5950b;

    /* JADX INFO: renamed from: c */
    public final f50 f5951c;

    /* JADX INFO: renamed from: d */
    public final xd0 f5952d;

    /* JADX INFO: renamed from: e */
    public final C0884xo f5953e;

    /* JADX INFO: renamed from: f */
    public final C0781uw f5954f;

    /* JADX INFO: renamed from: g */
    public final C0781uw f5955g;

    /* JADX INFO: renamed from: h */
    public final f50 f5956h = new f50(14);

    /* JADX INFO: renamed from: i */
    public final qj0 f5957i = new qj0();

    /* JADX INFO: renamed from: j */
    public final qd0 f5958j;

    public p01() {
        int i = 24;
        qd0 qd0Var = new qd0(new C0163e6(20, 5), new wa0(i), new o31(i), 20, false);
        this.f5958j = qd0Var;
        this.f5949a = new f50(qd0Var);
        int i2 = 0;
        this.f5950b = new C0781uw(0);
        this.f5951c = new f50(25);
        this.f5952d = new xd0(1);
        this.f5953e = new C0884xo(0);
        this.f5954f = new C0781uw(3);
        this.f5955g = new C0781uw(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        f50 f50Var = this.f5951c;
        synchronized (f50Var) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) f50Var.f2313k);
                ((ArrayList) f50Var.f2313k).clear();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ArrayList) f50Var.f2313k).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) f50Var.f2313k).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3814a(Class cls, InterfaceC0670rw interfaceC0670rw) {
        C0781uw c0781uw = this.f5950b;
        synchronized (c0781uw) {
            c0781uw.f7915j.add(new C0744tw(cls, interfaceC0670rw));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3815b(Class cls, b21 b21Var) {
        xd0 xd0Var = this.f5952d;
        synchronized (xd0Var) {
            xd0Var.f8895b.add(new c21(cls, b21Var));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3816c(Class cls, Class cls2, iq0 iq0Var) {
        f50 f50Var = this.f5949a;
        synchronized (f50Var) {
            f71 f71Var = (f71) f50Var.f2313k;
            synchronized (f71Var) {
                try {
                    uq0 uq0Var = new uq0(cls, cls2, iq0Var);
                    ArrayList arrayList = (ArrayList) f71Var.f2334k;
                    arrayList.add(arrayList.size(), uq0Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((C0884xo) f50Var.f2314l).f9009a.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3817d(String str, Class cls, Class cls2, y11 y11Var) {
        f50 f50Var = this.f5951c;
        synchronized (f50Var) {
            f50Var.m1609L(str).add(new z11(cls, cls2, y11Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m3818e() {
        ArrayList arrayList;
        C0781uw c0781uw = this.f5955g;
        synchronized (c0781uw) {
            arrayList = c0781uw.f7915j;
        }
        if (arrayList.isEmpty()) {
            throw new o01("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List m3819f(Object obj) {
        List listUnmodifiableList;
        f50 f50Var = this.f5949a;
        f50Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (f50Var) {
            jq0 jq0Var = (jq0) ((C0884xo) f50Var.f2314l).f9009a.get(cls);
            listUnmodifiableList = jq0Var == null ? null : jq0Var.f4064a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((f71) f50Var.f2313k).m1659e(cls));
                if (((jq0) ((C0884xo) f50Var.f2314l).f9009a.put(cls, new jq0(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new o01("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            hq0 hq0Var = (hq0) listUnmodifiableList.get(i);
            if (hq0Var.mo639a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(hq0Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new o01("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0847wo m3820g(Object obj) {
        InterfaceC0847wo interfaceC0847woMo2256b;
        C0884xo c0884xo = this.f5953e;
        synchronized (c0884xo) {
            try {
                o80.m3646g(obj);
                InterfaceC0810vo interfaceC0810vo = (InterfaceC0810vo) c0884xo.f9009a.get(obj.getClass());
                if (interfaceC0810vo == null) {
                    for (InterfaceC0810vo interfaceC0810vo2 : c0884xo.f9009a.values()) {
                        if (interfaceC0810vo2.mo2255a().isAssignableFrom(obj.getClass())) {
                            interfaceC0810vo = interfaceC0810vo2;
                            break;
                        }
                    }
                }
                if (interfaceC0810vo == null) {
                    interfaceC0810vo = C0884xo.f9008b;
                }
                interfaceC0847woMo2256b = interfaceC0810vo.mo2256b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0847woMo2256b;
    }

    /* JADX INFO: renamed from: h */
    public final void m3821h(InterfaceC0810vo interfaceC0810vo) {
        C0884xo c0884xo = this.f5953e;
        synchronized (c0884xo) {
            c0884xo.f9009a.put(interfaceC0810vo.mo2255a(), interfaceC0810vo);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3822i(Class cls, Class cls2, h21 h21Var) {
        C0781uw c0781uw = this.f5954f;
        synchronized (c0781uw) {
            c0781uw.f7915j.add(new he1(cls, cls2, h21Var));
        }
    }
}
