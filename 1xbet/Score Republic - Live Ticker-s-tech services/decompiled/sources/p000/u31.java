package p000;

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

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u31 extends mj0 {

    /* JADX INFO: renamed from: m */
    public static final Logger f7661m = Logger.getLogger(u31.class.getName());

    /* JADX INFO: renamed from: g */
    public final AbstractC0477mo f7663g;

    /* JADX INFO: renamed from: h */
    public boolean f7664h;

    /* JADX INFO: renamed from: j */
    public EnumC0474ml f7666j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f7667k;

    /* JADX INFO: renamed from: l */
    public kj0 f7668l;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f7662f = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public final xv0 f7665i = new xv0();

    public u31(AbstractC0477mo abstractC0477mo) {
        this.f7663g = abstractC0477mo;
        f7661m.log(Level.FINE, "Created");
        this.f7667k = new AtomicInteger(new Random().nextInt());
        this.f7668l = new s31();
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: a */
    public final ja1 mo1387a(jj0 jj0Var) {
        try {
            this.f7664h = true;
            f50 f50VarM4870g = m4870g(jj0Var);
            ja1 ja1Var = (ja1) f50VarM4870g.f2313k;
            if (!ja1Var.m2838f()) {
                this.f7664h = false;
                return ja1Var;
            }
            m4873j();
            for (qq0 qq0Var : (List) f50VarM4870g.f2314l) {
                qq0Var.f6562b.mo1390f();
                qq0Var.f6564d = EnumC0474ml.f5075n;
                f7661m.log(Level.FINE, "Child balancer {0} deleted", qq0Var.f6561a);
            }
            this.f7664h = false;
            return ja1Var;
        } catch (Throwable th) {
            this.f7664h = false;
            throw th;
        }
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: c */
    public final void mo1388c(ja1 ja1Var) {
        if (this.f7666j != EnumC0474ml.f5072k) {
            this.f7663g.mo965o(EnumC0474ml.f5073l, new qv0(ij0.m2652a(ja1Var), 1));
        }
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: f */
    public final void mo1390f() {
        Level level = Level.FINE;
        Logger logger = f7661m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f7662f;
        for (qq0 qq0Var : linkedHashMap.values()) {
            qq0Var.f6562b.mo1390f();
            qq0Var.f6564d = EnumC0474ml.f5075n;
            logger.log(Level.FINE, "Child balancer {0} deleted", qq0Var.f6561a);
        }
        linkedHashMap.clear();
    }

    /* JADX INFO: renamed from: g */
    public final f50 m4870g(jj0 jj0Var) {
        LinkedHashMap linkedHashMap;
        rq0 rq0Var;
        C0190ex c0190ex;
        Level level = Level.FINE;
        Logger logger = f7661m;
        logger.log(level, "Received resolution result: {0}", jj0Var);
        HashMap map = new HashMap();
        List list = jj0Var.f3946a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f7662f;
            if (!zHasNext) {
                break;
            }
            rq0 rq0Var2 = new rq0((C0190ex) it.next());
            qq0 qq0Var = (qq0) linkedHashMap.get(rq0Var2);
            if (qq0Var != null) {
                map.put(rq0Var2, qq0Var);
            } else {
                map.put(rq0Var2, new qq0(this, rq0Var2, this.f7665i, new qv0(ij0.f3585e, 1)));
            }
        }
        int i = 15;
        Object obj = null;
        if (map.isEmpty()) {
            ja1 ja1VarM2840h = ja1.f3883m.m2840h("NameResolver returned no usable address. " + jj0Var);
            mo1388c(ja1VarM2840h);
            return new f50(i, ja1VarM2840h, obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            nj0 nj0Var = ((qq0) entry.getValue()).f6563c;
            ((qq0) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                qq0 qq0Var2 = (qq0) linkedHashMap.get(key);
                if (qq0Var2.f6566f) {
                    qq0Var2.f6566f = false;
                }
            } else {
                linkedHashMap.put(key, (qq0) entry.getValue());
            }
            qq0 qq0Var3 = (qq0) linkedHashMap.get(key);
            if (key instanceof C0190ex) {
                rq0Var = new rq0((C0190ex) key);
            } else {
                a90.m122f("key is wrong type", key instanceof rq0);
                rq0Var = (rq0) key;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    c0190ex = null;
                    break;
                }
                c0190ex = (C0190ex) it2.next();
            } while (!rq0Var.equals(new rq0(c0190ex)));
            a90.m127k(c0190ex, key + " no longer present in load balancer children");
            C0831w8 c0831w8 = C0831w8.f8454b;
            List listSingletonList = Collections.singletonList(c0190ex);
            C0831w8 c0831w9 = C0831w8.f8454b;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(mj0.f5057e, bool);
            for (Map.Entry entry2 : c0831w9.f8455a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((C0794v8) entry2.getKey(), entry2.getValue());
                }
            }
            jj0 jj0Var2 = new jj0(listSingletonList, new C0831w8(identityHashMap), null);
            ((qq0) linkedHashMap.get(key)).getClass();
            if (!qq0Var3.f6566f) {
                qq0Var3.f6562b.mo1389d(jj0Var2);
            }
        }
        ArrayList arrayList = new ArrayList();
        nc0 nc0VarListIterator = qc0.m4058q(linkedHashMap.keySet()).listIterator(0);
        while (nc0VarListIterator.hasNext()) {
            Object next = nc0VarListIterator.next();
            if (!map.containsKey(next)) {
                qq0 qq0Var4 = (qq0) linkedHashMap.get(next);
                rq0 rq0Var3 = qq0Var4.f6561a;
                if (!qq0Var4.f6566f) {
                    qq0Var4.f6567g.f7662f.remove(rq0Var3);
                    qq0Var4.f6566f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", rq0Var3);
                }
                arrayList.add(qq0Var4);
            }
        }
        return new f50(i, ja1.f3875e, arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final t31 m4871h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((qq0) it.next()).f6565e);
        }
        return new t31(arrayList, this.f7667k);
    }

    /* JADX INFO: renamed from: i */
    public final void m4872i(EnumC0474ml enumC0474ml, kj0 kj0Var) {
        if (enumC0474ml == this.f7666j && kj0Var.equals(this.f7668l)) {
            return;
        }
        this.f7663g.mo965o(enumC0474ml, kj0Var);
        this.f7666j = enumC0474ml;
        this.f7668l = kj0Var;
    }

    /* JADX INFO: renamed from: j */
    public final void m4873j() {
        EnumC0474ml enumC0474ml;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f7662f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0474ml = EnumC0474ml.f5072k;
            if (!zHasNext) {
                break;
            }
            qq0 qq0Var = (qq0) it.next();
            if (!qq0Var.f6566f && qq0Var.f6564d == enumC0474ml) {
                arrayList.add(qq0Var);
            }
        }
        if (!arrayList.isEmpty()) {
            m4872i(enumC0474ml, m4871h(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            EnumC0474ml enumC0474ml2 = ((qq0) it2.next()).f6564d;
            EnumC0474ml enumC0474ml3 = EnumC0474ml.f5071j;
            if (enumC0474ml2 == enumC0474ml3 || enumC0474ml2 == EnumC0474ml.f5074m) {
                m4872i(enumC0474ml3, new s31());
                return;
            }
        }
        m4872i(EnumC0474ml.f5073l, m4871h(linkedHashMap.values()));
    }
}
