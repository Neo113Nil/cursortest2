package p028d6;

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
import com.google.android.gms.common.internal.w;
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
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends N {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f12490m = Logger.getLogger(x.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0438e f12492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12493h;
    public EnumC0446m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f12495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public L f12496l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f12491f = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0536r1 f12494i = new C0536r1();

    public x(AbstractC0438e abstractC0438e) {
        this.f12492g = abstractC0438e;
        f12490m.log(Level.FINE, "Created");
        this.f12495k = new AtomicInteger(new Random().nextInt());
        this.f12496l = new v();
    }

    @Override // U5.N
    public final l0 a(K k7) {
        try {
            this.f12493h = true;
            w wVarG = g(k7);
            l0 l0Var = (l0) wVarG.f11335b;
            if (!l0Var.e()) {
                this.f12493h = false;
                return l0Var;
            }
            j();
            for (i iVar : (ArrayList) wVarG.f11336c) {
                iVar.f12437b.f();
                iVar.f12439d = EnumC0446m.f6554e;
                f12490m.log(Level.FINE, "Child balancer {0} deleted", iVar.f12436a);
            }
            this.f12493h = false;
            return l0Var;
        } catch (Throwable th) {
            this.f12493h = false;
            throw th;
        }
    }

    @Override // U5.N
    public final void c(l0 l0Var) {
        if (this.j != EnumC0446m.f6551b) {
            this.f12492g.r(EnumC0446m.f6552c, new D0(J.a(l0Var)));
        }
    }

    @Override // U5.N
    public final void f() {
        Level level = Level.FINE;
        Logger logger = f12490m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f12491f;
        for (i iVar : linkedHashMap.values()) {
            iVar.f12437b.f();
            iVar.f12439d = EnumC0446m.f6554e;
            logger.log(Level.FINE, "Child balancer {0} deleted", iVar.f12436a);
        }
        linkedHashMap.clear();
    }

    public final w g(K k7) {
        LinkedHashMap linkedHashMap;
        j jVar;
        C0453u c0453u;
        int i7 = 1;
        Level level = Level.FINE;
        Logger logger = f12490m;
        logger.log(level, "Received resolution result: {0}", k7);
        HashMap map = new HashMap();
        List list = k7.f6430a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f12491f;
            if (!zHasNext) {
                break;
            }
            j jVar2 = new j((C0453u) it.next());
            i iVar = (i) linkedHashMap.get(jVar2);
            if (iVar != null) {
                map.put(jVar2, iVar);
            } else {
                map.put(jVar2, new i(this, jVar2, this.f12494i, new D0(J.f6425e)));
            }
        }
        Object obj = null;
        if (map.isEmpty()) {
            l0 l0VarG = l0.f6544n.g("NameResolver returned no usable address. " + k7);
            c(l0VarG);
            return new w(i7, l0VarG, obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C0536r1 c0536r1 = ((i) entry.getValue()).f12438c;
            ((i) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                i iVar2 = (i) linkedHashMap.get(key);
                if (iVar2.f12441f) {
                    iVar2.f12441f = false;
                }
            } else {
                linkedHashMap.put(key, (i) entry.getValue());
            }
            i iVar3 = (i) linkedHashMap.get(key);
            if (key instanceof C0453u) {
                jVar = new j((C0453u) key);
            } else {
                f.d("key is wrong type", key instanceof j);
                jVar = (j) key;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    c0453u = null;
                    break;
                }
                c0453u = (C0453u) it2.next();
            } while (!jVar.equals(new j(c0453u)));
            f.k(c0453u, key + " no longer present in load balancer children");
            C0435b c0435b = C0435b.f6454b;
            List listSingletonList = Collections.singletonList(c0453u);
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
            K k8 = new K(listSingletonList, new C0435b(identityHashMap), null);
            ((i) linkedHashMap.get(key)).getClass();
            if (!iVar3.f12441f) {
                iVar3.f12437b.d(k8);
            }
        }
        ArrayList arrayList = new ArrayList();
        C0165x c0165xListIterator = AbstractC0167z.E(linkedHashMap.keySet()).listIterator(0);
        while (c0165xListIterator.hasNext()) {
            Object next = c0165xListIterator.next();
            if (!map.containsKey(next)) {
                i iVar4 = (i) linkedHashMap.get(next);
                if (!iVar4.f12441f) {
                    LinkedHashMap linkedHashMap2 = iVar4.f12442g.f12491f;
                    j jVar3 = iVar4.f12436a;
                    linkedHashMap2.remove(jVar3);
                    iVar4.f12441f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", jVar3);
                }
                arrayList.add(iVar4);
            }
        }
        return new w(i7, l0.f6536e, arrayList);
    }

    public final w h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).f12440e);
        }
        return new w(arrayList, this.f12495k);
    }

    public final void i(EnumC0446m enumC0446m, L l7) {
        if (enumC0446m == this.j && l7.equals(this.f12496l)) {
            return;
        }
        this.f12492g.r(enumC0446m, l7);
        this.j = enumC0446m;
        this.f12496l = l7;
    }

    public final void j() {
        EnumC0446m enumC0446m;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f12491f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0446m = EnumC0446m.f6551b;
            if (!zHasNext) {
                break;
            }
            i iVar = (i) it.next();
            if (!iVar.f12441f && iVar.f12439d == enumC0446m) {
                arrayList.add(iVar);
            }
        }
        if (!arrayList.isEmpty()) {
            i(enumC0446m, h(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            EnumC0446m enumC0446m2 = ((i) it2.next()).f12439d;
            EnumC0446m enumC0446m3 = EnumC0446m.f6550a;
            if (enumC0446m2 == enumC0446m3 || enumC0446m2 == EnumC0446m.f6553d) {
                i(enumC0446m3, new v());
                return;
            }
        }
        i(EnumC0446m.f6552c, h(linkedHashMap.values()));
    }
}
