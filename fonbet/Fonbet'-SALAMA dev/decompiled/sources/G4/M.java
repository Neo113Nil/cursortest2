package G4;

import C0.C0090i;
import W5.AbstractC0486a1;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j4.C1321g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import n4.C1468b;
import n4.C1471e;
import n4.C1473g;
import org.json.JSONException;
import org.json.JSONTokener;
import p4.InterfaceC1538a;
import p6.AbstractC1539a;
import s4.C1593a;
import v0.AbstractC1663a;
import w1.C1718l0;
import w1.C1719l1;
import w1.C1722m0;
import w1.V0;

/* loaded from: classes2.dex */
public final class M implements C, InterfaceC1538a {

    /* renamed from: a, reason: collision with root package name */
    public long f2915a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2916b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2917c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2918d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2919e;

    public M(S s7, E4.y yVar) {
        this.f2915a = -1L;
        this.f2916b = s7;
        this.f2918d = new r(this, yVar);
    }

    public void A(H4.h hVar) {
        ((S) this.f2916b).b0("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", p3.f.C(hVar.f3318a), Long.valueOf(l()));
    }

    @Override // G4.C
    public void a(Z z4) {
        ((S) this.f2916b).f2931e.c(z4.b(l()));
    }

    @Override // p4.InterfaceC1538a
    public void b(C1473g c1473g, C1468b c1468b) {
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.v();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = c1468b.f15392a.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i7 += c1321g.m(c1473g.m((C1473g) entry.getKey()));
            i8 += c1321g.o(c1473g.m((C1473g) entry.getKey()), (v4.r) entry.getValue());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        android.support.v4.media.session.t tVar = c1321g.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            String c1473g2 = c1473g.toString();
            StringBuilder g3 = AbstractC1663a.g("Persisted a total of ", i8, " rows and deleted ", i7, " rows for a merge at ");
            g3.append(c1473g2);
            g3.append(" in ");
            g3.append(currentTimeMillis2);
            g3.append("ms");
            tVar.W(null, g3.toString(), new Object[0]);
        }
        z();
    }

    @Override // p4.InterfaceC1538a
    public void c() {
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.v();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = c1321g.f14632a.delete("writes", null, null);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        android.support.v4.media.session.t tVar = c1321g.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Deleted " + delete + " (all) write(s) in " + currentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // p4.InterfaceC1538a
    public void d(long j) {
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.v();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = c1321g.f14632a.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        android.support.v4.media.session.t tVar = c1321g.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Deleted " + delete + " write(s) with writeId " + j + " in " + currentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // p4.InterfaceC1538a
    public void e(C1473g c1473g, v4.r rVar) {
        p4.c cVar;
        p4.d dVar = (p4.d) this.f2917c;
        if (dVar.f15707a.C(c1473g, p4.d.f15705f) != null) {
            return;
        }
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.v();
        c1321g.u(c1473g, rVar, false);
        if (dVar.f15707a.m(c1473g, p4.d.f15704e) != null) {
            return;
        }
        s4.h a2 = s4.h.a(c1473g);
        p4.c b7 = dVar.b(a2);
        if (b7 == null) {
            long j = dVar.f15710d;
            dVar.f15710d = 1 + j;
            cVar = new p4.c(j, a2, System.currentTimeMillis(), true, false);
        } else {
            q4.k.b("This should have been handled above!", !b7.f15702d);
            cVar = new p4.c(b7.f15699a, b7.f15700b, b7.f15701c, true, b7.f15703e);
        }
        dVar.f(cVar);
    }

    @Override // G4.C
    public void f() {
        p3.f.O("Committing a transaction without having started one", this.f2915a != -1, new Object[0]);
        this.f2915a = -1L;
    }

    @Override // G4.C
    public void g() {
        p3.f.O("Starting a transaction without committing the previous one", this.f2915a == -1, new Object[0]);
        E4.y yVar = (E4.y) this.f2917c;
        long j = yVar.f2247a + 1;
        yVar.f2247a = j;
        this.f2915a = j;
    }

    @Override // p4.InterfaceC1538a
    public void h(s4.h hVar, HashSet hashSet) {
        q4.k.b("We should only track keys for filtered queries.", !hVar.f16173b.h());
        p4.c b7 = ((p4.d) this.f2917c).b(hVar);
        q4.k.b("We only expect tracked keys for currently-active queries.", b7 != null && b7.f15703e);
        long j = b7.f15699a;
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.v();
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = {String.valueOf(j)};
        SQLiteDatabase sQLiteDatabase = c1321g.f14632a;
        sQLiteDatabase.delete("trackedKeys", "id = ?", strArr);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            v4.c cVar = (v4.c) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", cVar.f17173a);
            sQLiteDatabase.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        android.support.v4.media.session.t tVar = c1321g.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Set " + hashSet.size() + " tracked query keys for tracked query " + j + " in " + currentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // p4.InterfaceC1538a
    public void i(s4.h hVar) {
        ((p4.d) this.f2917c).g(hVar, false);
    }

    @Override // p4.InterfaceC1538a
    public Object j(Callable callable) {
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.a();
        try {
            Object call = callable.call();
            c1321g.f14632a.setTransactionSuccessful();
            return call;
        } finally {
        }
    }

    @Override // p4.InterfaceC1538a
    public void k(long j, C1468b c1468b, C1473g c1473g) {
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.v();
        long currentTimeMillis = System.currentTimeMillis();
        c1321g.q(c1473g, j, "m", C1321g.r(c1468b.D()));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        android.support.v4.media.session.t tVar = c1321g.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Persisted user merge in " + currentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // G4.C
    public long l() {
        p3.f.O("Attempting to get a sequence number outside of a transaction", this.f2915a != -1, new Object[0]);
        return this.f2915a;
    }

    @Override // p4.InterfaceC1538a
    public void m(s4.h hVar, HashSet hashSet, HashSet hashSet2) {
        SQLiteDatabase sQLiteDatabase;
        q4.k.b("We should only track keys for filtered queries.", !hVar.f16173b.h());
        p4.c b7 = ((p4.d) this.f2917c).b(hVar);
        q4.k.b("We only expect tracked keys for currently-active queries.", b7 != null && b7.f15703e);
        long j = b7.f15699a;
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.v();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j);
        Iterator it = hashSet2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sQLiteDatabase = c1321g.f14632a;
            if (!hasNext) {
                break;
            } else {
                sQLiteDatabase.delete("trackedKeys", "id = ? AND key = ?", new String[]{valueOf, ((v4.c) it.next()).f17173a});
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            v4.c cVar = (v4.c) it2.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", cVar.f17173a);
            sQLiteDatabase.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        android.support.v4.media.session.t tVar = c1321g.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            StringBuilder g3 = AbstractC1663a.g("Updated tracked query keys (", hashSet.size(), " added, ", hashSet2.size(), " removed) for tracked query id ");
            g3.append(j);
            g3.append(" in ");
            g3.append(currentTimeMillis2);
            g3.append("ms");
            tVar.W(null, g3.toString(), new Object[0]);
        }
    }

    @Override // p4.InterfaceC1538a
    public void n(s4.h hVar) {
        ((p4.d) this.f2917c).g(hVar, true);
    }

    @Override // p4.InterfaceC1538a
    public List o() {
        byte[] e7;
        n4.H h6;
        C1321g c1321g = (C1321g) this.f2916b;
        android.support.v4.media.session.t tVar = c1321g.f14633b;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = c1321g.f14632a.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    long j = query.getLong(0);
                    C1473g c1473g = new C1473g(query.getString(1));
                    String string = query.getString(2);
                    if (query.isNull(3)) {
                        e7 = query.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(query.getBlob(4));
                            if (!query.moveToNext()) {
                                break;
                            }
                        } while (query.getLong(0) == j);
                        query.moveToPrevious();
                        e7 = C1321g.e(arrayList2);
                    }
                    try {
                        Object f7 = q6.a.f(new JSONTokener(new String(e7, C1321g.f14631e)).nextValue());
                        if ("o".equals(string)) {
                            h6 = new n4.H(j, c1473g, AbstractC1539a.a(f7, v4.j.f17184e), true);
                        } else {
                            if (!"m".equals(string)) {
                                throw new IllegalStateException("Got invalid write type: " + string);
                            }
                            h6 = new n4.H(j, C1468b.B((Map) f7), c1473g);
                        }
                        arrayList.add(h6);
                    } catch (JSONException e8) {
                        throw new IOException(e8);
                    }
                } catch (IOException e9) {
                    throw new RuntimeException("Failed to load writes", e9);
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Loaded " + arrayList.size() + " writes in " + currentTimeMillis2 + "ms", new Object[0]);
        }
        query.close();
        return arrayList;
    }

    @Override // p4.InterfaceC1538a
    public void p(C1473g c1473g, v4.r rVar, long j) {
        C1321g c1321g = (C1321g) this.f2916b;
        c1321g.v();
        long currentTimeMillis = System.currentTimeMillis();
        c1321g.q(c1473g, j, "o", C1321g.r(rVar.u(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        android.support.v4.media.session.t tVar = c1321g.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Persisted user overwrite in " + currentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // G4.C
    public void q(H4.h hVar) {
        A(hVar);
    }

    @Override // G4.C
    public void r(H4.h hVar) {
        A(hVar);
    }

    @Override // G4.C
    public void s(H4.h hVar) {
        A(hVar);
    }

    @Override // G4.C
    public void t(V0 v02) {
        this.f2919e = v02;
    }

    @Override // p4.InterfaceC1538a
    public C1593a u(s4.h hVar) {
        HashSet<v4.c> hashSet;
        boolean z4;
        p4.c cVar;
        p4.d dVar = (p4.d) this.f2917c;
        boolean d7 = dVar.d(hVar);
        C1321g c1321g = (C1321g) this.f2916b;
        C1473g c1473g = hVar.f16172a;
        s4.g gVar = hVar.f16173b;
        if (d7) {
            p4.c b7 = dVar.b(hVar);
            hashSet = (gVar.h() || b7 == null || !b7.f15702d) ? null : c1321g.h(Collections.singleton(Long.valueOf(b7.f15699a)));
            z4 = true;
        } else {
            q4.k.b("Path is fully complete.", !dVar.d(s4.h.a(c1473g)));
            hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Map map = (Map) dVar.f15707a.y(c1473g);
            if (map != null) {
                for (p4.c cVar2 : map.values()) {
                    if (!cVar2.f15700b.f16173b.h()) {
                        hashSet2.add(Long.valueOf(cVar2.f15699a));
                    }
                }
            }
            if (!hashSet2.isEmpty()) {
                hashSet.addAll(dVar.f15708b.h(hashSet2));
            }
            for (Map.Entry entry : dVar.f15707a.F(c1473g).f15856b) {
                v4.c cVar3 = (v4.c) entry.getKey();
                Object obj = ((q4.c) entry.getValue()).f15855a;
                if (obj != null && (cVar = (p4.c) ((Map) obj).get(s4.g.f16163i)) != null && cVar.f15702d) {
                    hashSet.add(cVar3);
                }
            }
            z4 = false;
        }
        v4.r f7 = c1321g.f(c1473g);
        if (hashSet == null) {
            return new C1593a(new v4.l(f7, gVar.f16170g), z4, false);
        }
        v4.r rVar = v4.j.f17184e;
        for (v4.c cVar4 : hashSet) {
            rVar = rVar.s(cVar4, f7.o(cVar4));
        }
        return new C1593a(new v4.l(rVar, gVar.f16170g), z4, true);
    }

    @Override // p4.InterfaceC1538a
    public void v(s4.h hVar, v4.r rVar) {
        boolean h6 = hVar.f16173b.h();
        C1321g c1321g = (C1321g) this.f2916b;
        C1473g c1473g = hVar.f16172a;
        if (h6) {
            c1321g.v();
            c1321g.u(c1473g, rVar, false);
        } else {
            c1321g.v();
            c1321g.u(c1473g, rVar, true);
        }
        w(hVar);
        z();
    }

    @Override // p4.InterfaceC1538a
    public void w(s4.h hVar) {
        boolean h6 = hVar.f16173b.h();
        p4.d dVar = (p4.d) this.f2917c;
        if (h6) {
            q4.c F7 = dVar.f15707a.F(hVar.f16172a);
            C1719l1 c1719l1 = new C1719l1(dVar);
            F7.getClass();
            F7.t(C1473g.f15415d, c1719l1, null);
            return;
        }
        dVar.getClass();
        p4.c b7 = dVar.b(p4.d.e(hVar));
        if (b7 == null || b7.f15702d) {
            return;
        }
        dVar.f(new p4.c(b7.f15699a, b7.f15700b, b7.f15701c, true, b7.f15703e));
    }

    @Override // G4.C
    public void x(H4.h hVar) {
        A(hVar);
    }

    @Override // p4.InterfaceC1538a
    public void y(C1473g c1473g, C1468b c1468b) {
        Iterator it = c1468b.f15392a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e(c1473g.m((C1473g) entry.getKey()), (v4.r) entry.getValue());
        }
    }

    public void z() {
        q4.c cVar;
        E4.y yVar;
        boolean z4;
        android.support.v4.media.session.t tVar;
        android.support.v4.media.session.t tVar2;
        int i7;
        int i8;
        M m7 = this;
        long j = m7.f2915a + 1;
        m7.f2915a = j;
        E4.y yVar2 = (E4.y) m7.f2919e;
        yVar2.getClass();
        long j3 = 1000;
        if (j > 1000) {
            android.support.v4.media.session.t tVar3 = (android.support.v4.media.session.t) m7.f2918d;
            if (tVar3.r0()) {
                tVar3.W(null, "Reached prune check threshold.", new Object[0]);
            }
            m7.f2915a = 0L;
            C1321g c1321g = (C1321g) m7.f2916b;
            long s7 = c1321g.s();
            if (tVar3.r0()) {
                tVar3.W(null, AbstractC0486a1.g("Cache size: ", s7), new Object[0]);
            }
            boolean z7 = true;
            while (z7) {
                C1718l0 c1718l0 = p4.d.f15706g;
                p4.d dVar = (p4.d) m7.f2917c;
                long size = dVar.c(c1718l0).size();
                if (s7 <= yVar2.f2247a && size <= j3) {
                    return;
                }
                ArrayList c3 = dVar.c(c1718l0);
                long size2 = c3.size() - Math.min((long) Math.floor(r7 * 0.8f), j3);
                p4.b bVar = new p4.b();
                android.support.v4.media.session.t tVar4 = dVar.f15709c;
                if (tVar4.r0()) {
                    tVar4.W(null, "Pruning old queries.  Prunable: " + c3.size() + " Count to prune: " + size2, new Object[0]);
                }
                Collections.sort(c3, new C0090i(3));
                for (int i9 = 0; i9 < size2; i9++) {
                    p4.c cVar2 = (p4.c) c3.get(i9);
                    C1473g c1473g = cVar2.f15700b.f16172a;
                    C1722m0 c1722m0 = p4.b.f15694b;
                    q4.c cVar3 = bVar.f15698a;
                    if (cVar3.C(c1473g, c1722m0) != null) {
                        throw new IllegalArgumentException("Can't prune path that was kept previously!");
                    }
                    if (cVar3.C(c1473g, p4.b.f15695c) == null) {
                        bVar = new p4.b(cVar3.E(c1473g, p4.b.f15696d));
                    }
                    s4.h e7 = p4.d.e(cVar2.f15700b);
                    p4.c b7 = dVar.b(e7);
                    q4.k.b("Query must exist to be removed.", b7 != null);
                    long j7 = b7.f15699a;
                    C1321g c1321g2 = dVar.f15708b;
                    c1321g2.v();
                    String valueOf = String.valueOf(j7);
                    SQLiteDatabase sQLiteDatabase = c1321g2.f14632a;
                    sQLiteDatabase.delete("trackedQueries", "id = ?", new String[]{valueOf});
                    sQLiteDatabase.delete("trackedKeys", "id = ?", new String[]{valueOf});
                    q4.c cVar4 = dVar.f15707a;
                    C1473g c1473g2 = e7.f16172a;
                    Map map = (Map) cVar4.y(c1473g2);
                    map.remove(e7.f16173b);
                    if (map.isEmpty()) {
                        dVar.f15707a = dVar.f15707a.B(c1473g2);
                    }
                }
                for (int i10 = (int) size2; i10 < c3.size(); i10++) {
                    C1473g c1473g3 = ((p4.c) c3.get(i10)).f15700b.f16172a;
                    C1722m0 c1722m02 = p4.b.f15694b;
                    q4.c cVar5 = bVar.f15698a;
                    if (cVar5.C(c1473g3, c1722m02) == null) {
                        bVar = new p4.b(cVar5.E(c1473g3, p4.b.f15697e));
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = dVar.f15707a.iterator();
                while (it.hasNext()) {
                    for (p4.c cVar6 : ((Map) ((Map.Entry) it.next()).getValue()).values()) {
                        if (cVar6.f15703e) {
                            arrayList.add(cVar6);
                        }
                    }
                }
                if (tVar4.r0()) {
                    tVar4.W(null, "Unprunable queries: " + arrayList.size(), new Object[0]);
                }
                Iterator it2 = arrayList.iterator();
                p4.b bVar2 = bVar;
                while (true) {
                    boolean hasNext = it2.hasNext();
                    cVar = bVar2.f15698a;
                    if (!hasNext) {
                        break;
                    }
                    C1473g c1473g4 = ((p4.c) it2.next()).f15700b.f16172a;
                    if (cVar.C(c1473g4, p4.b.f15694b) == null) {
                        bVar2 = new p4.b(cVar.E(c1473g4, p4.b.f15697e));
                    }
                }
                if (cVar.l()) {
                    C1473g c1473g5 = C1473g.f15415d;
                    if (cVar.l()) {
                        c1321g.v();
                        long currentTimeMillis = System.currentTimeMillis();
                        Cursor g3 = c1321g.g(c1473g5, new String[]{"rowid", "path"});
                        q4.c cVar7 = new q4.c(null);
                        q4.c cVar8 = new q4.c(null);
                        while (true) {
                            boolean moveToNext = g3.moveToNext();
                            tVar = c1321g.f14633b;
                            if (!moveToNext) {
                                break;
                            }
                            long j8 = g3.getLong(0);
                            E4.y yVar3 = yVar2;
                            C1473g c1473g6 = new C1473g(g3.getString(1));
                            if (c1473g5.z(c1473g6)) {
                                C1473g D7 = C1473g.D(c1473g5, c1473g6);
                                Boolean bool = (Boolean) cVar.A(D7);
                                if (bool == null || !bool.booleanValue()) {
                                    Boolean bool2 = (Boolean) cVar.A(D7);
                                    if (bool2 == null || bool2.booleanValue()) {
                                        tVar.C0("We are pruning at " + c1473g5 + " and have data at " + c1473g6 + " that isn't marked for pruning or keeping. Ignoring.");
                                    } else {
                                        cVar8 = cVar8.D(D7, Long.valueOf(j8));
                                    }
                                } else {
                                    cVar7 = cVar7.D(D7, Long.valueOf(j8));
                                }
                            } else {
                                tVar.C0("We are pruning at " + c1473g5 + " but we have data stored higher up at " + c1473g6 + ". Ignoring.");
                            }
                            yVar2 = yVar3;
                        }
                        yVar = yVar2;
                        if (cVar7.isEmpty()) {
                            tVar2 = tVar;
                            i7 = 0;
                            i8 = 0;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            C1473g c1473g7 = C1473g.f15415d;
                            tVar2 = tVar;
                            c1321g.l(c1473g5, c1473g7, cVar7, cVar8, bVar2, arrayList2);
                            ArrayList arrayList3 = new ArrayList();
                            cVar7.t(c1473g7, new u1.c(arrayList3, 24), null);
                            c1321g.f14632a.delete("serverCache", "rowid IN (" + C1321g.b(arrayList3) + ")", null);
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                q4.e eVar = (q4.e) it3.next();
                                c1321g.o(c1473g5.m((C1473g) eVar.f15857a), (v4.r) eVar.f15858b);
                            }
                            i7 = arrayList3.size();
                            i8 = arrayList2.size();
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        if (tVar2.r0()) {
                            Locale locale = Locale.US;
                            tVar2.W(null, AbstractC0486a1.i(AbstractC1663a.g("Pruned ", i7, " rows with ", i8, " nodes resaved in "), currentTimeMillis2, "ms"), new Object[0]);
                        }
                    } else {
                        yVar = yVar2;
                    }
                } else {
                    yVar = yVar2;
                    z7 = false;
                }
                s7 = c1321g.s();
                if (tVar3.r0()) {
                    z4 = false;
                    tVar3.W(null, AbstractC0486a1.g("Cache size after prune: ", s7), new Object[0]);
                } else {
                    z4 = false;
                }
                m7 = this;
                yVar2 = yVar;
                j3 = 1000;
            }
        }
    }

    public M(C1471e c1471e, C1321g c1321g, E4.y yVar) {
        M4.e eVar = new M4.e();
        this.f2915a = 0L;
        this.f2916b = c1321g;
        android.support.v4.media.session.t c3 = c1471e.c("Persistence");
        this.f2918d = c3;
        this.f2917c = new p4.d(c1321g, c3, eVar);
        this.f2919e = yVar;
    }
}
