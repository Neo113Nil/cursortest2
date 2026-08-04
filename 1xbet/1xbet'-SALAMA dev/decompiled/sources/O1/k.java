package O1;

import A1.C0011c;
import B.v;
import C0.J;
import C1.C0095a;
import C1.I;
import F1.m;
import F1.x;
import P.r0;
import P.s0;
import P.t0;
import P1.C;
import P1.D;
import P1.E;
import P1.z;
import W5.AbstractC0486a1;
import android.app.Activity;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Window;
import com.google.firebase.storage.s;
import com.google.firebase.storage.y;
import io.sentry.TransactionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p083l4.p;
import p083l4.q;
import p098n4.A;
import p098n4.AbstractC0930c;
import p098n4.C0934g;
import p098n4.C0940m;
import p098n4.M;
import p098n4.r;
import p151v2.t;
import p155w1.C1017n0;
import p155w1.C1052y0;
import p155w1.L;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public final class k implements z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f4969f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4974e;

    public k(s sVar, int i7, y yVar) {
        this.f4971b = new ConcurrentLinkedQueue();
        this.f4972c = new HashMap();
        this.f4973d = sVar;
        this.f4970a = i7;
        this.f4974e = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x012d  */
    @Override // P1.z
    public void a(C0095a c0095a) {
        p151v2.s sVar;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        p151v2.s sVar2;
        int i7;
        SparseArray sparseArray2;
        char c3;
        SparseIntArray sparseIntArray;
        int i8;
        SparseArray sparseArray3;
        if (c0095a.t() != 2) {
            return;
        }
        C c4 = (C) this.f4974e;
        int i9 = c4.f5124a;
        int i10 = 0;
        List list = c4.f5125b;
        if (i9 == 1 || i9 == 2 || c4.f5134l == 1) {
            sVar = (p151v2.s) list.get(0);
        } else {
            sVar = new p151v2.s(((p151v2.s) list.get(0)).c());
            list.add(sVar);
        }
        if ((c0095a.t() & 128) == 0) {
            return;
        }
        c0095a.E(1);
        int iY = c0095a.y();
        int i11 = 3;
        c0095a.E(3);
        x xVar = (x) this.f4971b;
        c0095a.f(xVar.f2586d, 0, 2);
        xVar.o(0);
        xVar.r(3);
        c4.f5140r = xVar.i(13);
        c0095a.f(xVar.f2586d, 0, 2);
        xVar.o(0);
        xVar.r(4);
        c0095a.E(xVar.i(12));
        v vVar = c4.f5128e;
        int i12 = c4.f5124a;
        if (i12 == 2 && c4.f5138p == null) {
            E eF = vVar.f(21, new C1017n0(21, (String) null, (ArrayList) null, t.f17164f));
            c4.f5138p = eF;
            if (eF != null) {
                eF.c(sVar, c4.f5133k, new J(iY, 21, 8192));
            }
        }
        SparseArray sparseArray4 = (SparseArray) this.f4972c;
        sparseArray4.clear();
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f4973d;
        sparseIntArray2.clear();
        int iD = c0095a.d();
        while (true) {
            sparseBooleanArray = c4.f5130g;
            if (iD <= 0) {
                break;
            }
            c0095a.f(xVar.f2586d, i10, 5);
            xVar.o(i10);
            int i13 = xVar.i(8);
            xVar.r(i11);
            int i14 = xVar.i(13);
            xVar.r(4);
            int i15 = xVar.i(12);
            int i16 = c0095a.f1463a;
            int i17 = i16 + i15;
            int i18 = iY;
            x xVar2 = xVar;
            int i19 = -1;
            String strTrim = null;
            p151v2.s sVar3 = sVar;
            ArrayList arrayList = null;
            while (true) {
                if (c0095a.f1463a >= i17) {
                    sparseArray2 = sparseArray4;
                    break;
                }
                int iT = c0095a.t();
                sparseArray2 = sparseArray4;
                int iT2 = c0095a.f1463a + c0095a.t();
                if (iT2 > i17) {
                    break;
                }
                int i20 = i14;
                if (iT == 5) {
                    long jU = c0095a.u();
                    if (jU == 1094921523) {
                        i19 = 129;
                    } else if (jU == 1161904947) {
                        i19 = 135;
                    } else if (jU == 1094921524) {
                        i19 = 172;
                    } else if (jU == 1212503619) {
                        i19 = 36;
                    }
                } else if (iT == 106) {
                    i19 = 129;
                } else if (iT == 122) {
                    i19 = 135;
                } else if (iT == 127) {
                    if (c0095a.t() == 21) {
                        i19 = 172;
                    }
                } else if (iT == 123) {
                    i19 = 138;
                } else if (iT == 10) {
                    strTrim = c0095a.r(3, D3.f.f1719c).trim();
                } else if (iT == 89) {
                    arrayList = new ArrayList();
                    while (c0095a.f1463a < iT2) {
                        String strTrim2 = c0095a.r(3, D3.f.f1719c).trim();
                        c0095a.t();
                        byte[] bArr = new byte[4];
                        c0095a.f(bArr, 0, 4);
                        arrayList.add(new D(strTrim2, bArr));
                        sparseIntArray2 = sparseIntArray2;
                    }
                    sparseIntArray2 = sparseIntArray2;
                    i19 = 89;
                } else {
                    sparseIntArray2 = sparseIntArray2;
                    if (iT == 111) {
                        i19 = 257;
                    }
                }
                c0095a.E(iT2 - c0095a.f1463a);
                sparseIntArray2 = sparseIntArray2;
                sparseArray4 = sparseArray2;
                i14 = i20;
            }
            SparseIntArray sparseIntArray3 = sparseIntArray2;
            int i21 = i14;
            c0095a.D(i17);
            C1017n0 c1017n0 = new C1017n0(i19, strTrim, arrayList, Arrays.copyOfRange((byte[]) c0095a.f1465c, i16, i17));
            if (i13 == 6 || i13 == 5) {
                i13 = i19;
            }
            iD -= i15 + 5;
            int i22 = i12 == 2 ? i13 : i21;
            if (sparseBooleanArray.get(i22)) {
                sparseIntArray = sparseIntArray3;
                sparseArray3 = sparseArray2;
                c3 = 21;
            } else {
                c3 = 21;
                E eF2 = (i12 == 2 && i13 == 21) ? c4.f5138p : vVar.f(i13, c1017n0);
                sparseIntArray = sparseIntArray3;
                if (i12 == 2) {
                    i8 = i21;
                    if (i8 >= sparseIntArray.get(i22, 8192)) {
                        sparseArray3 = sparseArray2;
                    }
                } else {
                    i8 = i21;
                }
                sparseIntArray.put(i22, i8);
                sparseArray3 = sparseArray2;
                sparseArray3.put(i22, eF2);
            }
            sparseArray4 = sparseArray3;
            sparseIntArray2 = sparseIntArray;
            sVar = sVar3;
            xVar = xVar2;
            iY = i18;
            i10 = 0;
            i11 = 3;
        }
        SparseArray sparseArray5 = sparseArray4;
        p151v2.s sVar4 = sVar;
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        int i23 = iY;
        int size = sparseIntArray4.size();
        int i24 = 0;
        while (true) {
            sparseArray = c4.f5129f;
            if (i24 >= size) {
                break;
            }
            int iKeyAt = sparseIntArray4.keyAt(i24);
            int iValueAt = sparseIntArray4.valueAt(i24);
            sparseBooleanArray.put(iKeyAt, true);
            c4.f5131h.put(iValueAt, true);
            E e7 = (E) sparseArray5.valueAt(i24);
            if (e7 != null) {
                if (e7 != c4.f5138p) {
                    m mVar = c4.f5133k;
                    i7 = i23;
                    J j = new J(i7, iKeyAt, 8192);
                    sVar2 = sVar4;
                    e7.c(sVar2, mVar, j);
                } else {
                    sVar2 = sVar4;
                    i7 = i23;
                }
                sparseArray.put(iValueAt, e7);
            } else {
                sVar2 = sVar4;
                i7 = i23;
            }
            i24++;
            sVar4 = sVar2;
            i23 = i7;
        }
        if (i12 == 2) {
            if (!c4.f5135m) {
                c4.f5133k.n();
                c4.f5134l = 0;
                c4.f5135m = true;
            }
            return;
        }
        sparseArray.remove(this.f4970a);
        int i25 = i12 == 1 ? 0 : c4.f5134l - 1;
        c4.f5134l = i25;
        if (i25 == 0) {
            c4.f5133k.n();
            c4.f5135m = true;
        }
    }

    public void b(Activity activity, Executor executor, Object obj) {
        boolean z4;
        S4.f fVar;
        com.google.android.gms.common.internal.D.i(obj);
        synchronized (((s) this.f4973d).f12059a) {
            try {
                z4 = (((s) this.f4973d).f12066h & this.f4970a) != 0;
                ((ConcurrentLinkedQueue) this.f4971b).add(obj);
                fVar = new S4.f(executor);
                ((HashMap) this.f4972c).put(obj, fVar);
                if (activity != null) {
                    com.google.android.gms.common.internal.D.a("Activity is already destroyed!", !activity.isDestroyed());
                    S4.c.f6322c.b(new K5.a(10, this, obj), activity, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            com.google.firebase.storage.x xVar = new com.google.firebase.storage.x(this, obj, ((s) this.f4973d).m(), 1);
            Executor executor2 = fVar.f6339a;
            if (executor2 != null) {
                executor2.execute(xVar);
            } else {
                Y4.D.f7697i.execute(xVar);
            }
        }
    }

    public void d(int i7) {
        String str;
        if (this.f4970a != 3) {
            android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
            boolean z4 = false;
            if (tVar.r0()) {
                tVar.W(null, "closing realtime connection", new Object[0]);
            }
            this.f4970a = 3;
            p083l4.y yVar = (p083l4.y) this.f4972c;
            if (yVar != null) {
                yVar.c();
                this.f4972c = null;
            }
            p083l4.s sVar = (p083l4.s) this.f4973d;
            android.support.v4.media.session.t tVar2 = sVar.f15013y;
            if (tVar2.r0()) {
                if (i7 == 1) {
                    str = "SERVER_RESET";
                } else {
                    if (i7 != 2) {
                        throw null;
                    }
                    str = "OTHER";
                }
                tVar2.W(null, "Got on disconnect due to ".concat(str), new Object[0]);
            }
            sVar.f14997h = p083l4.m.f14959a;
            sVar.f14996g = null;
            sVar.f14989G = false;
            sVar.f15000l.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = sVar.f15002n.entrySet().iterator();
            while (it.hasNext()) {
                q qVar = (q) ((Map.Entry) it.next()).getValue();
                if (qVar.f14977b.containsKey("h") && qVar.f14979d) {
                    arrayList.add(qVar);
                    it.remove();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).f14978c.b("disconnected", null);
            }
            if (sVar.f14993d.size() == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = sVar.f14995f;
                long j3 = jCurrentTimeMillis - j;
                if (j > 0 && j3 > TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
                    z4 = true;
                }
                if (i7 == 1 || z4) {
                    p091m4.a aVar = sVar.f15014z;
                    aVar.j = true;
                    aVar.f15274i = 0L;
                }
                sVar.q();
            }
            sVar.f14995f = 0L;
            C0940m c0940m = sVar.f14990a;
            c0940m.getClass();
            c0940m.t(AbstractC0930c.f15402d, Boolean.FALSE);
            HashMap mapP = Y4.D.p(c0940m.f15454b);
            ArrayList arrayList2 = new ArrayList();
            c0940m.f15457e.a(C0934g.f15421d, new M(c0940m, mapP, arrayList2));
            c0940m.f15457e = new r();
            c0940m.m(arrayList2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    public void e(String str) {
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
        if (tVar.r0()) {
            tVar.W(null, "Connection shutdown command received. Shutting down...", new Object[0]);
        }
        p083l4.s sVar = (p083l4.s) this.f4973d;
        sVar.getClass();
        boolean zEquals = str.equals("Invalid appcheck token");
        android.support.v4.media.session.t tVar2 = sVar.f15013y;
        if (zEquals) {
            int i7 = sVar.f14986D;
            if (i7 < 3) {
                sVar.f14986D = i7 + 1;
                tVar2.C0("Detected invalid AppCheck token. Reconnecting (" + (3 - ((long) sVar.f14986D)) + " attempts remaining)");
            } else {
                tVar2.C0("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(str));
                sVar.d("server_kill");
            }
        } else {
            tVar2.C0("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(str));
            sVar.d("server_kill");
        }
        d(2);
    }

    public void f(Map map) {
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
        if (tVar.r0()) {
            tVar.W(null, "Got control message: " + map.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (tVar.r0()) {
                    tVar.W(null, "Got invalid control message: " + map.toString(), new Object[0]);
                }
                d(2);
                return;
            }
            if (str.equals("s")) {
                e((String) map.get("d"));
                return;
            }
            if (str.equals("r")) {
                k((String) map.get("d"));
            } else if (str.equals("h")) {
                h((Map) map.get("d"));
            } else if (tVar.r0()) {
                tVar.W(null, "Ignoring unknown control message: ".concat(str), new Object[0]);
            }
        } catch (ClassCastException e7) {
            if (tVar.r0()) {
                tVar.W(null, "Failed to parse control message: " + e7.toString(), new Object[0]);
            }
            d(2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void g(Map map) {
        List listG;
        p134s4.i iVarD;
        List listEmptyList;
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
        ArrayList arrayList = null;
        if (tVar.r0()) {
            tVar.W(null, "received data message: " + map.toString(), new Object[0]);
        }
        p083l4.s sVar = (p083l4.s) this.f4973d;
        sVar.getClass();
        if (map.containsKey("r")) {
            p083l4.l lVar = (p083l4.l) sVar.f15000l.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (lVar != null) {
                lVar.a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        boolean zContainsKey = map.containsKey("a");
        android.support.v4.media.session.t tVar2 = sVar.f15013y;
        if (!zContainsKey) {
            if (tVar2.r0()) {
                tVar2.W(null, "Ignoring unknown message: " + map, new Object[0]);
                return;
            }
            return;
        }
        String str = (String) map.get("a");
        Map map2 = (Map) map.get("b");
        if (tVar2.r0()) {
            tVar2.W(null, "handleServerMessage: " + str + " " + map2, new Object[0]);
        }
        boolean zEquals = str.equals("d");
        C0940m c0940m = sVar.f14990a;
        if (zEquals || str.equals("m")) {
            boolean zEquals2 = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Object obj2 = map2.get("t");
            Long lValueOf = obj2 instanceof Integer ? Long.valueOf(((Integer) obj2).intValue()) : obj2 instanceof Long ? (Long) obj2 : null;
            if (zEquals2 && (obj instanceof Map) && ((Map) obj).size() == 0) {
                if (tVar2.r0()) {
                    tVar2.W(null, L.i("ignoring empty merge for path ", str2), new Object[0]);
                    return;
                }
                return;
            }
            ArrayList arrayListY = Y4.D.Y(str2);
            c0940m.getClass();
            C0934g c0934g = new C0934g(arrayListY);
            android.support.v4.media.session.t tVar3 = c0940m.f15461i;
            if (tVar3.r0()) {
                tVar3.W(null, "onDataUpdate: " + c0934g, new Object[0]);
            }
            if (c0940m.f15462k.r0()) {
                tVar3.W(null, "onDataUpdate: " + c0934g + " " + obj, new Object[0]);
            }
            try {
                if (lValueOf != null) {
                    p098n4.E e7 = new p098n4.E(lValueOf.longValue());
                    if (zEquals2) {
                        HashMap map3 = new HashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            map3.put(new C0934g((String) entry.getKey()), p115p6.a.a(entry.getValue(), v4.j.f17190e));
                        }
                        p098n4.D d7 = c0940m.f15465n;
                        d7.getClass();
                        listG = (List) d7.f15371g.j(new p098n4.t(d7, e7, c0934g, map3, 0));
                    } else {
                        v4.r rVarA = p115p6.a.a(obj, v4.j.f17190e);
                        p098n4.D d8 = c0940m.f15465n;
                        d8.getClass();
                        listG = (List) d8.f15371g.j(new p098n4.t(d8, e7, c0934g, rVarA, 1));
                    }
                } else if (zEquals2) {
                    HashMap map4 = new HashMap();
                    for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                        map4.put(new C0934g((String) entry2.getKey()), p115p6.a.a(entry2.getValue(), v4.j.f17190e));
                    }
                    p098n4.D d9 = c0940m.f15465n;
                    d9.getClass();
                    listG = (List) d9.f15371g.j(new A(d9, map4, c0934g));
                } else {
                    listG = c0940m.f15465n.g(c0934g, p115p6.a.a(obj, v4.j.f17190e));
                }
                if (listG.size() > 0) {
                    c0940m.p(c0934g);
                }
                c0940m.m(listG);
                return;
            } catch (p063i4.d e8) {
                tVar3.a0("FIREBASE INTERNAL ERROR", e8);
                return;
            }
        }
        if (!str.equals("rm")) {
            if (str.equals("c")) {
                ArrayList arrayListY2 = Y4.D.Y((String) map2.get("p"));
                if (tVar2.r0()) {
                    tVar2.W(null, "removing all listens at path " + arrayListY2, new Object[0]);
                }
                ArrayList arrayList2 = new ArrayList();
                HashMap map5 = sVar.f15004p;
                for (Map.Entry entry3 : map5.entrySet()) {
                    p083l4.r rVar = (p083l4.r) entry3.getKey();
                    p pVar = (p) entry3.getValue();
                    if (rVar.f14980a.equals(arrayListY2)) {
                        arrayList2.add(pVar);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    map5.remove(((p) it.next()).f14973b);
                }
                sVar.c();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((p) it2.next()).f14972a.b("permission_denied", null);
                }
                return;
            }
            if (str.equals("ac")) {
                tVar2.W(null, L.j("Auth token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), new Object[0]);
                sVar.f15005q = null;
                sVar.f15006r = true;
                c0940m.getClass();
                c0940m.t(AbstractC0930c.f15401c, Boolean.FALSE);
                sVar.f14996g.d(2);
                return;
            }
            if (str.equals("apc")) {
                tVar2.W(null, L.j("App check token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), new Object[0]);
                sVar.f15007s = null;
                sVar.f15008t = true;
                return;
            } else if (str.equals("sd")) {
                String strA0 = tVar2.A0((String) map2.get("msg"), new Object[0]);
                System.currentTimeMillis();
                ((v) tVar2.f8076b).l(2, (String) tVar2.f8077c, strA0);
                return;
            } else {
                if (tVar2.r0()) {
                    tVar2.W(null, "Unrecognized action from server: ".concat(str), new Object[0]);
                    return;
                }
                return;
            }
        }
        String str3 = (String) map2.get("p");
        ArrayList arrayListY3 = Y4.D.Y(str3);
        Object obj3 = map2.get("d");
        Object obj4 = map2.get("t");
        Long lValueOf2 = obj4 instanceof Integer ? Long.valueOf(((Integer) obj4).intValue()) : obj4 instanceof Long ? (Long) obj4 : null;
        ArrayList arrayList3 = new ArrayList();
        for (Map map6 : (List) obj3) {
            String str4 = (String) map6.get("s");
            String str5 = (String) map6.get("e");
            arrayList3.add(new p083l4.t(str4 != null ? Y4.D.Y(str4) : arrayList, str5 != null ? Y4.D.Y(str5) : arrayList, map6.get("m")));
            arrayList = null;
        }
        if (arrayList3.isEmpty()) {
            if (tVar2.r0()) {
                tVar2.W(null, "Ignoring empty range merge for path ".concat(str3), new Object[0]);
                return;
            }
            return;
        }
        c0940m.getClass();
        C0934g c0934g2 = new C0934g(arrayListY3);
        android.support.v4.media.session.t tVar4 = c0940m.f15461i;
        if (tVar4.r0()) {
            tVar4.W(null, "onRangeMergeUpdate: " + c0934g2, new Object[0]);
        }
        if (c0940m.f15462k.r0()) {
            tVar4.W(null, "onRangeMergeUpdate: " + c0934g2 + " " + arrayList3, new Object[0]);
        }
        ArrayList<u> arrayList4 = new ArrayList(arrayList3.size());
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new u((p083l4.t) it3.next()));
        }
        if (lValueOf2 != null) {
            p098n4.D d10 = c0940m.f15465n;
            p098n4.E e9 = new p098n4.E(lValueOf2.longValue());
            p134s4.h hVar = (p134s4.h) d10.f15367c.get(e9);
            if (hVar != null) {
                C0934g c0934g3 = hVar.f16178a;
                p120q4.k.c(c0934g2.equals(c0934g3));
                p098n4.s sVar2 = (p098n4.s) d10.f15365a.y(c0934g3);
                p120q4.k.b("Missing sync point for query tag that we're tracking", sVar2 != null);
                p134s4.i iVarH = sVar2.h(hVar);
                p120q4.k.b("Missing view for query tag that we're tracking", iVarH != null);
                v4.r rVarA2 = ((p134s4.a) iVarH.f16182c.f11336c).f16153a.f17192a;
                for (u uVar : arrayList4) {
                    uVar.getClass();
                    rVarA2 = uVar.a(C0934g.f15421d, rVarA2, uVar.f17208c);
                }
                listEmptyList = (List) d10.f15371g.j(new p098n4.t(d10, e9, c0934g2, rVarA2, 1));
            } else {
                listEmptyList = Collections.emptyList();
            }
        } else {
            p098n4.D d11 = c0940m.f15465n;
            p098n4.s sVar3 = (p098n4.s) d11.f15365a.y(c0934g2);
            if (sVar3 == null || (iVarD = sVar3.d()) == null) {
                listEmptyList = Collections.emptyList();
            } else {
                v4.r rVarA3 = ((p134s4.a) iVarD.f16182c.f11336c).f16153a.f17192a;
                for (u uVar2 : arrayList4) {
                    uVar2.getClass();
                    rVarA3 = uVar2.a(C0934g.f15421d, rVarA3, uVar2.f17208c);
                }
                listEmptyList = d11.g(c0934g2, rVarA3);
            }
        }
        if (listEmptyList.size() > 0) {
            c0940m.p(c0934g2);
        }
        c0940m.m(listEmptyList);
    }

    public void h(Map map) {
        long jLongValue = ((Long) map.get("ts")).longValue();
        String str = (String) map.get("h");
        p083l4.s sVar = (p083l4.s) this.f4973d;
        sVar.f14992c = str;
        String str2 = (String) map.get("s");
        if (this.f4970a == 1) {
            ((p083l4.y) this.f4972c).getClass();
            android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
            if (tVar.r0()) {
                tVar.W(null, "realtime connection established", new Object[0]);
            }
            this.f4970a = 2;
            android.support.v4.media.session.t tVar2 = sVar.f15013y;
            if (tVar2.r0()) {
                tVar2.W(null, "onReady", new Object[0]);
            }
            sVar.f14995f = System.currentTimeMillis();
            if (tVar2.r0()) {
                tVar2.W(null, "handling timestamp", new Object[0]);
            }
            long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
            HashMap map2 = new HashMap();
            map2.put("serverTimeOffset", Long.valueOf(jCurrentTimeMillis));
            C0940m c0940m = sVar.f14990a;
            c0940m.getClass();
            for (Map.Entry entry : map2.entrySet()) {
                c0940m.t(v4.c.b((String) entry.getKey()), entry.getValue());
            }
            if (sVar.f14994e) {
                HashMap map3 = new HashMap();
                if (sVar.f15009u.f19a) {
                    map3.put("persistence.android.enabled", 1);
                }
                map3.put("sdk.android." + "21.0.0".replace('.', '-'), 1);
                if (tVar2.r0()) {
                    tVar2.W(null, "Sending first connection stats", new Object[0]);
                }
                if (!map3.isEmpty()) {
                    HashMap map4 = new HashMap();
                    map4.put("c", map3);
                    sVar.p("s", false, map4, new p083l4.g(sVar, 1));
                } else if (tVar2.r0()) {
                    tVar2.W(null, "Not sending stats because stats are empty", new Object[0]);
                }
            }
            if (tVar2.r0()) {
                tVar2.W(null, "calling restore tokens", new Object[0]);
            }
            p083l4.m mVar = sVar.f14997h;
            Y4.D.v("Wanted to restore tokens, but was in wrong state: %s", mVar == p083l4.m.f14961c, mVar);
            if (sVar.f15005q != null) {
                if (tVar2.r0()) {
                    tVar2.W(null, "Restoring auth.", new Object[0]);
                }
                sVar.f14997h = p083l4.m.f14962d;
                sVar.k(true);
            } else {
                if (tVar2.r0()) {
                    tVar2.W(null, "Not restoring auth because auth token is null.", new Object[0]);
                }
                sVar.f14997h = p083l4.m.f14963e;
                sVar.j(true);
            }
            sVar.f14994e = false;
            sVar.f14983A = str2;
            c0940m.t(AbstractC0930c.f15402d, Boolean.TRUE);
        }
    }

    public void i() {
        if ((((s) this.f4973d).f12066h & this.f4970a) != 0) {
            com.google.firebase.storage.r rVarM = ((s) this.f4973d).m();
            for (Object obj : (ConcurrentLinkedQueue) this.f4971b) {
                S4.f fVar = (S4.f) ((HashMap) this.f4972c).get(obj);
                if (fVar != null) {
                    com.google.firebase.storage.x xVar = new com.google.firebase.storage.x(this, obj, rVarM, 0);
                    Executor executor = fVar.f6339a;
                    if (executor != null) {
                        executor.execute(xVar);
                    } else {
                        Y4.D.f7697i.execute(xVar);
                    }
                }
            }
        }
    }

    public void j(HashMap map) {
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (tVar.r0()) {
                    tVar.W(null, "Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
                }
                d(2);
                return;
            }
            if (str.equals("d")) {
                g((Map) map.get("d"));
            } else if (str.equals("c")) {
                f((Map) map.get("d"));
            } else if (tVar.r0()) {
                tVar.W(null, "Ignoring unknown server message type: ".concat(str), new Object[0]);
            }
        } catch (ClassCastException e7) {
            if (tVar.r0()) {
                tVar.W(null, "Failed to parse server message: " + e7.toString(), new Object[0]);
            }
            d(2);
        }
    }

    public void k(String str) {
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
        if (tVar.r0()) {
            tVar.W(null, "Got a reset; killing connection to " + ((String) ((C0011c) this.f4971b).f333c) + "; Updating internalHost to " + str, new Object[0]);
        }
        ((p083l4.s) this.f4973d).f14992c = str;
        d(1);
    }

    public void l(C0.A a2) {
        p113p3.f s0Var;
        Window window = ((p121q5.c) this.f4971b).getWindow();
        window.getDecorView();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            s0Var = new t0(window);
        } else {
            s0Var = i7 >= 26 ? new s0(window) : new r0(window);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i9 = a2.f1211a;
        if (i9 != 0) {
            int iE = p136t.e.e(i9);
            if (iE == 0) {
                s0Var.X(false);
            } else if (iE == 1) {
                s0Var.X(true);
            }
        }
        Integer num = (Integer) a2.f1213c;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) a2.f1214d;
        if (bool != null && i8 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i8 >= 26) {
            int i10 = a2.f1212b;
            if (i10 != 0) {
                int iE2 = p136t.e.e(i10);
                if (iE2 == 0) {
                    s0Var.W(false);
                } else if (iE2 == 1) {
                    s0Var.W(true);
                }
            }
            Integer num2 = (Integer) a2.f1215e;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) a2.f1216f;
        if (num3 != null && i8 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) a2.f1217x;
        if (bool2 != null && i8 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f4974e = a2;
    }

    public void m() {
        ((p121q5.c) this.f4971b).getWindow().getDecorView().setSystemUiVisibility(this.f4970a);
        C0.A a2 = (C0.A) this.f4974e;
        if (a2 != null) {
            l(a2);
        }
    }

    public k(A0.b bVar, C0011c c0011c, String str, p083l4.s sVar, String str2, String str3) {
        long j = f4969f;
        f4969f = 1 + j;
        this.f4971b = c0011c;
        this.f4973d = sVar;
        this.f4974e = new android.support.v4.media.session.t((v) bVar.f24f, "Connection", AbstractC0486a1.g("conn_", j), 24);
        this.f4970a = 1;
        this.f4972c = new p083l4.y(bVar, c0011c, str, str3, this, str2);
    }

    public k(p121q5.c cVar, p028d6.k kVar, p121q5.c cVar2) {
        io.flutter.plugin.platform.p pVar = new io.flutter.plugin.platform.p(this, 1);
        this.f4971b = cVar;
        this.f4972c = kVar;
        kVar.f12448c = pVar;
        this.f4973d = cVar2;
        this.f4970a = 1280;
    }

    public k(I i7, C1052y0 c1052y0, byte[] bArr, F1.y[] yVarArr, int i8) {
        this.f4971b = i7;
        this.f4972c = c1052y0;
        this.f4973d = bArr;
        this.f4974e = yVarArr;
        this.f4970a = i8;
    }

    public k(C c3, int i7) {
        this.f4974e = c3;
        this.f4971b = new x(new byte[5], 5);
        this.f4972c = new SparseArray();
        this.f4973d = new SparseIntArray();
        this.f4970a = i7;
    }

    @Override // P1.z
    public void c(p151v2.s sVar, m mVar, J j) {
    }
}
