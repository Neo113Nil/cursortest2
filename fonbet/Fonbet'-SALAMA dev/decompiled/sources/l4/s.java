package l4;

import A1.C0011c;
import A1.M0;
import W5.AbstractC0486a1;
import Y4.D;
import androidx.appcompat.widget.b1;
import d6.C0977k;
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
import m4.C1437a;
import n4.C1473g;
import n4.C1479m;
import s4.C1593a;
import w1.L;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: H, reason: collision with root package name */
    public static long f14976H;

    /* renamed from: A, reason: collision with root package name */
    public String f14977A;

    /* renamed from: F, reason: collision with root package name */
    public long f14982F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14983G;

    /* renamed from: a, reason: collision with root package name */
    public final C1479m f14984a;

    /* renamed from: b, reason: collision with root package name */
    public final C0011c f14985b;

    /* renamed from: c, reason: collision with root package name */
    public String f14986c;

    /* renamed from: f, reason: collision with root package name */
    public long f14989f;

    /* renamed from: g, reason: collision with root package name */
    public O1.k f14990g;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f14994l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f14995m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f14996n;

    /* renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f14997o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f14998p;

    /* renamed from: q, reason: collision with root package name */
    public String f14999q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15000r;

    /* renamed from: s, reason: collision with root package name */
    public String f15001s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15002t;

    /* renamed from: u, reason: collision with root package name */
    public final A0.b f15003u;

    /* renamed from: v, reason: collision with root package name */
    public final B1.c f15004v;

    /* renamed from: w, reason: collision with root package name */
    public final B1.c f15005w;

    /* renamed from: x, reason: collision with root package name */
    public final L4.b f15006x;

    /* renamed from: y, reason: collision with root package name */
    public final android.support.v4.media.session.t f15007y;

    /* renamed from: z, reason: collision with root package name */
    public final C1437a f15008z;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f14987d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f14988e = true;

    /* renamed from: h, reason: collision with root package name */
    public EnumC1402m f14991h = EnumC1402m.f14953a;

    /* renamed from: i, reason: collision with root package name */
    public long f14992i = 0;
    public long j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f14993k = 0;

    /* renamed from: B, reason: collision with root package name */
    public long f14978B = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f14979C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f14980D = 0;

    /* renamed from: E, reason: collision with root package name */
    public ScheduledFuture f14981E = null;

    public s(A0.b bVar, C0011c c0011c, C1479m c1479m) {
        this.f14984a = c1479m;
        this.f15003u = bVar;
        L4.b bVar2 = (L4.b) bVar.f21c;
        this.f15006x = bVar2;
        this.f15004v = (B1.c) bVar.f22d;
        this.f15005w = (B1.c) bVar.f23e;
        this.f14985b = c0011c;
        this.f14998p = new HashMap();
        this.f14994l = new HashMap();
        this.f14996n = new HashMap();
        this.f14997o = new ConcurrentHashMap();
        this.f14995m = new ArrayList();
        B.v vVar = (B.v) bVar.f24f;
        this.f15008z = new C1437a(bVar2, new android.support.v4.media.session.t(vVar, "ConnectionRetryHelper", (Object) null, 24));
        long j = f14976H;
        f14976H = 1 + j;
        this.f15007y = new android.support.v4.media.session.t(vVar, "PersistentConnection", AbstractC0486a1.g("pc_", j), 24);
        this.f14977A = null;
        c();
    }

    public final boolean a() {
        return this.f14991h == EnumC1402m.f14957e;
    }

    public final boolean b() {
        EnumC1402m enumC1402m = this.f14991h;
        return enumC1402m == EnumC1402m.f14956d || enumC1402m == EnumC1402m.f14957e;
    }

    public final void c() {
        if (!e()) {
            if (this.f14987d.contains("connection_idle")) {
                D.v("", !e(), new Object[0]);
                i("connection_idle");
                return;
            }
            return;
        }
        ScheduledFuture scheduledFuture = this.f14981E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f14981E = this.f15006x.schedule(new b1(this, 12), 60000L, TimeUnit.MILLISECONDS);
    }

    public final void d(String str) {
        android.support.v4.media.session.t tVar = this.f15007y;
        if (tVar.r0()) {
            tVar.W(null, "Connection interrupted for: ".concat(str), new Object[0]);
        }
        this.f14987d.add(str);
        O1.k kVar = this.f14990g;
        C1437a c1437a = this.f15008z;
        if (kVar != null) {
            kVar.d(2);
            this.f14990g = null;
        } else {
            ScheduledFuture scheduledFuture = c1437a.f15267h;
            android.support.v4.media.session.t tVar2 = c1437a.f15261b;
            if (scheduledFuture != null) {
                tVar2.W(null, "Cancelling existing retry attempt", new Object[0]);
                c1437a.f15267h.cancel(false);
                c1437a.f15267h = null;
            } else {
                tVar2.W(null, "No existing retry attempt to cancel", new Object[0]);
            }
            c1437a.f15268i = 0L;
            this.f14991h = EnumC1402m.f14953a;
        }
        c1437a.j = true;
        c1437a.f15268i = 0L;
    }

    public final boolean e() {
        return this.f14998p.isEmpty() && this.f14997o.isEmpty() && this.f14994l.isEmpty() && !this.f14983G && this.f14996n.isEmpty();
    }

    public final void f(String str, ArrayList arrayList, Object obj, String str2, u uVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", D.M(arrayList));
        hashMap.put("d", obj);
        if (str2 != null) {
            hashMap.put("h", str2);
        }
        long j = this.f14992i;
        this.f14992i = 1 + j;
        HashMap hashMap2 = this.f14996n;
        Long valueOf = Long.valueOf(j);
        C1406q c1406q = new C1406q();
        c1406q.f14970a = str;
        c1406q.f14971b = hashMap;
        c1406q.f14972c = uVar;
        hashMap2.put(valueOf, c1406q);
        if (a()) {
            o(j);
        }
        this.f14982F = System.currentTimeMillis();
        c();
    }

    public final C1405p g(C1407r c1407r) {
        android.support.v4.media.session.t tVar = this.f15007y;
        if (tVar.r0()) {
            tVar.W(null, "removing query " + c1407r, new Object[0]);
        }
        HashMap hashMap = this.f14998p;
        if (hashMap.containsKey(c1407r)) {
            C1405p c1405p = (C1405p) hashMap.get(c1407r);
            hashMap.remove(c1407r);
            c();
            return c1405p;
        }
        if (tVar.r0()) {
            tVar.W(null, "Trying to remove listener for QuerySpec " + c1407r + " but no listener exists.", new Object[0]);
        }
        return null;
    }

    public final void h() {
        EnumC1402m enumC1402m = this.f14991h;
        D.v("Should be connected if we're restoring state, but we are: %s", enumC1402m == EnumC1402m.f14957e, enumC1402m);
        android.support.v4.media.session.t tVar = this.f15007y;
        if (tVar.r0()) {
            tVar.W(null, "Restoring outstanding listens", new Object[0]);
        }
        for (C1405p c1405p : this.f14998p.values()) {
            if (tVar.r0()) {
                tVar.W(null, "Restoring listen " + c1405p.f14967b, new Object[0]);
            }
            m(c1405p);
        }
        if (tVar.r0()) {
            tVar.W(null, "Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f14996n.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o(((Long) it.next()).longValue());
        }
        ArrayList arrayList2 = this.f14995m;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C1403n c1403n = (C1403n) it2.next();
            n(c1403n.f14959a, c1403n.f14960b, c1403n.f14961c, c1403n.f14962d);
        }
        arrayList2.clear();
        if (tVar.r0()) {
            tVar.W(null, "Restoring reads.", new Object[0]);
        }
        ArrayList arrayList3 = new ArrayList(this.f14997o.keySet());
        Collections.sort(arrayList3);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            l((Long) it3.next());
        }
    }

    public final void i(String str) {
        android.support.v4.media.session.t tVar = this.f15007y;
        if (tVar.r0()) {
            tVar.W(null, "Connection no longer interrupted for: ".concat(str), new Object[0]);
        }
        this.f14987d.remove(str);
        if (this.f14987d.size() == 0 && this.f14991h == EnumC1402m.f14953a) {
            q();
        }
    }

    public final void j(final boolean z4) {
        if (this.f15001s == null) {
            h();
            return;
        }
        D.v("Must be connected to send auth, but was: %s", b(), this.f14991h);
        android.support.v4.media.session.t tVar = this.f15007y;
        if (tVar.r0()) {
            tVar.W(null, "Sending app check.", new Object[0]);
        }
        InterfaceC1401l interfaceC1401l = new InterfaceC1401l() { // from class: l4.f
            @Override // l4.InterfaceC1401l
            public final void a(Map map) {
                s sVar = s.this;
                sVar.getClass();
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    sVar.f14980D = 0;
                } else {
                    sVar.f15001s = null;
                    sVar.f15002t = true;
                    sVar.f15007y.W(null, L.j("App check failed: ", str, " (", (String) map.get("d"), ")"), new Object[0]);
                }
                if (z4) {
                    sVar.h();
                }
            }
        };
        HashMap hashMap = new HashMap();
        D.v("App check token must be set!", this.f15001s != null, new Object[0]);
        hashMap.put("token", this.f15001s);
        p("appcheck", true, hashMap, interfaceC1401l);
    }

    public final void k(boolean z4) {
        D.v("Must be connected to send auth, but was: %s", b(), this.f14991h);
        android.support.v4.media.session.t tVar = this.f15007y;
        com.google.android.gms.common.internal.w wVar = null;
        if (tVar.r0()) {
            tVar.W(null, "Sending auth.", new Object[0]);
        }
        InterfaceC1401l c1397h = new C1397h(this, z4);
        HashMap hashMap = new HashMap();
        String str = this.f14999q;
        if (str.startsWith("gauth|")) {
            try {
                HashMap c3 = q6.a.c(str.substring(6));
                wVar = new com.google.android.gms.common.internal.w(24, (String) c3.get("token"), (Map) c3.get("auth"));
            } catch (IOException e7) {
                throw new RuntimeException("Failed to parse gauth token", e7);
            }
        }
        if (wVar == null) {
            hashMap.put("cred", this.f14999q);
            p("auth", true, hashMap, c1397h);
            return;
        }
        hashMap.put("cred", (String) wVar.f11335b);
        Map map = (Map) wVar.f11336c;
        if (map != null) {
            hashMap.put("authvar", map);
        }
        p("gauth", true, hashMap, c1397h);
    }

    public final void l(Long l7) {
        D.v("sendGet called when we can't send gets", this.f14991h == EnumC1402m.f14957e, new Object[0]);
        C1404o c1404o = (C1404o) this.f14997o.get(l7);
        if (c1404o.f14965c) {
            android.support.v4.media.session.t tVar = this.f15007y;
            if (tVar.r0()) {
                tVar.W(null, "get" + l7 + " cancelled, ignoring.", new Object[0]);
                return;
            }
        } else {
            c1404o.f14965c = true;
        }
        p("g", false, c1404o.f14963a, new C1399j(this, l7, c1404o));
    }

    public final void m(C1405p c1405p) {
        C0977k c0977k;
        HashMap hashMap = new HashMap();
        hashMap.put("p", D.M(c1405p.f14967b.f14974a));
        Long l7 = c1405p.f14969d;
        if (l7 != null) {
            hashMap.put("q", c1405p.f14967b.f14975b);
            hashMap.put("t", l7);
        }
        s4.i iVar = (s4.i) c1405p.f14968c.f15383a;
        hashMap.put("h", ((C1593a) iVar.f16176c.f11336c).f16147a.f17186a.x());
        if (q4.d.b(((C1593a) iVar.f16176c.f11336c).f16147a.f17186a) > 1024) {
            v4.r rVar = ((C1593a) iVar.f16176c.f11336c).f16147a.f17186a;
            E4.y yVar = new E4.y();
            yVar.f2247a = Math.max(512L, (long) Math.sqrt(q4.d.b(rVar) * 100));
            if (rVar.isEmpty()) {
                c0977k = new C0977k(Collections.emptyList(), Collections.singletonList(""));
            } else {
                M0 m02 = new M0(yVar);
                C0977k.s(rVar, m02);
                q4.k.b("Can't finish hashing in the middle processing a child", m02.f119b == 0);
                if (((StringBuilder) m02.f121d) != null) {
                    m02.b();
                }
                ArrayList arrayList = (ArrayList) m02.f124g;
                arrayList.add("");
                c0977k = new C0977k((ArrayList) m02.f123f, arrayList);
            }
            List unmodifiableList = Collections.unmodifiableList((List) c0977k.f12441b);
            ArrayList arrayList2 = new ArrayList(unmodifiableList.size());
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C1473g) it.next()).l());
            }
            List unmodifiableList2 = Collections.unmodifiableList((List) c0977k.f12442c);
            if (arrayList2.size() != unmodifiableList2.size() - 1) {
                throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = Collections.unmodifiableList(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList3.add(D.M((List) it2.next()));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", Collections.unmodifiableList(unmodifiableList2));
            hashMap2.put("ps", arrayList3);
            hashMap.put("ch", hashMap2);
        }
        p("q", false, hashMap, new C1400k(this, c1405p));
    }

    public final void n(String str, ArrayList arrayList, Object obj, u uVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", D.M(arrayList));
        hashMap.put("d", obj);
        p(str, false, hashMap, new C1396g(uVar, 0));
    }

    public final void o(long j) {
        D.v("sendPut called when we can't send writes (we're disconnected or writes are paused).", a(), new Object[0]);
        C1406q c1406q = (C1406q) this.f14996n.get(Long.valueOf(j));
        u uVar = c1406q.f14972c;
        c1406q.f14973d = true;
        String str = c1406q.f14970a;
        p(str, false, c1406q.f14971b, new C1398i(this, str, j, c1406q, uVar));
    }

    public final void p(String str, boolean z4, Map map, InterfaceC1401l interfaceC1401l) {
        String[] strArr;
        long j = this.f14993k;
        this.f14993k = 1 + j;
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(j));
        hashMap.put("a", str);
        hashMap.put("b", map);
        O1.k kVar = this.f14990g;
        kVar.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("t", "d");
        hashMap2.put("d", hashMap);
        int i7 = kVar.f4970a;
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) kVar.f4974e;
        if (i7 != 2) {
            tVar.W(null, "Tried to send on an unconnected connection", new Object[0]);
        } else {
            if (z4) {
                tVar.W(null, "Sending data (contents hidden)", new Object[0]);
            } else {
                tVar.W(null, "Sending data: %s", hashMap2);
            }
            y yVar = (y) kVar.f4972c;
            yVar.e();
            try {
                String d7 = q6.a.d(hashMap2);
                if (d7.length() <= 16384) {
                    strArr = new String[]{d7};
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i8 = 0;
                    while (i8 < d7.length()) {
                        int i9 = i8 + 16384;
                        arrayList.add(d7.substring(i8, Math.min(i9, d7.length())));
                        i8 = i9;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArr.length > 1) {
                    yVar.f15020a.K("" + strArr.length);
                }
                for (String str2 : strArr) {
                    yVar.f15020a.K(str2);
                }
            } catch (IOException e7) {
                yVar.j.a0("Failed to serialize message: " + hashMap2.toString(), e7);
                yVar.f();
            }
        }
        this.f14994l.put(Long.valueOf(j), interfaceC1401l);
    }

    public final void q() {
        if (this.f14987d.size() == 0) {
            EnumC1402m enumC1402m = this.f14991h;
            D.v("Not in disconnected state: %s", enumC1402m == EnumC1402m.f14953a, enumC1402m);
            boolean z4 = this.f15000r;
            boolean z7 = this.f15002t;
            this.f15007y.W(null, "Scheduling connection attempt", new Object[0]);
            this.f15000r = false;
            this.f15002t = false;
            RunnableC1391b runnableC1391b = new RunnableC1391b(this, z4, z7);
            C1437a c1437a = this.f15008z;
            c1437a.getClass();
            x xVar = new x(2, c1437a, runnableC1391b);
            ScheduledFuture scheduledFuture = c1437a.f15267h;
            android.support.v4.media.session.t tVar = c1437a.f15261b;
            if (scheduledFuture != null) {
                tVar.W(null, "Cancelling previous scheduled retry", new Object[0]);
                c1437a.f15267h.cancel(false);
                c1437a.f15267h = null;
            }
            long j = 0;
            if (!c1437a.j) {
                long j3 = c1437a.f15268i;
                if (j3 == 0) {
                    c1437a.f15268i = c1437a.f15262c;
                } else {
                    c1437a.f15268i = Math.min((long) (j3 * c1437a.f15265f), c1437a.f15263d);
                }
                double d7 = c1437a.f15264e;
                double d8 = c1437a.f15268i;
                j = (long) ((c1437a.f15266g.nextDouble() * d7 * d8) + ((1.0d - d7) * d8));
            }
            c1437a.j = false;
            tVar.W(null, "Scheduling retry in %dms", Long.valueOf(j));
            c1437a.f15267h = c1437a.f15260a.schedule(xVar, j, TimeUnit.MILLISECONDS);
        }
    }
}
