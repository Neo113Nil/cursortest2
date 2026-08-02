package F3;

import I3.C0172b;
import I3.C0174d;
import I3.C0177g;
import I3.C0179i;
import I3.C0181k;
import I3.C0182l;
import I3.C0183m;
import I3.C0188s;
import I3.C0192w;
import I3.S;
import I3.T;
import I3.c0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final i f1548h = i.f1540d;
    public static final a i = h.f1538k;

    /* renamed from: j, reason: collision with root package name */
    public static final t f1549j = x.f1561k;

    /* renamed from: k, reason: collision with root package name */
    public static final u f1550k = x.f1562l;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f1551a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1552b;

    /* renamed from: c, reason: collision with root package name */
    public final j3.i f1553c;

    /* renamed from: d, reason: collision with root package name */
    public final C0179i f1554d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1555e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final i f1556g;

    public m() {
        H3.i iVar = H3.i.f2328m;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f1551a = new ThreadLocal();
        this.f1552b = new ConcurrentHashMap();
        j3.i iVar2 = new j3.i(15);
        this.f1553c = iVar2;
        this.f = true;
        this.f1556g = f1548h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0.f2618A);
        t tVar = x.f1561k;
        t tVar2 = f1549j;
        arrayList.add(tVar2 == tVar ? C0183m.f2661c : new C0181k(1, tVar2));
        arrayList.add(iVar);
        arrayList.addAll(list);
        arrayList.add(c0.f2633p);
        arrayList.add(c0.f2625g);
        arrayList.add(c0.f2623d);
        arrayList.add(c0.f2624e);
        arrayList.add(c0.f);
        C0192w c0192w = c0.f2628k;
        arrayList.add(new T(Long.TYPE, Long.class, c0192w));
        arrayList.add(new T(Double.TYPE, Double.class, new j(0)));
        arrayList.add(new T(Float.TYPE, Float.class, new j(1)));
        u uVar = x.f1562l;
        u uVar2 = f1550k;
        arrayList.add(uVar2 == uVar ? C0182l.f2659b : new C0181k(0, new C0182l(uVar2)));
        arrayList.add(c0.f2626h);
        arrayList.add(c0.i);
        arrayList.add(new S(AtomicLong.class, new k(new k(c0192w, 0), 2), 0));
        arrayList.add(new S(AtomicLongArray.class, new k(new k(c0192w, 1), 2), 0));
        arrayList.add(c0.f2627j);
        arrayList.add(c0.f2629l);
        arrayList.add(c0.f2634q);
        arrayList.add(c0.f2635r);
        arrayList.add(new S(BigDecimal.class, c0.f2630m, 0));
        arrayList.add(new S(BigInteger.class, c0.f2631n, 0));
        arrayList.add(new S(H3.k.class, c0.f2632o, 0));
        arrayList.add(c0.f2636s);
        arrayList.add(c0.f2637t);
        arrayList.add(c0.f2639v);
        arrayList.add(c0.f2640w);
        arrayList.add(c0.f2642y);
        arrayList.add(c0.f2638u);
        arrayList.add(c0.f2621b);
        arrayList.add(C0177g.f2647c);
        arrayList.add(c0.f2641x);
        if (L3.e.f3037a) {
            arrayList.add(L3.e.f3039c);
            arrayList.add(L3.e.f3038b);
            arrayList.add(L3.e.f3040d);
        }
        arrayList.add(C0172b.f2611c);
        arrayList.add(c0.f2620a);
        arrayList.add(new C0174d(iVar2, 0));
        arrayList.add(new C0174d(iVar2, 1));
        C0179i c0179i = new C0179i(iVar2);
        this.f1554d = c0179i;
        arrayList.add(c0179i);
        arrayList.add(c0.f2619B);
        arrayList.add(new C0188s(iVar2, i, iVar, c0179i));
        this.f1555e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(d5 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final y b(M3.a aVar) {
        boolean z3;
        ConcurrentHashMap concurrentHashMap = this.f1552b;
        y yVar = (y) concurrentHashMap.get(aVar);
        if (yVar != null) {
            return yVar;
        }
        ThreadLocal threadLocal = this.f1551a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            y yVar2 = (y) map.get(aVar);
            if (yVar2 != null) {
                return yVar2;
            }
            z3 = false;
        }
        try {
            l lVar = new l();
            map.put(aVar, lVar);
            Iterator it = this.f1555e.iterator();
            y yVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yVar3 = ((z) it.next()).a(this, aVar);
                if (yVar3 != null) {
                    if (lVar.f1547a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f1547a = yVar3;
                    map.put(aVar, yVar3);
                }
            }
            if (z3) {
                threadLocal.remove();
            }
            if (yVar3 != null) {
                if (z3) {
                    concurrentHashMap.putAll(map);
                }
                return yVar3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z3) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f1555e + ",instanceCreators:" + this.f1553c + "}";
    }
}
