package p083l4;

import A0.b;
import A1.C0011c;
import A1.M0;
import B.v;
import B1.c;
import E4.y;
import O1.k;
import W5.AbstractC0486a1;
import Y4.D;
import android.support.v4.media.session.t;
import androidx.appcompat.widget.b1;
import com.google.android.gms.common.internal.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p091m4.a;
import p098n4.C0934g;
import p098n4.C0940m;
import p120q4.d;
import p134s4.i;
import p155w1.L;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static long f14982H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f14983A;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f14988F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f14989G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0940m f14990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0011c f14991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14992c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f14996g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f15000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f15001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f15002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f15003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f15004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f15005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f15007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f15009u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f15010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f15011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final L4.b f15012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f15013y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f15014z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f14993d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14994e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f14997h = m.f14959a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f14998i = 0;
    public long j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14999k = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f14984B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f14985C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14986D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ScheduledFuture f14987E = null;

    public s(b bVar, C0011c c0011c, C0940m c0940m) {
        this.f14990a = c0940m;
        this.f15009u = bVar;
        L4.b bVar2 = (L4.b) bVar.f21c;
        this.f15012x = bVar2;
        this.f15010v = (c) bVar.f22d;
        this.f15011w = (c) bVar.f23e;
        this.f14991b = c0011c;
        this.f15004p = new HashMap();
        this.f15000l = new HashMap();
        this.f15002n = new HashMap();
        this.f15003o = new ConcurrentHashMap();
        this.f15001m = new ArrayList();
        v vVar = (v) bVar.f24f;
        this.f15014z = new a(bVar2, new t(vVar, "ConnectionRetryHelper", (Object) null, 24));
        long j = f14982H;
        f14982H = 1 + j;
        this.f15013y = new t(vVar, "PersistentConnection", AbstractC0486a1.g("pc_", j), 24);
        this.f14983A = null;
        c();
    }

    public final boolean a() {
        return this.f14997h == m.f14963e;
    }

    public final boolean b() {
        m mVar = this.f14997h;
        return mVar == m.f14962d || mVar == m.f14963e;
    }

    public final void c() {
        if (!e()) {
            if (this.f14993d.contains("connection_idle")) {
                D.v("", !e(), new Object[0]);
                i("connection_idle");
                return;
            }
            return;
        }
        ScheduledFuture scheduledFuture = this.f14987E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f14987E = this.f15012x.schedule(new b1(this, 12), 60000L, TimeUnit.MILLISECONDS);
    }

    public final void d(String str) {
        t tVar = this.f15013y;
        if (tVar.r0()) {
            tVar.W(null, "Connection interrupted for: ".concat(str), new Object[0]);
        }
        this.f14993d.add(str);
        k kVar = this.f14996g;
        a aVar = this.f15014z;
        if (kVar != null) {
            kVar.d(2);
            this.f14996g = null;
        } else {
            ScheduledFuture scheduledFuture = aVar.f15273h;
            t tVar2 = aVar.f15267b;
            if (scheduledFuture != null) {
                tVar2.W(null, "Cancelling existing retry attempt", new Object[0]);
                aVar.f15273h.cancel(false);
                aVar.f15273h = null;
            } else {
                tVar2.W(null, "No existing retry attempt to cancel", new Object[0]);
            }
            aVar.f15274i = 0L;
            this.f14997h = m.f14959a;
        }
        aVar.j = true;
        aVar.f15274i = 0L;
    }

    public final boolean e() {
        return this.f15004p.isEmpty() && this.f15003o.isEmpty() && this.f15000l.isEmpty() && !this.f14989G && this.f15002n.isEmpty();
    }

    public final void f(String str, ArrayList arrayList, Object obj, String str2, u uVar) {
        HashMap map = new HashMap();
        map.put("p", D.M(arrayList));
        map.put("d", obj);
        if (str2 != null) {
            map.put("h", str2);
        }
        long j = this.f14998i;
        this.f14998i = 1 + j;
        HashMap map2 = this.f15002n;
        Long lValueOf = Long.valueOf(j);
        q qVar = new q();
        qVar.f14976a = str;
        qVar.f14977b = map;
        qVar.f14978c = uVar;
        map2.put(lValueOf, qVar);
        if (a()) {
            o(j);
        }
        this.f14988F = System.currentTimeMillis();
        c();
    }

    public final p g(r rVar) {
        t tVar = this.f15013y;
        if (tVar.r0()) {
            tVar.W(null, "removing query " + rVar, new Object[0]);
        }
        HashMap map = this.f15004p;
        if (map.containsKey(rVar)) {
            p pVar = (p) map.get(rVar);
            map.remove(rVar);
            c();
            return pVar;
        }
        if (tVar.r0()) {
            tVar.W(null, "Trying to remove listener for QuerySpec " + rVar + " but no listener exists.", new Object[0]);
        }
        return null;
    }

    public final void h() {
        m mVar = this.f14997h;
        D.v("Should be connected if we're restoring state, but we are: %s", mVar == m.f14963e, mVar);
        t tVar = this.f15013y;
        if (tVar.r0()) {
            tVar.W(null, "Restoring outstanding listens", new Object[0]);
        }
        for (p pVar : this.f15004p.values()) {
            if (tVar.r0()) {
                tVar.W(null, "Restoring listen " + pVar.f14973b, new Object[0]);
            }
            m(pVar);
        }
        if (tVar.r0()) {
            tVar.W(null, "Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f15002n.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o(((Long) it.next()).longValue());
        }
        ArrayList<n> arrayList2 = this.f15001m;
        for (n nVar : arrayList2) {
            n(nVar.f14965a, nVar.f14966b, nVar.f14967c, nVar.f14968d);
        }
        arrayList2.clear();
        if (tVar.r0()) {
            tVar.W(null, "Restoring reads.", new Object[0]);
        }
        ArrayList arrayList3 = new ArrayList(this.f15003o.keySet());
        Collections.sort(arrayList3);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            l((Long) it2.next());
        }
    }

    public final void i(String str) {
        t tVar = this.f15013y;
        if (tVar.r0()) {
            tVar.W(null, "Connection no longer interrupted for: ".concat(str), new Object[0]);
        }
        this.f14993d.remove(str);
        if (this.f14993d.size() == 0 && this.f14997h == m.f14959a) {
            q();
        }
    }

    public final void j(final boolean z4) {
        if (this.f15007s == null) {
            h();
            return;
        }
        D.v("Must be connected to send auth, but was: %s", b(), this.f14997h);
        t tVar = this.f15013y;
        if (tVar.r0()) {
            tVar.W(null, "Sending app check.", new Object[0]);
        }
        l lVar = new l() { // from class: l4.f
            @Override // p083l4.l
            public final void a(Map map) {
                s sVar = this.f14943a;
                sVar.getClass();
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    sVar.f14986D = 0;
                } else {
                    sVar.f15007s = null;
                    sVar.f15008t = true;
                    sVar.f15013y.W(null, L.j("App check failed: ", str, " (", (String) map.get("d"), ")"), new Object[0]);
                }
                if (z4) {
                    sVar.h();
                }
            }
        };
        HashMap map = new HashMap();
        D.v("App check token must be set!", this.f15007s != null, new Object[0]);
        map.put("token", this.f15007s);
        p("appcheck", true, map, lVar);
    }

    public final void k(boolean z4) {
        D.v("Must be connected to send auth, but was: %s", b(), this.f14997h);
        t tVar = this.f15013y;
        w wVar = null;
        if (tVar.r0()) {
            tVar.W(null, "Sending auth.", new Object[0]);
        }
        l hVar = new h(this, z4);
        HashMap map = new HashMap();
        String str = this.f15005q;
        if (str.startsWith("gauth|")) {
            try {
                HashMap mapC = q6.a.c(str.substring(6));
                wVar = new w(24, (String) mapC.get("token"), (Map) mapC.get("auth"));
            } catch (IOException e7) {
                throw new RuntimeException("Failed to parse gauth token", e7);
            }
        }
        if (wVar == null) {
            map.put("cred", this.f15005q);
            p("auth", true, map, hVar);
            return;
        }
        map.put("cred", (String) wVar.f11335b);
        Map map2 = (Map) wVar.f11336c;
        if (map2 != null) {
            map.put("authvar", map2);
        }
        p("gauth", true, map, hVar);
    }

    public final void l(Long l7) {
        D.v("sendGet called when we can't send gets", this.f14997h == m.f14963e, new Object[0]);
        o oVar = (o) this.f15003o.get(l7);
        if (oVar.f14971c) {
            t tVar = this.f15013y;
            if (tVar.r0()) {
                tVar.W(null, "get" + l7 + " cancelled, ignoring.", new Object[0]);
                return;
            }
        } else {
            oVar.f14971c = true;
        }
        p("g", false, oVar.f14969a, new j(this, l7, oVar));
    }

    public final void m(p pVar) {
        p028d6.k kVar;
        HashMap map = new HashMap();
        map.put("p", D.M(pVar.f14973b.f14980a));
        Long l7 = pVar.f14975d;
        if (l7 != null) {
            map.put("q", pVar.f14973b.f14981b);
            map.put("t", l7);
        }
        i iVar = (i) pVar.f14974c.f15389a;
        map.put("h", ((p134s4.a) iVar.f16182c.f11336c).f16153a.f17192a.x());
        if (d.b(((p134s4.a) iVar.f16182c.f11336c).f16153a.f17192a) > 1024) {
            r rVar = ((p134s4.a) iVar.f16182c.f11336c).f16153a.f17192a;
            y yVar = new y();
            yVar.f2247a = Math.max(512L, (long) Math.sqrt(d.b(rVar) * 100));
            if (rVar.isEmpty()) {
                kVar = new p028d6.k(Collections.emptyList(), Collections.singletonList(""));
            } else {
                M0 m7 = new M0(yVar);
                p028d6.k.s(rVar, m7);
                p120q4.k.b("Can't finish hashing in the middle processing a child", m7.f119b == 0);
                if (((StringBuilder) m7.f121d) != null) {
                    m7.b();
                }
                ArrayList arrayList = (ArrayList) m7.f124g;
                arrayList.add("");
                kVar = new p028d6.k((ArrayList) m7.f123f, arrayList);
            }
            List listUnmodifiableList = Collections.unmodifiableList((List) kVar.f12447b);
            ArrayList arrayList2 = new ArrayList(listUnmodifiableList.size());
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C0934g) it.next()).l());
            }
            List listUnmodifiableList2 = Collections.unmodifiableList((List) kVar.f12448c);
            if (arrayList2.size() != listUnmodifiableList2.size() - 1) {
                throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = Collections.unmodifiableList(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList3.add(D.M((List) it2.next()));
            }
            HashMap map2 = new HashMap();
            map2.put("hs", Collections.unmodifiableList(listUnmodifiableList2));
            map2.put("ps", arrayList3);
            map.put("ch", map2);
        }
        p("q", false, map, new k(this, pVar));
    }

    public final void n(String str, ArrayList arrayList, Object obj, u uVar) {
        HashMap map = new HashMap();
        map.put("p", D.M(arrayList));
        map.put("d", obj);
        p(str, false, map, new g(uVar, 0));
    }

    public final void o(long j) {
        D.v("sendPut called when we can't send writes (we're disconnected or writes are paused).", a(), new Object[0]);
        q qVar = (q) this.f15002n.get(Long.valueOf(j));
        u uVar = qVar.f14978c;
        qVar.f14979d = true;
        String str = qVar.f14976a;
        p(str, false, qVar.f14977b, new i(this, str, j, qVar, uVar));
    }

    public final void p(String str, boolean z4, Map map, l lVar) {
        String[] strArr;
        long j = this.f14999k;
        this.f14999k = 1 + j;
        HashMap map2 = new HashMap();
        map2.put("r", Long.valueOf(j));
        map2.put("a", str);
        map2.put("b", map);
        k kVar = this.f14996g;
        kVar.getClass();
        HashMap map3 = new HashMap();
        map3.put("t", "d");
        map3.put("d", map2);
        int i7 = kVar.f4970a;
        t tVar = (t) kVar.f4974e;
        if (i7 != 2) {
            tVar.W(null, "Tried to send on an unconnected connection", new Object[0]);
        } else {
            if (z4) {
                tVar.W(null, "Sending data (contents hidden)", new Object[0]);
            } else {
                tVar.W(null, "Sending data: %s", map3);
            }
            y yVar = (y) kVar.f4972c;
            yVar.e();
            try {
                String strD = q6.a.d(map3);
                if (strD.length() <= 16384) {
                    strArr = new String[]{strD};
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i8 = 0;
                    while (i8 < strD.length()) {
                        int i9 = i8 + 16384;
                        arrayList.add(strD.substring(i8, Math.min(i9, strD.length())));
                        i8 = i9;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArr.length > 1) {
                    yVar.f15026a.K("" + strArr.length);
                }
                for (String str2 : strArr) {
                    yVar.f15026a.K(str2);
                }
            } catch (IOException e7) {
                yVar.j.a0("Failed to serialize message: " + map3.toString(), e7);
                yVar.f();
            }
        }
        this.f15000l.put(Long.valueOf(j), lVar);
    }

    public final void q() {
        if (this.f14993d.size() == 0) {
            m mVar = this.f14997h;
            D.v("Not in disconnected state: %s", mVar == m.f14959a, mVar);
            boolean z4 = this.f15006r;
            boolean z7 = this.f15008t;
            this.f15013y.W(null, "Scheduling connection attempt", new Object[0]);
            this.f15006r = false;
            this.f15008t = false;
            b bVar = new b(this, z4, z7);
            a aVar = this.f15014z;
            aVar.getClass();
            x xVar = new x(2, aVar, bVar);
            ScheduledFuture scheduledFuture = aVar.f15273h;
            t tVar = aVar.f15267b;
            if (scheduledFuture != null) {
                tVar.W(null, "Cancelling previous scheduled retry", new Object[0]);
                aVar.f15273h.cancel(false);
                aVar.f15273h = null;
            }
            long jNextDouble = 0;
            if (!aVar.j) {
                long j = aVar.f15274i;
                if (j == 0) {
                    aVar.f15274i = aVar.f15268c;
                } else {
                    aVar.f15274i = Math.min((long) (j * aVar.f15271f), aVar.f15269d);
                }
                double d7 = aVar.f15270e;
                double d8 = aVar.f15274i;
                jNextDouble = (long) ((aVar.f15272g.nextDouble() * d7 * d8) + ((1.0d - d7) * d8));
            }
            aVar.j = false;
            tVar.W(null, "Scheduling retry in %dms", Long.valueOf(jNextDouble));
            aVar.f15273h = aVar.f15266a.schedule(xVar, jNextDouble, TimeUnit.MILLISECONDS);
        }
    }
}
