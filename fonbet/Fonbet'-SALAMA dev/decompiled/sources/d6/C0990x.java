package d6;

import E3.AbstractC0167z;
import E3.C0165x;
import U5.AbstractC0438e;
import U5.C0434a;
import U5.C0435b;
import U5.C0453u;
import U5.EnumC0446m;
import U5.J;
import U5.K;
import U5.L;
import U5.N;
import U5.l0;
import W5.C0536r1;
import W5.D0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: d6.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0990x extends N {

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f12484m = Logger.getLogger(C0990x.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0438e f12486g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12487h;
    public EnumC0446m j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f12489k;

    /* renamed from: l, reason: collision with root package name */
    public L f12490l;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f12485f = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final C0536r1 f12488i = new C0536r1();

    public C0990x(AbstractC0438e abstractC0438e) {
        this.f12486g = abstractC0438e;
        f12484m.log(Level.FINE, "Created");
        this.f12489k = new AtomicInteger(new Random().nextInt());
        this.f12490l = new C0988v();
    }

    @Override // U5.N
    public final l0 a(K k7) {
        try {
            this.f12487h = true;
            com.google.android.gms.common.internal.w g3 = g(k7);
            l0 l0Var = (l0) g3.f11335b;
            if (!l0Var.e()) {
                return l0Var;
            }
            j();
            Iterator it = ((ArrayList) g3.f11336c).iterator();
            while (it.hasNext()) {
                C0975i c0975i = (C0975i) it.next();
                c0975i.f12431b.f();
                c0975i.f12433d = EnumC0446m.f6554e;
                f12484m.log(Level.FINE, "Child balancer {0} deleted", c0975i.f12430a);
            }
            return l0Var;
        } finally {
            this.f12487h = false;
        }
    }

    @Override // U5.N
    public final void c(l0 l0Var) {
        if (this.j != EnumC0446m.f6551b) {
            this.f12486g.r(EnumC0446m.f6552c, new D0(J.a(l0Var)));
        }
    }

    @Override // U5.N
    public final void f() {
        Level level = Level.FINE;
        Logger logger = f12484m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f12485f;
        for (C0975i c0975i : linkedHashMap.values()) {
            c0975i.f12431b.f();
            c0975i.f12433d = EnumC0446m.f6554e;
            logger.log(Level.FINE, "Child balancer {0} deleted", c0975i.f12430a);
        }
        linkedHashMap.clear();
    }

    public final com.google.android.gms.common.internal.w g(K k7) {
        LinkedHashMap linkedHashMap;
        C0976j c0976j;
        C0453u c0453u;
        int i7 = 1;
        Level level = Level.FINE;
        Logger logger = f12484m;
        logger.log(level, "Received resolution result: {0}", k7);
        HashMap hashMap = new HashMap();
        List list = k7.f6430a;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.f12485f;
            if (!hasNext) {
                break;
            }
            C0976j c0976j2 = new C0976j((C0453u) it.next());
            C0975i c0975i = (C0975i) linkedHashMap.get(c0976j2);
            if (c0975i != null) {
                hashMap.put(c0976j2, c0975i);
            } else {
                hashMap.put(c0976j2, new C0975i(this, c0976j2, this.f12488i, new D0(J.f6425e)));
            }
        }
        Object obj = null;
        if (hashMap.isEmpty()) {
            l0 g3 = l0.f6544n.g("NameResolver returned no usable address. " + k7);
            c(g3);
            return new com.google.android.gms.common.internal.w(i7, g3, obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            C0536r1 c0536r1 = ((C0975i) entry.getValue()).f12432c;
            ((C0975i) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                C0975i c0975i2 = (C0975i) linkedHashMap.get(key);
                if (c0975i2.f12435f) {
                    c0975i2.f12435f = false;
                }
            } else {
                linkedHashMap.put(key, (C0975i) entry.getValue());
            }
            C0975i c0975i3 = (C0975i) linkedHashMap.get(key);
            if (key instanceof C0453u) {
                c0976j = new C0976j((C0453u) key);
            } else {
                p3.f.d("key is wrong type", key instanceof C0976j);
                c0976j = (C0976j) key;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c0453u = null;
                    break;
                }
                c0453u = (C0453u) it2.next();
                if (c0976j.equals(new C0976j(c0453u))) {
                    break;
                }
            }
            p3.f.k(c0453u, key + " no longer present in load balancer children");
            C0435b c0435b = C0435b.f6454b;
            List singletonList = Collections.singletonList(c0453u);
            C0435b c0435b2 = C0435b.f6454b;
            C0434a c0434a = N.f6436e;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(c0434a, bool);
            for (Map.Entry entry2 : c0435b2.f6455a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((C0434a) entry2.getKey(), entry2.getValue());
                }
            }
            K k8 = new K(singletonList, new C0435b(identityHashMap), null);
            ((C0975i) linkedHashMap.get(key)).getClass();
            if (!c0975i3.f12435f) {
                c0975i3.f12431b.d(k8);
            }
        }
        ArrayList arrayList = new ArrayList();
        C0165x listIterator = AbstractC0167z.E(linkedHashMap.keySet()).listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (!hashMap.containsKey(next)) {
                C0975i c0975i4 = (C0975i) linkedHashMap.get(next);
                if (!c0975i4.f12435f) {
                    LinkedHashMap linkedHashMap2 = c0975i4.f12436g.f12485f;
                    C0976j c0976j3 = c0975i4.f12430a;
                    linkedHashMap2.remove(c0976j3);
                    c0975i4.f12435f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", c0976j3);
                }
                arrayList.add(c0975i4);
            }
        }
        return new com.google.android.gms.common.internal.w(i7, l0.f6536e, arrayList);
    }

    public final C0989w h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0975i) it.next()).f12434e);
        }
        return new C0989w(arrayList, this.f12489k);
    }

    public final void i(EnumC0446m enumC0446m, L l7) {
        if (enumC0446m == this.j && l7.equals(this.f12490l)) {
            return;
        }
        this.f12486g.r(enumC0446m, l7);
        this.j = enumC0446m;
        this.f12490l = l7;
    }

    public final void j() {
        EnumC0446m enumC0446m;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f12485f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0446m = EnumC0446m.f6551b;
            if (!hasNext) {
                break;
            }
            C0975i c0975i = (C0975i) it.next();
            if (!c0975i.f12435f && c0975i.f12433d == enumC0446m) {
                arrayList.add(c0975i);
            }
        }
        if (!arrayList.isEmpty()) {
            i(enumC0446m, h(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            EnumC0446m enumC0446m2 = ((C0975i) it2.next()).f12433d;
            EnumC0446m enumC0446m3 = EnumC0446m.f6550a;
            if (enumC0446m2 == enumC0446m3 || enumC0446m2 == EnumC0446m.f6553d) {
                i(enumC0446m3, new C0988v());
                return;
            }
        }
        i(EnumC0446m.f6552c, h(linkedHashMap.values()));
    }
}
