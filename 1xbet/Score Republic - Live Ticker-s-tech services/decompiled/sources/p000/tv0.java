package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 extends mj0 {

    /* JADX INFO: renamed from: o */
    public static final Logger f7607o = Logger.getLogger(tv0.class.getName());

    /* JADX INFO: renamed from: f */
    public final AbstractC0477mo f7608f;

    /* JADX INFO: renamed from: h */
    public ue0 f7610h;

    /* JADX INFO: renamed from: k */
    public a81 f7613k;

    /* JADX INFO: renamed from: l */
    public EnumC0474ml f7614l;

    /* JADX INFO: renamed from: m */
    public EnumC0474ml f7615m;

    /* JADX INFO: renamed from: n */
    public final boolean f7616n;

    /* JADX INFO: renamed from: g */
    public final HashMap f7609g = new HashMap();

    /* JADX INFO: renamed from: i */
    public int f7611i = 0;

    /* JADX INFO: renamed from: j */
    public boolean f7612j = true;

    public tv0(AbstractC0477mo abstractC0477mo) {
        boolean z = false;
        EnumC0474ml enumC0474ml = EnumC0474ml.f5074m;
        this.f7614l = enumC0474ml;
        this.f7615m = enumC0474ml;
        Logger logger = ca0.f1181a;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!gw0.m2161a(property) && Boolean.parseBoolean(property)) {
            z = true;
        }
        this.f7616n = z;
        this.f7608f = abstractC0477mo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.mj0
    /* JADX INFO: renamed from: a */
    public final ja1 mo1387a(jj0 jj0Var) {
        List list;
        EnumC0474ml enumC0474ml;
        if (this.f7614l == EnumC0474ml.f5075n) {
            return ja1.f3881k.m2840h("Already shut down");
        }
        List list2 = jj0Var.f3946a;
        Object obj = jj0Var.f3947b;
        if (list2.isEmpty()) {
            ja1 ja1VarM2840h = ja1.f3883m.m2840h("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + obj);
            mo1388c(ja1VarM2840h);
            return ja1VarM2840h;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((C0190ex) it.next()) == null) {
                ja1 ja1VarM2840h2 = ja1.f3883m.m2840h("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + obj);
                mo1388c(ja1VarM2840h2);
                return ja1VarM2840h2;
            }
        }
        this.f7612j = true;
        mc0 mc0VarM4056l = qc0.m4056l();
        mc0VarM4056l.m3005c(list2.size() + mc0VarM4056l.f4344b);
        if (list2 instanceof lc0) {
            mc0VarM4056l.f4344b = ((lc0) list2).mo3203c(mc0VarM4056l.f4344b, mc0VarM4056l.f4343a);
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                mc0VarM4056l.m3004a(it2.next());
            }
        }
        q01 q01VarM3374d = mc0VarM4056l.m3374d();
        ue0 ue0Var = this.f7610h;
        EnumC0474ml enumC0474ml2 = EnumC0474ml.f5072k;
        if (ue0Var == null) {
            ue0 ue0Var2 = new ue0();
            ue0Var2.f7802a = q01VarM3374d != null ? q01VarM3374d : Collections.EMPTY_LIST;
            this.f7610h = ue0Var2;
        } else if (this.f7614l == enumC0474ml2) {
            SocketAddress socketAddressM4909a = ue0Var.m4909a();
            ue0 ue0Var3 = this.f7610h;
            if (q01VarM3374d != null) {
                list = q01VarM3374d;
            } else {
                ue0Var3.getClass();
                list = Collections.EMPTY_LIST;
            }
            ue0Var3.f7802a = list;
            ue0Var3.f7803b = 0;
            ue0Var3.f7804c = 0;
            if (this.f7610h.m4913e(socketAddressM4909a)) {
                return ja1.f3875e;
            }
            ue0 ue0Var4 = this.f7610h;
            ue0Var4.f7803b = 0;
            ue0Var4.f7804c = 0;
        } else {
            ue0Var.f7802a = q01VarM3374d != null ? q01VarM3374d : Collections.EMPTY_LIST;
            ue0Var.f7803b = 0;
            ue0Var.f7804c = 0;
        }
        HashMap map = this.f7609g;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        nc0 nc0VarListIterator = q01VarM3374d.listIterator(0);
        while (nc0VarListIterator.hasNext()) {
            hashSet2.addAll(((C0190ex) nc0VarListIterator.next()).f2195a);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((sv0) map.remove(socketAddress)).f7217a.mo2157s();
            }
        }
        int size = hashSet.size();
        EnumC0474ml enumC0474ml3 = EnumC0474ml.f5071j;
        if (size == 0 || (enumC0474ml = this.f7614l) == enumC0474ml3 || enumC0474ml == enumC0474ml2) {
            this.f7614l = enumC0474ml3;
            m4853i(enumC0474ml3, new qv0(ij0.f3585e, 0));
            m4851g();
            mo3397e();
        } else {
            EnumC0474ml enumC0474ml4 = EnumC0474ml.f5074m;
            if (enumC0474ml == enumC0474ml4) {
                m4853i(enumC0474ml4, new rv0(this, this));
            } else if (enumC0474ml == EnumC0474ml.f5073l) {
                m4851g();
                mo3397e();
            }
        }
        return ja1.f3875e;
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: c */
    public final void mo1388c(ja1 ja1Var) {
        HashMap map = this.f7609g;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((sv0) it.next()).f7217a.mo2157s();
        }
        map.clear();
        m4853i(EnumC0474ml.f5073l, new qv0(ij0.m2652a(ja1Var), 0));
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: e */
    public final void mo3397e() {
        AbstractC0959zp abstractC0959zp;
        ue0 ue0Var = this.f7610h;
        if (ue0Var == null || !ue0Var.m4911c() || this.f7614l == EnumC0474ml.f5075n) {
            return;
        }
        SocketAddress socketAddressM4909a = this.f7610h.m4909a();
        HashMap map = this.f7609g;
        boolean zContainsKey = map.containsKey(socketAddressM4909a);
        Logger logger = f7607o;
        if (zContainsKey) {
            abstractC0959zp = ((sv0) map.get(socketAddressM4909a)).f7217a;
        } else {
            pv0 pv0Var = new pv0(this);
            hj0 hj0VarM2270d = hj0.m2270d();
            C0190ex[] c0190exArr = {new C0190ex(socketAddressM4909a)};
            wm1.m5355a("arraySize", 1);
            ArrayList arrayList = new ArrayList(6);
            Collections.addAll(arrayList, c0190exArr);
            hj0VarM2270d.m2274e(arrayList);
            hj0VarM2270d.m2271a(pv0Var);
            final AbstractC0959zp abstractC0959zpMo960a = this.f7608f.mo960a(hj0VarM2270d.m2272b());
            if (abstractC0959zpMo960a == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressM4909a);
                C0270h1.m2191g("Can't create subchannel");
                return;
            }
            sv0 sv0Var = new sv0(abstractC0959zpMo960a, pv0Var);
            pv0Var.f6272b = sv0Var;
            map.put(socketAddressM4909a, sv0Var);
            if (abstractC0959zpMo960a.mo2156e().f8455a.get(mj0.f5056d) == null) {
                pv0Var.f6271a = C0511nl.m3549a(EnumC0474ml.f5072k);
            }
            abstractC0959zpMo960a.mo2158u(new lj0() { // from class: ov0
                @Override // p000.lj0
                /* JADX INFO: renamed from: a */
                public final void mo3228a(C0511nl c0511nl) {
                    AbstractC0959zp abstractC0959zp2;
                    tv0 tv0Var = this.f5921a;
                    AbstractC0477mo abstractC0477mo = tv0Var.f7608f;
                    EnumC0474ml enumC0474ml = c0511nl.f5453a;
                    HashMap map2 = tv0Var.f7609g;
                    AbstractC0959zp abstractC0959zp3 = abstractC0959zpMo960a;
                    sv0 sv0Var2 = (sv0) map2.get((SocketAddress) abstractC0959zp3.m5992c().f2195a.get(0));
                    if (sv0Var2 == null || (abstractC0959zp2 = sv0Var2.f7217a) != abstractC0959zp3 || enumC0474ml == EnumC0474ml.f5075n) {
                        return;
                    }
                    EnumC0474ml enumC0474ml2 = EnumC0474ml.f5074m;
                    if (enumC0474ml == enumC0474ml2) {
                        abstractC0477mo.mo964m();
                    }
                    sv0.m4598a(sv0Var2, enumC0474ml);
                    EnumC0474ml enumC0474ml3 = tv0Var.f7614l;
                    EnumC0474ml enumC0474ml4 = EnumC0474ml.f5071j;
                    EnumC0474ml enumC0474ml5 = EnumC0474ml.f5073l;
                    if (enumC0474ml3 == enumC0474ml5 || tv0Var.f7615m == enumC0474ml5) {
                        if (enumC0474ml == enumC0474ml4) {
                            return;
                        }
                        if (enumC0474ml == enumC0474ml2) {
                            tv0Var.mo3397e();
                            return;
                        }
                    }
                    int iOrdinal = enumC0474ml.ordinal();
                    if (iOrdinal == 0) {
                        tv0Var.f7614l = enumC0474ml4;
                        tv0Var.m4853i(enumC0474ml4, new qv0(ij0.f3585e, 0));
                        return;
                    }
                    if (iOrdinal == 1) {
                        tv0Var.m4851g();
                        for (sv0 sv0Var3 : map2.values()) {
                            if (!sv0Var3.f7217a.equals(abstractC0959zp2)) {
                                sv0Var3.f7217a.mo2157s();
                            }
                        }
                        map2.clear();
                        EnumC0474ml enumC0474ml6 = EnumC0474ml.f5072k;
                        sv0.m4598a(sv0Var2, enumC0474ml6);
                        map2.put((SocketAddress) abstractC0959zp2.m5992c().f2195a.get(0), sv0Var2);
                        tv0Var.f7610h.m4913e((SocketAddress) abstractC0959zp3.m5992c().f2195a.get(0));
                        tv0Var.f7614l = enumC0474ml6;
                        tv0Var.m4854j(sv0Var2);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            dd0.m1167m(enumC0474ml, "Unsupported state:");
                            return;
                        }
                        ue0 ue0Var2 = tv0Var.f7610h;
                        ue0Var2.f7803b = 0;
                        ue0Var2.f7804c = 0;
                        tv0Var.f7614l = enumC0474ml2;
                        tv0Var.m4853i(enumC0474ml2, new rv0(tv0Var, tv0Var));
                        return;
                    }
                    if (tv0Var.f7610h.m4911c() && ((sv0) map2.get(tv0Var.f7610h.m4909a())).f7217a == abstractC0959zp3 && tv0Var.f7610h.m4910b()) {
                        tv0Var.m4851g();
                        tv0Var.mo3397e();
                    }
                    ue0 ue0Var3 = tv0Var.f7610h;
                    if (ue0Var3 == null || ue0Var3.m4911c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = tv0Var.f7610h.f7802a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((sv0) it.next()).f7220d) {
                            return;
                        }
                    }
                    tv0Var.f7614l = enumC0474ml5;
                    tv0Var.m4853i(enumC0474ml5, new qv0(ij0.m2652a(c0511nl.f5454b), 0));
                    int i = tv0Var.f7611i + 1;
                    tv0Var.f7611i = i;
                    List list2 = tv0Var.f7610h.f7802a;
                    if (i >= (list2 != null ? list2.size() : 0) || tv0Var.f7612j) {
                        tv0Var.f7612j = false;
                        tv0Var.f7611i = 0;
                        abstractC0477mo.mo964m();
                    }
                }
            });
            abstractC0959zp = abstractC0959zpMo960a;
        }
        int iOrdinal = ((sv0) map.get(socketAddressM4909a)).f7218b.ordinal();
        if (iOrdinal == 0) {
            if (this.f7616n) {
                m4852h();
                return;
            } else {
                abstractC0959zp.mo2660q();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.f7610h.m4910b();
            mo3397e();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            abstractC0959zp.mo2660q();
            sv0.m4598a((sv0) map.get(socketAddressM4909a), EnumC0474ml.f5071j);
            m4852h();
        }
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: f */
    public final void mo1390f() {
        Level level = Level.FINE;
        HashMap map = this.f7609g;
        f7607o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        EnumC0474ml enumC0474ml = EnumC0474ml.f5075n;
        this.f7614l = enumC0474ml;
        this.f7615m = enumC0474ml;
        m4851g();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((sv0) it.next()).f7217a.mo2157s();
        }
        map.clear();
    }

    /* JADX INFO: renamed from: g */
    public final void m4851g() {
        a81 a81Var = this.f7613k;
        if (a81Var != null) {
            a81Var.m80d();
            this.f7613k = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4852h() {
        if (this.f7616n) {
            a81 a81Var = this.f7613k;
            if (a81Var != null) {
                fc1 fc1Var = (fc1) a81Var.f63k;
                if (!fc1Var.f2377l && !fc1Var.f2376k) {
                    return;
                }
            }
            AbstractC0477mo abstractC0477mo = this.f7608f;
            this.f7613k = abstractC0477mo.mo963h().m2027c(new RunnableC0897y0(19, this), 250L, TimeUnit.MILLISECONDS, abstractC0477mo.mo962g());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4853i(EnumC0474ml enumC0474ml, kj0 kj0Var) {
        if (enumC0474ml == this.f7615m && (enumC0474ml == EnumC0474ml.f5074m || enumC0474ml == EnumC0474ml.f5071j)) {
            return;
        }
        this.f7615m = enumC0474ml;
        this.f7608f.mo965o(enumC0474ml, kj0Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m4854j(sv0 sv0Var) {
        EnumC0474ml enumC0474ml = sv0Var.f7218b;
        EnumC0474ml enumC0474ml2 = EnumC0474ml.f5072k;
        if (enumC0474ml != enumC0474ml2) {
            return;
        }
        C0511nl c0511nl = sv0Var.f7219c.f6271a;
        EnumC0474ml enumC0474ml3 = c0511nl.f5453a;
        if (enumC0474ml3 == enumC0474ml2) {
            m4853i(enumC0474ml2, new qv0(ij0.m2653b(sv0Var.f7217a, null), 1));
            return;
        }
        EnumC0474ml enumC0474ml4 = EnumC0474ml.f5073l;
        if (enumC0474ml3 == enumC0474ml4) {
            m4853i(enumC0474ml4, new qv0(ij0.m2652a(c0511nl.f5454b), 0));
        } else if (this.f7615m != enumC0474ml4) {
            m4853i(enumC0474ml3, new qv0(ij0.f3585e, 0));
        }
    }
}
