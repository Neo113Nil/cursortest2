package O1;

import A1.C0011c;
import B.v;
import C0.A;
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
import d6.C0977k;
import i4.C1267d;
import io.flutter.plugin.platform.p;
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
import l4.C1396g;
import l4.C1405p;
import l4.C1406q;
import l4.C1407r;
import l4.EnumC1402m;
import l4.InterfaceC1401l;
import m4.C1437a;
import n4.AbstractC1469c;
import n4.C1473g;
import n4.C1479m;
import n4.CallableC1465A;
import n4.M;
import n4.r;
import p6.AbstractC1539a;
import q5.AbstractActivityC1559c;
import s4.C1593a;
import v2.t;
import v4.u;
import w1.C1726n0;
import w1.C1761y0;
import w1.L;

/* loaded from: classes.dex */
public final class k implements z {

    /* renamed from: f, reason: collision with root package name */
    public static long f4969f;

    /* renamed from: a, reason: collision with root package name */
    public int f4970a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4971b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4972c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4973d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4974e;

    public k(s sVar, int i7, y yVar) {
        this.f4971b = new ConcurrentLinkedQueue();
        this.f4972c = new HashMap();
        this.f4973d = sVar;
        this.f4970a = i7;
        this.f4974e = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
    
        if (r28.t() == 21) goto L42;
     */
    @Override // P1.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(C0095a c0095a) {
        v2.s sVar;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        v2.s sVar2;
        int i7;
        SparseArray sparseArray2;
        char c3;
        SparseIntArray sparseIntArray;
        int i8;
        SparseArray sparseArray3;
        SparseIntArray sparseIntArray2;
        if (c0095a.t() != 2) {
            return;
        }
        C c4 = (C) this.f4974e;
        int i9 = c4.f5124a;
        int i10 = 0;
        List list = c4.f5125b;
        if (i9 == 1 || i9 == 2 || c4.f5134l == 1) {
            sVar = (v2.s) list.get(0);
        } else {
            sVar = new v2.s(((v2.s) list.get(0)).c());
            list.add(sVar);
        }
        if ((c0095a.t() & 128) == 0) {
            return;
        }
        c0095a.E(1);
        int y4 = c0095a.y();
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
            E f7 = vVar.f(21, new C1726n0(21, (String) null, (ArrayList) null, t.f17158f));
            c4.f5138p = f7;
            if (f7 != null) {
                f7.c(sVar, c4.f5133k, new J(y4, 21, 8192));
            }
        }
        SparseArray sparseArray4 = (SparseArray) this.f4972c;
        sparseArray4.clear();
        SparseIntArray sparseIntArray3 = (SparseIntArray) this.f4973d;
        sparseIntArray3.clear();
        int d7 = c0095a.d();
        while (true) {
            sparseBooleanArray = c4.f5130g;
            if (d7 <= 0) {
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
            int i18 = y4;
            x xVar2 = xVar;
            int i19 = -1;
            String str = null;
            v2.s sVar3 = sVar;
            ArrayList arrayList = null;
            while (true) {
                if (c0095a.f1463a >= i17) {
                    sparseArray2 = sparseArray4;
                    break;
                }
                int t7 = c0095a.t();
                sparseArray2 = sparseArray4;
                int t8 = c0095a.f1463a + c0095a.t();
                if (t8 > i17) {
                    break;
                }
                int i20 = i14;
                if (t7 == 5) {
                    long u4 = c0095a.u();
                    if (u4 == 1094921523) {
                        i19 = 129;
                    } else if (u4 == 1161904947) {
                        i19 = 135;
                    } else {
                        if (u4 != 1094921524) {
                            if (u4 == 1212503619) {
                                i19 = 36;
                            }
                        }
                        i19 = 172;
                    }
                    sparseIntArray2 = sparseIntArray3;
                } else if (t7 == 106) {
                    sparseIntArray2 = sparseIntArray3;
                    i19 = 129;
                } else if (t7 == 122) {
                    sparseIntArray2 = sparseIntArray3;
                    i19 = 135;
                } else {
                    if (t7 != 127) {
                        if (t7 == 123) {
                            sparseIntArray2 = sparseIntArray3;
                            i19 = 138;
                        } else if (t7 == 10) {
                            str = c0095a.r(3, D3.f.f1719c).trim();
                        } else if (t7 == 89) {
                            arrayList = new ArrayList();
                            while (c0095a.f1463a < t8) {
                                String trim = c0095a.r(3, D3.f.f1719c).trim();
                                c0095a.t();
                                byte[] bArr = new byte[4];
                                c0095a.f(bArr, 0, 4);
                                arrayList.add(new D(trim, bArr));
                                sparseIntArray3 = sparseIntArray3;
                            }
                            sparseIntArray2 = sparseIntArray3;
                            i19 = 89;
                        } else {
                            sparseIntArray2 = sparseIntArray3;
                            if (t7 == 111) {
                                i19 = 257;
                            }
                        }
                    }
                    sparseIntArray2 = sparseIntArray3;
                }
                c0095a.E(t8 - c0095a.f1463a);
                sparseIntArray3 = sparseIntArray2;
                sparseArray4 = sparseArray2;
                i14 = i20;
            }
            SparseIntArray sparseIntArray4 = sparseIntArray3;
            int i21 = i14;
            c0095a.D(i17);
            C1726n0 c1726n0 = new C1726n0(i19, str, arrayList, Arrays.copyOfRange((byte[]) c0095a.f1465c, i16, i17));
            if (i13 == 6 || i13 == 5) {
                i13 = i19;
            }
            d7 -= i15 + 5;
            int i22 = i12 == 2 ? i13 : i21;
            if (sparseBooleanArray.get(i22)) {
                sparseIntArray = sparseIntArray4;
                sparseArray3 = sparseArray2;
                c3 = 21;
            } else {
                c3 = 21;
                E f8 = (i12 == 2 && i13 == 21) ? c4.f5138p : vVar.f(i13, c1726n0);
                sparseIntArray = sparseIntArray4;
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
                sparseArray3.put(i22, f8);
            }
            sparseArray4 = sparseArray3;
            sparseIntArray3 = sparseIntArray;
            sVar = sVar3;
            xVar = xVar2;
            y4 = i18;
            i10 = 0;
            i11 = 3;
        }
        SparseArray sparseArray5 = sparseArray4;
        v2.s sVar4 = sVar;
        SparseIntArray sparseIntArray5 = sparseIntArray3;
        int i23 = y4;
        int size = sparseIntArray5.size();
        int i24 = 0;
        while (true) {
            sparseArray = c4.f5129f;
            if (i24 >= size) {
                break;
            }
            int keyAt = sparseIntArray5.keyAt(i24);
            int valueAt = sparseIntArray5.valueAt(i24);
            sparseBooleanArray.put(keyAt, true);
            c4.f5131h.put(valueAt, true);
            E e7 = (E) sparseArray5.valueAt(i24);
            if (e7 != null) {
                if (e7 != c4.f5138p) {
                    m mVar = c4.f5133k;
                    i7 = i23;
                    J j = new J(i7, keyAt, 8192);
                    sVar2 = sVar4;
                    e7.c(sVar2, mVar, j);
                } else {
                    sVar2 = sVar4;
                    i7 = i23;
                }
                sparseArray.put(valueAt, e7);
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
            l4.y yVar = (l4.y) this.f4972c;
            if (yVar != null) {
                yVar.c();
                this.f4972c = null;
            }
            l4.s sVar = (l4.s) this.f4973d;
            android.support.v4.media.session.t tVar2 = sVar.f15007y;
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
            sVar.f14991h = EnumC1402m.f14953a;
            sVar.f14990g = null;
            sVar.f14983G = false;
            sVar.f14994l.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = sVar.f14996n.entrySet().iterator();
            while (it.hasNext()) {
                C1406q c1406q = (C1406q) ((Map.Entry) it.next()).getValue();
                if (c1406q.f14971b.containsKey("h") && c1406q.f14973d) {
                    arrayList.add(c1406q);
                    it.remove();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C1406q) it2.next()).f14972c.b("disconnected", null);
            }
            if (sVar.f14987d.size() == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = sVar.f14989f;
                long j3 = currentTimeMillis - j;
                if (j > 0 && j3 > TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
                    z4 = true;
                }
                if (i7 == 1 || z4) {
                    C1437a c1437a = sVar.f15008z;
                    c1437a.j = true;
                    c1437a.f15268i = 0L;
                }
                sVar.q();
            }
            sVar.f14989f = 0L;
            C1479m c1479m = sVar.f14984a;
            c1479m.getClass();
            c1479m.t(AbstractC1469c.f15396d, Boolean.FALSE);
            HashMap p5 = Y4.D.p(c1479m.f15448b);
            ArrayList arrayList2 = new ArrayList();
            c1479m.f15451e.a(C1473g.f15415d, new M(c1479m, p5, arrayList2));
            c1479m.f15451e = new r();
            c1479m.m(arrayList2);
        }
    }

    public void e(String str) {
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
        if (tVar.r0()) {
            tVar.W(null, "Connection shutdown command received. Shutting down...", new Object[0]);
        }
        l4.s sVar = (l4.s) this.f4973d;
        sVar.getClass();
        boolean equals = str.equals("Invalid appcheck token");
        android.support.v4.media.session.t tVar2 = sVar.f15007y;
        if (equals) {
            int i7 = sVar.f14980D;
            if (i7 < 3) {
                sVar.f14980D = i7 + 1;
                tVar2.C0("Detected invalid AppCheck token. Reconnecting (" + (3 - sVar.f14980D) + " attempts remaining)");
                d(2);
            }
        }
        tVar2.C0("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(str));
        sVar.d("server_kill");
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

    public void g(Map map) {
        List g3;
        List emptyList;
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
        ArrayList arrayList = null;
        if (tVar.r0()) {
            tVar.W(null, "received data message: " + map.toString(), new Object[0]);
        }
        l4.s sVar = (l4.s) this.f4973d;
        sVar.getClass();
        if (map.containsKey("r")) {
            InterfaceC1401l interfaceC1401l = (InterfaceC1401l) sVar.f14994l.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (interfaceC1401l != null) {
                interfaceC1401l.a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        boolean containsKey = map.containsKey("a");
        android.support.v4.media.session.t tVar2 = sVar.f15007y;
        if (!containsKey) {
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
        boolean equals = str.equals("d");
        C1479m c1479m = sVar.f14984a;
        if (equals || str.equals("m")) {
            boolean equals2 = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Object obj2 = map2.get("t");
            Long valueOf = obj2 instanceof Integer ? Long.valueOf(((Integer) obj2).intValue()) : obj2 instanceof Long ? (Long) obj2 : null;
            if (equals2 && (obj instanceof Map) && ((Map) obj).size() == 0) {
                if (tVar2.r0()) {
                    tVar2.W(null, L.i("ignoring empty merge for path ", str2), new Object[0]);
                    return;
                }
                return;
            }
            ArrayList Y6 = Y4.D.Y(str2);
            c1479m.getClass();
            C1473g c1473g = new C1473g(Y6);
            android.support.v4.media.session.t tVar3 = c1479m.f15455i;
            if (tVar3.r0()) {
                tVar3.W(null, "onDataUpdate: " + c1473g, new Object[0]);
            }
            if (c1479m.f15456k.r0()) {
                tVar3.W(null, "onDataUpdate: " + c1473g + " " + obj, new Object[0]);
            }
            try {
                if (valueOf != null) {
                    n4.E e7 = new n4.E(valueOf.longValue());
                    if (equals2) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            hashMap.put(new C1473g((String) entry.getKey()), AbstractC1539a.a(entry.getValue(), v4.j.f17184e));
                        }
                        n4.D d7 = c1479m.f15459n;
                        d7.getClass();
                        g3 = (List) d7.f15365g.j(new n4.t(d7, e7, c1473g, hashMap, 0));
                    } else {
                        v4.r a2 = AbstractC1539a.a(obj, v4.j.f17184e);
                        n4.D d8 = c1479m.f15459n;
                        d8.getClass();
                        g3 = (List) d8.f15365g.j(new n4.t(d8, e7, c1473g, a2, 1));
                    }
                } else if (equals2) {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                        hashMap2.put(new C1473g((String) entry2.getKey()), AbstractC1539a.a(entry2.getValue(), v4.j.f17184e));
                    }
                    n4.D d9 = c1479m.f15459n;
                    d9.getClass();
                    g3 = (List) d9.f15365g.j(new CallableC1465A(d9, hashMap2, c1473g));
                } else {
                    g3 = c1479m.f15459n.g(c1473g, AbstractC1539a.a(obj, v4.j.f17184e));
                }
                if (g3.size() > 0) {
                    c1479m.p(c1473g);
                }
                c1479m.m(g3);
                return;
            } catch (C1267d e8) {
                tVar3.a0("FIREBASE INTERNAL ERROR", e8);
                return;
            }
        }
        if (!str.equals("rm")) {
            if (str.equals("c")) {
                ArrayList Y7 = Y4.D.Y((String) map2.get("p"));
                if (tVar2.r0()) {
                    tVar2.W(null, "removing all listens at path " + Y7, new Object[0]);
                }
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap3 = sVar.f14998p;
                for (Map.Entry entry3 : hashMap3.entrySet()) {
                    C1407r c1407r = (C1407r) entry3.getKey();
                    C1405p c1405p = (C1405p) entry3.getValue();
                    if (c1407r.f14974a.equals(Y7)) {
                        arrayList2.add(c1405p);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    hashMap3.remove(((C1405p) it.next()).f14967b);
                }
                sVar.c();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C1405p) it2.next()).f14966a.b("permission_denied", null);
                }
                return;
            }
            if (str.equals("ac")) {
                tVar2.W(null, L.j("Auth token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), new Object[0]);
                sVar.f14999q = null;
                sVar.f15000r = true;
                c1479m.getClass();
                c1479m.t(AbstractC1469c.f15395c, Boolean.FALSE);
                sVar.f14990g.d(2);
                return;
            }
            if (str.equals("apc")) {
                tVar2.W(null, L.j("App check token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), new Object[0]);
                sVar.f15001s = null;
                sVar.f15002t = true;
                return;
            } else if (str.equals("sd")) {
                String A02 = tVar2.A0((String) map2.get("msg"), new Object[0]);
                System.currentTimeMillis();
                ((v) tVar2.f8076b).l(2, (String) tVar2.f8077c, A02);
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
        ArrayList Y8 = Y4.D.Y(str3);
        Object obj3 = map2.get("d");
        Object obj4 = map2.get("t");
        Long valueOf2 = obj4 instanceof Integer ? Long.valueOf(((Integer) obj4).intValue()) : obj4 instanceof Long ? (Long) obj4 : null;
        ArrayList arrayList3 = new ArrayList();
        for (Map map3 : (List) obj3) {
            String str4 = (String) map3.get("s");
            String str5 = (String) map3.get("e");
            arrayList3.add(new l4.t(str4 != null ? Y4.D.Y(str4) : arrayList, str5 != null ? Y4.D.Y(str5) : arrayList, map3.get("m")));
            arrayList = null;
        }
        if (arrayList3.isEmpty()) {
            if (tVar2.r0()) {
                tVar2.W(null, "Ignoring empty range merge for path ".concat(str3), new Object[0]);
                return;
            }
            return;
        }
        c1479m.getClass();
        C1473g c1473g2 = new C1473g(Y8);
        android.support.v4.media.session.t tVar4 = c1479m.f15455i;
        if (tVar4.r0()) {
            tVar4.W(null, "onRangeMergeUpdate: " + c1473g2, new Object[0]);
        }
        if (c1479m.f15456k.r0()) {
            tVar4.W(null, "onRangeMergeUpdate: " + c1473g2 + " " + arrayList3, new Object[0]);
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new u((l4.t) it3.next()));
        }
        if (valueOf2 != null) {
            n4.D d10 = c1479m.f15459n;
            n4.E e9 = new n4.E(valueOf2.longValue());
            s4.h hVar = (s4.h) d10.f15361c.get(e9);
            if (hVar != null) {
                C1473g c1473g3 = hVar.f16172a;
                q4.k.c(c1473g2.equals(c1473g3));
                n4.s sVar2 = (n4.s) d10.f15359a.y(c1473g3);
                q4.k.b("Missing sync point for query tag that we're tracking", sVar2 != null);
                s4.i h6 = sVar2.h(hVar);
                q4.k.b("Missing view for query tag that we're tracking", h6 != null);
                v4.r rVar = ((C1593a) h6.f16176c.f11336c).f16147a.f17186a;
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    u uVar = (u) it4.next();
                    uVar.getClass();
                    rVar = uVar.a(C1473g.f15415d, rVar, uVar.f17202c);
                }
                emptyList = (List) d10.f15365g.j(new n4.t(d10, e9, c1473g2, rVar, 1));
            } else {
                emptyList = Collections.emptyList();
            }
        } else {
            n4.D d11 = c1479m.f15459n;
            n4.s sVar3 = (n4.s) d11.f15359a.y(c1473g2);
            if (sVar3 == null) {
                emptyList = Collections.emptyList();
            } else {
                s4.i d12 = sVar3.d();
                if (d12 != null) {
                    v4.r rVar2 = ((C1593a) d12.f16176c.f11336c).f16147a.f17186a;
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        u uVar2 = (u) it5.next();
                        uVar2.getClass();
                        rVar2 = uVar2.a(C1473g.f15415d, rVar2, uVar2.f17202c);
                    }
                    emptyList = d11.g(c1473g2, rVar2);
                } else {
                    emptyList = Collections.emptyList();
                }
            }
        }
        if (emptyList.size() > 0) {
            c1479m.p(c1473g2);
        }
        c1479m.m(emptyList);
    }

    public void h(Map map) {
        long longValue = ((Long) map.get("ts")).longValue();
        String str = (String) map.get("h");
        l4.s sVar = (l4.s) this.f4973d;
        sVar.f14986c = str;
        String str2 = (String) map.get("s");
        if (this.f4970a == 1) {
            ((l4.y) this.f4972c).getClass();
            android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
            if (tVar.r0()) {
                tVar.W(null, "realtime connection established", new Object[0]);
            }
            this.f4970a = 2;
            android.support.v4.media.session.t tVar2 = sVar.f15007y;
            if (tVar2.r0()) {
                tVar2.W(null, "onReady", new Object[0]);
            }
            sVar.f14989f = System.currentTimeMillis();
            if (tVar2.r0()) {
                tVar2.W(null, "handling timestamp", new Object[0]);
            }
            long currentTimeMillis = longValue - System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
            C1479m c1479m = sVar.f14984a;
            c1479m.getClass();
            for (Map.Entry entry : hashMap.entrySet()) {
                c1479m.t(v4.c.b((String) entry.getKey()), entry.getValue());
            }
            if (sVar.f14988e) {
                HashMap hashMap2 = new HashMap();
                if (sVar.f15003u.f19a) {
                    hashMap2.put("persistence.android.enabled", 1);
                }
                hashMap2.put("sdk.android." + "21.0.0".replace('.', '-'), 1);
                if (tVar2.r0()) {
                    tVar2.W(null, "Sending first connection stats", new Object[0]);
                }
                if (!hashMap2.isEmpty()) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("c", hashMap2);
                    sVar.p("s", false, hashMap3, new C1396g(sVar, 1));
                } else if (tVar2.r0()) {
                    tVar2.W(null, "Not sending stats because stats are empty", new Object[0]);
                }
            }
            if (tVar2.r0()) {
                tVar2.W(null, "calling restore tokens", new Object[0]);
            }
            EnumC1402m enumC1402m = sVar.f14991h;
            Y4.D.v("Wanted to restore tokens, but was in wrong state: %s", enumC1402m == EnumC1402m.f14955c, enumC1402m);
            if (sVar.f14999q != null) {
                if (tVar2.r0()) {
                    tVar2.W(null, "Restoring auth.", new Object[0]);
                }
                sVar.f14991h = EnumC1402m.f14956d;
                sVar.k(true);
            } else {
                if (tVar2.r0()) {
                    tVar2.W(null, "Not restoring auth because auth token is null.", new Object[0]);
                }
                sVar.f14991h = EnumC1402m.f14957e;
                sVar.j(true);
            }
            sVar.f14988e = false;
            sVar.f14977A = str2;
            c1479m.t(AbstractC1469c.f15396d, Boolean.TRUE);
        }
    }

    public void i() {
        if ((((s) this.f4973d).f12066h & this.f4970a) != 0) {
            com.google.firebase.storage.r m7 = ((s) this.f4973d).m();
            Iterator it = ((ConcurrentLinkedQueue) this.f4971b).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                S4.f fVar = (S4.f) ((HashMap) this.f4972c).get(next);
                if (fVar != null) {
                    com.google.firebase.storage.x xVar = new com.google.firebase.storage.x(this, next, m7, 0);
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

    public void j(HashMap hashMap) {
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f4974e;
        try {
            String str = (String) hashMap.get("t");
            if (str == null) {
                if (tVar.r0()) {
                    tVar.W(null, "Failed to parse server message: missing message type:" + hashMap.toString(), new Object[0]);
                }
                d(2);
                return;
            }
            if (str.equals("d")) {
                g((Map) hashMap.get("d"));
            } else if (str.equals("c")) {
                f((Map) hashMap.get("d"));
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
        ((l4.s) this.f4973d).f14986c = str;
        d(1);
    }

    public void l(A a2) {
        Window window = ((AbstractActivityC1559c) this.f4971b).getWindow();
        window.getDecorView();
        int i7 = Build.VERSION.SDK_INT;
        p3.f t0Var = i7 >= 30 ? new t0(window) : i7 >= 26 ? new s0(window) : new r0(window);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i9 = a2.f1211a;
        if (i9 != 0) {
            int e7 = t.e.e(i9);
            if (e7 == 0) {
                t0Var.X(false);
            } else if (e7 == 1) {
                t0Var.X(true);
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
                int e8 = t.e.e(i10);
                if (e8 == 0) {
                    t0Var.W(false);
                } else if (e8 == 1) {
                    t0Var.W(true);
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
        ((AbstractActivityC1559c) this.f4971b).getWindow().getDecorView().setSystemUiVisibility(this.f4970a);
        A a2 = (A) this.f4974e;
        if (a2 != null) {
            l(a2);
        }
    }

    public k(A0.b bVar, C0011c c0011c, String str, l4.s sVar, String str2, String str3) {
        long j = f4969f;
        f4969f = 1 + j;
        this.f4971b = c0011c;
        this.f4973d = sVar;
        this.f4974e = new android.support.v4.media.session.t((v) bVar.f24f, "Connection", AbstractC0486a1.g("conn_", j), 24);
        this.f4970a = 1;
        this.f4972c = new l4.y(bVar, c0011c, str, str3, this, str2);
    }

    public k(AbstractActivityC1559c abstractActivityC1559c, C0977k c0977k, AbstractActivityC1559c abstractActivityC1559c2) {
        p pVar = new p(this, 1);
        this.f4971b = abstractActivityC1559c;
        this.f4972c = c0977k;
        c0977k.f12442c = pVar;
        this.f4973d = abstractActivityC1559c2;
        this.f4970a = 1280;
    }

    public k(I i7, C1761y0 c1761y0, byte[] bArr, F1.y[] yVarArr, int i8) {
        this.f4971b = i7;
        this.f4972c = c1761y0;
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
    public void c(v2.s sVar, m mVar, J j) {
    }
}
